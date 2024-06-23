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
		Servlet : Java�ڵ� �ȿ��� html�� ����
		jsp : html���� java�ڵ� �ۼ��� ����
	 -->
	<%
	// cos.jar���� �ʿ� (webapp -> WEB-INF -> lib -> cos.jar)
	//	�� webapp  -> img
	response.setCharacterEncoding("UTF-8");
	String path = request.getServletContext().getRealPath("img"); //"���ε� �� ���� ���� ������"
	System.out.println(path);// Ȯ�ο�

	MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy());

	// <input>�� ��� ���� �޾ƿ���
	String name = mr.getParameter("name");
	double height = Double.parseDouble(mr.getParameter("height"));
	height /= 100; // height = height / 100;
	double weight = Double.parseDouble(mr.getParameter("weight"));
	double bmi = weight / (height * height);
	String result = "��ü��"; // ���ǹ��� else�� �� ��ü���� ���� ����� �迡 �̸� �־�α�
	if (bmi >= 40) {
		result = "����";
	} else if (bmi >= 35) {
		result = "�ߵ��";
	} else if (bmi >= 30) {
		result = "�浵";
	} else if (bmi >= 25) {
		result = "��ü��";
	} else if (bmi >= 18.5) {
		result = "����";
	}

	// �Ҽ��� ��°�ڸ����� (** �Ʒ� html �±� �ȿ����� �Ұ���)
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
			<td align="center">�̸�</td>
			<td><%=name%></td>
		</tr>
		<tr>
			<td align="center">Ű</td>
			<td><%=height * 100%>cm</td>
		</tr>
		<tr>
			<td align="center">������</td>
			<td><%=weight%>kg</td>
		</tr>
		<tr>
			<td align="center">BMI</td>
			<td><%=bmi2%></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><marquee>
					�����
					<%=result%>�Դϴ�
				</marquee></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><img src="img/<%=image%>"
				style="max-width: 60%"></td>
		</tr>
	</table>
</body>
</html>