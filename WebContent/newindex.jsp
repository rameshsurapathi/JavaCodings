<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NSEP</title>
<script type="text/javascript" src="Javascript/loginValidation.js">
</script>
<script>if(window.history.forward(1) != null)
	window.history.forward(1);</script>

<LINK href="CSS/loginpage.css" rel="stylesheet" type="text/css">
</head>
<body class="body">
<%
session.setAttribute("login_value",0);
%>

<table width="100%" height="155" background="Images/top.jpg">
<tr>
<td class="header">
 National Self Employment Program<br><br><br><br></td></tr></table>
<br>
<br>
<table align="center" cellpadding='0' cellspacing='0' border='1' width="600" bgcolor=blue bordercolor=blue>
<tr><td width="300" class="header"><i><b>Welcome to NSEP</b></i>
</td>
<td bgcolor="white">
<table bgcolor=#d0e4fe cellpadding='1' border="0" width='100%'>
<tr><td  align=center style="padding:2;padding-bottom:4">
<b><font size=-1 color="white" face="verdana,arial"><font size=-1 color="black" face="verdana,arial">Please Identify yourself
</font></font></b></td></tr>
<tr><td bgcolor=#d0e4fe  style="padding:5"><br>

<form action="/NSEP/LoginHandler" method="post">

<table bgcolor=#d0e4fe border="0">
<tr><td width="100" class="textstyle">
Admin ID:</td>
<td>
<input type="Text" name="adminid" id="adminid">
</td></tr>
<tr>
<td class="textstyle">
Password:</td><td>
<input type="password" name="password" id="password">
</td></tr>
<tr><td></td><td></td></tr>
<tr><td></td>
<td>
<input type="submit" value="LogIn" onclick="validate();"></input></td></tr>
</table>

</form>
</table>
</td>
</tr>
</table>
<br><br><br>

<table width="100%" height="155" background="Images/bottom.jpg">
<tr><td align="center" class="footer"> 
<br><br> <br><br><br><br><br><br>Copyright © 2011 National Self Employment Program | Terms of Use | Site best viewed in 1280x720 resolution. 
</td></tr></table>


</body>
</html>