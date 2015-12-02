package fr.uha.quatre02.biglog;

import static org.junit.Assert.*;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import org.junit.Test;

public class BigLogSparkTest {

	BigLogSpark bls;

	@Test
	public void Create() {
		bls = new BigLogSpark();

		assertNotNull(bls);
	}

	@Test
	public void Context() {
		JavaSparkContext context = BigLogSpark.getInstance();

		assertNotNull(context);
	}

	@Test
	public void LogLines() {
		String pathLogFile = "/Users/MaT/Dev/Web/Projet/BigLog/key/test";

		JavaRDD<String> logLines = BigLogSpark.getInstance().textFile(pathLogFile);

		assertNotNull(logLines);
	}

}
