package com.exposure.webapp.app;

import org.apache.wicket.Session;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

import com.exposure.webapp.app.login.service.LoginService;
import com.exposure.webapp.base.domain.LoggedInUser;
import com.exposure.webapp.base.domain.User;
import com.exposure.webapp.base.domain.UserLoginRequest;

/**
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class ExposureSession extends AuthenticatedWebSession
{
	private LoginService loginService;
	
	//Logged in user
	private LoggedInUser user;

	public ExposureSession(Request request, LoginService loginService) 
	{
		super(request);
		
		this.loginService = loginService;
	}
	
	public static ExposureSession get()
	{
		return ExposureSession.class.cast(Session.get());
	}
	
	 /**
     * Checks the given email address and password, returning a User object if the email address and
     * password identify a valid user.
     * 
     * @param emailAddress
     *            The email address
     * @param password
     *            The password
     * @return True if the user was authenticated
     */
    @Override
    public final boolean authenticate(final String emailAddress, final String password)
    {

        if (user == null)
        {	
        	user = loginService.authenticateUser(new UserLoginRequest(emailAddress, password));
        }

        return user != null;
    }
	
	
	public User getUser() {
		return user;
	}

	public void setUser(LoggedInUser user) {
		this.user = user;
	}

	@Override
	public Roles getRoles() 
	{
       if (isSignedIn())
        {
            // If the user is signed in, they have these roles
            return user.getRoles();
        }
        return null;
	}

}
