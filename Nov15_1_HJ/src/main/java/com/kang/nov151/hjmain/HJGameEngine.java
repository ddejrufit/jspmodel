package com.kang.nov151.hjmain;

import java.util.Random;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

// Model

// 필요한 method 만들 때 tip!
//		멤버변수가 없으면(안만들어도 되면) : static 기반
//		멤버변수가 있으면(만들어야 하면)	: singleton

public class HJGameEngine {
	private int t;
	private int win;
	private int lose;
	
	private static final HJGameEngine hge = new HJGameEngine();
	
	public HJGameEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public static HJGameEngine getHge() { // 이부분만 외부에서 건드릴 수 있음in
		return hge;
	}
	
	public void doHJ(HttpServletRequest request) {
		// 홀, 짝 클릭할 때 사용되는 parameter 받아오기 > userAns = 1, userAns = 0
		int userAns = Integer.parseInt(request.getParameter("userAns"));
	
		// 동전 몇개가지고 할건지
		int coin = new Random().nextInt(Integer.MAX_VALUE) + 2;
		request.setAttribute("c", coin);
		
		// 홀짝여부 판단하기
		String gameAns = (coin % 2 == 0) ? "짝" : "홀";
		request.setAttribute("r", gameAns);
		
		// coin % 2 >> 값이 0이면 짝/ 1이면홀
		// int끼리 비교
		if (userAns == (coin % 2)) {
			t++;
			win++;
		}else {
			t++;
			lose++;
		}
		request.setAttribute("t", t);
		request.setAttribute("w", win);
		request.setAttribute("l", lose);
	}
	
}
