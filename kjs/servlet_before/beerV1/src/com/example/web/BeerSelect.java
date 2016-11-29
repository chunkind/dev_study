package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.example.model.*;

/**
 * HttpServlet은 GenericServlet을 상속 받았고 GenericServlet은 Servlet 인터페이스를 구현 하였다.
 */
public class BeerSelect extends HttpServlet{
    
    /**
     * HTML 폼에서 method=post 라고 했기에 doPost()를 재정의하였다.
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        
        //이 메소드는 servletResponse 인터페이스에 있는 메소드입니다.
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //out.println("Beer Selection Advice<br>");
        //out.println("<br>Got Beer Color " + c);
        List result = be.getBrands(c);
        
        Iterator it = result.iterator();
        while(it.hasNext()){
            /*
                getBrands()가 리턴한 ArrayList를 루핑하며
                하나씩 출력합니다. (최종버전 에서는 서블릿이 아니라 JSP에서 출력 하도록 수정할 것임)
            */
            out.print("<br>try: " + it.next());
        }
        
    }
    
}
