<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.github.javatraining.web.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test2 result</title>
</head>
<body>
	<%
		Boolean result = (Boolean) request.getAttribute("result");
	%>
	<div style="width: 80%; margin: auto;">
		<table style="width: 80%; margin: auto;">
			<tr>
				<td colspan="2" style="width: 80%; text-align: center;"><%=result.booleanValue()%>
				</td>
			</tr>
			<tr>
				<td colspan="2" style="width: 80%; text-align: center;"><a
					href="index.jsp">返回</a></td>
			</tr>
		</table>
	</div>

</body>
</html>