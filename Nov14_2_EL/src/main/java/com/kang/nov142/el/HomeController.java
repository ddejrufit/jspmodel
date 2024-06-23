package com.kang.nov142.el;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	// 어떤 사이트에 첫접속 : GET방식
	// 만약에 V1.html에서 버튼을 눌렀을 때도 GET방식을 써야 한다면?
	
	// 첫접속 vs 버튼 눌렀을 때 : 요청파라미터의 유무!
	//URL
	//		첫접속 : https://host주소/파일명
	//		버튼		: https://host주소/파일명?x=10&y=20
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청파라미터가 없으면 -> 이 사이트의 첫 접속을 GET방식으로 해라
		if(!request.getParameterNames().hasMoreElements()) {
			request.getRequestDispatcher("v1.html").forward(request, response);
		}else {//요청파라미터가 있으면 -> 이 사이트의 기능 활요을 GET방식으로 해라!
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
