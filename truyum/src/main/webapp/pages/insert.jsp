<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>

.heading
{
	margin-top:-20px;
}

.footer
{
	bottom:0;
	width:100;

}
.jumbotron
{
	margin:20px;

}
.incont
{
	width:100%;
}
#name
{
	width:100%;
}
#id
{
	width:100%;
}
#price
{
	width:100%;
}
#acive
{
	width:100%;
}
#dateOfLaunch
{
	width:100%;
}
#category
{
	width:100%;
}
#rad
{
	width:100%;
	margin-top :8px;
}

</style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="jumbotron">
<h1 class ="heading">Edit Menu Item</h1>
<br/>
<div class="container">
<form action ="insert" method ="post" >

	<div class="row">
		<div class="col-3">
			Id : <input type = "text" id = "id" name ="id" value="${count}" required/>
		</div>
		<div class ="col-9">
			Name : <input type = "text"  id = "name" name ="name" required/>
		</div>
	</div>
	<br/>
	<div class ="row">
		<div class="col-3">
			Price :<input type = "text" id = "price" name ="price" required/>
		</div>
		<div class="col-2">
			Active :
			<br/>
			<div id="rad">
			<input type = "radio" id = "yes" name ="active" value="true" required/>
			<label for ="yes">Yes</label>
			<input type = "radio" id = "no" name ="active" value="false" required/>
			<label for ="no">No</label>
			</div>
		</div>
		<div class="col-5">
			DateofLaunch : <input type = "date" id = "dateOfLaunch" name ="dateOfLaunch"required/>
		</div>
		
		<div class="col-2">
		Category :
		<select id = "category" name ="category" >
				<option value ="${item.category}">${item.category}</option>
				<option value ="Main Course">Main Course</option>
				<option value ="Starters">Starters</option>
				<option value ="Desert">Dessert</option>
				
			</select>
		</div>
	</div>	
	<br/>
	<div class="row">
		<div class ="col-3">
			<input type = "checkbox" id = "free" name ="free" required/>
			 <label for="free">Free Delivery</label>
		</div>
	</div>
	<br/>
	<div class="incont">
	<input type="submit" class="btn btn-danger" style="float:left";>
	<input type ="reset" class="btn btn-danger" style="float:right";>
	</div>
</form>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
