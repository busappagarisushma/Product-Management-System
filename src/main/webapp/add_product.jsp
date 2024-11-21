<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add-product" method="post">
		<input type="text" name="title" placeholder="Enter a product title"><br><br>
		<input type="text" name="description"placeholder="Enter a Product Description"><br><br> 
		<input type="number" name="quantity" placeholder="Enter a product Quantity"><br><br>
		<input type="text" name="price" placeholder="Enter a price"><br><br>
		<input type="submit">
	</form>
</body>
</html>