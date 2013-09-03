package com.exposure.webapp.app.login.dao;

import com.exposure.webapp.base.domain.LoggedInUser;
import com.exposure.webapp.base.domain.UserLoginRequest;

public interface LoginDao 
{
	LoggedInUser authenticateUser(UserLoginRequest request);
}
