package com.exposure.webapp.base.nav;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

@SuppressWarnings("serial")
public class MenuLinkItem extends Panel
{
	public MenuLinkItem(String id, BookmarkablePageLink<?> pageLink, Boolean shouldBeActive)
	{
		super(id);
		
		add(pageLink);
        if (shouldBeActive) 
        {
            add(new AttributeAppender("class", " active "));
        }
	}
}
