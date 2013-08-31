package com.exposure.webapp.app.home;

import org.apache.wicket.markup.html.basic.Label;

import com.exposure.webapp.base.page.AuthenticatedUserPage;

@SuppressWarnings("serial")
public class HomePage extends AuthenticatedUserPage
{
	public HomePage() 
	{
		add(new Label("message", "Home Page"));
	}
}
