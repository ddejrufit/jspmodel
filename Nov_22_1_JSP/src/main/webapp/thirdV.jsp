<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>thirdV.jsp</title>
</head>
<body>
	<h1>thirdV</h1>
		a : ${param.a }<p>
		b : ${param.b }<p>
		c : ${c }<p>
		d : ${dd }<p>
		e : ${sessionScope.ee } <%-- sessionScope.어트리뷰트명 --%>
	<jsp:include page="${baby }"/>
	<%-- jsp:include 기능 사용 중인데 무한루프 돈다?
		include가 잘못된 페이지를 가져왔다 or 없는 페이지를 include했다 or include를 안햇다
		여기서 말하는 include :
			Controller의 request.setAttribute("baby", "thirdVBaby.jsp");--%>
</body>
</html>