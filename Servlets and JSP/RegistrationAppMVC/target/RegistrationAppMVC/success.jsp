<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<title>Registration</title>

<style>

body{

font-family:Arial;

display:flex;

justify-content:center;

align-items:center;

height:100vh;

background:#f5f5f5;

}

.card{

background:white;

padding:40px;

border-radius:10px;

box-shadow:0 0 10px rgba(0,0,0,.2);

text-align:center;

}

a{

display:inline-block;

margin-top:20px;

padding:10px 20px;

background:#0d6efd;

color:white;

text-decoration:none;

}

</style>

</head>

<body>

<div class="card">

<h1>

<%=request.getAttribute("message")%>

</h1>

<br>

<a href="login.jsp">

Go To Login

</a>

</div>

</body>

</html>