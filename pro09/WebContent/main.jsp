<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
    
   if (session.getAttribute("isLogon") != null && ((Boolean)session.getAttribute("isLogon"))) {
      String user_id = (String)session.getAttribute("login.id");
%>
안녕하세요 <%=user_id%>님!!!<br>
<%  
   } else {
%>
로그인 되지 않았습니다. 먼저 로그인 하세요.<br>
<a href="login3.html">로그인</a>
<%    } %>
</body>
</html>