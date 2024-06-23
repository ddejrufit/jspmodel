<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first.jsp</title>
</head>
<body>
	<%--
		JSP Model 2
		View(.jsp)
			값 받기 : EL ${XXX }
			페이지이동 : redirect, forward, include
			
			조건문, 반복문, 출력형식(소수점, 날짜형식, 화페단위, ...)
			
			Custom Tag
				- 생김새 : HTML DOM 객체
				- .jsp : servlet으로 바뀔 때 Java코드로 변환
				- custom tag : .jsp에서만 사용 가능
				<접두어:태그명>내용</접두어:태그명>
				<접두어:태그명 /> : 내용이 없을 떄
				
				// JSP 표준 액션 태그
					- JSP 환경이면 기본적으로 사용이 가능
					- 접두어 부분이 jsp
					- include 사용이 대표적
				// CustomTag 
					- 외부 .jar파일을 넣고 사용함(jstl.jar)
					- 접두어가 마음대로
					- 반복문, 조건문, 출력형태, ...
	 --%>
	 <h1>First</h1>
	 <%-- second.jsp 코드가 아래에 포함 --%>
	 <%-- ** 내가 원하는 자리에 넣어서 표현할 수 있다는 장점! --%>
	<%--  <jsp:include page="second.jsp"></jsp:include>--%>
	  <jsp:include page="second.jsp"/>
	  <h1>First</h1>
</body>
</html>