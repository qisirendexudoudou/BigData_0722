<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">

		var f1=function clearSpan(){		
			// 获取要清空的span节点
			$("#errorSpan").html("");

		}
		
		$(function(){
			
			$("#input1").change(f1);
			
		});
		
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

</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
			<c:if test="${empty sessionScope.username}">
				<h1>欢迎登录</h1>
				<form action="login" method="post">
						用户名称：<input id="input1" name="username" value="${cookie.username.value }" onblur="validUsername()" ><span id="errorSpan">${errorInfo }</span><br>
						用户密码：<input name="password"  type="password"> <br>
						<input type="submit" value="Login">
				</form>
			
			</c:if>
			<c:if test="${! empty sessionScope.username}">
						<h1 align="center">欢迎${sessionScope.username }登录</h1>
			</c:if>
		

</body>
</html>