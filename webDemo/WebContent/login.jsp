<?xml version="1.0" encoding="gb2312" ?>
<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="helloModel" class="webDemo.HelloWorldModel" scope="request">
	</jsp:useBean>
	<jsp:setProperty name="helloModel" property="*"/>
	<%
		if("login".equals(helloModel.getSubmitFlag())){
	%>
		<jsp:forward page="/hello" />
	<%
		}
	%>
	
	<form action="welcome.jsp" method="post">
		<input type="hidden" name="submitFlag" value="login"/>
		账号: <input type="text" name="account"/><br/>
		密码: <input type="password" name="password"/><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>