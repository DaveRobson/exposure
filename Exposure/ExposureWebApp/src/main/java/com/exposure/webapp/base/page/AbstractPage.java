package com.exposure.webapp.base.page;

import com.exposure.webapp.app.contacts.ContactsPage;
import com.exposure.webapp.app.home.HomePage;
import com.exposure.webapp.base.nav.MenuItem;
import com.exposure.webapp.base.nav.Navbar;

/**
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public abstract class AbstractPage extends BasePage
{
	
	public AbstractPage() 
	{
		add(new Navbar.Builder("navbar", HomePage.class, "Exposure", MenuItem.NONE)
					  .withMenuItem(MenuItem.HOME, HomePage.class)
					  .withMenuItem(MenuItem.CONTACTS, ContactsPage.class)
					  .inverse()
					  .build());
	}
	
}
