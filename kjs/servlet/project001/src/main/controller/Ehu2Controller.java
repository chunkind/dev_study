package main.controller;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class Ehu2Controller extends HttpServlet{
    
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

		//문서설정
		response.setContentType("text/html;");
		//한글처리
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
	
		System.out.println("너의 아이디와 비번은? " + id + " / " + pw);
	
		out.print("<!DOCTYPE>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("<title>" + id + "의 홈페이지에 오신 것을 환영합니다.</title>");
		out.print("<style>");
		out.print(".left{display:inline-block;margin:10px;padding:10px;font-size:20px;}");
		out.print(".left a{text-decoration: none;}");
		out.print(".main{display:inline-block;font-size:20px;}");
		out.print(".selected{color:blue;}");
		out.print("</style>");
		out.print("</haed>");
		out.print("<body>");
		out.print("<div class=\"left\">");
		out.print("<body>");
		out.print("<div class=\"left\">");
		out.print("<h6>" + id +"님 환영합니다^^</h6>");
		out.print("<a href=\"/main.do\">메인</a><br/>");
		out.print("<a href=\"/intro.do\" class=\"selected\">나를소개합니다.</a><br/>");
		out.print("<a href=\"/ehu1.do\">에휴1</a><br/>");
		out.print("<a href=\"/ehu2.do\">에휴2</a><br/>");
		out.print("<a href=\"/index.html\">멘 처음으로</a>");
		out.print("</div>");
		out.print("<div class=\"main\">");
		out.print("<pre>");
		out.print("새해 복 많이 받으세용~~~");
		out.print("내년에는 여러분 모두가!!");
		out.print("좋은일 있길 기도해보구요");
		out.print("공부 열심히 합시다...에휴..");
		out.print("</pre>");
		out.print("</div>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
        
    }
    
}
