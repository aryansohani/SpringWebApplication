package com.aryan.springprefixsuffix;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }

    @RequestMapping("calculate")
    public String calculate()
    {
        return "add";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1")int n1, @RequestParam("num2")int n2, Model model)
    {
        int result = n1 + n2;
        model.addAttribute("result",result);
        return "result";
    }
}
