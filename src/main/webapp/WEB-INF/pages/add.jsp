<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"  %>
<h1  style="color:green; text-align:center">Register Employee</h1>

<frm:form  modelAttribute="emp" method="POST" >
<table  border="1" bgcolor=green align=center>
<tr>
<td>Employee Name::</td>
<td><frm:input path="ename"/></td>

</tr>

<tr>
<td>Employee Desg::</td>
<td><frm:input path="job"/></td>

</tr>
<tr>
<td>Employee salary::</td>
<td><frm:input path="sal"/></td>

</tr>
<tr>
<td>Employee depno::</td>
<td><frm:input path="depno"/></td>

</tr>

<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="cancel"></td>
</tr>


</table>




</frm:form>

</body>
</html>