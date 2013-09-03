package com.exposure.webapp.base.dao;

import org.springframework.dao.DataAccessException;

@SuppressWarnings("serial")
public class DatabaseException extends DataAccessException
{
	private final String sql;

	public DatabaseException(final String msg, final String sql, final Throwable throwable)
	{
		super(msg, throwable);
		this.sql = sql;
	}

	@Override
	public String getMessage()
	{
		return super.getMessage().concat(" The following SQL was run:").concat(sql);
	}
}