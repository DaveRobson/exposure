package com.exposure.webapp.base.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class AbstractExposureDao extends AbstractDao
{
	@Resource
	private DataSource exposureDatasource;

	@Override
	protected DataSource dataSource() 
	{
		return exposureDatasource;
	} 
}
