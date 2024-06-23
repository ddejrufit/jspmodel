//03_DialogBox.js
//alert("확인용");

// 대화상자
//		alert, prompt, confirm

// alert : 알려줌(일반적인 경고창)
//	alert("경고!")

// prompt : 값을 입력받을 수 있음
let name = prompt("이름을 입력하세요");
alert(`안녕하세여. ${name}님. 환영합니다`);
// prompt에 값 넣지 않고 그냥 취소해버리면 => null(아무 내용이 없다~)

// default 값을 넣을 수 있다
//		뭔가에 대한 값을 넣을 때, 안내를 하거나 힌트를 주는 역할도 가능
let name2 = prompt("이름을 입력하세요","손");
alert(`안녕하세여. ${name2}님. 환영합니다`);

let reservation = prompt("예약일을 입력하세요", "2023-11-");

// confirm : 확인받음
// 값 : 확인 -> true / 취소 -> false
let isAdult = confirm('당신은 성인입니까?');
alert(isAdult);

//정리
	alert('ㅎㅇ')// 메시지를 보여주는 기능
	prompt('점심뭐먹었어요?')// 메시지를 보여주고 값을 입력받는 기능
	conflrm('JS 재밌나요?')// 사용자에게 확인받기 위한 기능
	
//단점
//		1. 창이 떠있는 동안 스크립트(html화면)가 일시정지
//		2. 자체적 스타일링이 불가능!(위치, 모양 지정하기가 없음)
//		3. 브라우저들 마다 모양이 제각각

//	=> 빠르고 간단하게 적용 가능한 장점이 있어서 광범위하게 사용되고 있음!



