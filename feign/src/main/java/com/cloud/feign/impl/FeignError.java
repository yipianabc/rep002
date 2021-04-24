package com.cloud.feign.impl;

import com.cloud.entity.Student;
import com.cloud.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component  //标注为组建
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}