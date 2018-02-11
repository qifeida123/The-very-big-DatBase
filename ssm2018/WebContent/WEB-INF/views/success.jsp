<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
 <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h4>Success Page</h4> 
time: ${requestScope.time}<br><br>
username: ${requestScope.username}<br><br>
user:${requestScope.user}<br><br>
</body>
<script>
window.onload=function justdo(){
	$.ajax({
		 url:"/springmvc/testPojo.do" 
		/* url:"niu/testPojo" */
		,type:"POST" 
		,data:""
		,contentType:"application/json"
		,success:function(data){
			alert(data);
		}
		,error:function(data){
			alert(data);
		}
	});
}

</script>
</html>