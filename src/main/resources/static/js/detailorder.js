$(document).ready(function() {

	var param = {
			"order_id" : sessionStorage.getItem('order_id')
		}

    $.ajax({
    	url : 'order/selectorder',
    	async : false,// false 일 경우 동기 요청으로 변경
    	type : 'POST',
    	data : JSON.stringify(param),
    	contentType : "application/json; charset=UTF-8",
    	success : function(data) {
    		if(data != null){
    			console.log("success",data.title);   			
    			$('#title').val(data.title);
    			$('#address').val(data.address);
    			$('#etcinfo').val(data.etc_info);
    			$('#txtcontent').val(data.txt_content);

    			
    		}else{
    			console.log("success else");

    		}
    	},// 요청 완료 시
    	error : function(xhr, status, error) {
    		console.log("error")
    	}
    });
	if (sessionStorage.getItem('from') == "myorderlist") {
		$("#goorderlist").hide();
		sessionStorage.removeItem("from");
	}else{
		$("#gohome").hide();
		sessionStorage.removeItem("from");
	}
    

	
});

$("#goorderlist").click(function(){
	location.href = 'orderlist.html';
});

$("#gohome").click(function(){
	location.href = 'index.html';
});
