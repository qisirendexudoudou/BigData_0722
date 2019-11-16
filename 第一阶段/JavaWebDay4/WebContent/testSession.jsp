<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page1</title>
</head>
<body>
		<% 
			session.setAttribute("session", "hello");
		
			String id=session.getId();
			
			System.out.println(id);
		
		%>
		
		<h1>${sessionScope.session }</h1>
		
		<h1>${cookie.JSESSIONID.value }</h1>
		
		<h1><%=id %></h1>

</body>
</html>