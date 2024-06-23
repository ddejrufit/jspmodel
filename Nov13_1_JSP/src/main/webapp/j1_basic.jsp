<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>j1_basic.jsp</title>
</head>
<body>
	<h1>오전 09시 14분</h1>
	<h1>JSP 시작</h1>
	HTML : 웹사이트 제작 가능
	----------------------디자인 / 이벤트 부족 : 못생기고, 정적인 이벤트만 가능...
	HTML : 뼈대를 만들고
	CSS : 디자인
	JavaScript : 이벤트 처리
	----------------------파라미터 읽기, 계산, 조건문, 반복문 : 프로그래밍언어쪽 기능 부재
	servlet : 클라이언트가 요청
		-> HTML + CSS + JavaScript를 만들어서 응답하는 자바프로그램
	----------------------어렵고, 작업이 불편
	JSP(Java servlet/Server Page)
		작업 형태 : HTML + CSS + JavaScript에 필요한 부분마다 Java코드를 살짝 추가
		실제 정체 : Tomcat이 Java코드부분을 Servlet으로 바꿔서 실행
		
		servlet : 자바코드 안에서 HTML을 구현
		JSP : HTML 안에서 자바코드를 추가
	<!-- 
	이것도 주석 가능
	 -->
	 <%--
		1. JSP 주석 (지금 필기 감싼 형태가 주석)
	 	2. 스크립트릿(Scriptlet)
	 		JSP에서 Java코드를 실행할 때 사용하는 블록
	 		<% Java코드가 여기에! %>
	 	3. 지시자
	 		특별한 지시를 내릴 수 있도록 하는 블ㄹ고
	 		<%@ page/ include / taglid / ...  %>
	 		
	 	4. 표현식
	 		어떤 값을 (웹페이지에) 출력 결과로 포함시키고 싶을 때 사용하는 블록
	 		<%= Value %>
	 		숫자, 문자열, 변수 등 값 사용 가능
	 		Servlet의 out.print() 와 비슷한 기능
	 		
	 	5. 선언문
	 		표현식에서 사용할 수 있는 Java의 Method를 작성할 때 사용하는 블록
	 		<%! 멤버변수, method %>
	 		Java의 Method와 동일(이름 규칙 등도 동일)
	 		
	  --%>
		
		
</body>
</html>