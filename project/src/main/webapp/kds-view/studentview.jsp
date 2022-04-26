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
Student s = (Student)request.getAttribute("student");

%>

<form method="post"  action="" >
<table>
<tr>
<td>번호</td>
<td><input type="text" name="m_id" value="<%=s.getSnumber()%>"></td>
</tr>
<tr>
<td>이름</td>
<td><input type="text" name="m_pw" value="<%=s.getName()%>"></td>
</tr>
<tr>
<td>국어</td>
<td><input type="text" name="m_name" value="<%=s.getKor()%>" readonly></td>
</tr>
<tr>
<td>영어</td>
<td><input type="text" name="m_tel" value="<%=s.getEng()%>" readonly></td>
</tr>
<tr>
<td>수학</td>
<td><input type="text" name="m_birthday" value="<%=s.getMath()%>" readonly></td>
</tr>
<tr>
<td>총점</td>
<td><input type="text" name="m_point" value="<%=s.getTotal()%>" readonly></td>
</tr>
<tr>
<td>평균</td>
<td><input type="text" name="m_grade" value="<%=s.getAvg()%>" readonly></td>
</tr>
<tr>
<td> <button>변경</button></td> 
</tr>
</table>
</form>
 
 
</body>
</html>