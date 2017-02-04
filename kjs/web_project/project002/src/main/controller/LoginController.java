package main.controller;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class LoginController extends HttpServlet{
    
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

		//문서설정
		response.setContentType("text/html;");
		//한글처리
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		//세션 사용후.
		setInfoSession(request, response);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/main/main.jsp");
		view.forward(request, response);
		
    }
	
	
	public void setInfoSession(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		request.getSession().setAttribute("id", id);
		request.getSession().setAttribute("pw", pw);
		
		System.out.println(request.getSession().getAttribute("id") + "님 로그인!");
	}
    
}
