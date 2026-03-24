package com.aryan.springsendingdatatoservlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorServlet {

    @RequestMapping("/")
    public String landing()
    {
        return "index.jsp";   // ✅ fixed
    }

    @RequestMapping("/calculate")
    public String Calculator()
    {
        return "add.jsp";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest req, HttpSession session)
    {
        int n1=Integer.parseInt(req.getParameter("num1"));
        int n2=Integer.parseInt(req.getParameter("num2"));
        int result = n1 + n2;

        session.setAttribute("result", result);

        return "result.jsp";
    }
}
