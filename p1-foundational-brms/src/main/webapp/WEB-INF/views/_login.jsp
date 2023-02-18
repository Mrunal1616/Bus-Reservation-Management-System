<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<body>
	<jsp:include page="_header.jsp"></jsp:include>
	
	<br><br>

	<div  style=" margin: 20px; margin-left:500px;">
		<h3>Login Here</h3>
		<p style="color: red;">${errorString}</p>
		<p style="color: green;">${logOutString}</p>
		<form method="POST" action="validate">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName"
						value="${user.userLogin}" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password"
						value="${user.userPass}" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" />
					<td><input type="reset" name="rest" value="Reset" /></td>
				</tr>
			</table>
		</form>
	</div>
	<br><br><br><br>
	<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>