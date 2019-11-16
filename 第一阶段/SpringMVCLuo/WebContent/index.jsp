<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">

$(function(){
	$("#handle12").click(function(){
		var user={"id":2,"username":"tom","password":"123"};
		var userStr=JSON.stringify(user);
		
		$.ajax({
			url:$(this).attr("href"),
			type:"POST",
			data:userStr,
			contentType:"application/json",
			success:function(){
				alert(haha);
			}			
		});
		
		return false;
	});
});


</script>
</head>
<body>

	<a href="hello">hello</a>
	<a href="hello2">hello2</a>
	<a href="hello3">hello3</a>
	<a href="hello4">hello4</a>
		<form action="/SpringMVCLuo/hello" method="GET">
  		<p>First name: <input type="text" name="fname" /></p>
  		<p>Last name: <input type="text" name="lname" /></p>
		 <input type="submit" value="Submit" />
		</form>

	<p>请单击确认按钮，输入会发送到服务器上hello的请求处理。</p>
	<hr>
	<a href="handle1?username=xiaoxu&password=0000000">handle1</a>
	<a href="handle2">handle2</a>
	<a href="handle3">handle3</a>
	<form action="/SpringMVCLuo/handle4" method="post">
		<p>username: <input type="text" name="username" /></p>
  		<p>password: <input type="text" name="password" /></p>
  		<p>phone.type:    <input type="text" name="phone.type" /></p>
  		<p>phone.brand:    <input type="text" name="phone.brand" /></p>
		 <input type="submit" value="handle4提交" />
	</form>
	<a href="handle5?username=xiaoxu">handle5</a><br/>

	<hr>
	<!--增删改查 -->
	<form action="/SpringMVCLuo/book/1" method="get">
	<input type="submit" value="查询1号图书">
	</form>
	
	<form action="/SpringMVCLuo/book/2" method="post">
	<input type="submit" value="增加2号图书">
	</form>	
	
	<form action="/SpringMVCLuo/book/2" method="post">
	<input name="_method"  value="put" type="hidden">
	<input type="submit" value="修改2号图书">
	</form>
	
	<form action="/SpringMVCLuo/book/2" method="post">
	<input name="_method"  value="delete" type="hidden">
	<input type="submit" value="删除2号图书">
	</form>
	<hr>
		
	<a href="handle7">request域的共享数据</a><br>
	<a href="handle8">将String类型的数据转为json字符串返回给浏览器</a><br>
	<a href="handle9">将User对象转为json字符串返回给浏览器</a><br>
	<a href="handle12" id="handle12">将json字符串转换为java对象返回给服务器</a><br>
	<a href="handle13" id="handle13">将java对象转换为json字符串返回给浏览器</a><br>


</body>   
</html>