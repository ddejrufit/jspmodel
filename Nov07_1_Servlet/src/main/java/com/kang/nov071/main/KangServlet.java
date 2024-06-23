package com.kang.nov071.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet : WAS에서만 실행 가능 -> Tomcat환경에서만 실행 가능
//		ㄴ Servlet에서 ctrl + f11로 실행

// html + css + javascript : 프로그래밍 언어 기능이 부족

@WebServlet("/KangServlet")
public class KangServlet extends HttpServlet {
	
	// 현재 : HTTP
	//		돈 주고 인증서 사와서 톰캣에 세팅 : https
	
	// Internet
	//		http/https 통신하는 거
	
	// GET방식 요청(기본) 받을 때  : 어떤 사이트에 [처음] 접속하는 건 무조건 GET방식
	//		주소를 알고 있어서 직접 타이핑해서 접속
	//		포털사이트에서 검색 -> 클릭
	//		사이트 내부에서 클릭
	// ** URL 창에 client의 요청 정보를 쓸 수 있으면 GET방식이 가능
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글처리 방식
		response.setCharacterEncoding("UTF-8");
		// 응답객체.setContentType("text/html; charset=UTF-8");
		
		// 랜선에 붙어있을 응답용 빨대
		PrintWriter pw = response.getWriter(); // console >> scanner같은 것
		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"></head>");
		pw.print("<body>");
		for (int i = 0; i < 5; i++) {
			pw.print("<marquee><h1 style='color:red;'>오늘 짱 춥네여</h1></marquee>");
		}
		
		pw.print("</body>");
		pw.print("</html>");
		
	}

	// POST방식 요청 받을 때 :
	//		프로그램 내부적으로 프로그램을 통해서만 가능
	//	**	URL 창에 client의 요청 정보 쓸 수 없으면 POST방식으로만
	//		 ㄴ 회원가입, 블로그에 사진 포스팅, 음악을 업로드, ...
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
