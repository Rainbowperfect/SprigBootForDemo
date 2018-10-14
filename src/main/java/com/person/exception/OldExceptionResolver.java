package com.person.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 1.0
 * @description com.person.exception
 * @date2017-8-17
 */
//@Component
public class OldExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("errors");
        mav.addObject("msg", "抱歉，服务卖了一波萌，请稍候再连接...");
        return mav;
    }
}
