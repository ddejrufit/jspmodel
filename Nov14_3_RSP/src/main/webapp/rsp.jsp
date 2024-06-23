<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rsp.jsp</title>
<link rel="stylesheet" href="rsp.css">
</head>
<body>
	<table>
		<tr>
			<th colspan="3">가위바위보 게임</th>
		</tr>
		<tr><%-- parameter를 input의 name이 아닌 <a>태그 주소로 만들어서 사용
					각각 이미지 클릭하면 href에 있는 주소가 url이 됨
		 --%>
		<td align="center"><a href="HomeController?userHand=1"><img src="1.png"></a></td>
		<td align="center"><a href="HomeController?userHand=2"><img src="2.png"></a></td>
		<td align="center"><a href="HomeController?userHand=3"><img src="3.png"></a></td>
		</tr>
		<tr>
		<td align="center">유저(▼)</td>
		<td align="center">VS</td>
		<td align="center">상대(▼)</td>
		</tr>
		<tr>
		<td class="td2" align="center"><img src="${uh }" ></td>
		<td class="td2" align="center">vs</td>
		<td class="td2" align="center"><img src="${ch }"></td>
		</tr>
		<tr><td class="td1" colspan="3" align="center">판정 : ${r }</td></tr>
		<tr><td class="td3" colspan="3" align="center">${t }전 ${w }승 ${d }무 ${l }패</td></tr>
	</table>
</body>
</html>