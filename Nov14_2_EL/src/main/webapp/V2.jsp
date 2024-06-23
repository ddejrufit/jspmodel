<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>V2.jsp</title>
</head>
<body>
	<%--
		EL(Expression Language)
			값을 받을 때 Java대신 사용 가능!
			.jsp에서만 사용 가능(.jsp를 tomcat이 servlet으로 바꿀 때 el을 java코드로 번역해줌)
			
			문법 : ${XXX }
				- 연산자 사용 가능
				- 형변환 자동
				- 값은 없을 때 그냥 넘어감(error)
				- import 업어도 됨
				
			파라미터값 읽기 : ${param.파라미터명} => 파라미터 : html,jsp 등의 input의 name부분
			어트리뷰트값 읽기 : ${어트리뷰트명 } => 어트리뷰트 : java에서 만든 값
			어트리뷰트값 읽기(객체)
				주소값 : ${어트리뷰트명 }
				속성값 : ${어트리뷰트명.멤버변수명}
			어트리뷰트값 읽기(List,[])
			AL, [] 자체 : ${어트리뷰트명 }
			index위치의 객체 : ${어트리뷰트명[인덱스] }
			index위치의 객체 속성 : ${어트리뷰트명[인덱스].멤버변수명 }
			
			반복문,조건문 = EL(X)/ CustopmTag(o)
	 --%>
	<h1>짜잔</h1>
	${param.x }<br> <%-- input의 name을 붙임 -> param.input의name--%>
	${param.y }<br>
	${param.x * param.y }<br> <%-- 연산 가능 --%>
	${z }<%--java에서 만든 attribute는 어트리뷰트명만 - rquest.setAttribute("어트리뷰트명", 자바의변수명) --%>
	<hr>
	${cc }<br>
	${cc.name }-${cc.age }<br>
	${param,sadfasdfafsdfasd } <%-- 없는 값은 그냥 넘어감 --%>
	<hr>
	${cs }<br>
	${cs[2] }<br>
	${cs[2].name }<br>
	${cs[2].age }<br>
	

</body>
</html>