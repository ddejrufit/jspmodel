package com.kang.nov132.jm;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Controller : Servlet
//			상황판단해서 M/ V 소환
//			-> 어떤 요청이 들어왔을 때 상황 판단을 통해 M or V를 소환
//			해당 프로젝트(사이트)의 진입점 (ctrl + f11 실행이 여기서!!)

// Back-end 개발자 : PL급(Project Leader)
@WebServlet("/C")
public class C extends HttpServlet {

	// 어떤 사이트에 접속
	//		주소를 직접 입력
	//		검색 -> <a> 눌러서
	//		둘 다 GET방식 요청(어떤 사이트에 POST로 첫접속 ? - X)		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher rd = request.getRequestDispatcher("V1.html");
//		rd.forward(request, response);
		request.getRequestDispatcher("V1.html").forward(request, response);;
	
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		M.add(request); // 계산을 먼저 하고 결과를 봐야
		request.getRequestDispatcher("V2.jsp").forward(request, response);
	}

}
