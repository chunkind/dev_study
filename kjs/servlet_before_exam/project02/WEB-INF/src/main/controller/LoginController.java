package main.controller;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class LoginController extends HttpServlet{
    

    public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{

	//��������
	response.setContentType("text/html;");
	//�ѱ�ó��
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        
	String id = request.getParameter("user_id");
	String pw = request.getParameter("user_pw");

	System.out.println("���� ���̵�� �����? " + id + " / " + pw);

	out.print("<!DOCTYPE>");
	out.print("<html>");
	out.print("<head>");
	out.print("<meta charset=\"utf-8\">");
	out.print("<title>" + id + "�� Ȩ�������� ���� ���� ȯ���մϴ�.</title>");
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
	out.print("<h6>" + id +"�� ȯ���մϴ�^^</h6>");
	out.print("<a href=\"/project02/main/main.html\">����</a><br/>");
	out.print("<a href=\"/project02/main/intro.html\" class=\"selected\">�����Ұ��մϴ�.</a><br/>");
	out.print("<a href=\"/project02/main/ehu1.html\">����1</a><br/>");
	out.print("<a href=\"/project02/main/ehu2.html\">����2</a><br/>");
	out.print("<a href=\"/project02/index.html\">�� ó������</a>");
	out.print("</div>");
	out.print("<div class=\"main\">");
	out.print("<pre>");
	out.print("		" + id + "�� 29�� �Դϴ�.");
	out.print("		���� ġŲ�� �����մϴ�.");
	out.print("</pre>");
	out.print("</div>");
	out.print("</body>");
	out.print("</html>");
	out.close();
        
    }
    
}
