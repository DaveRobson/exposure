package com.exposure.webapp.base.nav;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.model.Model;

import com.exposure.webapp.base.page.AbstractPage;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

@SuppressWarnings("serial")
public class Navbar extends Panel
{

	public Navbar(final Builder builder) 
	{
		super(builder.id);
		
		BookmarkablePageLink<Class<? extends AbstractPage>> homePageLink = new BookmarkablePageLink<Class<? extends AbstractPage>>("homePageLink", builder.homePage);
	    homePageLink.add(new Label("label", builder.applicationName).setRenderBodyOnly(true));
	    add(homePageLink);
	 
	    RepeatingView repeatingView = new RepeatingView("menuItems");
	 
	    for (MenuItem item : builder.linksMap.keySet()) 
	    {
	        boolean shouldBeActive = item.equals(builder.activeMenuItem);
	 
	        Collection<BookmarkablePageLink<Class<? extends AbstractPage>>> linksInThisMenuItem = builder.linksMap.get(item);
	 
	        if (linksInThisMenuItem.size() == 1) 
	        {
	            BookmarkablePageLink<Class<? extends AbstractPage>> pageLink = Iterables.get(linksInThisMenuItem, 0);
	 
	            MenuLinkItem menuLinkItem = new MenuLinkItem(repeatingView.newChildId(), pageLink, shouldBeActive);
	            repeatingView.add(menuLinkItem);
	        } 
	        else 
	        {   
	            repeatingView.add(new MenuDropdownItem(repeatingView.newChildId(), item, linksInThisMenuItem,
	                    shouldBeActive));
	        }
	    }
	 
	    add(repeatingView);
	}

	
	@SuppressWarnings("serial")
	public static class Builder implements Serializable 
	{
		 
        private String id;
        private Class<? extends AbstractPage> homePage;
        private String applicationName;
        private MenuItem activeMenuItem;
 
        private Multimap<MenuItem, BookmarkablePageLink<Class<? extends AbstractPage>>> linksMap = LinkedHashMultimap.create(); 
 
  
        public Builder(String id, Class<? extends AbstractPage> homePage, String applicationName, MenuItem activeMenuItem) 
        {
            this.id = id;
            this.homePage = homePage;
            this.applicationName = applicationName;
            this.activeMenuItem = activeMenuItem;
        }
 
        public Builder withMenuItem(MenuItem menuItem, Class<? extends AbstractPage> pageToLink) 
        { 
            Preconditions.checkState(linksMap.containsKey(menuItem) == false, "Builder already contains " + menuItem +
                    ". Please use withMenuItemInDropdown if you need many links in one menu item");
            
            BookmarkablePageLink<Class<? extends AbstractPage>> link = new BookmarkablePageLink<Class<? extends AbstractPage>>("link", pageToLink);
            link.setBody(new Model<String>(menuItem.toString()));
            linksMap.put(menuItem, link);
            return this;
        }
        
        public Navbar build()
        {
        	return new Navbar(this);
        }
 
    }
}
