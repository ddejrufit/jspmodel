function Check() {
		let numBox = document.nbform.userAns;
		
		if (isEmpty(numBox) ||  atLeastLetter(numBox,3) || isNotNumber(numBox)
			|| numBox.value[0] == numBox.value[1]
			|| numBox.value[1] == numBox.value[2]
			|| numBox.value[2] == numBox.value[0]) {
			alert('숫자의 각 자리수는 달라야 하고,3자리수여야합니다');
			numBox.value='';
			numBox.focus();
			return false;
		}
		return true;
	}