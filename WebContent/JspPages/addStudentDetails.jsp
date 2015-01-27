<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student Details</title>
</head>
<body>
<%@ include file="sessions.jsp" %>

<form name="createstudent" action="/NSEP/AddDetailsHandler" method="post" enctype=multipart/form-data>
<center><h3>PLEASE ENTER THE STUDENT DETAILS</h3></center>


<table border=0 align="center">
<tr>
<TD><div align="right">First Name</div></TD>
<td>&nbsp;</td>
<TD><input type="text" name="firstname" id="firstname" size=20></input></td>
</tr>
<tr>
<td></td>
<td>&nbsp;</td>
<td><input type="submit" value="Register"></input></td>
</tr>
</table>

</form>

</body>
</html>