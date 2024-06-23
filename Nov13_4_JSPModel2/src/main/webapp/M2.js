// M2.js
// alert('connected')

function check(){
	let x = document.ff.x;
	let y = document.ff.y;
	
	if(isEmpty(x) || isNotNumber(x) || isEmpty(y) || isNotNumber(y)){
		alert('Ouch!')
		return false;
	}
	return true;
}



