<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Called By Home Controller</h1>
<h1>This Is My First SpringMVC Project...</h1>
<%
 String name=(String)request.getAttribute("name");
List<String> friends=(List<String>)request.getAttribute("f");
%>
<h1>NAme Is <%=name%></h1>

<h1><% 
 for(String s:friends)
 {
	 out.println(s);
 }
%>
 </h1>
</body>
</html>