<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="cn.sagar.*" %>
	<%@page import="java.util.*" %>
	<%@page import="cn.sagar.dao.*" %>
	<%@page import="cn.sagar.connection.dbCon" %>
	<%
User auth=(User) request.getSession().getAttribute("auth");
if(auth!=null){
	request.setAttribute("auth", auth);
	response.sendRedirect("index.jsp");
}
ArrayList<cart> cart_list = (ArrayList<cart>) request.getSession().getAttribute("cart-list");
List<cart> cartProduct = null;
if(cart_list != null){
	
	request.setAttribute("cart_list",cart_list);
}
%>
<!DOCTYPE html>
<html>
<head>

<title>login</title>
<%@include file="includes/header.jsp"%>

</head>
<body>
<%@include file="includes/navbar.jsp" %>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">User Login</div>
			<div class="card-body">
				<form action="user-LoginServlet" method="post">
					<div class="form-group">
						<label>Email Address</label> <input type="email"
							class="form-control" name="Login-email"
							placeholder="Enter your Email" required>
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password"
							class="form-control" name="Login-password"
							placeholder="**********" required>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Login</button>
					</div>
				</form>
			</div>

		</div>

	</div>
	
	
</body>
</html>