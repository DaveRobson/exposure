package com.exposure.webapp.app;

import org.apache.wicket.Session;
import org.apache.wicket.authroles.authorization.strategies.role.IRoleCheckingStrategy;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;

public class UserRolesAuthorizer implements IRoleCheckingStrategy
{

    /**
     * Construct.
     */
    public UserRolesAuthorizer()
    {
    }

    /**
     * @see org.apache.wicket.authorization.strategies.role.IRoleCheckingStrategy#hasAnyRole(Roles)
     */
    public boolean hasAnyRole(Roles roles)
    {
        ExposureSession authSession = (ExposureSession)Session.get();
        return authSession.getUser().hasAnyRole(roles);
    }

}
