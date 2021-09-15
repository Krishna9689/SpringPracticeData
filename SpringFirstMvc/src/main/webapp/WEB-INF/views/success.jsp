<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${Header}</h1>
<p>${Desc}</p>
<hr>
<h1>Welcome ${user.user}</h1>
<h1>Your Email Address Is ${user.email} </h1>
<h1>Your Password is ${user.pass}</h1>
<h3>Try to secure password</h3>
</body>
</html>