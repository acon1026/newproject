<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="student.Student" %>
    <%@ page import= "Score.StudentScore" %>
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
<td>아이디</td>
<td>이름</td>
<td>생일</td>
<td>반</td>
<td>국어</td>
<td>영어</td>
<td>수학</td>
<td>합계</td>
<td>평균</td>

</tr>
<%  ArrayList<Student> list  =(ArrayList<Student>) request.getAttribute("list");
	   ArrayList<StudentScore> list1 = (ArrayList<StudentScore>) request.getAttribute("list1");
for(int i=0;  i<list.size();  i++)  {
	Student s =  list.get(i);
	%>
	<%for(int j=0; j<list1.size(); j++){
		StudentScore ss = list1.get(j);
	if(s.getSnumber() == ss.getSnumber()){ %>
	<tr>
	<td><%= s.getSnumber() %></td>
	<td><%= s.getId() %></td>
	<td><%= s.getName() %></td>
	<td><%= s.getBirthday() %></td>
	<td><%= s.getBan() %></td>
	
	<td><%= ss.getKor() %></td>
	<td><%= ss.getEng() %></td>
	<td><%= ss.getMath() %></td>
	<td><%= ss.getTotal() %></td>
	<td><%= ss.getAvg() %></td>
	
	
	
<%} }} %>


</table>

</body>
</html>