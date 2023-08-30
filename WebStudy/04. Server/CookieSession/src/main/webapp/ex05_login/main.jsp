<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%= session.getAttribute("login") %> 님 안녕하세요
	<a href="../LogoutService">로그아웃</a>
</body>
</html>