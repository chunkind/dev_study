package basic.step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicHttpServlet1 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	// 클라이언트가 요청을 하면 컨테이너에 의해서 자동 호출되는 함수..
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// 수행하고자 하는 내용을 작성.

		/*
		 * 웹브라우저로 오늘은 불금..
		 * 현대백화점 가는날! 을 출력
		 * 
		 * 콘솔창으로 백화점에서 술은 먹지 맙시다..
		 * 
		 * DD 파일 작성 조건 ::
		 * 서버 내부 이름 : BasicServlet
		 * 클라이언트가 url로 요청하는 이름 : Basic
		 */
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<h2> 오늘은 불금 입니다..</h2><br>");
		out.println("<h3> 현대 백화점 가는 날!</h3><br>");
		System.out.println("백화점에서는 술 먹지 맙시다.");
		out.close();
	}
}
