// 01_Variable.js

// JavaScript
//		인터프리터 언어 -> 오타 안나게 주의

// alert("연결완")

// 1. 변수(Variable)
//		데이터를 담는 그릇

//변수에 접근하는 방법(우리가 확인하는 거 - syso)
//  1) alert() : 경고창을 띄워주는 함수
//					alert("까꿍");
//	2) console.log() : 로그를 띄워주는 함수
//					console.log("확인")

// name = "kang";
// age = 100; // 전역변수의 형태이기 때문에 이방식은 굉장히 위험함!

// 이걸 방지하기 위해 변수 선언하는 형태 3가지
//		var, letm const
//		자바는 : 자료형 변수명
//		JS는		: 변수형태 변수명 

// var: var(iable) >> 중복선언 가능 + 초기화
var a = 10; // a라는 변수 선언하면서 초기화
console.log(a);
var a = 20;// a라는 변수 선언하면서 초기화
console.log(a);
var a;		// 변수 선언 : 마지막에 해당 변수에 할당된 값이 변수에 저장
console.log(a);
// 		기존에 선언해 둔 변수를 까먹고 다시 값을 할당하는 실수가 있을 수 있어서 잘 사용 X

// let : java 변수 만들때와 비슷한 느김(변수명 중복 X)
let name="kang"ㅣ
console.log(name);
// let name = "kang"; // 이미 name이 kang으로 선언 되었기 때문에 에러 발생!!
name="chanwoo";// 변수명 = 값;의 형태로 변경이 가능!
console.log(name);

// const : 값이 절대로 바뀌지 않는 상수!
//			수정 불가능, 수정하려고 하면 에러 발생!
//			const 변수명은 대문자로 사용하는 문화
const PI = 3.141592;
console.log(PI);
//PI = 6.1532554747;// error!!
//console.log(PI);

// 정리!
//		JS에서 변수 선언할 때
//			변할 수 있는 값은 var, let
//			변하지 않는 값은 const

//	JS 변수명 짓는 조건! (Java와 동일)
//		1. 변수는 문자와 숫자, $, _만 가능
//		2. 첫글자로 숫자, 대문자는 사용하지 않음!!
//		3. 예약어는 사용하지 않음!!
//		4. 변수명은 읽기 쉽고 이해하기 좋게
//		5. const변수를 만들 땐 전부 대문자로