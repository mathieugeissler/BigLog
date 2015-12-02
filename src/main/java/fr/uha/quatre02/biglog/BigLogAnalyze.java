package fr.uha.quatre02.biglog;

import java.io.Serializable;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import fr.uha.quatre02.biglog.data.BigLogMapperInterface;
import fr.uha.quatre02.biglog.pattern.BigLogPatInterface;

public class BigLogAnalyze implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2330420027774187295L;
	private JavaRDD<String> lines;

	public BigLogAnalyze ReadFile(String pathFile) {
		JavaSparkContext sc = BigLogSpark.getInstance();
		lines = sc.textFile(pathFile).cache();
		return this;
	}

	public BigLogPatInterface FindPat(String line) {
		return BigLogCheckPat.Analyze(line);
	}

	public JavaRDD<BigLogMapperInterface> Data() {
		if (lines != null) {
			BigLogPatInterface pattern = FindPat(lines.first());
			if (pattern != null) {
				JavaRDD<BigLogMapperInterface> data = lines.map(s -> pattern.parseLine(s)).filter(s -> s != null).cache();
				return data;
			}
		}
		return null;
	}
}
