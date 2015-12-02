package fr.uha.quatre02.biglog;

import java.io.Serializable;

public class BigLogStatsResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -411982595395502947L;
	private long httpCode200 = 0;
	private long httpCode304;
	
	private long bytesTotal;

	public long getHttpCode200() {
		return httpCode200;
	}

	public void setHttpCode200() {
		this.httpCode200++;
	}

	public long getHttpCode304() {
		return httpCode304;
	}

	public void setHttpCode304(long httpCode304) {
		this.httpCode304 = httpCode304;
	}

	public long getBytesTotal() {
		return bytesTotal;
	}

	public void setBytesTotal(long bytesTotal) {
		this.bytesTotal = bytesTotal;
	}
	
}
