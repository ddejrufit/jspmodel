// 03_RepeatStmtEx.js
// alert('dd')

// document.write()
//		ㄴ 웹페이지가 로딩될 때 실행되면 웹페이지에 가장 먼저 출력
//		ㄴ 보통 테스트 용도 or 디버깅 용도로 사용
//		ㄴ 중간에 document.write()가 실행되면
//		ㄴ 웹페이지 안에 먼저 로딩된 모든 데이터를 지우고 본인의 데이터를 출력

function test() {
	document.write("<table border='1'>");
	document.write("<tr>")
	document.write("<td>테이블 이렇게 만들 수 있다</td>")
	document.write("</tr>")
	document.write("<tr>")
	document.write("<td>document.write()는</td>")
	document.write("</tr>")
	document.write("<tr>")
	document.write("<td>test 용도</td>")
	document.write("</tr>")
	document.write("</table>")
}

function makeTable() {
	let row = prompt('행 개수 입력')
	let col = prompt('열 개수 입력')
	alert(row + "X" + col + "의 table을 생성합니다.")
	
	let count =1;
	document.write('<table border="1">');
	for(let i = 0; i < row; i++){
	document.write("<tr height='50px'>")
	for(let i = 0; i < col; i++){
		document.write("<td width='50px' align='center'>")
		document.write(count)
		document.write("</td>")
		count++;
	}
	document.write("</tr>")
	}
	document.write('</table>');
}

