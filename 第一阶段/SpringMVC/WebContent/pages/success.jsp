<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>success</h1>
		<h1>request域</h1>
		${requestScope.map }<br>
		${requestScope.mdoel }<br>
		${requestScope.modelMap }<br>
		${requestScope.hello }<br>
		<hr>
		<h1>session域</h1>
		${sessionScope.session }<br>
		${sessionScope.model }<br>
		${sessionScope.modelMap }<br>
		<hr>
		<h1>application域</h1>
		${applicationScope.applicaiton }<br>
		${applicationScope.model }<br>
		${applicationScope.modelMap }<br>
		

</body>
</html>