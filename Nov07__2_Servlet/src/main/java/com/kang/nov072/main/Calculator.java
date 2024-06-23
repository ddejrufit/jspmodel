package com.kang.nov072.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		int x = Integer.parseInt(request.getParameter("x"));
		int y  = Integer.parseInt(request.getParameter("y"));
		PrintWriter pw = response.getWriter();
		
				pw.print("<html>");
				pw.print("<head><meta charset=\"UTF-8\"><title>사칙연산</title></head>");
				pw.print("<body>");
				pw.print("<table border=\"1\">");
				pw.print("<h1>[사칙연산]");
				pw.print("<tr><td align=\"center\">");
				pw.print("<h1>");
				pw.printf("%d + %d = %d",x,y,x+y);
				pw.print("</td></tr>");
				pw.print("<tr><td align=\"center\">");
				pw.print("<h1>");
				pw.printf("%d - %d = %d",x,y,x-y);
				pw.print("</td></tr>");
				pw.print("<tr><td align=\"center\">");
				pw.print("<h1>");
				pw.printf("%d X %d = %d",x,y,x*y);
				pw.print("</td></tr>");
				pw.print("<tr><td align=\"center\">");
				pw.print("<h1>");
				pw.printf("%d / %d = %d",x,y,x/y);
				pw.print("</td></tr>");
				pw.print("</h1>");
			
				pw.print("</table>");
				pw.print("</body>");
				pw.print("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
