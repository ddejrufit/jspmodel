<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>j3_gugudan.jsp</title>
<style type="text/css">
	table{
		float:left;
	}
</style>
</head>
<body>

		

	

	<%	
	for(int i = 2; i < 10; i++){
		 %>
		 <table border="1">
		 <tr>
		 	<th><%= i %>단</th>
		 </tr>
		 
		 
		 <% 
		for(int j = 2; j < 10; j++){
		%>
		<tr>
		<td align="center">
		<%= i %> X <%= j %> = <%= i * j %>
		</td>
		</tr>
<%
		}
	
%>
<p>
</table>
<%
		
	}
%>
	
</html>