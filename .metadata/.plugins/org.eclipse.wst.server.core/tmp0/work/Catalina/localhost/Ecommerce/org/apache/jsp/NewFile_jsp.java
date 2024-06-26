/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-26 03:58:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("  <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      justify-content: center;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("      height: 100vh;\r\n");
      out.write("      background-color: #f8f9fa;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .payment-buttons {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      flex-direction: column;\r\n");
      out.write("      justify-content: space-around;\r\n");
      out.write("      align-items: space-between;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-payment {\r\n");
      out.write("      width: 1200px;\r\n");
      out.write("      margin-bottom: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Custom button style for \"Pay with Khalti\" */\r\n");
      out.write("    #payment-button {\r\n");
      out.write("      background-color: #F6C90E;\r\n");
      out.write("      border-color: #F6C90E;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #payment-button:hover {\r\n");
      out.write("      background-color: #F7D849;\r\n");
      out.write("      border-color: #F7D849;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Custom button style for \"Cash On Delivery\" */\r\n");
      out.write("    .btn-cod {\r\n");
      out.write("      background-color: #007BFF;\r\n");
      out.write("      border-color: #007BFF;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-cod:hover {\r\n");
      out.write("      background-color: #0069D9;\r\n");
      out.write("      border-color: #0062CC;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write(" <script src=\"https://khalti.s3.ap-south-1.amazonaws.com/KPG/dist/2020.12.17.0.0.0/khalti-checkout.iffe.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <!-- Place this where you need payment button -->\r\n");
      out.write(" 	<div class=\"payment-buttons\">\r\n");
      out.write("    <button class=\"btn btn-primary\" id=\"payment-button\">Pay with Khalti</button>\r\n");
      out.write("    <a href=\"epay.jsp\" class = \"btn btn-primary\">Cash On Delivery</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Place this where you need payment button -->\r\n");
      out.write("    <!-- Paste this code anywhere in you body tag -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        var config = {\r\n");
      out.write("            // replace the publicKey with yours\r\n");
      out.write("            \"publicKey\": \"test_public_key_dc74e0fd57cb46cd93832aee0a390234\",\r\n");
      out.write("            \"productIdentity\": \"1234567890\",\r\n");
      out.write("            \"productName\": \"Dragon\",\r\n");
      out.write("            \"productUrl\": \"http://gameofthrones.wikia.com/wiki/Dragons\",\r\n");
      out.write("            \"paymentPreference\": [\r\n");
      out.write("                \"KHALTI\",\r\n");
      out.write("                \"EBANKING\",\r\n");
      out.write("                \"MOBILE_BANKING\",\r\n");
      out.write("                \"CONNECT_IPS\",\r\n");
      out.write("                \"SCT\",\r\n");
      out.write("                ],\r\n");
      out.write("            \"eventHandler\": {\r\n");
      out.write("                onSuccess (payload) {\r\n");
      out.write("                    // hit merchant api for initiating verfication\r\n");
      out.write("                    console.log(payload);\r\n");
      out.write("                },\r\n");
      out.write("                onError (error) {\r\n");
      out.write("                    console.log(error);\r\n");
      out.write("                },\r\n");
      out.write("                onClose () {\r\n");
      out.write("                    console.log('widget is closing');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var checkout = new KhaltiCheckout(config);\r\n");
      out.write("        var btn = document.getElementById(\"payment-button\");\r\n");
      out.write("        btn.onclick = function () {\r\n");
      out.write("            // minimum transaction amount must be 10, i.e 1000 in paisa.\r\n");
      out.write("            checkout.show({amount: 10000000});\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
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
