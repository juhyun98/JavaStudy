<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		
	<%
		String c = request.getParameter("c");
		String r = request.getParameter("r"); %>
		
		<h2><%= c %>층</h2>
		<h2><%= r %>방</h2>
		
	<%  String tr = "";
		
		for (int i = 0; i < Integer.parseInt(c); i++) {
			tr += "<tr>";
			
			for (int j =0; j < Integer.parseInt(r); j++) {
				tr += "<td>" + j + "</td>";
				
			}
			tr += "</tr>";
		}
		out.print(tr); 
	%>
	
		
	</table>
</body>
</html>