package com.winter.service.annotation;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 注解方式实现类
 */
@Service(timeout = 5000)
public class ProviderServiceImplAnnotation implements ProviderServiceAnnotation{

    public String SayHelloAnnotation(String word) {
        return word;
    }
}