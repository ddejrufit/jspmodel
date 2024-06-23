package com.kang.nov152.nbmain;

import java.util.Iterator;
import java.util.Random;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class NBGameEngine {
	// 누적 되어야 하는것 -> 몇번 만에 정답맞췄는지?
	private int t;
	private String answer; // 사용자가 정답을 맞출때까지 바뀌지 않도록
	

	
	private static final NBGameEngine NGE = new NBGameEngine();

	private NBGameEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public static NBGameEngine getNge() {
		return NGE;
	}
	
	public void pickAns() { // 처음 접속했을때, 게임다시 시작할때만
		int a = new Random().nextInt(987) + 12;
		String ans = String.format("%03d", a);
			if (ans.charAt(0) == ans.charAt(2) ||ans.charAt(1) == ans.charAt(2)||ans.charAt(0) == ans.charAt(1)) {
			
			pickAns();
			return; // 기존에 하던 method를 빠져 나와서 새로운 method를 실행하기 위해
	}
	this.answer = ans; // this.answer : 멤버변수의 answer에 정답 담아두기
	System.out.println("정답 : " + ans);
		
}
	public void doNB(HttpServletRequest request) {
		String userAns = request.getParameter("userAns");//input의 name
		request.setAttribute("ua","유저의 답 : " + userAns);
		
		int strike = 0;
		int ball = 0;
		
		for (int i = 0; i < 3; i++) {//userAns용
			for (int j = 0; j < 3; j++) {// answer용
				if (userAns.charAt(i) == answer.charAt(j)) { // 숫자 같을 때
					if (i == j) { //자릿수까지 같다면
						strike++;
					}else { // 숫자는 같으나 자릿수가 다르다면
						ball++;
					}
				}
			}
		}
	t++;
	request.setAttribute("t",t + "번째 시도!");
	request.setAttribute("s","S : " + strike);
	request.setAttribute("b","B : " + ball);
	
	if (strike == 3) {
		String result = "정답! " + answer + "였습니다!";
		t = 0; //시도횟수 0으로
		request.setAttribute("r", result);
		request.setAttribute("ua", null);
		request.setAttribute("s", null);
		request.setAttribute("b", null);
		request.setAttribute("btn", "<button onclick='goHome()'>다시시작</button>");
		request.setAttribute("cmt", "와우 공중제비를 멈추게하십쇼!");
	}
	
	}

	
	
	
	
}
