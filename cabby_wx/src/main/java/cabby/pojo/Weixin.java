/**
 * This file created at 2016年6月28日.
 *
 * Copyright (c) 2002-2016 Bingosoft, Inc. All rights reserved.
 */
package cabby.pojo;

/**
 * <code>{@link Weixin}</code>
 *
 * TODO : document me
 *
 * @author Administrator
 */
public class Weixin extends BaseDomain{
	private String Appid;//wx2907aeb92ae661f0
	private String TimesTamp;//1467099817
	private String NonceStr;//88238f0c09ea473d9df775e899ac0aea
	private String Signature;//1d3f88bcd13fdd8ad8a81c9b481d30af2971363a
	
	/**
	 * 
	 */
	public Weixin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param appid
	 * @param timesTamp
	 * @param nonceStr
	 * @param signature
	 */
	public Weixin(String appid, String timesTamp, String nonceStr,
			String signature) {
		Appid = appid;
		TimesTamp = timesTamp;
		NonceStr = nonceStr;
		Signature = signature;
	}

	/**
	 * @return the appid
	 */
	public String getAppid() {
		return Appid;
	}

	/**
	 * @param appid the appid to set
	 */
	public void setAppid(String appid) {
		Appid = appid;
	}

	/**
	 * @return the timesTamp
	 */
	public String getTimesTamp() {
		return TimesTamp;
	}

	/**
	 * @param timesTamp the timesTamp to set
	 */
	public void setTimesTamp(String timesTamp) {
		TimesTamp = timesTamp;
	}

	/**
	 * @return the nonceStr
	 */
	public String getNonceStr() {
		return NonceStr;
	}

	/**
	 * @param nonceStr the nonceStr to set
	 */
	public void setNonceStr(String nonceStr) {
		NonceStr = nonceStr;
	}

	/**
	 * @return the signature
	 */
	public String getSignature() {
		return Signature;
	}

	/**
	 * @param signature the signature to set
	 */
	public void setSignature(String signature) {
		Signature = signature;
	}
	
	

}
