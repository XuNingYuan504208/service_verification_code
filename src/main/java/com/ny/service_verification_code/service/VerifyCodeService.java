package com.ny.service_verification_code.service;

import com.ny.internal_common.dto.ResponseResult;
import com.ny.internal_common.dto.serviceverificationcode.VerifyCodeResponse;

public interface VerifyCodeService {
    ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber);
}
