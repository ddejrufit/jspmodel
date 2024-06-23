package com.kang.nov072.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Output")
public class Output extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		// 내 이름을 출력 <h1>홍길동</h1>
		String a = request.getParameter("name");
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"><title>이름은</title></head>");
		pw.print("<body>");
		pw.print("<h1>OUTPUT - GET</h1>");
		pw.printf("<h1> %s </h1>",a);
		pw.print("</body>");
		pw.print("</html>");
	}

	// GET방식 vs POST방식
	//		GET : 요청 파라미터가 주소에 있어서 우리가 눈으로 볼 수 있음
	//		POST: 요철 파라미터가 주소에 없음. 내부적으로 정보 전달
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //안하면 한글 깨져서 나옴
		response.setCharacterEncoding("UTF-8");
		// 내 이름을 출력 <h1>홍길동</h1>
		String a = request.getParameter("name");
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"><title>이름은</title></head>");
		pw.print("<body>");
		pw.print("<h1>OUTPUT - POST</h1>");
		pw.printf("<h1> %s </h1>",a);
		pw.print("</body>");
		pw.print("</html>");
	}

}
