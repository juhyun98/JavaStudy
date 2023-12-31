package com.front;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.controller.JoinService;
import com.controller.LoginService;
import com.controller.LogoutService;
import com.controller.MsgAllDelete;
import com.controller.MsgDelete;
import com.controller.MsgSendService;
import com.controller.UpdateService;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	// HashMap 생성
	HashMap<String, ICommand> map = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		// 누군가에 의해서 현재 서블릿 들어오게 된다면
		// 서블릿을 실행할 수 있게 서블릿 객체를 생성하는 메소드
		// 이 메소드는 최초에 의해서 1번만 실행됨
		map.put("JoinService.do", new JoinService());
		map.put("LoginService.do", new LoginService());
		map.put("LogoutService.do", new LogoutService());
		map.put("UpdateService.do", new UpdateService());
		map.put("MsgSendService.do", new MsgSendService());
		map.put("MsgAllDelete.do", new MsgAllDelete());
		map.put("MsgDelete.do", new MsgDelete());
		
	}

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("프론트 컨트롤러 실행!");

		// 1.client가 요청한 URL 가져오기f
		String requestURI = request.getRequestURI();
		// 2.Context Path (웹 어플리케이션의 시작 주소)
		String contextPath = request.getContextPath();
		// 3.client 요청 부분만 분리
		String command = requestURI.substring(contextPath.length() + 1);
		
		response.sendRedirect(map.get(command).execute(request, response));

	}
}