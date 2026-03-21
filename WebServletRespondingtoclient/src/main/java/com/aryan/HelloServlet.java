package com.aryan;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {


    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Inside servlet");
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("<h1>hello</h1>");
    }
}
