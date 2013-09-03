package com.exposure.webapp.base.dao;

import javax.sql.DataSource;

public class DaoHelper extends AbstractDao
{
	private final DataSource dataSource;

	public DaoHelper(final DataSource dataSource)
	{
		this.dataSource = dataSource;
		afterPropertiesSet();
	}

	@Override
	protected DataSource dataSource()
	{
		return dataSource;
	}

}