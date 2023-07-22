<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<h1>How Can I help You?</h1>
	<%
	/*String name=(String)request.getAttribute("name");
	Integer roll=(Integer)request.getAttribute("roll");
	LocalDateTime time=(LocalDateTime)request.getAttribute("time");*/
	%>
	<h1>Hello my name is 
	<%--<%=name --%> 
	${name}
	</h1>
	<h1>Hello my roll is 
	<%--<%=roll --%> 
	${roll}
	</h1>
	<h1>The time is ${time}</h1>
	<hr>
	<c:forEach var="item" items="${markes }">
		<h1>${item }</h1>
	</c:forEach>
</body>
</html>