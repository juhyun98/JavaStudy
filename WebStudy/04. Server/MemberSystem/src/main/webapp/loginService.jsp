<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.Console"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		ID, PW �ΰ��� ������ �޾ƿͼ�
		�α����� �� ����
		�α��� ������ ����� �г��� �ֿܼ� ���
	 --%>
	 
	 <%
	 	
	 	String id = request.getParameter("id");
	 	String pw = request.getParameter("pw");
	 	
	 	String nick = null;
	 	
	 	System.out.println(id);
	 	
	 	Connection conn = null;
	 	PreparedStatement psmt = null;
	 	ResultSet rs = null;
	 	
	 	Class.forName("oracle.jdbc.driver.OracleDriver");
	 	
	 	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	 	String db_id = "shopping";
		String db_pw = "12345";
		
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
		
		String sql = "select * from member where id = ? and pw = ?";
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setString(2, pw);
		
		rs = psmt.executeQuery();
		
		if (rs.next()) {
			nick = rs.getString("NICK");

		}else {
			out.print("�α��� ����");
		}if (rs != null) {
			rs.close();
		}if (psmt != null) {
			psmt.close();
		}if (conn != null) {
			conn.close();
		}
		
		// �α��� ������ -> loginSuccess.jsp
		// �α��� �ø��н� -> login.jsp
		
		if (nick != null) {
			// �α��ο� ����
			nick = URLEncoder.encode(nick, "EUC-KR");
			response.sendRedirect("loginSuccess.jsp?nick="+nick);
		}else {
			// �α��ο� ����
			response.sendRedirect("login.jsp");
		}
		
		
	 %>
	
</body>
</html>