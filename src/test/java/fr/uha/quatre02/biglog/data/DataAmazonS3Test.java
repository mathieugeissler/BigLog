package fr.uha.quatre02.biglog.data;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DataAmazonS3Test {
	
	private DataAmazonS3 dataAS3;
	
	@Before
	public void setUp() {
		dataAS3 = new DataAmazonS3();
	}

	@Test
	public void Test() {
		DataAmazonS3 bld = new DataAmazonS3();

		assertNotNull(bld);
	}

	@Test
	public void IpTest() {
		String ip = "92.140.43.9";
		dataAS3.setIp(ip);

		String getIp = dataAS3.getIp();

		assertEquals(ip, getIp);
	}

	@Test
	public void DateTimeTest() {
		String dateTime = "28/Oct/2015:23:02:00 +0000";
		dataAS3.setDateTime(dateTime);

		Date getDateTime = dataAS3.getDateTime();

		assertEquals("Thu Oct 29 00:02:00 CET 2015", getDateTime.toString());
	}

	@Test
	public void KeyTest() {
		String key = "AS-2312664.js";
		dataAS3.setKey(key);

		String getKey = dataAS3.getKey();

		assertEquals(key, getKey);
	}

	@Test
	public void HttpCodeTest() {
		String httpCode = "200";
		dataAS3.setHttpCode(httpCode);

		String getHttpCode = dataAS3.getHttpCode();

		assertEquals(httpCode, getHttpCode);
	}

	@Test
	public void RequestUriTest() {
		String requestUri = "\"GET /js-project/AS-2312790.js HTTP/1.1\"";
		dataAS3.setRequestUri(requestUri);

		String getRequestUri = dataAS3.getRequestUri();

		assertEquals(requestUri, getRequestUri);
	}

	@Test
	public void UserAgentTest() {
		String userAgent = "\"Mozilla/5.0 (Windows NT 10.0; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0\"";
		dataAS3.setUserAgent(userAgent);

		String getUserAgent = dataAS3.getUserAgent();

		assertEquals(userAgent, getUserAgent);
	}

	@Test
	public void BucketOwnerTest() {
		String bucketOwner = "d9a6da0c289240ff708bb11a2f9449da0a604afa90c83d118fa0c9c326085bed";
		dataAS3.setBucketOwner(bucketOwner);

		String getBucketOwner = dataAS3.getBucketOwner();

		assertEquals(bucketOwner, getBucketOwner);
	}

	@Test
	public void ReferrerTest() {
		String referrer = "\"http://www.xl.com/promotions-billets-avion?xlp=f&xts=514130&xtor=AL-49-[Public_Idees]-22693[ad6media_site_under_fr_]-[0]-32575[promotions_xl]-[lien]&xtdt=24101221\"";
		dataAS3.setReferrer(referrer);

		String getReferrer = dataAS3.getReferrer();

		assertEquals(referrer, getReferrer);
	}

	@Test
	public void BucketTest() {
		String bucket = "js-project";
		dataAS3.setBucket(bucket);

		String getBucket = dataAS3.getBucket();

		assertEquals(bucket, getBucket);
	}

	@Test
	public void RequestIdTest() {
		String requestId = "C9CE28D09C29DEC0";
		dataAS3.setRequestId(requestId);

		String getRequestId = dataAS3.getRequestId();

		assertEquals(requestId, getRequestId);
	}

	@Test
	public void BytesSentTest() {
		String bytesSent = "4609";
		dataAS3.setBytesSent(bytesSent);

		String getBytesSent = dataAS3.getBytesSent();

		assertEquals(bytesSent, getBytesSent);
	}

	@Test
	public void ObjectSizeTest() {
		String objectSize = "4609";
		dataAS3.setObjectSize(objectSize);

		String getObjectSize = dataAS3.getObjectSize();

		assertEquals(objectSize, getObjectSize);
	}

	@Test
	public void TotalTimeTest() {
		String totalTime = "14";
		dataAS3.setTotalTime(totalTime);

		String getTotalTime = dataAS3.getTotalTime();

		assertEquals(totalTime, getTotalTime);
	}

}
