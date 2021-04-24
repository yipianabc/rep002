package com.cloud.feign;

import com.cloud.entity.Student;
import com.cloud.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {
    @RequestMapping("/student/findAll")     //此处命名和client的全路径相同
    public Collection<Student> findAll();

    @RequestMapping("student/index")
    public String index();
}
