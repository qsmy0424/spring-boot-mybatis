package com.qsmy.mybatis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author qsmy
 * @date 2019-07-26
 */
// @Configuration
public class GlobalExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView modelAndView = new ModelAndView();
        if (ex instanceof ArithmeticException) {
            modelAndView.setViewName("error1");
        } else if (ex instanceof NullPointerException){
            modelAndView.setViewName("error2");
        }
        modelAndView.addObject("error", ex.toString());
        return modelAndView;
    }
}
