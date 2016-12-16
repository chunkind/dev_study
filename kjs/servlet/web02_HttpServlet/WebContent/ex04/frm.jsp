<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 폼에 입력된 정보입니다.. jsp로 받습니다..</h1><p>
	<%
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	%>
	<li> 당신의 이름 :: <%= request.getParameter("userName")  %><br>
	<li> 당신의 주소 :: <%= request.getParameter("userAddr")  %><br>
	<li> 당신의 기수 :: <%= request.getParameter("userKisu")  %><br>
</body>
</html>