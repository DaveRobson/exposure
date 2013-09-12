package com.exposure.webapp.base.component;

import java.util.List;

import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;

import com.exposure.webapp.base.domain.Contact;

/**
 * A List with expanding detail sections.
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class ListGroup extends Panel
{

	public ListGroup(String id, List<Contact> contacts) 
	{
		super(id);
			
		
		ListView<Contact> view = new ListView<Contact>("view", contacts)
		{
			@Override
			protected void populateItem(ListItem<Contact> item) 
			{
				item.add(new ListGroupItem("group-item", item.getModelObject()));
			}
		};
		add(view);
	}

}
