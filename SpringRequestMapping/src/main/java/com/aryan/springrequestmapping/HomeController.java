package com.aryan.springrequestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/hi")
    public String home()
    {
        System.out.println("HELLO");
        return "index.jsp";
    }



}
