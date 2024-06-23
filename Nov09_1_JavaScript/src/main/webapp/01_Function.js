// 01_Function.js
//alert('확인')

// 함수(Fuction)
//		서비스를 만들다 보면 같거나 비슷한 기능을 또 사용하게 되는 경우가 발생
//		매번 새롭게 만들지 않고 -> 자주 사용하는 기능을 하나로 묶어서 불러다 쓰자~

// function vs method
//		function : 하나의 기능을 구현하도록 구성한 것 - 독립적 존재
//		method	 : class 내부에 정의한 함수(function) - 종속적 존재

/*function 함수명(파라미터){
	내용
}*/
// 함수명(파라미터); 로 호출

//파라미터 없는 함수
function showError(){
	alert('에러발생!!!')
}
showError(); // html실행과 동시에 발생
// 원하는 타이밍에 함수를 부르고 싶다면, 다양한 이벤트를 통해 부르면 됨!

// 파라미터 있는 함수
function sayMyName(name){
	let msg=`Hello, ${name}`;
	alert(msg);
}

//sayMyName('kang')
// if 파라미터가 필요한 함수에서 파라미터를 쓰지 않으면
// sayMyName(); // undefined <<

//undefined를 방지하자!!
function sayMyName2(name){
	let msg = "Hello";
	if(name){
		msg +=`,${name}`
	}
	alert(msg)
}
//sayMyName2(' kang ')
//sayMyName2();

let msg = "Hellow"; // 현재 .js파일 어디에서나 접근이 가능한 변수 : 전역변수(Global Variable)
console.log('함수 호출 전')
console.log(msg)
function sayMyName3(name){
	let msg = "Hello"// 해당 함수 안에서만 접근 가능한 변수 : 지역변수(Local Variable)
	if(name){
		msg +=`, ${name}`
	}
	console.log(msg)
}
sayMyName3('kang')
console.log('함수 호출 후')
console.log(msg) // Hellow

// 지역변수는 함수 안에서 전역변수와 같은 이름으로 지울 수 있고, 서로 간섭받지 않음!!
//	c.f) 전역변수가 많아지면 관리하기가 힘들어지기 때문에
//			=> 함수에서 필요한 변수는 가능하면 함수 안에서 만드는 지역변수를 사용하는 것이 편함!


// OR을 사용해서 기본값 넣기
function sayHello(name){
	let newName = name|| 'Friend';
	let msg = `Hello, ${newName}`
	console.log(msg)
}
sayHello();
sayHello('chanwoo');

// 파라미터에 default값을 정하기
function sayHello2(name = 'Friend'){
	let msg = `Hello, ${name}`
	console.log(msg)
} 
sayHello2();
sayHello2('chanwoo')

// 정리 :
//		함수는 한번에 하난의 작업만 하는 것이 좋다
//		여러작업이 진행되어야 한다면 함수를 나눠서 구분하기 (1함수 = 1기능)
//		함수명은 읽기 쉽고 어떤 기능이 들어있는지 알 수 있게 네이밍
//		함수명 중복 불가능























