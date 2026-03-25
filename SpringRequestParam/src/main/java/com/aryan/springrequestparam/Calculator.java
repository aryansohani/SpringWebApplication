package com.aryan.springrequestparam;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @RequestMapping("/")
    public String home()
    {
        return "index.jsp";
    }

    @RequestMapping("/calculate")
    public String calculate()
    {
        return "add.jsp";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, HttpSession session)
    {
        int result= n1+n2;
        session.setAttribute("result",result);
        return "result.jsp";
    }

}
