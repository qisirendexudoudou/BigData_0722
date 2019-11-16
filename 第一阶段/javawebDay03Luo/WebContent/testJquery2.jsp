<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 引入其他js文件的 script标签，标签体中不能写js代码-->
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>

<script type="text/javascript">
	
	$(function(){
		
		var content=$("#myh1").html();
		
		alert(content);
		
		$("#myh1").html("重新设置js");
		
		$("#myinput").val("tom");
		
		
		
	});



</script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1 id="myh1">测试js</h1>
		
		<input id="myinput" name="username" value="jack">

</body>
</html>