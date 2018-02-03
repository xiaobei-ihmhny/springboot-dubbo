package com.ihmhny.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: xiaobei
 * @createTime: 2018-02-02 22:55
 * @since: JDK 1.8
 * @description: 测试Thymeleaf模板
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("host","http://www.baidu.com");
        return "index";
    }
}
