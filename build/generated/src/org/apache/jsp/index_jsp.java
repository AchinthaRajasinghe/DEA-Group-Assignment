package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('images/register.jpg'); background-size: cover; background-attachment: fixed; background-color: rgba(255, 255, 255, 0.5);\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/adminnav.jsp", out, false);
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"container mt-5\" style=\"height:700px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.05); padding: 20px; background-color: rgba(255, 255, 255, 0.7); border-radius: 25px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <h1 class=\"text-center\">Register here</h1>\n");
      out.write("                    <img src=\"fruites.jpg\" alt=\"Background Image\" style=\"width: 100%; height: auto; position: absolute; top: 0; left: 0; z-index: -1; border-radius: 15px;\">\n");
      out.write("\n");
      out.write("                    <form action=\"insert\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"fname\">Full Name:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"fname\" name=\"fname\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"contactno\">Contact no:</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" id=\"contactno\" name=\"contactno\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"username\">Username:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password\">Create Password:</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"confirm_password\">Confirm Password:</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"confirm_password\" name=\"confirm_password\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Register</button>\n");
      out.write("                        <br> <br>\n");
      out.write("                        Already have an account<a href=\"login_1.jsp\"> Login</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
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
