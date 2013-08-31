package com.exposure.webapp.base.nav;

import java.util.Collection;
import java.util.List;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.RepeatingView;

import com.exposure.webapp.base.page.AbstractPage;

@SuppressWarnings("serial")
public class MenuDropdownItem extends Panel
{

	public MenuDropdownItem(String id, MenuItem currentMenuItem, Collection<BookmarkablePageLink<Class<? extends AbstractPage>>> linksInMenuItem, boolean shouldBeActive) 
	{
		super(id);
		
		WebMarkupContainer itemContainer = new WebMarkupContainer("itemContainer"); 
        if (shouldBeActive) {
            itemContainer.add(new AttributeAppender("class", " active "));
        }
        itemContainer.add(new Label("label", currentMenuItem.toString()));
 
        RepeatingView repeatingView = new RepeatingView("itemLinks");
 
        for (BookmarkablePageLink<Class<? extends AbstractPage>> link : linksInMenuItem) 
        { 
            MenuLinkItem menuLinkItem = new MenuLinkItem(repeatingView.newChildId(), link, false);
            repeatingView.add(menuLinkItem);
        }
 
        itemContainer.add(repeatingView);
        add(itemContainer);
	}

}
