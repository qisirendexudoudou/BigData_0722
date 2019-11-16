<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
		<%-- <%  
				String errorInfo=(String)request.getAttribute("errorInfo");
			String usname=(String)request.getAttribute("usname");
		%> --%>

		<h1>欢迎登录</h1>
		<form action="login" method="post">
				用户名称：<input name="username" value="${usname}" ><span>${errorInfo }</span><br>
				用户密码：<input name="password"  type="password"> <br>
				<input type="submit" value="Login">
		</form>

</body>
</html>