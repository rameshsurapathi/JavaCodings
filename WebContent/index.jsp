<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NSEP</title>
<script type="text/javascript" src="Javascript/loginValidation.js">
</script>
</head>
<body background="Images/background.jpg" onunload="javascript:history.go(0)">
<%
session.setAttribute("login_value",0);
%>

<%@ include file="HtmlPages/Header.html" %>

<br/>
<br/>
<h2 style="color: blue" align="center">Admin Login</h2>

<form name="loginform" method="post" action="/NSEP/LoginHandler">
<table border="0" align="center">
<tr>
<td>Admin ID  </td>
<td><input type="text" name="adminid" id="adminid" size="30"></input></td>
</tr>
<tr>
<td>Password  </td>
<td><input type="password" name="password" id="password" size="30"></input></td>
</tr>
<tr><td></td><td></td></tr>
<tr><td></td>
<td><input type="submit" value="LogIn" onclick="validate();"></input></td>
</tr>
</table>
</form>

<div style="height:260px"></div>

<%@ include file="HtmlPages/Footer.html" %>

</body>
</html>