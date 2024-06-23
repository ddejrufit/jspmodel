package com.kang.nov132.jm;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

// Model : 일반적인 Java Class
//			실제 업무(계산, DB, 가공, ...)

// back-end 개발자

public class M {
	// V1.html -> C -> 가지고 온 값 계산 + 가공
	static void add(HttpServletRequest request)  {// 요청객체
		// 받아온 값 - parameter
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		
		// 여기서 만드는 값 - Attribute
		int z = x + y;
		request.setAttribute("zz", z);
	}
	
	// 다 만들어지면 -> C로 일단 보내기
}
