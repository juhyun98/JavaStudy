package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.front.ICommand;
import com.model.MessageDAO;

public class MsgDelete implements ICommand{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("메세지개별삭제 기능실행");
		
		String num = request.getParameter("num");
		
		int ch_num = Integer.parseInt(num);
		
		MessageDAO dao = new MessageDAO();
		
		dao.delete(ch_num);
		
		return "main.jsp#two";

	}

}
