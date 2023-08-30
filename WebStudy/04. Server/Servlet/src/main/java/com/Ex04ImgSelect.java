package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex04ImgSelect
 */
@WebServlet("/Ex04ImgSelect")
public class Ex04ImgSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String select = request.getParameter("select");
		PrintWriter out = response.getWriter();
		if (select.equals("1")) {
			out.print("<html>");
			out.print("<body>");
			out.print("<img src='ghen.png'>");
			out.print("</body>");
			out.print("</html>");
			
		}else if (select.equals("2")) {
			out.print("<html>");
			out.print("<body>");
			out.print("<img src='img/img.png'>");
			out.print("</html>");
			out.print("</body>");
		}else if (select.equals("3")) {
			out.print("<html>");
			out.print("<body>");
			out.print("<img src='img/KakaoTalk_20230706_162326498.png'>");
			out.print("</html>");
			out.print("</body>");
			
		}
		
		
	}

}
