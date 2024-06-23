package com.kang.nov071.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Gugudan
 */
@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		
		// 내가 url에 단 수를 입력하면 3단 >> 3단
		String d = request.getParameter("dan");
		// 계산이 필요 -> int로 형변환
		int dd = Integer.parseInt(d);
		int to = Integer.parseInt(request.getParameter("to"));
		PrintWriter pw = response.getWriter();
		// 2단
		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"></head>");
		pw.print("<body>");
		pw.print("<table border=\"1\">");
		
			pw.printf("<tr><td align=\"center\"><h1>구구단 %d단</h1></td></tr>",dd);
		for (int i = 1; i <=to ; i++) {
			pw.printf("<tr><td align=\"center\"><h1>%d X %d = %d  </h1></td></tr>",dd,i,dd*i);	
		}
		
	
		
		pw.print("</table>");
		pw.print("</body>");
		pw.print("</html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
