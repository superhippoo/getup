$(document).ready(function() {
		
	$('#content').load('home.html');

	if (sessionStorage.getItem('nikname')) {
		$('#loginstatus').text(sessionStorage.getItem('nikname')+' 님 반갑습니다.');
		$('#loginout').text('로그아웃');
		$('#loginout').attr("onclick", "logout()")
	}else{
		$('#loginstatus').text('로그인해주세요');
		$('#loginout').attr("onclick", "login()")
	}

});




function login(){
	documnet.location.replace('login.html');
};

function logout(){
	documnet.location.replace('logout.html');
};
