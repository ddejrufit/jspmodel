<%@page import="java.util.StringTokenizer"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>output.jsp</title>
<script type="text/javascript">
	function getRandomColor() {
		// Math.random()					->0.0 ~ 0.999999
		// Math.random() * 255 				-> 0.0 ~ 254.999999
		// Math.round(Math.random() * 255)	->0 ~ 255
		
		// rgb컬러 색상 최고 숫자 : 255
		let r = Math.round(Math.random() * 255);
		let g = Math.round(Math.random() * 255);
		let b = Math.round(Math.random() * 255);
		
		// rgb(0,0,0)
		return "rgb(" + r +"," + g +"," + b +")";
		}
	function init() {
		// html5 : canvas / IOS : Quarts2D / android : CanvasView
		let cv = document.getElementById("cv");
		let pen = cv.getContext("2d");
		
		let x = null;
		let y = null;
		
		setInterval(function() {
			pen.save(); // 현제 pen 상태 저장
			pen.fillstyle = "rgba(0, 0, 0, 0.2)";// a = 투명도(0 ~ 1 사이)
			pen.fillRect(0, 0, 500, 500);
			
			// 그림자 x, y값을 0으로 = 그림자 없이
			pen.shadowOffsety = 0;
			pen.shadowOffsetx = 0;
			pen.shadowBlur = 5; // 그림자 번짐 정도
			pen.shadowColor = "white";
			
			x = Math.random() * 500;
			y = Math.random() * 500;
			pen.fillstyle = getRandomColor();// red = #FF0000 = rgb(255,0,0);
			pen.fillRect(x, y, 20 ,20);
			
			pen.restore();
			
			
		}, 200);
		
	}
</script>
</head>
<!--  onload : 문서에 포함되어 있는 모든 컨텐츠(html, image, css, javascript) 같은 것들이 
				모두 로드된 후 발생하는 이벤트 -->
<body onload="init();">
	<canvas id="cv" width="500px" height="500px"></canvas>
	<%
		response.sendRedirect("test.jsp");
		// input.html의 <input>에 숫자 콤마로 구분해서 입력
		
		request.setCharacterEncoding("UTF-8");
		
		String num = request.getParameter("number");
				
		// Split
		String[] numData = num.split(",");
		
		int sum1 = 0;
		for(String n : numData){
			try{
				sum1 += Integer.parseInt(n);
			}catch (Exception e){
				// 아무것도 안써야 에러 표시 안남 -> 숫자만 골라서 더하려고
			}
			
		}
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(num, ",");
		int sum2 = 0;
		while (st.hasMoreTokens()){
			try{
				
				sum2 += Integer.parseInt(st.nextToken());
			}catch(Exception e){
				
			}
		}
		
	%>
	합(Split) : <%=sum1 %><br>
	합(StringTokenizer) : <%=sum2 %>
</body>
</html>