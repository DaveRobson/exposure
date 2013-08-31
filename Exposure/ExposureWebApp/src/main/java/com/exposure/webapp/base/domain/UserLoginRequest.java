package com.exposure.webapp.base.domain;

/**
 * Object holding details for a user tring to login in 
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class UserLoginRequest extends CommonDomainBase
{
	private String emailAddress;
	private String password;
	
	public UserLoginRequest()
	{
		this("","");
	}
	
	public UserLoginRequest(String emailAddress, String password)
	{
		this.emailAddress = emailAddress;
		this.password = password;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
