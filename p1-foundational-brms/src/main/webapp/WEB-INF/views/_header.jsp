<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<div>
	<nav class="navbar navbar-expand-lg  " style="background-image:linear-gradient(to right, red , yellow);">
		<div class="container-fluid ">
			<a class="navbar-brand fw-bolder fs-1">MSTANG BUS Service</a>
			
			<div style="margin-left: 500px" class="collapse navbar-collapse"
				id="navbarScroll">
				<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
					style="-bs-scroll-height: 100px;">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="${pageContext.request.contextPath}/"> <!-- Button trigger modal -->

							<button type="button" class="btn " data-bs-toggle="modal"
								data-bs-target="#exampleModal" id="category">Home</button>

					<!--basket button to jump on my basket page-->
					<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/login">
							<button class="btn " type="button">SignIn</button>
					</a></li>
					
					
					<li class="nav-item"><a class="nav-link " href="${pageContext.request.contextPath}/addUser">
							<!-- Button trigger modal -->
							<button type="button" class="btn ">Sign Up</button>
					</a></li>
				</ul>


			</div>
		</div>
	</nav>
</div>