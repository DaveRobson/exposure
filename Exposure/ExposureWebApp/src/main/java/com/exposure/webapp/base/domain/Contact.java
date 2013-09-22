package com.exposure.webapp.base.domain;

/**
 * Temp object for the contacts page
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class Contact extends CommonDomainBase 
{
	private String displayHeading;
	private String displayText;
	
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	
	public Contact()
	{
		
	}
	
	public Contact(String firstName, String lastName, String emailAddress, String phoneNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		
		this.displayHeading = firstName + " " + lastName + " - " + phoneNumber;
		this.displayText = emailAddress;
	}

	public String getDisplayHeading() {
		return displayHeading;
	}

	public void setDisplayHeading(String displayHeading) {
		this.displayHeading = displayHeading;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
