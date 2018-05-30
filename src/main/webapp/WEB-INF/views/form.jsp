<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
</head>
<body>
	<h3>Please fill out the form to register!</h3>

	<form action="/form1">
		First Name: <input type="text" name="firstName" required> 
		Last Name: <input type="text" name="lastName" required> 
		Email: <input type="text" name="email"> 
		Phone Number: <input type="text" name="phoneNum"> 
		Password: <input type="password" name="password"> 
		<button type="submit" class="btn btn-primary">Register!</button>


	</form>



	<script>
		function test() {
			return stuff;
		}
	</script>
</body>
</html>