<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="helloworld">hello world</a>
<a href="today">hello world2</a>
<a href="picture">hello world3</a>
<a href="testPathVariable/1">testPathVariable</a><br/><br/>
<a href="testRequestParam?username=jackie&age=12">testRequestParam</a><br/><br/>
<a href="testRequestHeader">testRequestHeader</a><br/><br/>

<form action="springmvc/testRest" method="post">
	<input type="text" name="username" value="">
    <input type="submit" value="testRestPost">
</form><br/><br/>
<a href="springmvc/testRest/1">testRest</a><br/><br/>

<form action="testPojo" method="post">
    username: <input type="text" name="username"><br>
    password: <input type="password" name="password"><br>
    email:    <input type="text" name="email"><br>
    age:      <input type="text" name="age"><br>
    city:     <input type="text" name="address.city"><br>
    province: <input type="text" name="address.province"><br>
   	          <input type="submit" value="submit">
</form><br/><br/>

<a href="testViewAndViewResolver">testViewAndViewResolver</a><br/><br/>

</body>
</html>