<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
<div class="container py-5">
    <div class="row">
        <div class="col-md-12">
            <h2 class="text-center mb-5">Welcome to TruYum</h2>
            <div class="row">
                <div class="col-md-6 mx-auto">
                    <div class="card border-secondary">
                        <div class="card-header">
                            <h3 class="mb-0 my-2">Fill the Customer Details</h3>
                        </div>
                        <div class="card-body">
                            <form class="form" role="form" action="register" method="post">
                                <div class="form-group">
                                    <label for="name">Name</label>
                                    <input type="text" class="form-control" name ="name" id="name" placeholder="full name">
                                </div>
                                <div class="form-group">
                                    <label for="address">Address</label>
                                    <input type="text" class="form-control" name ="address" id="address" placeholder="city">
                                </div>
                                <div class="form-group">
                                    <label for="email">Email</label>
                                    <input type="email" class="form-control" name ="email" id="email" placeholder="email@gmail.com" required="">
                                </div>
                                <div class="form-group">
                                    <label for="phone">Phone</label>
                                    <input type="text" class="form-control" name ="phone" id="phone" placeholder="phone number" required="">
                                </div>
                      
                                <div class="form-group">
                                    <button type="submit" class="btn btn-success btn-lg float-right">Proceed</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <!--/row-->

        </div>
        <!--/col-->
    </div>
    <!--/row-->
</div>
<!--/container-->
</body>
</html>