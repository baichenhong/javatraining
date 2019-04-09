<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.github.javatraining.web.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test2</title>
</head>
<body>
		<div style="width: 80%; margin: auto;">
			
			<table style="width: 80%; margin: auto;">
				<%
					List<User> users = (List<User>) request.getAttribute("users");
					if (users != null) {
						for (int i = 0; i < users.size(); i++) {
							User u = users.get(i);
							%>
				<tr>
					<td style="width: 50%; text-align: right;">用户名:<%=u.getUsername()%></td>
					<td style="width: 50%; text-align: left;">姓名:<%=u.getName()%></td>
				</tr>
							<%
						}
					}
				%>
			</table>
		</div>
</body>
</html>