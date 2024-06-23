<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>thirdVBaby.jsp</title>
</head>
<body>
	<div style="border:red solid 3px;">
		<h1>thirdVBaby</h1>
		a : ${param.a }<p>
		b : ${param.b }<p>
		c : ${c }<p>
		d : ${dd }<p>
		e : ${sessionScope.ee }<p>
		f : ${cookie.ff.value }
	</div>
</body>
</html>