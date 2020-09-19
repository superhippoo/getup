$(document).ready(function() {
	
	if (sessionStorage.getItem('nikname')) {
		$('#loginstatus').text(sessionStorage.getItem('nikname')+' 님 반갑습니다.');
		$('#loginout').text('로그아웃');
		$('#loginout').attr("onclick", "logout()")
	}else{
		$('#loginstatus').text('로그인해주세요');
		$('#loginout').attr("onclick", "login()")
	}
	
		
	var str = '';
	
    $.ajax({
	url : 'store/selectstorelist',
	async : false,// false 일 경우 동기 요청으로 변경
	type : 'POST',
	data : JSON.stringify({}),
	contentType : "application/json; charset=UTF-8",
	success : function(data) {
		if(data != null){	
			console.log("success");
			for (var i = 0; i < data.length; i++) {
				console.log(i,"=",data[i]);
				str = "<div class='col-lg-4' id="+data[i].store_id+" onclick='detailstore(#{data[i].store_id})' style='cursor:pointer;'>";
				str = str.replace('#{data[i].store_id}', '"'+ data[i].store_id +'"');

				$("#wap").append(str+
						"<svg class=\"bd-placeholder-img radius-square\" width=100% height=\"200\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 200x200\">" +
						"<title>"+data[i].title+"</title> " +
						"<rect width=\"100%\" height=\"100%\" fill=\"#777\"/>" +
						"<text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">200x200</text>" +
						"<image width=\"100%\" height=\"100%\"  xlink:href=\"/images/"+data[i].sam1+".jpg\"/></svg>" +
						"<h2>"+data[i].title+"</h2>" +
						"<p>"+data[i].summary+"</p>" +
						"<p>가격 : "+data[i].price+"</p>" +
						"<p><a class=\"btn btn-secondary\" href=\"#\" role=\"button\">자세히보기 &raquo;</a></p>" +
						"</div>");				
			}
			
		}else{
			console.log("success else");

		}
	},// 요청 완료 시
	error : function(xhr, status, error) {
		console.log("error")
	}

});
});

function detailstore(url){
	sessionStorage.setItem('store_id', url);
	location.href='detail.html?store_id='+url;
};


function login(){
	location.href='login.html';
};

function logout(){
	location.href='logout.html';
};



    
