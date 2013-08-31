package com.exposure.webapp.base.page;

import org.apache.wicket.markup.head.CssUrlReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;

import com.exposure.webapp.app.home.HomePage;
import com.exposure.webapp.app.login.LoginPage;
import com.exposure.webapp.base.nav.MenuItem;
import com.exposure.webapp.base.nav.Navbar;

/**
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public abstract class AbstractPage extends WebPage
{
	
	public AbstractPage() 
	{
		add(new Navbar.Builder("navbar", HomePage.class, "Exposure", MenuItem.NONE)
					  .withMenuItem(MenuItem.SIGN_IN, LoginPage.class)
					  .build());
	}
	
	@Override
	public void renderHead(IHeaderResponse response) 
	{
	    super.renderHead(response);

	    response.render(JavaScriptHeaderItem.forReference(getApplication().getJavaScriptLibrarySettings()
	            .getJQueryReference()));  
	    
		response.render(CssUrlReferenceHeaderItem.forUrl("css/main.css"));
	}
}
