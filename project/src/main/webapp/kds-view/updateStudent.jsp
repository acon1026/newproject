<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="kds.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
//Student s = (Student)request.getAttribute("student");

%>

<form method="post"  action="/0420_/updateStudent.20_" >
<table>
<tr>
<td>번호</td>
<td><input type="text" name="snumber" value=""></td>
</tr>
<tr>
<td>이름</td>
<td><input type="text" name="name" value=""></td>
</tr>
<tr>
<td> <button>변경</button></td> 
</tr>
</table>
</form>
 
 
</body>
</html>