package com.aryan.springmodel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @RequestMapping("/")
    public String home()
    {
        return "home.jsp";
    }

    @RequestMapping("calculate")
    public String calculate()
    {
        return "add.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1")int n1, @RequestParam("num2")int n2, Model model)
    {
        int result = n1 + n2;
        model.addAttribute("result",result);
        return "result.jsp";
    }
}
