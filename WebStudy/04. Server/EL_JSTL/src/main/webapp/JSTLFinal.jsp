<%@page import="com.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<String> idol = new ArrayList<String>();
		idol.add("����ȩ");
		idol.add("����");
		idol.add("����");
		idol.add("����");
		idol.add("����");
		pageContext.setAttribute("idol", idol);
	%>

	<c:forEach items="${idol}" var="name">
		${name}
	</c:forEach>
	<br>

	<%
		MemberDTO dto1 = new MemberDTO("pbk", "1234", "ȣ�ξƺ�", "����");
		MemberDTO dto2 = new MemberDTO("iu", "5678", "������", "����");
		MemberDTO dto3 = new MemberDTO("son", "9999", "�����", "����");
		MemberDTO dto4 = new MemberDTO("jjy", "7777", "�ؿ�", "����");
		MemberDTO dto5 = new MemberDTO("imh", "4567", "���ưϵ�", "����");
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		pageContext.setAttribute("list", list);
		
	%>
	<table border="1px">
		<tr>
			<td>��ȣ</td>
			<td>���̵�</td>
			<td>��й�ȣ</td>
			<td>�г���</td>
			<td>�ּ�</td>
		</tr>
		
		<!-- ���� �Ʒ��� JSTL�� ���ؼ� list�ȿ� �ִ� ȸ���� ������ ��� -->
		
		<c:forEach varStatus="i" items="${list}" var="dto">
			<tr>
				<td>${i.count}</td>
				<td>${dto.id}</td>
				<td>${dto.pw}</td>
				<td>${dto.nick}</td>
				<td>${dto.addr}</td>
			</tr>
		<%-- </c:forEach>
		
		<c:forEach var="i" begin="0" end="4" step="1">
			<tr>
				<td>${i+1}</td>
				<td>${list[i].id}</td>
				<td>${list[i].pw}</td>
				<td>${list[i].nick}</td>
				<td>${list[i].addr}</td>
			</tr>
		</c:forEach> --%>
	</table>


</body>
</html>