package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex01Mypage
 */
@WebServlet("/Ex01Mypage")
public class Ex01Mypage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		
		// 페이지를 요청한 client의 ip 획득
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		
		
		
		// 응답객체에 인코딩 적용
		response.setCharacterEncoding("EUC-KR");
		
		// Web Page Text 및 Tag를 사용하기 위해서는 out객체 필요
		PrintWriter out = response.getWriter();
		
		if (ip.equals("192.168.0.59")) {
			out.print("<h1>병관쌤 반가워요~</h1>");
		
		}else if (ip.equals("192.168.0.44")) {
			out.print("<h1>치우형 환영합니다!!!</h1>");
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>" + ip + " 병관쌤 존잘</h1>");
			out.print("<img src='ghen.png'>");
			out.print("</body>");
			out.print("</html>");			
			
		}
		
	}

}
