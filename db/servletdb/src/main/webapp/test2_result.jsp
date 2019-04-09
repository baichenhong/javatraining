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
		User user = (User) request.getAttribute("user");
		if (user != null) {
	%>

	<div style="width: 80%; margin: auto;">
		<table style="width: 80%; margin: auto;">
			<tr>
				<td colspan="2" style="width: 80%; text-align: center;">
					<%=result.booleanValue()%>
				</td>
			</tr>
			<tr>
				<td colspan="2" style="width: 80%; text-align: center;">提交的注册信息:</td>
			</tr>
			<tr>
				<td style="width: 50%; text-align: right;">用户名:</td>
				<td style="width: 50%; text-align: left;"><%=user.getUsername()%></td>
			</tr>
			<tr>
				<td style="width: 50%; text-align: right;">密码:</td>
				<td style="width: 50%; text-align: left;"><%=user.getPassword()%></td>
			</tr>
			<tr>
				<td style="width: 50%; text-align: right;">姓名:</td>
				<td style="width: 50%; text-align: left;"><%=user.getName()%></td>
			</tr>
			<tr>
				<td style="width: 50%; text-align: right;">性别:</td>
				<td style="width: 50%; text-align: left;"><%=user.getSex()%></td>
			</tr>
			<tr>
				<td style="width: 50%; text-align: right;">居住省市:</td>
				<td style="width: 50%; text-align: left;"><%=user.getProvince()%></td>
			</tr>
			<tr>
				<td colspan="2" style="width: 80%; text-align: center;"><a
					href="index.jsp">返回</a></td>
			</tr>
		</table>
	</div>

	<%
		}
	%>
</body>
</html>