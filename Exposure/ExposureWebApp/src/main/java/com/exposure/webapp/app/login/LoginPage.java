package com.exposure.webapp.app.login;

import org.apache.wicket.markup.html.basic.Label;

import com.exposure.webapp.base.page.AbstractPage;
import com.exposure.webapp.base.page.BasePage;

@SuppressWarnings("serial")
public class LoginPage extends BasePage
{
	public LoginPage() 
	{
		add(new Label("heading", "Exposure CRM"));
		add(new Label("subheading", "The photography oriented crm system"));
		
		add(new LoginPanel("loginForm"));
	}
}
