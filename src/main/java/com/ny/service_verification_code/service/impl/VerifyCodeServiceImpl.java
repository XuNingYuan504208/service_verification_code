package com.ny.service_verification_code.service.impl;

import com.ny.internal_common.dto.ResponseResult;
import com.ny.internal_common.dto.serviceverificationcode.VerifyCodeResponse;
import com.ny.service_verification_code.service.VerifyCodeService;
import org.springframework.stereotype.Service;

@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {


    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        return null;
    }
}
