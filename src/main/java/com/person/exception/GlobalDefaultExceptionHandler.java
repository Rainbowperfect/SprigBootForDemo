package com.person.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @description com.person.exception
 * @date 2017-8-17
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    /*@ExceptionHandler(Exception.class)
    @ResponseBody
    public String exception(){
        return "抱歉，服务正在卖萌，请稍候再连接...";
    }*/

   /* @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> exception(){
        Map<String, Object> map = new HashMap<>();
        map.put("errorCode", 500);
        map.put("message", "系统发生异常，请查看错误代码。");
        return map;
    }*/

    @ExceptionHandler(Exception.class)
    public String exception(Model model){
        model.addAttribute("msg", "系统发生异常，请查看错误代码");
        return "errors";
    }
}
