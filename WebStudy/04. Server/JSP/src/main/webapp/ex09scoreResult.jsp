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
			<legend>����Ȯ�����α׷�</legend>
	<table style="margin: auto; text-align: center;">
		<tr>
			<td>�̸�</td>
			<td><%= name %></td>
		</tr>
		<tr>
			<td>JAVA����</td>
			<td><%= java %></td>
		</tr>
		<tr>
			<td>WEB����</td>
			<td><%= web %></td>
		</tr>
		<tr>
			<td>IoT����</td>
			<td><%= iot %></td>
		</tr>
		<tr>
			<td>ANDROID����</td>
			<td><%= android %></td>
		</tr>
		<tr>
			<td>���</td>
			<td><%= avg %></td>
		</tr>
		<tr>
			<td>����</td>
			
			<td>
			<strong><%= grade %></strong>
			</td>
			
		</tr>
	</table>
	</fieldset>
	
</body>
</html>