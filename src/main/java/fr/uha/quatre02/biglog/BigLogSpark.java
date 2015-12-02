package fr.uha.quatre02.biglog;

import java.io.Serializable;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class BigLogSpark implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6317841427633487847L;
	static String appName = "BigLog";
	static String appHost = "local[*]";
	
	static final SparkConf sparkConf = new SparkConf().setMaster(appHost).setAppName(appName);
	
	private static JavaSparkContext INSTANCE = null;
	
	public static JavaSparkContext getInstance()
	{
		if(INSTANCE == null) {
			INSTANCE = new JavaSparkContext(sparkConf);
		}
		return INSTANCE;
	}
	
	private Object readResolve() {
		return INSTANCE;
	}
	
	
	

}
