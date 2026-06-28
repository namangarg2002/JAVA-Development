<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>User Details</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#f4f7fc;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.card{
    width:420px;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 15px rgba(0,0,0,.2);
}

h1{
    color:#0d6efd;
    text-align:center;
    margin-bottom:25px;
}

table{
    width:100%;
    border-collapse:collapse;
}

td{
    padding:12px;
    border-bottom:1px solid #ddd;
}

.label{
    font-weight:bold;
}

.value{
    color:#198754;
}

a{
    display:block;
    margin-top:20px;
    text-align:center;
    text-decoration:none;
    background:#0d6efd;
    color:white;
    padding:10px;
    border-radius:5px;
}

a:hover{
    background:#084fc7;
}

</style>

</head>

<body>

<div class="card">

    <h1>User Details</h1>

    <table>

        <tr>
            <td class="label">Name</td>
            <td class="value">
                <%= request.getAttribute("name") %>
            </td>
        </tr>

        <tr>
            <td class="label">City</td>
            <td class="value">
                <%= request.getAttribute("city") %>
            </td>
        </tr>

    </table>

    <a href="index.html">Go Back</a>

</div>

</body>
</html>