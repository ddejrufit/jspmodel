package com.kang.nov073.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Output")
public class Output extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String gd = request.getParameter("gd");
		String lc = request.getParameter("lc");
		String[] hb = request.getParameterValues("hb");
		String itd = request.getParameter("itd");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head><title>회원가입</title></head>");
		out.print("<body>");
		out.print("<h1>회원가입결과</h1>");
		out.printf("<h2>ID : %s </h2>",id);
		out.printf("<h2>PW : %s </h2> ",pw);
		out.printf("<h2>성별 : %s </h2>",gd);
		out.printf("<h2>지역 : %s </h2>",lc);
		if (hb != null) {
			out.print("<h2>취미 :  ");
			for (String s : hb) {
				out.print(s + " ");
			}
			out.print("</h2>");
		}else {
			out.print("<h2>취미 : 선택안함</h2>");
		}
		
		out.printf("<h2>자기소개 : %s </h2>",itd);
		out.print("</body>");
		out.print("</html>");
	}

}
