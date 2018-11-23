package com.ssm.api.service;

import com.ssm.api.common.request.LoginRequest;
import com.ssm.api.common.Resultful;

public interface UserService {
    public Resultful loginVerify(LoginRequest loginRequest);
}
