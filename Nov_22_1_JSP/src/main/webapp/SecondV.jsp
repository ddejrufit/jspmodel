<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 SecondV</h1>
	<%-- <a>태그 이용해서 thirdV.jsp 페이지로 이동 (thirdVBaby.jsp라는 페이지가 들어가게) --%>
	<a href="ThirdC">ThirdC로 이동</a>
	<%--
		href="SecondC?a=100$b=10"
		a태그, JS, <form>+<button> 마다 요청 파라미터 값이 다름
	 --%>
	<h2>a : ${param.a }</h2>
	<h2>b : ${param.b }</h2>
	<h2>c : ${c }</h2> <%-- M쪽의 setAttribute부분 --%>
	<h2>d : ${dd }</h2>
</body>
</html>