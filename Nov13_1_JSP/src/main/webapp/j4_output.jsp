<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>j4_input.jsp</title>
</head>
<body>
	<%
		// GET /POST
		//	원래) 요청파라미터 -> 한글처리
		//		GET방식 - 안함
		//		POST방식 - 해야함
		//		일단 요청 하고 봅시다
		request.setCharacterEncoding("UTF-8");
		
		// 원래) 응답 한글처리 (필요 했었음...)
		// ex) jsp파일 기준 1, 2, 6번줄에서 해주고 있어서 필요 없음
		// response.setCharacterEndocing("UTF-8");
		String name = request.getParameter("name");
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		
		int z = x + y;
	%> 
	이름 : <%=name %>
	<h1><%=x %> + <%=y %> = <%=z %></h1>
</body>
</html>