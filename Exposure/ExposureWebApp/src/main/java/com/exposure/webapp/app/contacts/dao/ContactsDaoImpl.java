package com.exposure.webapp.app.contacts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.exposure.webapp.base.dao.AbstractExposureDao;
import com.exposure.webapp.base.dao.DaoImpl;
import com.exposure.webapp.base.domain.Contact;

@DaoImpl
@Repository("contactsDao")
public class ContactsDaoImpl extends AbstractExposureDao implements ContactsDao
{

	@Override
	public List<Contact> getContacts() 
	{
		return getJdbcTemplate().query("SELECT * FROM Contact;", 
				new RowMapper<Contact>()
				{
					@Override
					public Contact mapRow(ResultSet rs, int rowNum) throws SQLException 
					{
						return new Contact(rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("EmailAddress"),
								rs.getString("PhoneNumber"));
					}		
				});
	}

}
