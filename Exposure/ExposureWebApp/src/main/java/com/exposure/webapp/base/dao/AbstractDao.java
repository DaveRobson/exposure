package com.exposure.webapp.base.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.SQLExceptionTranslator;

public abstract class AbstractDao extends JdbcDaoSupport
{
	@Override
	protected void checkDaoConfig()
	{
		setDataSource(dataSource());
		super.checkDaoConfig();
	}
	
	@Override
	protected void initDao() throws Exception
	{
		getJdbcTemplate().setExceptionTranslator(new SQLExceptionTranslator()
		{
			@Override
			public DataAccessException translate(final String task, final String sql, final SQLException ex)
			{
				return new DatabaseException(task, sql, ex);
			}
		});
		super.initDao();
	}

	protected abstract DataSource dataSource();
	
	/**
	 * Validates the the results contain only 1. An exception is thrown if not
	 * 
	 * @param results
	 */
	protected void validateJustOne(final List<?> results)
	{
		if (results.size() != 1)
		{
			throw new IllegalStateException(String.format("Expected only one result, actual %d", results.size()));
		}
	}
}
