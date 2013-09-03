package com.exposure.webapp.app.login.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.exposure.webapp.base.dao.AbstractExposureDao;
import com.exposure.webapp.base.dao.DaoHelper;
import com.exposure.webapp.base.dao.DaoImpl;
import com.exposure.webapp.base.domain.LoggedInUser;
import com.exposure.webapp.base.domain.UserLoginRequest;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

@DaoImpl
@Repository("loginDao")
public class LoginDaoImpl extends AbstractExposureDao implements LoginDao 
{
	@Override
	public LoggedInUser authenticateUser(UserLoginRequest request) 
	{
		List<LoggedInUser> tempList = getJdbcTemplate().query("SELECT * FROM User WHERE EmailAddress = ? AND Password = ?", 
				new Object[]{request.getEmailAddress(), request.getPassword()},
				new RowMapper<LoggedInUser>()
				{

					@Override
					public LoggedInUser mapRow(ResultSet rs, int i) throws SQLException 
					{
						return new LoggedInUser(rs.getInt("User_ID"),  rs.getString("Firstname"), rs.getString("Lastname"),
								rs.getString("EmailAddress"), rs.getString("Password"));
					}
			
				});
		validateJustOne(tempList);
		
		return Iterables.getOnlyElement(tempList);
	}

}
