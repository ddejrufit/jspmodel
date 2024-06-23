<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function gogo() {
		location.href = "SecondC?a=200&b=20";
	}

</script>
</head>
<body>
	<h1>수요일 두개제</h1>
	<%--
		사용자가 어떤 액션을 취했을 때 이동 : 요청(request)
		<a>태그로 요청 : 클릭하면 GET방식 요청
			(JS로 HTML만들기가 가능 -> JS로 <form>형식 만들어서 POST 요청하면 가능)
			<form> + <button> : 버튼 클릭했을 때 GET/POST방식 요청
			
			정수 a와 b를 요청하는 방법 3가지(JS는 파일 새로 안만들고)
			-> SecondC로 요청 -> firstV에서 입력받은 값들 + (a+b한 값)들 secondV.jsp에서 보여지게
	 --%>
	 
	 <a href="SecondC?a=100&b=10">SecondC로</a>
	 <div onclick="gogo();">SecondC로</div>	 
	 <form action="SecondC">
	 <input name="a"><p>
	 <input name="b"><p>
	 <button>SecondC로</button>
	 </form>
</body>
</html>