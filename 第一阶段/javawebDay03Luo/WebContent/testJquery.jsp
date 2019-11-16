<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">


		


	    $(function(){
		var content=$("#myh1").html();
		alert(content);
		$("#myh1").html("重新设置js1");
		});
	
		$(function(){		
		var content=$("#myh2").html();		
		alert(content);		
		$("#myh2").html("重新设置js2");			
		});

		$(function(){
			var content=$("#myh3").html();
			alert(content);
			$("#myh3").html("重新设置js3");
		});	    

		$(function(){
			$("#input1").val("xiaoluo");
		});



</script>







<title>虽千万人吾往矣</title>
</head>
<body>

		
		<h1 id="myh1">js1</h1>
		<h1 id="myh2">js2</h1>
		<h1 id="myh3">js3</h1>
		<input id="input1" name="username" value="xiaoxu" ></input>
		
		
		
</body>
</html>