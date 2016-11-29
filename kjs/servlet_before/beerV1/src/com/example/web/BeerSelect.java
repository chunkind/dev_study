package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * HttpServlet은 GenericServlet을 상속 받았고 GenericServlet은 Servlet 인터페이스를 구현 하였다.
 */
public class BeerSelect extends HttpServlet{
    
    /**
     * HTML 폼에서 method=post 라고 했기에 doPost()를 재정의하였다.
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        //이 메소드는 servletResponse 인터페이스에 있는 메소드입니다.
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice<br>");
        String c = request.getParameter("color");
        out.println("<br>Got Beer Color " + c);
    }
    
}