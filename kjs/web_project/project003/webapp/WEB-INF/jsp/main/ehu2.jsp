<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String id =(String) request.getSession().getAttribute("id");%>
<!DOCTYPE>
<html>
<head>
	<meta charset="utf-8">
	<title><%=id%>의 홈페이지에 오신 것을 환영합니다.</title>
	<link rel="stylesheet" type="text/css" href="/css/common.css" />
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/left.jsp" flush="true" />
<div class="main">
	<pre>
		새해 복 많이 받으세용~~~
		내년에는 여러분 모두가!!
		좋은일 있길 기도해보구요
		공부 열심히 합시다...에휴..
	</pre>
</div>
</body>
</html>