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
	
	public Contact(String displayHeading, String displayText)
	{
		this.displayHeading = displayHeading;
		this.displayText = displayText;
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
	
	
}
