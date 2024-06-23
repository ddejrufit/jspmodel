package com.kang.nov142.el;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class Model {
	public static void multiply(HttpServletRequest request) {
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x* y;
		request.setAttribute("z", z);
		///////////////////////////////
		Kang k = new Kang("kang", 27, 1.0, "010.9954.7876");
		request.setAttribute("kk", k);
		/////////////////////////////
		ArrayList<Kang> kangs = new ArrayList<Kang>();
		kangs.add(k);
		kangs.add(new Kang("홍길동", 20, 0.8, "010.9954.7876"));
		kangs.add(new Kang("김길동", 26, 0.9, "010.2222.7876"));
		kangs.add(new Kang("박길동", 24, 0.2, "010.3333.7876"));
		kangs.add(new Kang("이길동", 22, 1.2, "010.4444.7876"));
		request.setAttribute("cs", kangs);
	}
}
