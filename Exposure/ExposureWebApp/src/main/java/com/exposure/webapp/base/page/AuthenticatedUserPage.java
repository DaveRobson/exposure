package com.exposure.webapp.base.page;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;

@AuthorizeInstantiation("USER")
@SuppressWarnings("serial")
public class AuthenticatedUserPage extends AbstractPage
{
	
}
