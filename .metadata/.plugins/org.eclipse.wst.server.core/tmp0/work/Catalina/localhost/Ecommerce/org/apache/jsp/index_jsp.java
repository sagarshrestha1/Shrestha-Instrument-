/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-04-17 12:24:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.sagar.User;
import cn.sagar.dao.ProductDao;
import java.util.*;
import cn.sagar.cart;
import cn.sagar.Product;
import cn.sagar.servlet.*;
import cn.sagar.connection.dbCon;
import cn.sagar.User;
import cn.sagar.dao.UserDao;
import cn.sagar.servlet.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/includes/footer.jsp", Long.valueOf(1713355488688L));
    _jspx_dependants.put("/includes/navbar.jsp", Long.valueOf(1713356639561L));
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1711095077961L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(5);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("cn.sagar.servlet");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(6);
    _jspx_imports_classes.add("cn.sagar.User");
    _jspx_imports_classes.add("cn.sagar.Product");
    _jspx_imports_classes.add("cn.sagar.connection.dbCon");
    _jspx_imports_classes.add("cn.sagar.cart");
    _jspx_imports_classes.add("cn.sagar.dao.ProductDao");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

User auth = (User) request.getSession().getAttribute("auth");
if (auth != null) {
	request.setAttribute("auth", auth);
}
ProductDao pd= new ProductDao(dbCon.getConnection()); 
List<Product>products = pd.getAllProducts();
ArrayList<cart> cart_list = (ArrayList<cart>) session.getAttribute("cart-list");
List<cart> cartProduct = null;
if(cart_list != null){
	
	request.setAttribute("cart_list",cart_list);
}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>Eshopping</title>\r\n");
      out.write("<style>\r\n");
      out.write(".card .img-fit{\r\n");
      out.write("aspect-ratio:4/3;\r\n");
      out.write("object-fit:cover;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"  />");
      out.write("\r\n");
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
      out.write("                  	<form class=\"d-flex\" role=\"search\" name=\"search\" action=\"SearchServlet\" method=\"post\">\r\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
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
      out.write("		<div class=\"card-header my-3\">All products</div>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("		");

		if(!products.isEmpty()){
			for(Product p:products){
      out.write("\r\n");
      out.write("				<div class=\"col-md-3 my-3 lg-3\">\r\n");
      out.write("				<div class=\"card h-100 w-100\" style=\"width: 18rem;\">\r\n");
      out.write("					<img src=\"product-images/");
      out.print(p.getImage() );
      out.write("\" class=\"card-img-top img-fluid img-fit\" alt=\"dhimey\">\r\n");
      out.write("					<div class=\"card-body mt-1 pt-2\">\r\n");
      out.write("						<h5 class=\"card-title\">");
      out.print( p.getName());
      out.write("</h5>\r\n");
      out.write("						<h6 class=\"price\">Price:Rs ");
      out.print(p.getPrice());
      out.write("</h6>\r\n");
      out.write("						<h6 class=\"price\">Category:");
      out.print( p.getCategory());
      out.write("</h6>\r\n");
      out.write("						<div class=\"mt-7 d-flex justify-content-between\">\r\n");
      out.write("						<a href=\"cartServlet?id=");
      out.print(p.getId() );
      out.write("\" class=\"btn btn-dark\">Add to cart</a>\r\n");
      out.write("						<a href=\"OrderNowServlet?quantity=1&id=");
      out.print(p.getId() );
      out.write("\" class=\"btn btn-primary\">Buy Now</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("				\r\n");
      out.write("			");
}
		}
      out.write("\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/5.0.0-beta3/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid bg-dark text-white py-5\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <!-- Footer Navigation -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h5>Navigation</h5>\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\">About</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\">Services</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\">Contact</a></li>\r\n");
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
      out.write("                <p>&copy; 2024 Your Company. All rights reserved.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap JS and Popper.js -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.3/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/5.0.0-beta3/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
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
