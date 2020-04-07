<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Invoice</title>
<style>
.invoice-title h2, .invoice-title h3 {
    display: inline-block;
}

.table > tbody > tr > .no-line {
    border-top: none;
}

.table > thead > tr > .no-line {
    border-bottom: none;
}

.table > tbody > tr > .thick-line {
    border-top: 2px solid;
}
</style>

</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-xs-12">
    		<div class="invoice-title">
    			<h2>Invoice</h2><h3 class="pull-right">Order # 12345</h3>
    		</div>
    		<hr>
    		<div class="row">
    			<div class="col-xs-6">
    				<address>
    				<strong>Billed To:</strong><br>
    					Customer Name : ${cus.name}<br>
    					Customer Address:${cus.address}<br>
    					Cu${cus.phone }<br>
    					${cus.email}
    				</address>
    			</div>
 
    		</div>
    	</div>
    </div>
    
    <div class="row">
    	<div class="col-md-12">
    		<div class="panel panel-default">
    			<div class="panel-heading">
    				<h3 class="panel-title"><strong>Order summary</strong></h3>
    			</div>
    			<div class="panel-body">
    				<div class="table-responsive">
    					<table class="table table-condensed">
    						<thead>
                                <tr>
        							<td><strong>Item</strong></td>
        							<td class="text-right"><strong>Totals</strong></td>
                                </tr>
    						</thead>
    						<tbody>
    							<c:forEach items="${items}" var="menu">
								<tr>
										<td><c:out value="${menu.name}"/></td>
										<td class="text-right"><c:out value ="${menu.price}"/></td>
    							</tr>
    							</c:forEach>
    							<tr>
 
    								<td class="thick-line text-left"><strong>Amount</strong></td>
    								<td class="thick-line text-right">Rs.${total}</td>
    							</tr>
    							<tr>
 
    								<td class="text-left"><strong>Tax (10%)</strong></td>
    								<td class="text-right">${tax}</td>
    							</tr>
    							<tr>
    								<td class="text-left"><strong>Subtotal</strong></td>
    								<td class="text-right">${amount}</td>
    							</tr>
    							    						
    					  </tbody>
    					</table>
    				</div>
    			</div>
    		</div>
    	</div>
    	
    </div>
    <div class="text-center">
    	<a href ="done"><button type ="button" class="btn btn-success">Done</button></a>
    	</div>
</div>
</body>
</html>