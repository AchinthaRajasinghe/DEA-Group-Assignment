package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <title>Checkout Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/adminnav.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String id = request.getParameter("productId");
            System.out.println(id);
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <h2>Checkout</h2>\n");
      out.write("            <form>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <label for=\"firstName\">First Name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"First Name\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <label for=\"lastName\">Last Name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"lastName\" placeholder=\"Last Name\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\">Email</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Email\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"address\">Address</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"1234 Main St\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <label for=\"city\">City</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"city\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-4\">\n");
      out.write("                        <label for=\"state\">State</label>\n");
      out.write("                        <select id=\"state\" class=\"form-control\" required>\n");
      out.write("                            <option selected>Choose...</option>\n");
      out.write("                            <!-- Add your state options here -->\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-2\">\n");
      out.write("                        <label for=\"zip\">Zip</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"zip\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"creditCard\">Credit Card Number</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"creditCard\" placeholder=\"**** **** **** ****\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <label for=\"expiryDate\">Expiry Date</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"expiryDate\" placeholder=\"MM/YYYY\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <label for=\"cvv\">CVV</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"cvv\" placeholder=\"CVV\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Place Order</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
