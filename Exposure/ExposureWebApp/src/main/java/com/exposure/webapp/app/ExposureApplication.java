package com.exposure.webapp.app;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.authroles.authorization.strategies.role.RoleAuthorizationStrategy;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import com.exposure.webapp.app.home.HomePage;
import com.exposure.webapp.app.login.LoginPage;
import com.exposure.webapp.app.login.service.LoginService;

/**
 * 
 * @author David
 *
 */
public class ExposureApplication extends AuthenticatedWebApplication
{
	private LoginService loginService;
	
	@Override
	protected void init() 
	{
		getComponentInstantiationListeners().add(new SpringComponentInjector(this));
		
		getDebugSettings().setDevelopmentUtilitiesEnabled(true);
		
		getMarkupSettings().setStripWicketTags(true);
		
        getSecuritySettings().setAuthorizationStrategy(
                new RoleAuthorizationStrategy(new UserRolesAuthorizer()));

		super.init();
	}
	
	@Override
	public Class<? extends Page> getHomePage() 
	{
		return HomePage.class;
	}
	
	@Override
	public Session newSession(Request request, Response response)
	{
	    return new ExposureSession(request, loginService);
	}

	@Override
	protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() 
	{
		return ExposureSession.class;
	}

	@Override
	protected Class<? extends WebPage> getSignInPageClass() {
		return LoginPage.class;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
