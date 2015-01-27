<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.http.HttpSession;"%>
    


<%
session.setAttribute("session_value",1);
session.setAttribute("footer_value",1);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<script>if(window.history.forward(1) != null)
	window.history.forward(1);
	</script>
	
<link rel="stylesheet" type="text/css" href="../CSS/dropdown.css" />

<script src="../Javascript/stuHover.js" type="text/javascript"></script>

<LINK href="../CSS/sideMenu.css" rel="stylesheet" type="text/css">
</head>
<body>






<%@ include file="../HtmlPages/Header.html" %>

<table border="0" width="900px" height="400px">
<tr>
<td width="200px" valign="top">


<div class="sidebarmenu">
<ul id="sidebarmenu1">

<li><a href="student.jsp">Student</a>  
</li>
<li><a href="#">Bank</a></li>
<li><a href="#">College</a></li>
</ul>
</div>

</td>
<td width="700px" id="mainpage">

</td>
</tr>
</table>


<%@ include file="../HtmlPages/Footer.html" %>

</body>
</html>