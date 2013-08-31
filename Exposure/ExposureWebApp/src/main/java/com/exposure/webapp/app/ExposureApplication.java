package com.exposure.webapp.app;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.exposure.webapp.app.home.HomePage;

public class ExposureApplication extends WebApplication
{

	@Override
	public Class<? extends Page> getHomePage() 
	{
		return HomePage.class;
	}

}
