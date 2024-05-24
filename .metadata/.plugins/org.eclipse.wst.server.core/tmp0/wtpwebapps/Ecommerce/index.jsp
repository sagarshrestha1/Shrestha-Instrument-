<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="cn.sagar.User"%>
<%@page import="cn.sagar.dao.ProductDao"%>
<%@page import="java.util.*"%>
<%@page import="cn.sagar.cart" %>

<%@page import="cn.sagar.Product"%>
<%@page import="cn.sagar.servlet.*"%>
<%@page import="cn.sagar.connection.dbCon"%>
<%
User auth = (User) request.getSession().getAttribute("auth");
if (auth != null) {
	request.setAttribute("auth", auth);
}
ProductDao pd= new ProductDao(dbCon.getConnection()); 
List<Product>products = pd.getAllProducts();
List<Product>westernproduct=pd.getWesternProduct();
ArrayList<cart> cart_list = (ArrayList<cart>) session.getAttribute("cart-list");
List<cart> cartProduct = null;
if(cart_list != null){
	
	request.setAttribute("cart_list",cart_list);
}
%>
<!DOCTYPE html>
<html>
<head>

<title>Eshopping</title>
<style>
.card .img-fit{
aspect-ratio:4/3;
object-fit:cover;

}
</style>
<%@include file="includes/header.jsp"%>

</head>
<body>
	<%@include file="includes/navbar.jsp"%>
	<div class="container">
		<div class="card-header my-3">All products</div>
		<div class="row">
		<%
		if(!products.isEmpty()){
			for(Product p:products){%>
				<div class="col-md-3 my-3 lg-3">
				<div class="card h-100 w-100" style="width: 18rem;">
					<img src="product-images/<%=p.getImage() %>" class="card-img-top img-fluid img-fit" alt="dhimey">
					<div class="card-body mt-1 pt-2">
						<h5 class="card-title"><%= p.getName()%></h5>
						<h6 class="price">Price:Rs <%=p.getPrice()%></h6>
						<h6 class="price">Category:<%= p.getCategory()%></h6>
						<div class="mt-7 d-flex justify-content-between">
						<a href="cartServlet?id=<%=p.getId() %>" class="btn btn-dark">Add to cart</a>
						<a href="OrderNowServlet?quantity=1&id=<%=p.getId() %>" class="btn btn-primary">Buy Now</a>
						</div>
						
					</div>
					</div>
					</div>
					
				
			<%}
		}%>
			

			</div>
				<div class="card-header my-3">Western Musical instruments</div>
		<div class="row">
		<%
		if(!westernproduct.isEmpty()){
			for(Product ps:westernproduct){%>
				<div class="col-md-3 my-3 lg-3">
				<div class="card h-100 w-100" style="width: 18rem;">
					<img src="product-images/<%=ps.getImage() %>" class="card-img-top img-fluid img-fit" alt="dhimey">
					<div class="card-body mt-1 pt-2">
						<h5 class="card-title"><%= ps.getName()%></h5>
						<h6 class="price">Price:Rs <%=ps.getPrice()%></h6>
						<h6 class="price">Category:<%= ps.getCategory()%></h6>
						<div class="mt-7 d-flex justify-content-between">
						<a href="cartServlet?id=<%=ps.getId() %>" class="btn btn-dark">Add to cart</a>
						<a href="OrderNowServlet?quantity=1&id=<%=ps.getId() %>" class="btn btn-primary">Buy Now</a>
						</div>
						
					</div>
					</div>
					</div>
					
				
			<%}
		}%>
			

			</div>
		
		</div>
		
	
	<%@include file="includes/footer.jsp"%>
</body>
</html>