package com.xiaoluo.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luowenqin
 * @create 2019-01-31 9:39
 */

@Controller
@RequestMapping(value = "/api")
public class LoginController {

    private  static  final  String SUCCESS  ="index";

    @RequestMapping(value = "/testViewResourlver")
    public  String testViewResourlver(){
        System.out.println(1);
        return SUCCESS;
    }


    /**
     *
     * @return
     */
    @GetMapping(value = "/testModeAndView")
    public ModelAndView testModeAndView(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("date",new Date());
        modelAndView.setViewName(SUCCESS);
        return  modelAndView;
    }


    @GetMapping(value = "/testModelMap")
    @ResponseBody
    public  Object testModelMap(){
        Map<String,Object> maps =new HashMap<String,Object>();
        maps.put("couple","xiaoluo");
        return  maps;
    }


    @GetMapping(value = "/testExceptionHanderResolver")
    public  Object testExceptionHanderResolver(@RequestParam("i") Integer i){
        System.out.println("result:"+(10/i.intValue()));
        return SUCCESS;

    }

}
