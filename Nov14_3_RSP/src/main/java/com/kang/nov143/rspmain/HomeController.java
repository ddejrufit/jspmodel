package com.kang.nov143.rspmain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//지금 문제 : GET방식 요청할 때마다 새로운 엔진ㅇ르 만들면서 새롭게 생성하느라 숫자가 안쌓임
		// 해결책 : 엔진을 하나로 -> Singleton Pattern!!
		//		**JS{ Model 2할 때 Model이 singleton pattern인 경우가 많음!
		
		// 문제 2 : Singleton Pattern의 엔진을 쓰게 되면 여러명이 하나의 엔진을 쓰게 됨(전적이 공유)
		//		사람별로 따로? -> 클라이언트 별로 개별공간을 줘야?
		
	if(!request.getParameterNames().hasMoreElements()) {//첫접속이면
		request.setAttribute("uh", "rsp.gif");
		request.setAttribute("ch", "rsp.gif");
	}else {
//		RSPGameEngine rge = new RSPGameEngine(); // 새로운 엔진 만들어서
		RSPGameEngine rge = RSPGameEngine.getRge(); // singleton pattern 불러오기
		rge.doRSP(request); // 한 판 진행
	}
		request.getRequestDispatcher("rsp.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
