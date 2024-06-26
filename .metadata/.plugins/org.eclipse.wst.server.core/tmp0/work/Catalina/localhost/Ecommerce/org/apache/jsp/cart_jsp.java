/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-25 04:11:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.sagar.User;
import cn.sagar.connection.dbCon;
import cn.sagar.dao.*;
import java.util.*;
import cn.sagar.cart;
import cn.sagar.User;
import cn.sagar.dao.UserDao;
import cn.sagar.servlet.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/includes/footer.jsp", Long.valueOf(1716530016092L));
    _jspx_dependants.put("/includes/navbar.jsp", Long.valueOf(1716609236906L));
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1711095077961L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("cn.sagar.dao");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("cn.sagar.servlet");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("cn.sagar.User");
    _jspx_imports_classes.add("cn.sagar.connection.dbCon");
    _jspx_imports_classes.add("cn.sagar.cart");
    _jspx_imports_classes.add("cn.sagar.dao.UserDao");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

User auth = (User) request.getSession().getAttribute("auth");
if (auth != null) {
	request.setAttribute("auth", auth);

}
ArrayList<cart> cart_list = (ArrayList<cart>) request.getSession().getAttribute("cart-list");
List<cart> cartProduct = null;
if (cart_list != null) {
	ProductDao pDao = new ProductDao(dbCon.getConnection());
	cartProduct = pDao.getCartProducts(cart_list);
	double total = pDao.getTotalCartPrice(cart_list);
	request.setAttribute("cart_list", cart_list);
	request.setAttribute("total", total);
}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>shopping cart</title>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"  />");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".table tbody td {\r\n");
      out.write("	vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-incre, .btn-decre {\r\n");
      out.write("	box-shadow: none;\r\n");
      out.write("	font-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("footer{\r\n");
      out.write("position: fixed;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  background-color: red;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("img{\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-collapse-sm bg-body-tertiary\">\r\n");
      out.write("  <div class=\"container-fluid container-dark text-bg-dark text-white \">\r\n");
      out.write("    <a class=\"navbar-brand text-white\" href=\"index.jsp \"><img src=\"product-images/homelogo(1).jpg\" alt=\"Logo\" class=\"img-fluid\" style=\"max-height: 50px;\"></a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"dark\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"navbar navbar-expand-md  text-white\"  id=\"navbarText\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 display-flex justify-content-end text-white\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active text-white\" aria-current=\"page\" href=\"index.jsp\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item text-white\">\r\n");
      out.write("          <a class=\"nav-link text-white \" href=\"cart.jsp\">Cart<span class=\"badge badge-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart_list.size() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></a>\r\n");
      out.write("        </li>\r\n");
      out.write("        ");
if(auth!=null){
      out.write("\r\n");
      out.write("        	<li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link text-white\" href=\"orders.jsp\">Orders</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item nav-text-white\">\r\n");
      out.write("            <a class=\"nav-link text-white\" href=\"LogoutServlet\">Logout</a>\r\n");
      out.write("          </li>\r\n");
      out.write("                  	<form class=\"d-flex\" role=\"search\"  action=\"SearchServlet\" method=\"post\">\r\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" name=\"search\" aria-label=\"Search\">\r\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\" name=\"search\">Search</button>\r\n");
      out.write("      </form>\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("        	");
 }
        	else{
      out.write("\r\n");
      out.write("        		 <li class=\"nav-item text-white\">\r\n");
      out.write("                 <a class=\"nav-link text-white\" href=\"login.jsp\">Login</a>\r\n");
      out.write("               </li>\r\n");
      out.write("        	");
}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("               \r\n");
      out.write("      </ul>\r\n");
      out.write("      <span class=\"navbar-text\">\r\n");
      out.write("       \r\n");
      out.write("      </span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"d-flex py-3\">\r\n");
      out.write("			<h3>Total Price: Rs ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(total>0)?total:0 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("			<a class=\"mx-3 btn btn-primary\" href=\"CheckOutServlet\">Check Out</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<table class=\"table table-loght\">\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th scope=\"col\">Name</th>\r\n");
      out.write("					<th scope=\"col\">Category</th>\r\n");
      out.write("					<th scope=\"col\">Price</th>\r\n");
      out.write("					<th scope=\"col\">Buy Now</th>\r\n");
      out.write("					<th scope=\"col\">Cancel</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");
      out.write("				");

				if (cart_list != null) {
					for (cart c : cartProduct) {
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.print(c.getName());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(c.getCategory());
      out.write("</td>\r\n");
      out.write("					<td>Rs");
      out.print(c.getPrice());
      out.write("</td>\r\n");
      out.write("					<td><form action=\"epay.jsp\" method=\"post\" class=\"form-inline\">\r\n");
      out.write("							<input type=\"hidden\" name=\"id\" value=\"");
      out.print(c.getId());
      out.write("\"\r\n");
      out.write("								class=\"form-input\">\r\n");
      out.write("							<div class=\"form-group d-flex justify-content-between w-50\">\r\n");
      out.write("								<a class=\"btn btn-sm btn-incre\"\r\n");
      out.write("									href=\"QuantityIncDecServlet?action=inc&id=");
      out.print(c.getId());
      out.write("\"><i\r\n");
      out.write("									class=\"fas fa-plus-square\"></i></a> <input type=\"text\"\r\n");
      out.write("									name=\"quantity\" class=\"form-control w-50\"\r\n");
      out.write("									value=");
      out.print(c.getQuantity());
      out.write(" readonly> <a\r\n");
      out.write("									class=\"btn btn-sm btn-decre\"\r\n");
      out.write("									href=\"QuantityIncDecServlet?action=dec&id=");
      out.print(c.getId());
      out.write("\"><i\r\n");
      out.write("									class=\"fas fa-minus-square\"></i></a>\r\n");
      out.write("							\r\n");
      out.write("							<button type=\"submit\" class =\"btn btn-primary btn-md\">Buy</button></div>\r\n");
      out.write("						</form></td>\r\n");
      out.write("					<td><a class=\"btn btn-sm btn-danger\"\r\n");
      out.write("						href=\"removeCartServlet?id=");
      out.print(c.getId());
      out.write("\">Remove</a>\r\n");
      out.write("						</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</tbody>\r\n");
      out.write("\r\n");
      out.write("			");

			}
			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("<footer>");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/5.0.0-beta3/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"container-fluid  bg-dark text-white py-5  border-top footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <!-- Footer Navigation -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h5>Navigation</h5>\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                    <li><a href=\"index.jsp\" class=\"text-white text-decoration-none\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"about.jsp\" class=\"text-white text-decoration-none\">About</a></li>\r\n");
      out.write("                    <li><a href=\"services.jsp\" class=\"text-white text-decoration-none\">Services</a></li>\r\n");
      out.write("                    <li><a href=\"contact.jsp\" class=\"text-white text-decoration-none\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Social Media Links -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h5>Follow Us</h5>\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\"><i class=\"bi bi-facebook\"></i> Facebook</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\"><i class=\"bi bi-twitter\"></i> Twitter</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\"><i class=\"bi bi-instagram\"></i> Instagram</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\"><i class=\"bi bi-linkedin\"></i> LinkedIn</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Copyright -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h5>Copyright</h5>\r\n");
      out.write("                <p>&copy; 2024 Shrestha Instrument. All rights reserved.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap JS and Popper.js -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.3/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/5.0.0-beta3/js/bootstrap.min.js\"></script>\r\n");
      out.write("</footer>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
