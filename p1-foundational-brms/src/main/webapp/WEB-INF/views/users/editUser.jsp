<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Profile</title>
</head>
<body>


	<jsp:include page="../menus/_menuNormal.jsp"></jsp:include>
	<div style="margin-left:500px;">

		<h3>Welcome ${sessionScope.userIs.userLogin}</h3>

		<p style="color: red;">${errorString}</p>

		<c:if test="${not empty editUser}">
			<form method="POST" action="doEditUser">
				<input type="hidden" name="loginId" value="${editUser.userLogin}" />
				<table border="0">
					<tr>
						<td>Login Id</td>
						<td style="color: red;">${editUser.userLogin}</td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="text" name="password"
							value="${editUser.userPass}" /></td>
					</tr>
					<tr>
						<td>Role</td>
						<td><select name="role">
								<option value="normal">Normal User</option>
								<option value="admin">Admin</option>
						</select></td>

					</tr>
					<tr>
						<td>User Name</td>
						<td><input type="text" name="username"
							value="${editUser.username}" /></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email" value="${editUser.email}" /></td>
					</tr>
					<tr>
						<td>Phone Number</td>
						<td><input type="text" name="phoneNo"
							value="${editUser.phoneNo}" /></td>
					</tr>

					<tr>
						<td>Birth Date</td>
						<td><input type="text" name="dateOfBirth"
							value="${editUser.dateOfBirth}" /></td>
					</tr>
					<tr>
						<td>Age</td>
						<td><input type="text" name="age" value="${editUser.age}" /></td>
					</tr>
					<tr>
						<td>Address</td>
						<td><input type="text" name="address"
							value="${editUser.address}" /></td>
					</tr>
					<tr>
						<td>Physical Disability</td>
						<td><input type="text" name="physicalDisability"
							value="${editUser.physicalDisability}" /></td>
					</tr>
					<tr>
						<td>Identity Proof</td>
						<td><input type="text" name="identityProof"
							value="${editUser.identityProof}" /></td>
					</tr>

					<tr>
						<td><input type="submit" value="Submit" />
						<td><input type="reset" name="rest" value="Reset" /></td>
					</tr>
				</table>
			</form>
		</c:if>
	</div>
	<jsp:include page="../_footer.jsp"></jsp:include>

</body>
</html>