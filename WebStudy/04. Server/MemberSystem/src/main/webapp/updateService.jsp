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
	<%
		// id, pw, nick, email, phone, gender, age
		// 위의 값을 먼저 다 가져온 다음
		// id와 pw가 일치하는 계정을 찾아
		// 입력한 nick, email, phone, gender, age를 수정하시오
		
		// 수정 성공시 -> main.jsp 이동
		// 수정 실패시 -> update.jsp 이동
	
		request.setCharacterEncoding("EUC-KR");
		
		String id = request.getParameter("id");
	 	String pw = request.getParameter("pw");
	 	String nick = request.getParameter("nick");
	 	String email = request.getParameter("email");
	 	String phone = request.getParameter("phone");
	 	String gender = request.getParameter("gender");
	 	String age = request.getParameter("age");	 		 	
	 	
	 	int cnt = 0;
	 	Connection conn = null;
	 	PreparedStatement psmt = null;
	 	
	 	Class.forName("oracle.jdbc.driver.OracleDriver");
	 	
	 	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	 	String db_id = "shopping";
		String db_pw = "12345";
		
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
		
		String sql = "update member set nick = ?, email = ?, phone = ?, gender = ?, age = ? where id = ? and pw = ?";
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, nick);
		psmt.setString(2, email);
		psmt.setString(3, phone);
		psmt.setString(4, gender);
		psmt.setString(5, age);
		psmt.setString(6, id);
		psmt.setString(7, pw);
		
		cnt = psmt.executeUpdate();
		
		if (cnt > 0) {
			System.out.println("회원정보수정 성공");
		}else {
			System.out.println("회원정보수정 실패");
		}if (psmt != null) {
			psmt.close();
		}if (conn != null) {
			conn.close();
		}
		
		// 로그인 성공시 -> loginSuccess.jsp
		// 로그인 시리패시 -> login.jsp
		
		if (cnt > 0) {
			// 회원정보수정에 성공
			
			out.print("<script>");
			out.print("alert('회원정보 수정 성공!');");
			out.print("location.href='main.jsp'");
			out.print("</script>");
			
		}else {
			// 회원정보수정에 실패
			out.print("<script>");
			out.print("alert('회원정보 수정 실패');");
			out.print("location.href='update.jsp'");
			out.print("</script>");
		}
		
	%>
</body>
</html>