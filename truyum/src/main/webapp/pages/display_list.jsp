<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>
.jumbotron
{
	margin:20px;
}

.heading
{
	margin-top:-30px;
}
.mes
{
	color:green;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="jumbotron">

<h1 class ="heading">Menu Items</h1>
<br/>
<div>
<p class="mes">${msg}</p>
</div>
<table class="table table-striped">
	<thead class = "thead-dark">
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Active</th>
			<th>Date of launch</th>
			<th>Category</th>
			<th>Free Delivery</th>
			<th class ="options">Action</th>
		</tr>
	</thead>		
		<c:forEach items="${items}" var="menu">
		<tr>
			<td><c:out value="${menu.name}"/></td>
			<td><c:out value ="${menu.price}"/></td>
			<td><c:out value="${menu.active}"/></td>
			<td><c:out value="${menu.dateOfLaunch}"/></td>
			<td><c:out value ="${menu.category}"/></td>
			<td><c:out value ="${menu.free}"/></td>
			<td>
				<a href = "update?id=<c:out value="${menu.id}"/>"><button type ="button" class="btn btn-success">Update</button></a>
				<a href = "delete?id=<c:out value="${menu.id}"/>"><button type = "button" class="btn btn-danger">Delete</button></a>	
		</tr>
		</c:forEach>
	</table>
	 <div class="text-center">
    	<a href ="insert"><button type ="button" class="btn btn-success">Insert Item</button></a>
    	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>