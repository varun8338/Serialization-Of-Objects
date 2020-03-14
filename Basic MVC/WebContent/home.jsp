<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Home Page</h1>
<a href = "<%=request.getContextPath() %>/Controller?page=login">Login</a>
<br/>

<a href = "<%=request.getContextPath() %>/Controller?page=signUp">Sign Up</a>
<br/>

<a href = "<%=request.getContextPath() %>/Controller?page=about">About US</a>
<br/>
</body>
</html>