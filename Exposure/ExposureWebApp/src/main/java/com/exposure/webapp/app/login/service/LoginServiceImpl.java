package com.exposure.webapp.app.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.exposure.webapp.app.login.dao.LoginDao;
import com.exposure.webapp.base.domain.LoggedInUser;
import com.exposure.webapp.base.domain.UserLoginRequest;

@Service("loginService")
public class LoginServiceImpl implements LoginService 
{

	@Resource
	private LoginDao loginDao;
	
	@Override
	public LoggedInUser authenticateUser(UserLoginRequest request) 
	{
		return loginDao.authenticateUser(request);
	}

}
