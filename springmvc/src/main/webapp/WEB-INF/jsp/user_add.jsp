<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test2</title>
</head>
<body>
	<form action="/users" method="post">
		<div style="width: 80%; margin: auto;">
			<table style="width: 80%; margin: auto;">
				<tr>
					<td colspan="2" style="width: 80%; text-align: center;">注册信息:</td>
				</tr>
				<tr>
					<td style="width: 50%; text-align: right;">用户名:</td>
					<td style="width: 50%; text-align: left;"><input type="text"
						name="username"></td>
				</tr>
				<tr>
					<td style="width: 50%; text-align: right;">密码:</td>
					<td style="width: 50%; text-align: left;"><input
						type="password" name="password"></td>
				</tr>
				<tr>
					<td style="width: 50%; text-align: right;">姓名:</td>
					<td style="width: 50%; text-align: left;"><input type="text"
						name="name"></td>
				</tr>
				<tr>
					<td style="width: 50%; text-align: right;">性别:</td>
					<td style="width: 50%; text-align: left;"><input type="radio"
						name="sex" value="male">男<input type="radio" name="sex"
						value="female">女</td>
				</tr>
				<tr>
					<td style="width: 50%; text-align: right;">居住省市:</td>
					<td style="width: 50%; text-align: left;"><select
						name="province">
							<option value="北京">北京</option>
							<option value="天津">天津</option>
							<option value="上海">上海</option>
					</select></td>
				</tr>
				<tr>
					<td style="width: 50%; text-align: right;"><input type="reset"
						value="重制"></td>
					<td style="width: 50%; text-align: left;"><input type="submit"
						value="提交"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>