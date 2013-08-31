package com.exposure.webapp.base.domain;

import org.apache.wicket.authroles.authorization.strategies.role.Roles;


public interface User extends Domain
{
	/**
	 * Get the user id
	 * 
	 * @return
	 */
	int getUserId();

	/**
	 * Get the email address for a user
	 * 
	 * @return
	 */
	String getEmail();
	
	/**
	 * Get the roles a user has 
	 * 
	 * @return
	 */
	Roles getRoles();
}
