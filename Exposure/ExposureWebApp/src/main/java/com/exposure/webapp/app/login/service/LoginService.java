package com.exposure.webapp.app.login.service;

import com.exposure.webapp.base.domain.LoggedInUser;
import com.exposure.webapp.base.domain.UserLoginRequest;

public interface LoginService 
{
	LoggedInUser authenticateUser(UserLoginRequest request);
}
