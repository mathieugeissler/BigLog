package fr.uha.quatre02.biglog;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

import fr.uha.quatre02.biglog.data.BigLogMapperInterface;
import scala.Tuple2;

public class BigLogStats implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6334864465312421951L;
	private JavaRDD<BigLogMapperInterface> data;
	private long countLines;
	private Date latestDate;
	private int currentHour;
	private BigLogStatsResult newResult = new BigLogStatsResult();
	private List<BigLogStatsResult> resultList = null;
	
	public BigLogStats(JavaRDD<BigLogMapperInterface> getData) {
		this.data = getData;
		this.countLines = CountNbLines();
		this.latestDate = GetLatestDate();
	}

	public long CountHttpCode(int i) {
		return data.filter(s -> s.MapHttpCode() == i).count();	
	}

	public double PerCentHttpCode(int code) {
		double count = (double) (CountHttpCode(code)*100) 
				/ this.countLines;
		return arrondir(count, 2);
	}
	
	public Date GetLatestDate() {
		Date dateReduce = data.map(s -> s.MapDate())
		.reduce(new Function2<Date, Date, Date>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -7823240975741280014L;

			@Override
			public Date call(Date v1, Date v2) throws Exception {
				if(v1.before(v2)) {
					return v1;
				}
				return v2;
			}
			
		});
		
		return dateReduce;
	}
	
	public JavaRDD<Object> reduceHour() {	
		currentHour = latestDate.getHours();
		  JavaRDD<Object> test = data.map(s -> ResultData(s));
		return test;	
	}
	
	private List<BigLogStatsResult> ResultData(BigLogMapperInterface s) {
		if(s.MapDate().getHours() == currentHour) {
			if(s.MapHttpCode() == 200) {
				newResult.setHttpCode200();
			}
		} else {
			resultList.add(newResult);
			newResult = new BigLogStatsResult();
			currentHour = s.MapDate().getHours();
		}
		return resultList;	
	}
	
	
	private double arrondir(double nombre,double nbApVirg)
	{
		return(double)((int)(nombre * Math.pow(10,nbApVirg) + .5)) / Math.pow(10,nbApVirg);
	}
	
	private long CountNbLines() {
		return data.count();
	}
	

}
