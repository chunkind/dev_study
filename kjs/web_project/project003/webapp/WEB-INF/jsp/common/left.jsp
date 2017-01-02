<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String id =(String) request.getSession().getAttribute("id");%>
<div class="left">
	<h6><%=id%>님 환영합니다^^</h6>
	<a href="/main.do?command=main">메인</a><br/>
	<a href="/main.do?command=intro">나를소개합니다.</a><br/>
	<a href="/main.do?command=ehu1" class="selected">에휴1</a><br/>
	<a href="/main.do?command=ehu2">에휴2</a><br/>
	<a href="/index.html">멘 처음으로</a>
</div>
