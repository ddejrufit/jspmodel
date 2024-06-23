package com.kang.nov151.hjmain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("c", "0");
			request.setAttribute("r", "0");
			request.setAttribute("t", "0");
			request.setAttribute("w", "0");
			request.setAttribute("l", "0");
		}else {
			HJGameEngine.getHge().doHJ(request);
		}
		
		
		request.getRequestDispatcher("hj.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
