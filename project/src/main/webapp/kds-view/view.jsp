<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="kds.Student" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>번호</td>
<td>이름</td>
<td>국어</td>
<td>영어</td>
<td>수학</td>
<td>총점</td>
<td>평균</td>

</tr>
<%  ArrayList<Student> list  =(ArrayList<Student>) request.getAttribute("list");
for(int i=0;  i<list.size();  i++)  {
	Student s =  list.get(i);
	%>
	<tr>
	<td><%= s.getSnumber() %></td>
	<td><%= s.getName() %></td>
	<td><%= s.getKor() %></td>
	<td><%= s.getEng() %></td>
	<td><%= s.getMath() %></td>
	<td><%= s.getTotal() %></td>
	<td><%= s.getAvg() %></td>
	</tr>
<% } %>


</table>

</body>
</html>