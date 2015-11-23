<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://www.rui.com/taglib" prefix="myTag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<%
		List<String> a = new ArrayList<String>();
		a.add("Rui");
		a.add("Lan");
		a.add("Bin");
		
		pageContext.setAttribute("a", a);
	%>
	<h2>Iterator tag</h2>
	<table border="1" bgcolor="#aaaadd" width="300">
		<myTag:iterator item="item" collection="a">
		<tr>
			<td>${pageScope.item}</td>
		</tr>
		</myTag:iterator>
	</table>
</body>
</html>