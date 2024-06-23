/**
 * 
 */
 

 

 function bmiCheck(){
	let nameBox = document.bmiForm.name;
	let heightBox = document.bmiForm.height;
	let weightBox = document.bmiForm.weight;
	let photoBox = document.bmiForm.photo;
	//alert(nameBox.value); // 중간중간 확인 할 것!

//	1. 이름 : 빈칸X, 2자 이상
	if(isEmpty(nameBox) || atLeastLetter(nameBox, 2)) {
		alert('이름 다시');
		nameBox.value="";
		nameBox.focus();
		return false;
	}
//	2. 키 : .빈칸X, 숫자만, 3자이상
else if(isEmpty(heightBox) || isNotNumber(heightBox) || atLeastLetter(heightBox, 3)){
	alert('키 다시')
	heightBox.value=""
	heightBox.focus();
	return false;
}
//	3. 몸무게 : 빈칸X, 숫자만, 2자 이상
else if(isEmpty(weightBox) || isNotNumber(weightBox) || atLeastLetter(weightBox, 3)){
	alert('몸무게 다시')
	weightBox.value=""
	weightBox.focus();
	return false;
}
//	4. 사진 : 빈칸X, png, gif, jpg, PNG, JPG 만 가능
	else if(isEmpty(photoBox) || (isNotType(photoBox, 'png') 
	&& isNotType(photoBox, 'gif')  && isNotType(photoBox, 'jpg') 
	&& isNotType(photoBox, 'PNG') && isNotType(photoBox, 'JPG'))){
	alert('사진 다시')
	photoBox.value=""
	photoBox.focus();
	return false;
}
	return true;
}



























