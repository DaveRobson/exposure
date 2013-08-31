package com.exposure.webapp.app;

import org.apache.wicket.Page;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import com.exposure.webapp.app.home.HomePage;
import com.exposure.webapp.app.login.LoginPage;

/**
 * 
 * @author David
 *
 */
public class ExposureApplication extends AuthenticatedWebApplication
{
	@Override
	protected void init() 
	{
		getComponentInstantiationListeners().add(new SpringComponentInjector(this));
		
		getDebugSettings().setDevelopmentUtilitiesEnabled(true);
		
		getMarkupSettings().setStripWicketTags(true);

		super.init();
	}
	
	@Override
	public Class<? extends Page> getHomePage() 
	{
		return HomePage.class;
	}

	@Override
	protected Class<? extends WebPage> getSignInPageClass() 
	{
		return LoginPage.class;
	}

	@Override
	protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() 
	{
		return ExposureSession.class;
	}
}
