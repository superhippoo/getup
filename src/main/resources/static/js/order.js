$(document).ready(function() {
	
});

$("#sendorder").click(function(){
	
	if(confirm('주문하시겠습니까')){
		var param = {
			"uid" : sessionStorage.getItem('uid'),
			"author_id" : sessionStorage.getItem('author_id'),
			"store_id" : sessionStorage.getItem('store_id'),
			"title" : document.getElementById("title").value,
			"address" : document.getElementById("address").value,
			"etc_info" : document.getElementById("etcinfo").value,
			"order_stat" : "a",
			"price" : document.getElementById("price").value,
			"txt_content" :  document.getElementById("txtcontent").value,
			"reg_id" : sessionStorage.getItem('uid'),
			"mdfy_id" : sessionStorage.getItem('uid')
		}

	    $.ajax({
	    	url : 'order/insertorder',
	    	async : false,// false 일 경우 동기 요청으로 변경
	    	type : 'POST',
	    	data : JSON.stringify(param),
	    	contentType : "application/json; charset=UTF-8",
	    	success : function(data) {
	    		if(data != null){
	    			console.log("success");
	    			var val = location.href.substr(location.href.lastIndexOf('=') + 1);
	    			console.log('val : ' + val);
	    			location.href='detail.html?store_id='+sessionStorage.getItem('store_id');
	    		}else{
	    			console.log("success else");

	    		}
	    	},// 요청 완료 시
	    	error : function(xhr, status, error) {
	    		console.log("error")
	    	}
	    });
		

	}else{
		alert('주문취소');
	}

});