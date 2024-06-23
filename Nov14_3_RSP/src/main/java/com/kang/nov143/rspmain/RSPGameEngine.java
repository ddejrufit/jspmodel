package com.kang.nov143.rspmain;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

// model

public class RSPGameEngine {
	// 게임수, 승 , 무, 패를 count -> 멤버변수
	private int t;
	private int win;
	private int draw;
	private int lose;
	
	// 손도 못대게 하나 만들어 둘 것(상수화)
	// private : class 내부에서만 사용 가능 / 외부로 못가져감 (Controller에서 못끌어다 씀)
	private static final RSPGameEngine rge = new RSPGameEngine();//상수화 시킴
	
	private RSPGameEngine() {
		
	}
	
	//getter하나만 처리 >> Singleton Pattern << Controller에서 사용하려고
	public static RSPGameEngine getRge() {
		return rge;
	}
	
	// static method 아님!!!(위의 멤버변수 때문에)
	public void doRSP(HttpServletRequest request) {
		//parameter로 받은 userHand가
		// 1 ->  가위 -> 1.png
		int userHand = Integer.parseInt(request.getParameter("userHand"));
		request.setAttribute("uh", userHand+".png");
		
		int comHand = new Random().nextInt(3)+1;
		request.setAttribute("ch", comHand+".png");
		
		// 판정
		int result = userHand - comHand;
		if (result == 0) {
			request.setAttribute("r", "무");
			draw++;
			t++;
		}else if (result == -1 || result == 2) {
			request.setAttribute("r", "패");
			lose++;
			t++;
		}else {
			request.setAttribute("r", "승");
			win++;
			t++;
		}
		
		request.setAttribute("t",t);
		request.setAttribute("w", win);
		request.setAttribute("d", draw);
		request.setAttribute("l", lose);
		
		
	}
}
