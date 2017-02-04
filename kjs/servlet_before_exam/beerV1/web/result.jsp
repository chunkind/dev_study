<!-- 이것은 한글처리를 위한 코드 입니다. -->
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>servlet</title>
    <!-- 
    JSP는 개발자가 컴파일 하지 않는다.
    JSP 최초 호출시 컴파일러가 알아서 컴파일 해줌.
    page 지시자(directive) 라고 부르는 부분입니다.
    -->
</head>
<body>
    <!-- 표준 HTML 코드 JSP이런것을 템플릿 텍스트 라고 부른다. -->
    <h1 align="center">Beer Recommendations JSP</h1>
    
    <!-- <%%>표준 자바 언어를 코딩 한다. 이런 것을 스크립틀릿 이라고 한다. -->
    <%
        List style = (List)request.getAttribute("style");
        Iterator it = style.iterator();
        while(it.hasNext()){
            out.print("<br>try: " + it.next());
        };
    %>
    <h1>이것은 한글 테스트 입니다.</h1>
</body>
</html>