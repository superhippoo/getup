$(document).ready(function() {

	
});

function checklogin(email){
    $.ajax({
    	url : 'user/login',
    	async : false,// false 일 경우 동기 요청으로 변경
    	type : 'POST',
    	data : JSON.stringify({nikname : email}),
    	contentType : "application/json; charset=UTF-8",
    	success : function(data) {
    		if(data != null){
    			if(data.message == 'login ok' || data.message == 'regist ok'){
   				 	sessionStorage.setItem('nikname', data.nikname);
   				 	sessionStorage.setItem('uid', data.uid);
    				window.location.replace("http://" + window.location.hostname + 
                            ( (location.port==""||location.port==undefined)?"":":" + location.port) + "/index.html");
    			}else{
    				window.location.replace("http://" + window.location.hostname + 
                            ( (location.port==""||location.port==undefined)?"":":" + location.port) + "/login.html");
    			}
							
    		}else{
    			console.log("success else",data);

    		}
    	},// 요청 완료 시
    	error : function(xhr, status, error) {
    		console.log("error")
    	}
    });
};