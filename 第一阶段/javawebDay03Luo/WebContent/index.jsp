<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
		
		var f1=function clearspan(){
			<%--document.getElementById("errorSpan").innerHTML="";--%>
			$("#errorSpan").html("");
		}
		
		
		<%--window.onload=function(){
			var input1=document.getElementById("input1");
			input1.onfocus=f1;
		}--%>
		$(function(){
			$("#input1").change(f1);
			})
		
		function validUsername(){
			var data=$("#input1").attr("name")+"="+$("#input1").val();
		$.ajax({
			"type":"POST",
			"url":"validUsername",
			"data":data,
			"success":function(responseData){
				$("#errorSpan").html(responseData);
			}
		});	
		}
			
			
		<%--function validUsername(){

		//发送异步请求
			var xmlhttp=new XMLHttpRequest();
			var url="validUsername?username="
					+document.getElementById("input1").value;
		
		//准备请求
		xmlhttp.open("GET",url,true);
		//发送请求
		xmlhttp.send();
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				document.getElementById("errorSpan").innerHTML = xmlhttp.responseText;
			}
		}
		} --%>
			
			
			
			
			
			
	
</script>
<title>Insert title here</title>
</head>
<body bgcolor="pink">
		
		<h1>欢迎登录</h1>
		<form action="login" method="post">
				用户名称：<input id="input1" name="username" value="${usname}" onblur="validUsername()" ><span id="errorSpan">${errorinfo}</span><br>
				用户密码：<input name="password"  type="password"> <br>
				<input type="submit" value="Login">
		</form>

</body>
</html>