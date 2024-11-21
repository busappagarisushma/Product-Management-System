<%@page import="com.example.product.entity.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Product product = (Product)  request.getAttribute("product"); %>

<form action="update-product" method="post">
	<label>Product Id: </label><br>
	<input type="text" value="<%=product.getProductId() %>" name="productId" readonly="readonly" ><br><br>
	<label>Title:</label><br>
	<input type="text" value="<%=product.getTitle() %>" name="title"><br><br>
	<label>Description:</label><br>
	<input type="text" value="<%=product.getDescription()%>" name="description"><br><br>
	<label>Quantity:</label><br>
	<input type="number" value="<%=product.getQuantity()%>" name="quantity"><br><br>
	<label>Price: </label><br>
	<input type="number" value="<%=product.getPrice()%>" name="price"><br><br>
	<input type="Submit" value="UPDATE"> 
	</form>
</body>
</html>