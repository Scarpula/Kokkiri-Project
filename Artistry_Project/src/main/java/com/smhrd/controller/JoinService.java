package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class JoinService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// post 방식 인코딩

		request.setCharacterEncoding("UTF-8");

		String mb_Email = request.getParameter("mb_Email");
		String mb_Pw = request.getParameter("mb_Pw");
		String mb_Name = request.getParameter("mb_Name");
		String mb_Birthdate = request.getParameter("mb_Birthdate");
		String mb_Phone = request.getParameter("mb_Phone");
		String mb_Nick = request.getParameter("mb_Nick");
		String mb_Addr = request.getParameter("mb_Addr");
		String mb_Addr2 = request.getParameter("mb_Addr2");
		Boolean mb_Type = Boolean.parseBoolean(request.getParameter("mb_Type"));
		String add = mb_Addr + ' '+ mb_Addr2;

		Member member = new Member(mb_Email, mb_Pw, mb_Phone,mb_Birthdate, mb_Name,mb_Nick, add,mb_Type);
		int cnt = new MemberDAO().join(member);
		
	}

}