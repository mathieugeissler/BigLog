package fr.uha.quatre02.biglog.data;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataAmazonS3 implements BigLogMapperInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 814532302743184546L;
	private String bucketOwner;
	private String bucket;
	private Date dateTime;
	private String ip;
	private String requester;
	private String requestId;
	private String operation;
	private String key;
	private String requestUri;
	private String httpCode;
	private String errorCode;
	private String bytesSent;
	private String objectSize;
	private String totalTime;
	private String aroundTime;
	private String referrer;
	private String userAgent;
	private String versionId;

	public DataAmazonS3(String bucketOwner, String bucket, String dateTime, String ip, String requester,
			String requestId, String operation, String key, String requestUri, String httpCode, String errorCode,
			String bytesSent, String objectSize, String totalTime, String aroundTime, String referrer, String userAgent,
			String versionId) {
		super();
		this.bucketOwner = bucketOwner;
		this.bucket = bucket;
		this.dateTime = FormatDate(dateTime);
		this.ip = ip;
		this.requester = requester;
		this.requestId = requestId;
		this.operation = operation;
		this.key = key;
		this.requestUri = requestUri;
		this.httpCode = httpCode;
		this.errorCode = errorCode;
		this.bytesSent = bytesSent;
		this.objectSize = objectSize;
		this.totalTime = totalTime;
		this.aroundTime = aroundTime;
		this.referrer = referrer;
		this.userAgent = userAgent;
		this.versionId = versionId;
	}

	public DataAmazonS3() {

	}

	public String CheckTiret(String text) {
		if (text.matches("-")) {
			return null;
		}
		return text;
	}

	// SETTER
	public void setBucketOwner(String bucketOwner) {
		this.bucketOwner = bucketOwner;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = FormatDate(dateTime);
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setKey(String key) {
		this.key = key;

	}

	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public void setBytesSent(String bytesSent) {
		this.bytesSent = bytesSent;
	}

	public void setObjectSize(String objectSize) {
		this.objectSize = objectSize;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	public void setAroundTime(String aroundTime) {
		this.aroundTime = aroundTime;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	// GETTER
	public String getBucketOwner() {
		return bucketOwner;
	}

	public String getBucket() {
		return bucket;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public String getIp() {
		return ip;
	}

	public String getRequester() {
		return requester;
	}

	public String getRequestId() {
		return requestId;
	}

	public String getOperation() {
		return operation;
	}

	public String getKey() {
		return key;
	}

	public String getRequestUri() {
		return requestUri;
	}

	public String getHttpCode() {
		return httpCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getBytesSent() {
		return bytesSent;
	}

	public String getObjectSize() {
		return objectSize;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public String getAroundTime() {
		return aroundTime;
	}

	public String getReferrer() {
		return referrer;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public String getVersionId() {
		return versionId;
	}

	public Date FormatDate(String dateS) {
		DateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss ZZZZ", Locale.ENGLISH);
		Date date = null;
		try {
			date = formatter.parse(dateS);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	// LogMapper
	
	@Override
	public Integer MapHttpCode() {
		if (this.httpCode.equals("-")) {
			return null;
		}
		return Integer.parseInt(this.httpCode);
	}
	

	@Override
	public Date MapDate() {
		return this.dateTime;
	}

	@Override
	public String MapReferrer() {
		return this.referrer;
	}

	@Override
	public Integer MapBytesSent() {
		if(this.bytesSent.matches("-")) {
			return null;
		}
		return Integer.parseInt(this.bytesSent);
	}

	@Override
	public String MapUserAgent() {
		return this.userAgent;
	}

	@Override
	public Integer MapTotalTime() {
		if(this.totalTime.matches("-")) {
			return null;
		}
		return Integer.parseInt(this.totalTime);
	}

	@Override
	public String MapLocalisation() {
		return null;
	}

}
