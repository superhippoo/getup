$(document).ready(function() {


	if(confirm('로그아웃하시겠습니까')){
		sessionStorage.clear();
		alert('로그아웃되었습니다');
		location.href = 'index.html';
		
	}else{
		location.href = 'index.html';
	}


});





    
