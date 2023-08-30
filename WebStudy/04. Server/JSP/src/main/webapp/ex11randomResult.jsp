<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	div, h2, fieldset, input{
		margin: auto;	
		text-align: center;
		margin-top: 10px;
	}
</style>
</head>
<body>
	<div>
		<h2>랜덤당첨게임</h2>
			<fieldset>
				<legend>랜덤당첨결과</legend>
					
					<br>
				<%
					request.setCharacterEncoding("EUC-KR");
					response.setCharacterEncoding("EUC-KR");
					String title = request.getParameter("title");
					String[] name = request.getParameterValues("name");
				 	Random rand = new Random();
					int randNm = rand.nextInt(name.length);
					//System.out.println(name[randNm]);
					out.print(title);
					out.print("<br>");
					out.print(name[randNm]);
				%>
			</fieldset>
	</div>
</body>
</html>