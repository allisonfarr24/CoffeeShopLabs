<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GC Coffee</title>


<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="css/main.css"></link>
</head>
<body>
<h2>Welcome to Grand Circus Coffee Shop!</h2>
	${register }

	<br>
	<a href="form"><button type="button">Register Here</button></a>



	<div class="container">
		<h3>Items to Purchase</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Item</th>
					<th>Description</th>
					<th>Quantity</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="items" items="${items }">
					<tr>
						<td>${items.name}</a></td>
						<td>${items.description}</td>
						<td>${items.quantity}</td>
						<td>${items.price}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>