<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "Score.StudentScore" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% StudentScore ss= (StudentScore) request.getAttribute("score"); %>

<form method="post" action="/project/updateScore">
<table>
<tr><td>score_num</td><td><input type="text" name="score_num" value="<%=ss.getScore_num()%>" readonly></td></tr>
<tr><td>snumber</td><td><input type="text" name="snumber" value="<%=ss.getSnumber()%>" readonly></td></tr>
<tr><td>국어</td><td><input type="text" name="kor" value="<%=ss.getKor()%>"  ></td></tr>
<tr><td>영어</td><td><input type="text" name="eng" value="<%=ss.getEng()%>" ></td></tr>
<tr><td>수학</td><td><input type="text" name="math" value="<%=ss.getMath()%>" ></td></tr>
<tr><td>합계</td><td><input type="text" name="math" value="<%=ss.getTotal()%>" readonly></td></tr>
<tr><td>평균</td><td><input type="text" name="math" value="<%=ss.getAvg()%>" readonly></td></tr>

<tr><td><button>수정</button></td></tr>

</table>

</form>


</body>
</html>