<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

		var f1=function clearSpan(){
			
			// 获取要清空的span节点
			var errorSpan=document.getElementById("errorSpan");
			
			errorSpan.innerHTML="";
			
		}
		
		window.onload=function(){
			
			var input1=document.getElementById("input1");
			
			input1.onclick=f1;
			
			
		}
		
		function validUsername(){
			

	// 发送ajax请求，验证用户名
		var xmlhttp = new XMLHttpRequest();

		var url = "validUsername?username="
				+ document.getElementById("input1").value;

		// 准备请求
		xmlhttp.open("GET", url, true);
		// 发送请求
		xmlhttp.send();

		// 为onreadystatechange事件绑定函数，onreadystatechange事件负责监听请求状态的变化
		xmlhttp.onreadystatechange = function() {
			//4代表服务器已经处理完，且响应就绪
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				//xmlhttp.responseText 代表服务器响应的内容
				document.getElementById("errorSpan").innerHTML = xmlhttp.responseText;
			}
		}

	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	
		<h1>欢迎登录</h1>
		<form action="login" method="post">
				用户名称：<input id="input1" name="username" value="${usname}" onblur="validUsername()"><span id="errorSpan">${errorInfo }</span><br>
				用户密码：<input name="password"  type="password"> <br>
				<input type="submit" value="Login">
		</form>

</body>
</html>