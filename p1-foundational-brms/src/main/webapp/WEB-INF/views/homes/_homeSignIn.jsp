<%@page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>
<body>

	<jsp:include page="../menus/_menuNormal.jsp"></jsp:include>
	<div style="margin-left:500px;">
		<h3>Welcome ${sessionScope.userIs.userLogin}</h3>
		<b>Your Profile Details</b> <br> <br>
		<table>
			<tr>
				<td>User Name</td>
				<td>- ${sessionScope.userIs.userLogin}</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>- ${sessionScope.userIs.userPass}</td>
			</tr>
			<tr>
				<td>Role</td>
				<td>- ${sessionScope.userIs.role}</td>
			</tr>
			<tr>
				<td>User Name</td>
				<td>${sessionScope.userIs.username}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${sessionScope.userIs.email}</td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td>${sessionScope.userIs.phoneNo}</td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td>${sessionScope.userIs.dateOfBirth}</td>
			</tr>
			<tr>
				<td>age</td>
				<td>${sessionScope.userIs.age}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td>${sessionScope.userIs.address}</td>
			</tr>
			<tr>
				<td>Physical Disability</td>
				<td>${sessionScope.userIs.physicalDisability}</td>
			</tr>
			<tr>
				<td>Identity Proof</td>
				<td>${sessionScope.userIs.identityProof}</td>
			</tr>

		</table>
	</div>

	<jsp:include page="../_footer.jsp"></jsp:include>
</body>
</html>
