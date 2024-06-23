<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First.jsp</title>
<script type="text/javascript">
	function gogo() {
		location.href="Second.jsp?a=100&b=50";
	}
</script>
</head>
<body>
<h1>First</h1>
	<hr>
	<a href="Second.jsp?a=10&b=5">&lt;a&gt;로 [GET방식 요청]</a>
	<hr>
	<div onclick="gogo();">JavaScript로 [GET방식 요청]</div>

<form action="Second.jsp">
 a : <input name="a"><p>
 b : <input name="b"><p>
 <button>ㄱㄱ</button><p>
<%--
	First.jsp에서 a와 b에 숫자를 넣어서 Second.jsp로 이동
	수동 ver. 3가지 모두 사용 할 것!
	JS파일은 새로 안만들 것
 --%>
 
 </form>
</body>
</html>