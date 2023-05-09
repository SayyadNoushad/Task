<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>

body {
background-color: #008080;
}
</style>
</head>
<body>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page isELIgnored="false" %>

<c:choose>

<c:when test="${ !empty data}">
<h1 style="color:yellow;text-align:center">Employee Report</h1>
<table border="1"  align="center"  bgcolor="orange">

<tr style=color:red> <th>empno</th><th>emp name</th><th>job</th><th>salary</th><th>depno</th><th>Optional</th></tr>

<c:forEach  var="emp" items="${data}">

<tr style="color:blue">

<td>${emp.empno }</td>
<td>${emp.ename }</td>
<td>${emp.job }</td>
<td>${emp.sal }</td>
<td>${emp.depno }</td>

<td><a  href="emp_edit?no=${emp.empno}" > <img alt="image not found" src="images/edit.webp" width="30px" height="30px"></a>
<a  href="emp_delete?no=${emp.empno }" onclick="return confirm('do u want to delete the employee')"><img src="images/delete.avif"  width="30px" height="30px"/></a>

</td>



</tr>


</c:forEach>



</table>
<h2>${data1 }</h2>

<h2 style=text-align:center><a  href=addEmployee><img alt="image not found" src="images/add.png" width="50px" height="50x">AddEmployee</a></h2>
<br>
<h2 style=text-align:center><a href="./"><img alt="not found" src="images/home.webp">Home</a></h2>



</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Employee Not Found</h1>
</c:otherwise>




</c:choose>


</body>
</html>