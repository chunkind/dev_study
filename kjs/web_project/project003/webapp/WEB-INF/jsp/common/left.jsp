<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="left">
	<h6>${sessionScope.id}님 환영합니다^^</h6>
	<a href="/main.do?command=main" <c:if test="${requestScope.page eq 'main' }">class='selected'</c:if>>메인</a><br/>
	<a href="/main.do?command=intro" <c:if test="${requestScope.page eq 'intro' }">class='selected'</c:if>>나를소개합니다.</a><br/>
	<a href="/main.do?command=ehu1" <c:if test="${requestScope.page eq 'ehu1' }">class='selected'</c:if>>에휴1</a><br/>
	<a href="/main.do?command=ehu2" <c:if test="${requestScope.page eq 'ehu2' }">class='selected'</c:if>>에휴2</a><br/>
	<a href="/index.html">멘 처음으로</a>
</div>
