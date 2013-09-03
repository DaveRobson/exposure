package com.exposure.webapp.base.nav;

public enum MenuItem 
{
	NONE(""),
	SIGN_IN("Sign in"),
	FEATURES("Features"),
	CONTACTS("Contacts"),
	HOME("Home");
	
	private String label;
	
	private MenuItem(String label)
	{
		this.label = label;
	}
	
	@Override
	public String toString() 
	{
		return label;
	}
}
