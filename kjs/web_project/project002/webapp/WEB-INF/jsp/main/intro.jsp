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
		<%=id%>은 29살 입니다.
		저는 치킨을 좋아합니다.
	</pre>
</div>
</body>
</html>