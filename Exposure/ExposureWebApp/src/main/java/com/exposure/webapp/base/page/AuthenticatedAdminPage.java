package com.exposure.webapp.base.page;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;

@AuthorizeInstantiation("ADMIN")
@SuppressWarnings("serial")
public class AuthenticatedAdminPage extends AbstractPage
{

}
