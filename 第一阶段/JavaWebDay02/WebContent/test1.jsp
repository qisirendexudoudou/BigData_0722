<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
			<%-- jsp声明
					<%@ jsp声明 %>
					jsp声明，声明页面使用的编码，语言，导包等操作
			 --%>
			<!-- 可以编写html中所有的内容  -->
			<h1>jsp</h1>
			
			<!-- jsp脚本片段中可以编写java代码 -->
			<% System.out.print("hello");
					int i=10;
			%>
			
			<%-- Jsp注释
					jsp表达式：会向页面输出表达式（变量，对象）中的内容
			 --%>
			<%=i %>
			
			<% pageContext.setAttribute("key1", "pageContext1");
				request.setAttribute("key2", "request1");
				session.setAttribute("key3", "session1");
				application.setAttribute("key4", "application");
				
				String pageStr=(String)pageContext.getAttribute("key1");
				String requestStr=(String)request.getAttribute("key2");
				String sessionStr=(String)session.getAttribute("key3");
				String applicationStr=(String)application.getAttribute("key4");
				
				
			%>
			<h1><%=pageStr %></h1>
			<h1><%=requestStr %></h1>
			<h1><%=sessionStr %></h1>
			<h1><%=applicationStr %></h1>
			
			
			
			

</body>
</html>