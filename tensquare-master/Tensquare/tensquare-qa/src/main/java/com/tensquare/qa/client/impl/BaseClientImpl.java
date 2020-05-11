package com.tensquare.qa.client.impl;

import com.tensquare.qa.client.BaseClient;
import entity.Result;
import entity.StatusCode;
import org.springframework.stereotype.Component;

/**
 * @program: tensquare-parent
 * @Date: 2019-4-6 16:13
 * @Author: 846602483
 * @Description:
 */
@Component
public class BaseClientImpl implements BaseClient {

    @Override
    public Result findById(String labelId) {

        return new Result(false, StatusCode.ERROR,"熔断器触发了");
    }
}
