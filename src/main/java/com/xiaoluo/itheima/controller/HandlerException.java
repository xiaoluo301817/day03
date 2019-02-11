package com.xiaoluo.itheima.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author luowenqin
 * @create 2019-02-02 9:21
 */
@EnableWebMvc
@ControllerAdvice(value =" com.xiaoluo.itheima.controller.LoginController")
public class HandlerException {



    @ExceptionHandler(value = { ArithmeticException.class })
    public ModelAndView handerArithmeticException(ArithmeticException e){
        ModelAndView modelAndView =new ModelAndView();
        System.out.println("出错了="+e);
        modelAndView.setViewName("error");
        modelAndView.addObject("ex",e);
        return  modelAndView;
    }
}
