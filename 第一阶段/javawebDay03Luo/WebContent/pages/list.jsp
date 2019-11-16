<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.atguigu.dao.Employee" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示员工</title>
</head>
<body>
		<%-- <% List<Employee> emps=(List<Employee>)request.getAttribute("emps"); %>
		<table align="center">
				<tr>
					<th>ID</th>	
					<th>LASTNAME</th>
					<th>GENDER</th>
					<th>EMAIL</th>
				<tr>
				<% 
					for(Employee e: emps){
						%>
				<tr>
					<th><%=e.getId() %></th>	
					<th><%=e.getLastName() %></th>
					<th><%=e.getGender() %></th>
					<th><%=e.getEmail() %></th>
				<tr>
								
				<% 		
					}
				
				%>
		</table>--%>
		
		
		<table align="center">
				<tr>
					<th>ID</th>	
					<th>LASTNAME</th>
					<th>GENDER</th>
					<th>EMAIL</th>
				<tr>
				<c:forEach items="${emps}" var="e">
					<tr>
						<td>${e.id }</td>	
						<td>${e.lastName }</td>	
						<td>${e.gender }</td>	
						<td>${e.email }</td>		
					<tr>
				</c:forEach>
		</table>

</body>
</html>