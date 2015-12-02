package fr.uha.quatre02.biglog;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.junit.Before;
import org.junit.Test;

import fr.uha.quatre02.biglog.data.BigLogMapperInterface;

public class BigLogStatsTest {

	private String pathFile = "/Users/MaT/Dev/Web/Projet/BigLog/js-project-eu/*";
	private BigLogStats bls;
	private JavaRDD<BigLogMapperInterface> data;
	
	@Before
	public void setUp() {
		data = new BigLogAnalyze().ReadFile(pathFile).Data();
		bls = new BigLogStats(data);
	}
	
	@Test
	public void TestCountCode200() {
		long count = bls.CountHttpCode(200);
		assertEquals(8570, count);
	}
	
	@Test
	public void TestCountCode304() {
		long count = bls.CountHttpCode(304);
		assertEquals(28950, count);
	}
	
	@Test
	public void TestMoyenCode200() {
		double count = bls.PerCentHttpCode(200);
		assertEquals(22.83, count, 0.01);
	
	}
	
	@Test 
	public void TestLatestDate() {
		Date date = bls.GetLatestDate();
		assertEquals("Thu Oct 29 19:00:00 CET 2015", date.toString());
	}
	
	@Test
	public void TestHourResult() {
		List<BigLogStatsResult> list = bls.reduceHour();
		assertEquals(null, list);
	}
	
	

}
