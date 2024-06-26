package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_005fproducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Insert Product</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/admin_nav.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <h2>Insert Product</h2>\n");
      out.write("            <form action=\"product_details\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"productName\">Product Name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"productName\" name=\"productName\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"productPrice\">Product Price:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"productPrice\" name=\"productPrice\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"productDescription\">Product Description:</label>\n");
      out.write("                    <textarea class=\"form-control\" id=\"productDescription\" name=\"productDescription\" required></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container mt-5\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"image\" class=\"form-label\">Select Image:</label>\n");
      out.write("                        <input type=\"file\" class=\"form-control\" id=\"image\" name=\"file2\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"productStatus\">Product Status:</label>\n");
      out.write("                    <select class=\"form-control\" id=\"productStatus\" name=\"productStatus\" required>\n");
      out.write("                        <option value=\"In Stocks\">In Stocks</option>\n");
      out.write("                        <option value=\"Out of Stocks\">Out of Stocks</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Insert Product</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
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
