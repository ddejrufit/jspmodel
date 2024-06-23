package com.kang.nov063.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// main이 없다? -> main은 Tomcat 내부에 존재

// Servlet = Server + Application

// server
//		web server : HTML + CSS 요청하면 HTML + CSS 주는
//		WAS			: Web Application Sever(웹 서버 보다 한 급 높다)
//						프로그램 실행이 가능한 웹서버
//						웹서버 + 프로그래밍 언어
//						웹서버 + JDK
//						웹서버 + C언어
//						....

// @XXX : Annotation
//			원래는 다 직접 구현했어야 하는데 -> 자동 구현 됨
// LearnServlet을 Tomcat에 등록해라~ (지우면 실행 X, 바로 아래 class명과 동일)
@WebServlet("/LearnServlet")
public class LearnServlet extends HttpServlet {
						// HttpServlet 클래스에 있는 기능(요청받으면 응답하기)을 상속받음
						// 뭔가 필요하면 더 추가할 수 있음!!
	
	//지워도 무방 X, 작업하면서 버전 표시하라고
	private static final long serialVersionUID = 1L;
       
	// constructor(생성자) - 별로 쓸일이 많지는 않음(지워도 무방!)
	//			이 LearnServlet 객체를 만드는건 Tomcat
    public LearnServlet() {
        super();
    }

    // event-driven-programming(이벤트 기반 프로그래밍)
    //			Tomcat이 실행중 -> LearnServlet을 실행
    //			-> Tomcat이 LearnServlet 객체를 만들어서 무한루프
    //			-> 어떤 이벤트가 발생하면 그걸 처리하고 루프로 복귀
    
    // ** 핵심부분~!!
    //		루프를 돌다가 client가 이 Servlet으로 GET방식 요청하면
    //		Tomcat이 doGet메소드를 자동으로 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	//		루프를 돌다가 client가 이 Servlet으로 POST방식 요청하면
	//		Tomcat이 doPost메소드를 자동으로 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
