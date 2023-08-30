<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String java = request.getParameter("java");
		String web = request.getParameter("web");
		String iot = request.getParameter("iot");
		String android = request.getParameter("android");

		double avg = (Integer.parseInt(java) + 
				Integer.parseInt(web) + 
				Integer.parseInt(iot) + 
				Integer.parseInt(android)) / 4.0;

		String grade ;
		if (avg >= 95) {
			grade = "A+";
		}else if (avg >= 85) {
			grade = "A";
		}else if (avg >= 80) {
			grade = "B+";
		}else if (avg >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
	%>
	<fieldset>
			<legend>학점확인프로그램</legend>
	<table style="margin: auto; text-align: center;">
		<tr>
			<td>이름</td>
			<td><%= name %></td>
		</tr>
		<tr>
			<td>JAVA점수</td>
			<td><%= java %></td>
		</tr>
		<tr>
			<td>WEB점수</td>
			<td><%= web %></td>
		</tr>
		<tr>
			<td>IoT점수</td>
			<td><%= iot %></td>
		</tr>
		<tr>
			<td>ANDROID점수</td>
			<td><%= android %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td><%= avg %></td>
		</tr>
		<tr>
			<td>학점</td>
			
			<td>
			<strong><%= grade %></strong>
			</td>
			
		</tr>
	</table>
	</fieldset>
	
</body>
</html>