package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MemberDAO;
import com.model.MemberDTO;

@WebServlet("/deleteService")
public class deleteService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDTO dto = new MemberDTO(id, pw);
		
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.delete(dto);
		
		if (cnt > 0) {
			// 회원탈퇴에 성공
			response.sendRedirect("main.jsp");
		}else {
			// 회원탈퇴에 실패
			response.sendRedirect("delete.jsp");
		}
		
	}

}
