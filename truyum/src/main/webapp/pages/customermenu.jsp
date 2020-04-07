<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Cart</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="headercus.jsp"></jsp:include>
<div class ="jumbotron">
<div class ="row">
<div class ="col-8">
<h2>Menu Items</h2>
<table  class="table table-striped" >
		<thead class ="thead-dark">
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>Free Delivey</th>
			<th class ="options">Action</th>
		</tr>
		</thead>		
		<c:forEach items="${menuitems}" var="menu">
		<tr>
			<td><c:out value="${menu.name}"/></td>
			<td><c:out value ="${menu.price}"/></td>
			<td><c:out value ="${menu.category}"/></td>
			<td><c:out value ="${menu.free}"/></td>
			<td>
				<a href = "addtocart?id=<c:out value="${menu.id}"/>"><button type ="button" class="btn btn-success">Add to Cart</button></a>	
		</tr>
		</c:forEach>
	</table>
</div>
<div class="col-4">
<h2> Cart</h2>
	<table border="1" class="table table-dark table-striped">
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Free Delivery</th>
			<th class ="options">Action</th>
		</tr>		
		<c:forEach items="${custitems}" var="menu">
		<tr>
			<td><c:out value="${menu.name}"/></td>
			<td><c:out value ="${menu.price}"/></td>
			<td><c:out value ="${menu.free}"/></td>
			<td>
				<a href = "remove?id=<c:out value="${menu.id}"/>"><button type = "button" class="btn btn-danger">Delete</button></a>	
		</tr>
		</c:forEach>
	</table>
	Total : ${total}
	<br>
	<a href = "checkout"><button type = "button" class="btn btn-danger">Checkout</button></a>
	</div>
	
	</div>
</div>
	
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>