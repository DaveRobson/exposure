package com.exposure.webapp.base.page;

import org.apache.wicket.markup.head.CssUrlReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;

@SuppressWarnings("serial")
public class BasePage extends WebPage
{
	@Override
	public void renderHead(IHeaderResponse response) 
	{
	    super.renderHead(response);

	    response.render(JavaScriptHeaderItem.forReference(getApplication().getJavaScriptLibrarySettings()
	            .getJQueryReference()));  
	    
		response.render(CssUrlReferenceHeaderItem.forUrl("css/main.css"));
	
	}
}
