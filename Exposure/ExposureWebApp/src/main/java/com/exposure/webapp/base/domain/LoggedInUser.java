package com.exposure.webapp.base.domain;

import org.apache.wicket.authroles.authorization.strategies.role.Roles;

/**
 * A user how has logged into the application
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class LoggedInUser extends CommonDomainBase implements User
{	
	private int userId;
	private String emailAddress;
	private String firstname;
	private String lastname;
	private String password;
	private Roles roles;
	
	public LoggedInUser(int userId, String emailAddress, Roles roles)
	{
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.roles = roles;
	}
	
	public LoggedInUser(int userId, String firstname, String lastname, String emailAddress, String password)
	{
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.emailAddress = emailAddress;
		this.roles = new Roles(Roles.USER);
		
	}
	
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
	
	public void setRoles(Roles roles)
	{
		this.roles = roles;
	}
		
	@Override
	public int getUserId() {
		return userId;
	}

	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public Roles getRoles() {
		return roles;
	}	
	
	@Override
    public boolean hasRole(String role)
    {
        return roles.hasRole(role);
    }

    @Override
    public boolean hasAnyRole(Roles roles)
    {
        return this.roles.hasAnyRole(roles);
    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
