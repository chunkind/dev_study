package main.controller;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class MainController extends HttpServlet{
    
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

		RequestDispatcher view = null;
		
		String page = request.getParameter("command");
		
		//리퀘스트 바인딩
		request.setAttribute("page", page);
		
		if(page.equals("main")){
			view = request.getRequestDispatcher("/WEB-INF/jsp/main/main.jsp");
		}else if(page.equals("ehu1")){
			view = request.getRequestDispatcher("/WEB-INF/jsp/main/ehu1.jsp");
		}else if(page.equals("ehu2")){
			view = request.getRequestDispatcher("/WEB-INF/jsp/main/ehu2.jsp");
		}else{
			view = request.getRequestDispatcher("/WEB-INF/jsp/main/intro.jsp");
		}
        
		view.forward(request, response);
		
    }
	
}
