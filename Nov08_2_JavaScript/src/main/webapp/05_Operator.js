//05_Operator.js
//

// 5. 연산자(Operator)
// 산술연산자 : + - * / %

// 거듭제곱
let num1 = 2 ** 3;
console.log(num1)

// 연산자 줄여쓰기 가능!
let num2 = 10;
num2 += 5; //num2 = num2 + 5;
console.log(num2)

// 증감연산자
let num3 = 20;
num3 ++;
console.log(num3) //21

let result = num3++;	// => 후위연산자
console.log(result); // 21
console.log(num3); // 22

let result2 = ++num3;	// => 전위연산자
console.log(result2); // 23

// =>  ++을 변수 뒤에 담으면 증가시키기 전의 값을 담고
//				앞에 담으면 증가시킨 값을 담음

// 비교연산자(Java때와 같음)
// <(미만) >(초과) <=(이하) >=(이상) ==(같음) !=(다름)
console.log('----------')
console.log(10 > 5)
console.log(10 == 5)
console.log(10 < 5)
console.log('----------')

//"10"과 10이 같은지 비교해주세요!
console.log("10" == 10)// true(자동 형변환 덕분에)
console.log("10" === 10)// false(자료형까지 비교하는 방법)
// 일치연산자 : === / !==

//논리연산자
//||(or)
//&&(and)
// !(not)
