package com.exposure.webapp.base.component;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

import com.exposure.webapp.base.domain.Contact;

@SuppressWarnings("serial")
public class ListGroupItem extends Panel
{

	public ListGroupItem(String id, Contact contact) 
	{
		super(id);
		
		add(new Label("item-heading", contact.getDisplayHeading()));
		add(new Label("item-text", contact.getDisplayText()));
		
		
		
		final WebMarkupContainer wmc = new WebMarkupContainer("details-section");
		wmc.setOutputMarkupId(true);
		add(wmc);
		
		add(new AjaxLink<Void>("details-button")
		{
			@Override
			public void onClick(AjaxRequestTarget target) 
			{
				
				StringBuilder builder = new StringBuilder();
				builder.append("$('#")
					   .append(wmc.getMarkupId())
					   .append("').toggleClass('active');");
				target.appendJavaScript(builder.toString());
			}		
		});			
	}
}
