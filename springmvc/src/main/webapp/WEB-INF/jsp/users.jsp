<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.github.javatraining.springmvc.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test2</title>
<script type="text/javascript">
</script>
<style type="text/css">
td {
	border: solid #add9c0;
	border-width: 0px 1px 1px 0px;
	padding: 10px 0px;
}

table {
	border: solid #add9c0;
	border-width: 1px 0px 0px 1px;
}
</style>
</head>
<body>
	<div style="width: 80%; margin: auto;">
		<table style="width: 80%; margin: auto;">
			<tr>
				<td style="width: 40%; text-align: right;">用户名</td>
				<td style="width: 40%; text-align: left;">姓名</td>
				<td style="width: 10%; text-align: left;">&nbsp;</td>
				<td style="width: 10%; text-align: left;">&nbsp;</td>
			</tr>
			<%
			Iterable<User> users = (Iterable<User>) request.getAttribute("users");
				if (users != null) {
					Iterator<User> iu = users.iterator();
					while(iu.hasNext()){
						User u = iu.next();
			%>
			<tr>
				<td style="width: 40%; text-align: right;"><%=u.getUsername()%></td>
				<td style="width: 40%; text-align: left;"><%=u.getName()%></td>
				<td style="width: 10%; text-align: left;"><a
					href="/users/view/<%=u.getId()%>">查看</a></td>
				<td style="width: 10%; text-align: left;"><a
					href="/users/delete/<%=u.getId()%>">删除</a></td>
			</tr>
			<%
				}
				}
			%>
		</table>
	</div>
</body>
</html>