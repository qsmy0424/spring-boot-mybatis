package com.qsmy.mybatis.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author qsmy
 * @date 2019-07-25
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(ArithmeticException.class)
    public Object exceptionHandler(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>(2);
        request.setAttribute("javax.servlet.error.status_code", 404);
        map.put("code", "自定义异常！");
        map.put("message", e.getMessage() + "1");
        request.setAttribute("ext", map);
        return map;
    }

    @ResponseBody
    @ExceptionHandler(NullPointerException.class)
    public Object nullException(Exception e) {
        return e;
    }
}
