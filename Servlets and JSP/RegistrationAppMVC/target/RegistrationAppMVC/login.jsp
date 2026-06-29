<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Login</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial;
}

body{

    display:flex;

    justify-content:center;

    align-items:center;

    height:100vh;

    background:#f5f5f5;

}

.container{

    width:380px;

    background:white;

    padding:30px;

    border-radius:10px;

    box-shadow:0 0 15px rgba(0,0,0,.2);

}

h2{

    text-align:center;

    margin-bottom:20px;

}

input{

    width:100%;

    padding:12px;

    margin:10px 0;

}

button{

    width:100%;

    padding:12px;

    background:#0d6efd;

    color:white;

    border:none;

    cursor:pointer;

}

.error{

    color:red;

    text-align:center;

    margin-bottom:10px;

}

</style>

</head>

<body>

<div class="container">

<h2>User Login</h2>

<%
String error=(String)request.getAttribute("error");

if(error!=null){
%>

<p class="error"><%=error%></p>

<%
}
%>

<form action="Login" method="post">

<input
type="email"
name="uemail"
placeholder="Enter Email"
required>

<input
type="password"
name="upassword"
placeholder="Enter Password"
required>

<button type="submit">

Login

</button>

</form>

<br>

<a href="index.html">

Create New Account

</a>

</div>

</body>

</html>