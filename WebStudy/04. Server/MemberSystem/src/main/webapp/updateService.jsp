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
		// ���� ���� ���� �� ������ ����
		// id�� pw�� ��ġ�ϴ� ������ ã��
		// �Է��� nick, email, phone, gender, age�� �����Ͻÿ�
		
		// ���� ������ -> main.jsp �̵�
		// ���� ���н� -> update.jsp �̵�
	
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
			System.out.println("ȸ���������� ����");
		}else {
			System.out.println("ȸ���������� ����");
		}if (psmt != null) {
			psmt.close();
		}if (conn != null) {
			conn.close();
		}
		
		// �α��� ������ -> loginSuccess.jsp
		// �α��� �ø��н� -> login.jsp
		
		if (cnt > 0) {
			// ȸ������������ ����
			
			out.print("<script>");
			out.print("alert('ȸ������ ���� ����!');");
			out.print("location.href='main.jsp'");
			out.print("</script>");
			
		}else {
			// ȸ������������ ����
			out.print("<script>");
			out.print("alert('ȸ������ ���� ����');");
			out.print("location.href='update.jsp'");
			out.print("</script>");
		}
		
	%>
</body>
</html>