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
	String getEmailAddress();
	
	/**
	 * Get the roles a user has 
	 * 
	 * @return
	 */
	Roles getRoles();
	
	
	 /**
	  * Whether this user has the given role.
	  * 
	  * @param role
	  * @return whether this user has the given role
	  */
	boolean hasRole(String role);
	
	
    /**
     * Whether this user has any of the given roles.
     * 
     * @param roles
     *            set of roles
     * @return whether this user has any of the given roles
     */
	boolean hasAnyRole(Roles roles);
}
