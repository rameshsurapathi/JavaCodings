<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.tcs.ilp.h57.gE.POJO.AddDetailsPOJO;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Student Details</title>
</head>
<body>
<%@ include file="sessions.jsp" %>
<form name="createstudent" action="/NSEP/DeleteDetailsHandler" method="post">
<center><h3>DELETE STUDENT DETAILS</h3></center>


<table border=0 align="center">
<tr>
<TD><div align="right">Student ID</div></TD>
<td>&nbsp;</td>
<TD><input type="text" name="studentid" id="studentid" size=20></input></td>
</tr>
<tr>
<td></td>
<td>&nbsp;</td>
<td><input type="submit" value="Submit"></input></td>
</tr>
</table>

</form>

</body>
</html>