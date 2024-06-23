//06_Conditional_stmt.js
//console.log("connected")

// 조건문 (Conditional statement)

// if : 가장 기본적인 조건문
//		ㄴ if절 괄호 안의 조건을 보고 성립(true)면 실행 되도록

/*let age = 20;
// 18살 이상이면 alert으로 [어서오세요!]

if(age>=18){
	alert("어서오세요")
}
*/
// let, const가 다른 블록에서 같은 이름으로 선언 가능
/*let a =1;
if(true){
	let a =2;
	console.log('if문 속의 let a가'+a); // 2
}
console.log('if문 밖의 let a가 ' + a); // 1
*/
// const로 b의 값을 입력받아서
// b가 10보다 크면 console.log로 [b는 10보다 큽니다]
// 그 외 나머지 console.log로 [다릅니다] 가 나오게
/*
const b = Number(prompt('숫자입력'))
if(b > 10){
	console.log('b는 10보다 큽니다')
}else{
	console.log('다릅니다')
}
*/
// 변수 c에 숫자를 입력받아서
/*
const c= prompt('숫자입력')
// c가 10보다 크면 [너무 큰 숫자]
if(Number(c) > 10){
	console.log('[너무 큰 숫자]')
}
// c가 10이면 [정답]
else if(Number(c)===10){
	console.log('[정답]')
}
// c가 10보다 작으면 [너무 작은 숫자]
else{
	console.log('너무 작은 숫자')
}
// 가 크롬 개발자 도구 console에 뜨게
// + Number()로 형변환하는걸 prompt에 안하고
*/


//switch-case
// 사과 : 100원
// 바나나 : 200원
// 키위 : 300원
// 멜론 : 500원
// 수박 : 500원
// 그 외 나머지 과일 입력하면 [그런거 없는데요?]가 alert
// 사고싶은 과일(하나만) 입력받아서 해당하는 가격을 alert으로 출력하기
const fruit =prompt('어떤걸로?')

switch(fruit){
	case"사과":
	alert(`${fruit} : 100원`)
break;
	case"바나나":
	alert(`${fruit} : 200원`)
break;
	case"키위":
	alert(`${fruit} : 300원`)
break;
	case"멜론":
	alert(`${fruit} : 500원`)
break;
	case"수박":
	alert(`${fruit} : 500원`)
	break;
	default:
	alert(`${fruit}...? 그런거 없는데요`)
}


