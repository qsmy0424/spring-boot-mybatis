package com.qsmy.mybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @author qsmy
 * @date 2019-07-26
 */
// @Configuration
public class GlobalException {

    /**
     *该方法必须要有返回值，返回值类型必须为SimpleMappingExceptionResolver
     */
    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();

        Properties mappings = new Properties();

         // 参数一：异常的类型，必须是异常类型的全名
         // 参数二：视图名称
        mappings.put("java.lang.ArithmeticException", "error1");
        mappings.put("java.lang.NullPointerException", "error2");

        // 设置异常与视图映射信息
        resolver.setExceptionMappings(mappings);
        return resolver;
    }
}
