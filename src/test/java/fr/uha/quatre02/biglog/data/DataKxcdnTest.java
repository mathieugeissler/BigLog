package fr.uha.quatre02.biglog.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.uha.quatre02.biglog.data.DataKxcdn;

public class DataKxcdnTest {

	private DataKxcdn dataKxcdn;

	@Before
	public void setUp() {
		dataKxcdn = new DataKxcdn();
	}

	@Test
	public void test() {
		assertNotNull(dataKxcdn);
	}

	@Test
	public void TimestampTest() {
		double timestamp = 1446147003.793;
		dataKxcdn.setTimestamp(timestamp);

		double getTimestamp = dataKxcdn.getTimestamp();
		
		assertEquals(timestamp, getTimestamp, 0.001);
	}

	@Test
	public void PopTest() {
		String pop = "jptk";
		dataKxcdn.setPop(pop);
		
		String getPoP = dataKxcdn.getPop();
		
		assertEquals(pop, getPoP);
	}
	
	@Test
	public void IpTest() {
		String ip = "203.105.73.50";
		dataKxcdn.setIp(ip);
		
		String getIp = dataKxcdn.getIp();
		
		assertEquals(ip, getIp);
	}
	
	@Test
	public void HttpCodeTest() {
		int httpCode = 200;
		dataKxcdn.setHttpCode(httpCode);
		
		int getHttpCode = dataKxcdn.getHttpCode();
		
		assertEquals(httpCode, getHttpCode);
	}
	
	@Test
	public void BytesSentTest() {
		int bytesSent = 98421;
		dataKxcdn.setBytesSent(bytesSent);
		
		int getBytesSent = dataKxcdn.getBytesSent();
		
		assertEquals(bytesSent, getBytesSent);
	}
	
	@Test
	public void UserIDTest() {
		String userID = "uid7249";
		dataKxcdn.setUserID(userID);
		
		String getUserID = dataKxcdn.getUserID();
		
		assertEquals(userID, getUserID);
	}
	
	@Test
	public void ZoneIDTest() {
		String zoneID = "zid15070";
		dataKxcdn.setZoneID(zoneID);
		
		String getZoneID = dataKxcdn.getZoneID();
		
		assertEquals(zoneID, getZoneID);
	}
	
	@Test
	public void ZonURLTest() {
		String zoneURL = "bp-1c51.kxcdn.com";
		dataKxcdn.setZoneURL(zoneURL);
		
		String getZoneURL = dataKxcdn.getZoneURL();
		
		assertEquals(zoneURL, getZoneURL);
	}

	@Test
	public void CacheStatusTest() {
		String cacheStatus = "HIT";
		dataKxcdn.setCacheStatus(cacheStatus);
		
		String getCacheStatus = dataKxcdn.getCacheStatus();
		
		assertEquals(cacheStatus, getCacheStatus);
	}
	
	@Test
	public void ClfRequestTest() {
		String clfRequest = "\"GET /listener/18D6C8F6DE322EE1D29E7637494FF2A3.cache.js HTTP/1.1\"";
		dataKxcdn.setClfRequest(clfRequest);
		
		String getClfRequest = dataKxcdn.getClfRequest();
		
		assertEquals(clfRequest, getClfRequest);
	}
	
	@Test
	public void ClfDateTest() {
		String clfDate = "[29/Oct/2015:20:30:03 +0100]";
		dataKxcdn.setClfDate(clfDate);
		
		String getClfDate = dataKxcdn.getClfDate();
		
		assertEquals(clfDate, getClfDate);
	}
	
	@Test
	public void ReferrerTest() {
		String referrer = "\"http://www.montblanc.cn/zh-cn/home.html\"";
		dataKxcdn.setReferrer(referrer);
		
		String getReferrer = dataKxcdn.getReferrer();
		
		assertEquals(referrer, getReferrer);
	}
	
	@Test
	public void AgentTest() {
		String agent = "\"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:24.0; GomezAgent 3.0) Gecko/20100101 Firefox/24.0\"";
		dataKxcdn.setAgent(agent);
		
		String getAgent = dataKxcdn.getAgent();
		
		assertEquals(agent, getAgent);
	}
	
	@Test
	public void SchemeTest() {
		String scheme = "http";
		dataKxcdn.setScheme(scheme);
		
		String getScheme = dataKxcdn.getScheme();
		
		assertEquals(scheme, getScheme);
	}
	
	@Test
	public void CountryCodeTest() {
		String countryCode = "JP";
		dataKxcdn.setCountryCode(countryCode);
		
		String getCountryCode = dataKxcdn.getCountryCode();
		
		assertEquals(countryCode, getCountryCode);
	}
	
	@Test
	public void CountryNameTest() {
		String countryName = "Japan";
		dataKxcdn.setCountryName(countryName);
		
		String getCountryName = dataKxcdn.getCountryName();
		
		assertEquals(countryName, getCountryName);
	}
	
	@Test
	public void CityTest() {
		String city = "Tokyo";
		dataKxcdn.setCity(city);
		
		String getCity = dataKxcdn.getCity();
		
		assertEquals(city, getCity);
	}
	
	@Test
	public void RegionTest() {
		int region = 40;
		dataKxcdn.setRegion(region);
		
		int getRegion = dataKxcdn.getRegion();
		
		assertEquals(region, getRegion);
	}
	
	@Test
	public void LatitudeTest() {
		double latitude = 35.6850;
		dataKxcdn.setLatitude(latitude);
		
		double getLatitude = dataKxcdn.getLatitude();
		
		assertEquals(latitude, getLatitude, 0.0001);
	}
	
	@Test
	public void LongitudeTest() {
		double longitude = 139.7514;
		dataKxcdn.setLongitude(longitude);
		
		double getLongitude = dataKxcdn.getLongitude();
		
		assertEquals(longitude, getLongitude, 0.0001);
	}
	
	@Test
	public void OrganizationTest() {
		String organization = "AS2914 NTT America, Inc.";
		dataKxcdn.setOrganization(organization);
		
		String getOrganization = dataKxcdn.getOrganization();
		
		assertEquals(organization, getOrganization);
	}
}
