<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.DriverManager"%>
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
		ID와 PW값을 먼저 가져온다음
		ID와 PW가 일치하는 회원의 정보를 삭제
		삭제 성공 -> main.jsp 이동
		삭제 실패 -> delete.jsp 이동
	 --%>
	 
	 
	 <%
		String id = request.getParameter("id");
	 	String pw = request.getParameter("pw");
	 	
	 	String nick = null;
	 	
	 	System.out.println(id);
	 	
	 	int cnt = 0;
	 	Connection conn = null;
	 	PreparedStatement psmt = null;
	 	
	 	Class.forName("oracle.jdbc.driver.OracleDriver");
	 	
	 	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	 	String db_id = "shopping";
		String db_pw = "12345";
		
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
		
		String sql = "DELETE FROM MEMBER WHERE ID = ? AND PW = ?";
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setString(2, pw);
		
		cnt = psmt.executeUpdate();
		
		if (cnt > 0) {
			System.out.println("회원탈퇴성공");
		}else {
			System.out.println("회원탈퇴실패");
		}if (psmt != null) {
			psmt.close();
		}if (conn != null) {
			conn.close();
		}
		
		// 로그인 성공시 -> loginSuccess.jsp
		// 로그인 시리패시 -> login.jsp
		
		if (cnt > 0) {
			// 회원탈퇴에 성공
			
			out.print("<script>");
			out.print("alert('회원탈퇴 성공!');");
			out.print("location.href='main.jsp'");
			out.print("</script>");
			//response.sendRedirect("main.jsp");
		}else {
			// 회원탈퇴에 실패
			response.sendRedirect("delete.jsp");
		}
		
		
	 %>
</body>
</html>