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
		ID, PW 두개의 정보를 받아와서
		로그인을 한 다음
		로그인 성공한 사람의 닉네임 콘솔에 출력
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
			out.print("로그인 실패");
		}if (rs != null) {
			rs.close();
		}if (psmt != null) {
			psmt.close();
		}if (conn != null) {
			conn.close();
		}
		
		// 로그인 성공시 -> loginSuccess.jsp
		// 로그인 시리패시 -> login.jsp
		
		if (nick != null) {
			// 로그인에 성공
			nick = URLEncoder.encode(nick, "EUC-KR");
			response.sendRedirect("loginSuccess.jsp?nick="+nick);
		}else {
			// 로그인에 실패
			response.sendRedirect("login.jsp");
		}
		
		
	 %>
	
</body>
</html>