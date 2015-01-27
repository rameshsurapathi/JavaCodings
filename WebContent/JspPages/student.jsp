<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="com.tcs.ilp.h57.gE.POJO.*" 
    import="javax.servlet.http.HttpSession"
   
   %>
    
<%
session.setAttribute("footer_value",1);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StudentHome</title>
<script type="text/javascript" src="../Javascript/studentValidations.js">
</script>

<LINK href="../CSS/sideMenu.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@ include file="sessions.jsp" %>
<%
if((Integer)session.getAttribute("session_value")==1){
	
%>

<%@ include file="../HtmlPages/afterLoginHeader.html" %>

<table border="0" width="900px" height="400px">
<tr>
<td width="200px" valign="top">


<div class="sidebarmenu">
<ul id="sidebarmenu1">


  <li><a href="javascript:show_page(1);">Add Student Details</a></li>
  <li><a href="javascript:show_page(2);">View Student Details</a></li>
  <li><a href="javascript:show_page(3);">Update Student Details</a></li>
  <li><a href="javascript:show_page(4);">Delete Student Details</a></li>
  
</ul>
</div>

</td>
<td width="700px" id="studentmainpage" valign="top">

<%} %>

<%
System.out.println((Integer)session.getAttribute("session_value"));
if((Integer)session.getAttribute("session_value")==1){
	%>
	
	<%
}
else if((Integer)session.getAttribute("session_value")==2){
	%>
	<h2 align="center" style="color:blue">Student Name : <%= request.getParameter("firstname") %></h2>
	
	<%
	session.setAttribute("session_value",1);
	session.setAttribute("footer_value",0);
}
 
else if((Integer)session.getAttribute("session_value")==3){
	SendStudentDetailsPOJO sendobject1 = (SendStudentDetailsPOJO)session.getAttribute("send_object");
	
	%>
	
	<h2 align="center" style="color:blue">Student Name : <%= sendobject1.getFirstname() %></h2>
	<% 
	session.setAttribute("session_value",1);
	session.setAttribute("footer_value",0);
}
else if((Integer)session.getAttribute("session_value")==5){
	SendStudentDetailsPOJO updateobject1 = (SendStudentDetailsPOJO)session.getAttribute("update_object");
	
	%>
	<form action="/NSEP/UpdateDetailsHandler" method="post">
	<table border="0" align="center">
	<tr>
	<td colspan="2"><h2>Update Student Details</h2></td>
	</tr>
	<tr>
	<td>Student ID</td>
	<td><input type="text" name="studentid" size="20" value="<%= updateobject1.getStudentid() %>"></input></td>
	</tr>
	<tr>
	<td>Student Name</td>
	<td><input type="text" name="studentname" size="20" value="<%= updateobject1.getFirstname() %>"></input></td>
	</tr>
	<tr>
	<td></td>
	<td><input type="submit" value="Update"></input></td>
	</tr>
	</table>
	</form>
	
	<% 
	session.setAttribute("session_value",1);
	session.setAttribute("footer_value",0);
}
else if((Integer)session.getAttribute("session_value")==6){
	
	%>
	
	<h2 align="center" style="color:blue">Updated Successfully !</h2>
	<%
	session.setAttribute("session_value",1);
	session.setAttribute("footer_value",0);
}

else if((Integer)session.getAttribute("session_value")==7){
	
	%>
	
	<h2 align="center" style="color:blue">Deleted Successfully !</h2>
	<%
	session.setAttribute("session_value",1);
	session.setAttribute("footer_value",0);
}
%> 


<%
if((Integer)session.getAttribute("session_value")==1){
	
%>

</td>
</tr>
</table>

<%} %>
<%
if((Integer)session.getAttribute("footer_value")==1){
	
%>
<%@ include file="../HtmlPages/Footer.html" %>
<%} %>


</body>
</html>