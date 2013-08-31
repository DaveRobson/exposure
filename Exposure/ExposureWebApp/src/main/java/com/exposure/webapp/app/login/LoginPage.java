package com.exposure.webapp.app.login;

import org.apache.wicket.markup.html.basic.Label;

import com.exposure.webapp.base.page.AbstractPage;

@SuppressWarnings("serial")
public class LoginPage extends AbstractPage
{
	public LoginPage() 
	{
		add(new Label("message", "Login Page"));
	}
}
