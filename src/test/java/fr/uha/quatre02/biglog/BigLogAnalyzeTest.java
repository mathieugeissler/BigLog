package fr.uha.quatre02.biglog;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.apache.spark.api.java.JavaRDD;
import org.junit.Before;
import org.junit.Test;

import fr.uha.quatre02.biglog.data.BigLogMapperInterface;

public class BigLogAnalyzeTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4691788468834091178L;
	private BigLogAnalyze bla;
	private String pathFile = "/Users/MaT/Dev/Web/Projet/BigLog/js-project-eu/*";

	@Before
	public void setUp() {
		bla = new BigLogAnalyze();
	}

	@Test
	public void Test() {
		assertNotNull(bla);
	}

	@Test
	public void countTest() {
		JavaRDD<BigLogMapperInterface> data = bla.ReadFile(pathFile).Data();
		long count = data.count();
		
		assertEquals(37538, count);
	}

	@Test
	public void DataTest() {
		JavaRDD<BigLogMapperInterface> data = bla.ReadFile(pathFile).Data();
		long count = data.filter(s -> s.MapHttpCode() == 304).count();
		assertEquals(28950, count);
	}
	
	
}
