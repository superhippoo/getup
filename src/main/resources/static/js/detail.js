$(document).ready(function() {
	var val ="";
	if ((location.href.lastIndexOf('=') + 1)>0) {
		val = location.href.substr(location.href.lastIndexOf('=') + 1);
	}else{
		val = sessionStorage.getItem('store_id');    			
	}
	console.log('val : ' + val);
	
    $.ajax({
    	url : 'store/selectstore',
    	async : false,// false 일 경우 동기 요청으로 변경
    	type : 'POST',
    	data : JSON.stringify({store_id : val}),
    	contentType : "application/json; charset=UTF-8",
    	success : function(data) {
    		if(data != null){
    			console.log("success");
    				$("#wap").append(
    						"<div id="+data.store_id+" class=\"card h-100\" >"  +
    						"<img src=\"images/"+data.sam1+".jpg\" class=\"card-img-top\" alt=\"...\">" +
    						"<div class=\"card-body\">" +
    						"<h5 class=\"card-title\">"+data.title+"</h5>" +
    						"<p class=\"card-text\">price = "+data.price+"</p>" +
    						"<p class=\"card-text\">txt = "+data.txt_content+"</p>" +
    						"<input type=\"hidden\" name=\"store_id\" value="+data.store_id+">"+
    						"</div>" +
    						"</div>" +
    						"</div>");
    				sessionStorage.setItem('author_id', data.uid);    			
    		}else{
    			console.log("success else");

    		}
    	},// 요청 완료 시
    	error : function(xhr, status, error) {
    		console.log("error")
    	}
    });
	
});

$("#goorder").click(function(){
	
	var val ="";
	if ((location.href.lastIndexOf('=') + 1)>0) {
		val = location.href.substr(location.href.lastIndexOf('=') + 1);
	}else{
		val = sessionStorage.getItem('store_id');    			
	}	
	location.href='order.html?store_id='+val;
});