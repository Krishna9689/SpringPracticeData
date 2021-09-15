<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This Is Help Page page</h1>
<%
/*
String name=(String)request.getAttribute("name");
LocalDateTime obj=(LocalDateTime)request.getAttribute("time");
*/
%>

<h1>
MY Name IS 
${name}

<br>
Time Is ${time}
<%--
<%=name %>
<%=obj.toString() %>
 --%>
</h1>


<hr>
 
 <c:forEach var="item" items="${marks}">
     <h1><c:out value="${item}"></c:out></h1>
 </c:forEach>
</body>
</html>