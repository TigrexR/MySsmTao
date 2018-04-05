package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Linus on 2018/4/4.
 */
@Controller
public class PageController {

    /**
     * 打开首页
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    /**
     * 从首页获取参数跳转其他页面
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
