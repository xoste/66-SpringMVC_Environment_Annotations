package com.xoste.leon.controller;


import com.xoste.leon.pojo.Demo;
import com.xoste.leon.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Leon
 */
@Controller
public class DispatcherController {
    @RequestMapping("/demo1")
    public String demo1(User user, String username, String password, HttpServletRequest request) {
        System.out.println("执行了demo1");
        System.out.println("user...." + user + "username..." + username + "...password..." + password);
        request.setAttribute("test", "测试");
        return "/jsp/index1.jsp";
    }

    @RequestMapping("/demo2")
    public String demo2(@RequestParam(value = "username1") String username, @RequestParam(value = "password1") String password) {
        System.out.println("执行了demo2");
        System.out.println("username...." + username + "...password..." + password);
        return "/jsp/index2.jsp";
    }

    @RequestMapping("/demo3")
    public String demo3(@RequestParam(defaultValue = "1") int currentPageNum, @RequestParam(defaultValue = "2") int pageSize) {
        System.out.println("执行了demo3");
        System.out.println("currentPageNum...." + currentPageNum + "...pageSize..." + pageSize);
        return "/jsp/index3.jsp";
    }

    /**
    * (@RequestParam(required = true) 代表变量必须要传具体的参数
    * */
    @RequestMapping("/demo4")
    public String demo4(@RequestParam(required = true) String username) {
        System.out.println("执行了demo4");
        System.out.println("username是SQL的查询条件，必须传参数...." + username);
        return "/jsp/index4.jsp";
    }

    @RequestMapping("/demo5")
    public String demo5(String username, String password, @RequestParam("hover")List<String> hover) {
        System.out.println("执行了demo5");
        System.out.println(username + " " + password + " " + hover);
        return "/jsp/index1.jsp";
    }

    @RequestMapping("/demo6")
    public String demo6(Demo demo) {
        System.out.println(demo);
        return "/jsp/index1.jsp";
    }

    @RequestMapping("/demo7")
    public String demo7(String username, String password) {
        System.out.println(username + " " + password);
        return "/jsp/index1.jsp";
    }

    @RequestMapping("/demo8/{username}/{password1}")
    public String demo8(@PathVariable("username") String username, @PathVariable("password1") String password) {
        System.out.println(username + " " + password);
        return "/jsp/index2.jsp";
    }

    @RequestMapping("/demo9")
    public String demo9() {
        System.out.println("转发");
        return "/jsp/index1.jsp";
    }

    @RequestMapping("demo10")
    public String demo10() {
        System.out.println("重定向");
        return "redirect:/jsp/index2.jsp";
    }

    @RequestMapping("/demo11")
    public String demo11() {
        return "forward:demo12";
    }

    @RequestMapping("/demo12")
    public String demo12() {
        return "/jsp/index1";
    }

    @RequestMapping("/demo13")
    @ResponseBody
    public User demo13() {
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123");
        return user;
    }

    @RequestMapping(value = "/demo14", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String demo14() {
        return "中文";
    }
}
