<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>BMIOutput.jsp</title>
</head>
<body>
	<!-- 
		Servlet : Java코드 안에서 html을 구현
		jsp : html에서 java코드 작성이 가능
	 -->
	<%
	// cos.jar파일 필요 (webapp -> WEB-INF -> lib -> cos.jar)
	//	ㄴ webapp  -> img
	response.setCharacterEncoding("UTF-8");
	String path = request.getServletContext().getRealPath("img"); //"업로드 한 사진 담을 폴더명"
	System.out.println(path);// 확인용

	MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy());

	// <input>에 담긴 내용 받아오기
	String name = mr.getParameter("name");
	double height = Double.parseDouble(mr.getParameter("height"));
	height /= 100; // height = height / 100;
	double weight = Double.parseDouble(mr.getParameter("weight"));
	double bmi = weight / (height * height);
	String result = "저체중"; // 조건문의 else에 둘 저체중은 변수 만드는 김에 미리 넣어두기
	if (bmi >= 40) {
		result = "고도비만";
	} else if (bmi >= 35) {
		result = "중등도비만";
	} else if (bmi >= 30) {
		result = "경도";
	} else if (bmi >= 25) {
		result = "과체중";
	} else if (bmi >= 18.5) {
		result = "정상";
	}

	// 소수점 둘째자리까지 (** 아래 html 태그 안에서는 불가능)
	String bmi2 = String.format("%.2f", bmi);

	String image = mr.getFilesystemName("photo");
	image = URLEncoder.encode(image, "UTF-8");
	image = image.replace(" ", "+");
	%>
	<table>
		<tr>
			<th colspan="2">BMI Result</th>
		</tr>
		<tr>
			<td align="center">이름</td>
			<td><%=name%></td>
		</tr>
		<tr>
			<td align="center">키</td>
			<td><%=height * 100%>cm</td>
		</tr>
		<tr>
			<td align="center">몸무게</td>
			<td><%=weight%>kg</td>
		</tr>
		<tr>
			<td align="center">BMI</td>
			<td><%=bmi2%></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><marquee>
					당신은
					<%=result%>입니다
				</marquee></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><img src="img/<%=image%>"
				style="max-width: 60%"></td>
		</tr>
	</table>
</body>
</html>