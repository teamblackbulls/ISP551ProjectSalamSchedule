<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>My Profile</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
	<style type="text/css">
		ul {
		  list-style-type: none;
		  margin: 0;
		  padding: 0;
		  overflow: hidden;

		}
		
		li {
		  float: left;
		}
		
		li a {
		  color: white;
		  text-align: center;
		  padding: 14px 16px;
		  text-decoration: none;
		}
		
		li a:hover:not(.active) {
			color: black;
		}
		
		.active {
		   color: black;
		}
	
	</style>
	
</head>
<body>
<br>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: #95ac80">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> MasjidSalam </a>
			</div>

			<ul>
			  <li><a href="index.html">Home</a></li>
			  <li><a class="active" href="#viewStaff">View Staff</a></li>
			  <li><a href="ListStaffController">List Staff</a></li>
			  <li><a href="ListPrayerController">List Prayer</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="center">
		<h2>My Information</h2>
		ID: <c:out value="${s.id}"/> <br>
		Name: <c:out value="${s.name}"/> <br>
		Address: <c:out value="${s.address}"/> <br>
		Phone Number: <c:out value="${s.phone}"/> <br>
		Email: <c:out value="${s.email}"/> <br>
		Role: <c:out value="${s.role}"/> <br><br>
	</div>
</body>
</html>