<%@page isELIgnored="false"%>
<h2 style="text-align:center;color:green">Edit Employee Data</h2>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="c"%>


<c:form modelAttribute="emp">
<table align="center"  bgcolor="cyan">

<tr>

<td>Employee Number::</td>
<td><c:input path="empno"  readonly="true"/></td>
</tr>
<tr>


<td>Employee Name::</td>
<td><c:input path="ename"/></td>
</tr>
<tr>

<td>Employee Desg::</td>

<td><c:input path="job"/></td>
</tr>
<tr>
<td>Employee Salary::</td>

<td><c:input path="sal"/></td>
</tr>
<tr>
<td>Employee Dept No::</td>

<td><c:input path="depno"/></td>
</tr>

<tr>
<td><input type="submit"  value=UpateEmployee></td>
<td><input type="reset" value=cancel></td>

</tr>



</table>





</c:form>
