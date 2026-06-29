<%@ page import="com.naman.learning.model.User"%>

<%

HttpSession mySession=request.getSession(false);

if(mySession==null){

    response.sendRedirect("login.jsp");

    return;

}

User user=(User)mySession.getAttribute("user");

if(user==null){

    response.sendRedirect("login.jsp");

    return;

}

%>

<!DOCTYPE html>

<html>

<head>

<title>Dashboard</title>

<style>

*{

margin:0;

padding:0;

box-sizing:border-box;

font-family:Arial;

}

body{

background:#f5f5f5;

display:flex;

justify-content:center;

align-items:center;

height:100vh;

}

.card{

width:500px;

background:white;

padding:30px;

border-radius:10px;

box-shadow:0 0 15px rgba(0,0,0,.2);

}

table{

width:100%;

margin-top:20px;

border-collapse:collapse;

}

td{

padding:12px;

border-bottom:1px solid #ddd;

}

.logout{

display:block;

margin-top:25px;

padding:12px;

background:red;

color:white;

text-decoration:none;

text-align:center;

border-radius:5px;

}

</style>

</head>

<body>

<div class="card">

<h2>

Welcome

<%=user.getName()%>

</h2>

<table>

<tr>

<td><b>Name</b></td>

<td><%=user.getName()%></td>

</tr>

<tr>

<td><b>Email</b></td>

<td><%=user.getEmail()%></td>

</tr>

<tr>

<td><b>City</b></td>

<td><%=user.getCity()%></td>

</tr>

</table>

<a href="Logout" class="logout">

Logout

</a>

</div>

</body>

</html>