<%@page import="com.example.product.entity.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		List<Product> products = (List<Product>)request.getAttribute("products");
		%>

	<table border="2">
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Description</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>

		<tbody>
			<%
			for (Product product : products) {
			%>
			<tr>
				<td><%=product.getProductId()%></td>
				<td><%=product.getTitle()%></td>
				<td><%=product.getDescription()%></td>
				<td><%=product.getQuantity()%></td>
				<td><%=product.getPrice()%></td>
				<td><a
					href="update-product?product_id=<%=product.getProductId()%>">EDIT</a></td>
				<td><a
					href="delete-product?product_id=<%=product.getProductId()%>">DELETE</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

	<h2>
		<a href="index.jsp">Go back to Home page</a>
	</h2>

</body>
</html>