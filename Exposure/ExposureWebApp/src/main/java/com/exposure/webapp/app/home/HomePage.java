package com.exposure.webapp.app.home;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

@SuppressWarnings("serial")
public class HomePage extends WebPage
{
	public HomePage() 
	{
		add(new Label("message", "Hello World"));
	}
}
