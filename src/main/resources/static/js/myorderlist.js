$(document).ready(function() {

	
	var param = {
			"uid" : sessionStorage.getItem('uid')
		}
	var str = '';
	var temp = '';

	    $.ajax({
	    	url : 'order/selectmyorderlist',
	    	async : false,// false 일 경우 동기 요청으로 변경
	    	type : 'POST',
	    	data : JSON.stringify(param),
	    	contentType : "application/json; charset=UTF-8",
	    	success : function(data) {
	    		if(data != null){
	    			for (var i = 0; i < data.length; i++) {
	    				console.log(i,"=",data[i]);
	    				str = "<div class='media-body' onclick='move(#{data[i].order_id})' style='cursor:pointer;'>";
	    				str = str.replace('#{data[i].order_id}', '"' + data[i].order_id + '"');
	    				$("#wap").append(str+
	    						"<h5 class=\"mt-0\">"+data[i].title+"</h5>"+
	    								 "<p>"+data[i].reg_dt+"</p>"+
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



function move(str) {

	sessionStorage.setItem('order_id', str);
	sessionStorage.setItem('from', 'myorderlist');
	location.href = 'detailorder.html';
}

	
		
		

	
