// 04_TypeCasting.js
// alert("connected");

// 형변환(Type Casting)

// String() -> 문자형으로 변환
// Number() -> 숫자형으로 변환
// Boolean() -> 논리형으로 변화

// 형변환은 왜 필요한가?
//		ㄴ 자료형이 다른 두 변수를 계산했을 떄 원하지 않는 결과가 나올수도 있어서!

// 대화상자 중에서 하느를 골라서
//	수학점수, 영어점수를 각각 입력받고 
// 그 두 점수의 평균 점수를 console.log로 찍기

/*let math = prompt("수학점수를 입력하세요");
let eng = prompt("영어점수를 입력하세요");
let avg = (math + eng) /2;
console.log('평균점수 : ' + avg); // 2022.5
*/
//변수에 직접 값을 할당해서 다시
/*let math1 = 40;
let eng1 = 45;
let avg1 = (math1 + eng1) / 2;
console.log('다시평균점수 : '+avg1); // 42.5
*/
// prompt로 입력받은 값은 무조건 문자형(String)
//		"40" + "45" =85(x), "4045"(o)
//		"4045" / 2 = 2022.5

// JS : 문자여도 숫자로 보이면 숫자로 바꿔
//	"4045"는 분명히 문자열 -> 근데 계산이 되었음!
//		숫자형이 아니더라도 표현식(+-*/)을 활용했을 때 숫자형으로 변환할 수 있다면
//		자동으로 형변환이 되어서 계산이 됨 => 자동형변환
//	자동형변환 좋아보이지만
//		원인을 찾기 힘든 에러 발생시킬 여지가 다분
//		=> 항상 의도를 가지고 원하는 타입(자료형)으로 변환해서 사용하는 것 => 명시적형변환

/*let math2 = Number(prompt("수학점수를 입력하세요"));
let eng2 = Number(prompt("수학점수를 입력하세요"));
let avg2 = (math2 + eng2) / 2
console.log(avg2) */

// String() : 괄호 속의 값을 문자형으로 바꿔줌
document.write("String()<br>")
document.write(
	String(3) + '<br>',
	String(true) + '<br>',
	String(false) + '<br>',
	String(null) + '<br>',
	String(undefined) + '<br>',
);

// Boolean() : 괄호 안의 값을 논리형을 바꿔줌
//		대부분 true 가 나옴
// false가 나오는 경우가 있음

document.write(Boolean(3) + '<br>')
document.write(Boolean('kang') + '<br>')
document.write(Boolean('') + '<br>')// 빈문자열은 false
document.write(Boolean(' ') + '<br>')
document.write(Boolean(null) + '<br>')// null은 false
document.write(Boolean(undefined) + '<br>')// false
document.write(Boolean(NaN) + '<br>')//false

// 주의사항? 인지해두면 좋은거
Number(null);		//0
Number(undefined);	//NaN

