package com.exposure.webapp.base.component;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

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
				target.add(wmc);
				
				wmc.add(new AttributeModifier("class", "list-group-item-details")
				{
					@Override
					protected String newValue(String currentValue, String replacementValue) 
					{
						
						if(currentValue.length() == replacementValue.length())
						{
							return currentValue + " active";
						}
						else
						{
							return replacementValue;
						}					
					}
				});
			}			
		});
		
		
		
		
				
	}

}
