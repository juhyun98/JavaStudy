<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��Ű�����Ϸ�</h1>
	
	<%
		//��Ű �����ϴ� ���
		Cookie cookie = new Cookie("name", "");
	
		//setMaxAge()�� 0���� ���� -> ����
		cookie.setMaxAge(0);
		
		response.addCookie(cookie);
	
	%>

</body>
</html>