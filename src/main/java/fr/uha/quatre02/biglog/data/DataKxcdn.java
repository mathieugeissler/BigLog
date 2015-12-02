package fr.uha.quatre02.biglog.data;


public class DataKxcdn {

	public DataKxcdn(String timestamp, String pop, String ip, String httpCode, String bytesSent, String userID, String zoneID,
			String zoneURL, String cacheStatus, String clfRequest, String clfDate, String referrer, String agent,
			String scheme, String countryCode, String countryName, String city, String region, String latitude,
			String longitude, String organization) {
		super();
		this.timestamp = Double.parseDouble(timestamp);
		this.pop = pop;
		this.ip = ip;
		this.httpCode = Integer.parseInt(httpCode);
		this.bytesSent = Integer.parseInt(bytesSent);
		this.userID = userID;
		this.zoneID = zoneID;
		this.zoneURL = zoneURL;
		this.cacheStatus = cacheStatus;
		this.clfRequest = clfRequest;
		this.clfDate = clfDate;
		this.referrer = referrer;
		this.agent = agent;
		this.scheme = scheme;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.city = city;
		this.region = Integer.parseInt(region);
		this.latitude = Double.parseDouble(latitude);
		this.longitude = Double.parseDouble(longitude);
		this.organization = organization;
	}

	public DataKxcdn() {
		// TODO Auto-generated constructor stub
	}

	private double timestamp;
	private String pop;
	private String ip;
	private int httpCode;
	private int bytesSent;
	private String userID;
	private String zoneID;
	private String zoneURL;
	private String cacheStatus;
	private String clfRequest;
	private String clfDate;
	private String referrer;
	private String agent;
	private String scheme;
	private String countryCode;
	private String countryName;
	private String city;
	private int region;
	private double latitude;
	private double longitude;
	private String organization;
	
	
	// SETTER
	public void setTimestamp(double timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setPop(String pop) {
		this.pop = pop;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}

	public void setBytesSent(int bytesSent) {
		this.bytesSent = bytesSent;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setZoneID(String zoneID) {
		this.zoneID = zoneID;
	}
	
	public void setZoneURL(String zoneURL) {
		this.zoneURL = zoneURL;
	}
	
	public void setCacheStatus(String cacheStatus) {
		this.cacheStatus = cacheStatus;
	}
	
	public void setClfRequest(String clfRequest) {
		this.clfRequest = clfRequest;
	}
	
	public void setClfDate(String clfDate) {
		this.clfDate = clfDate;
	}
	
	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}
	
	public void setAgent(String agent) {
		this.agent = agent;
	}
	
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setRegion(int region) {
		this.region = region;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	// GETTER
	public double getTimestamp() {
		return timestamp;
	}

	public String getPop() {
		return pop;
	}

	public String getIp() {
		return ip;
	}

	public int getHttpCode() {
		return httpCode;
	}

	public int getBytesSent() {
		return bytesSent;
	}

	public String getUserID() {
		return userID;
	}

	public String getZoneID() {
		return zoneID;
	}

	public String getZoneURL() {
		return zoneURL;
	}

	public String getCacheStatus() {
		return cacheStatus;
	}

	public String getClfRequest() {
		return clfRequest;
	}

	public String getClfDate() {
		return clfDate;
	}

	public String getReferrer() {
		return referrer;
	}	

	public String getAgent() {
		return agent;
	}

	public String getScheme() {
		return scheme;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}	

	public String getCity() {
		return city;
	}

	public int getRegion() {
		return region;
	}

	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public String getOrganization() {
		return organization;
	}

}
