<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<% System.out.print("--");
		int i=10;
		%>
		
		<%-- --%>
		<%=i %>
		<%
			pageContext.setAttribute("key1", "pageContext1");
			request.setAttribute("key2", "request1");
			session.setAttribute("key3", "session1");
			application.setAttribute("key4", "application");
			
			String pagestr=(String)pageContext.getAttribute("key1");
			String requeststr=(String)request.getAttribute("key2");
			String sessionstr=(String)session.getAttribute("key3");
			String applicationstr=(String)application.getAttribute("key4");
		%>
		
		<h1><%=pagestr %></h1>
		<h1><%=requeststr %></h1>
		<h1><%=sessionstr %></h1>
		<h1><%=applicationstr %></h1>
		
		
		
		
		
</body>
</html>