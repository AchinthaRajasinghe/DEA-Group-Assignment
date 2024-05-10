package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.PrintWriter;

public final class userdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>User details</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/78e4720a2a.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/admin_nav.jsp", out, false);
      out.write("\n");
      out.write("        ");

            String sqlQuery = "     ";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dea_project", "root", "mysql"); PreparedStatement preparedStatement = connection.prepareStatement("SELECT fname,email,contact_no,username,password FROM user")) {

                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
        
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin-top: 20px;\">\n");
      out.write("            <table class=\"table table-bordered table-hover\">\n");
      out.write("                <thead class=\"table-dark\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">Full Name</th>\n");
      out.write("                        <th scope=\"col\">Email</th>\n");
      out.write("                        <th scope=\"col\">Contact Information</th>\n");
      out.write("                        <th scope=\"col\">Username</th>\n");
      out.write("                        <th scope=\"col\">Password</th>\n");
      out.write("                        <th scope=\"col\">Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 while (resultSet.next()) {
                            String fname = resultSet.getString("fname");
                            String item = resultSet.getString("email");
                            String volume = resultSet.getString("contact_no");
                            String username = resultSet.getString("username");
                            String pwd = resultSet.getString("password");
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( fname);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( item);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( volume);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( username);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pwd);
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"removeuser\" method=\"post\" style=\"display: inline-block;\">\n");
      out.write("                                <input type=\"hidden\" name=\"name\" value=\"");
      out.print( fname);
      out.write("\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Remove User</button>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                out.println("Error: " + e.getMessage());
            } catch (SQLException e) {
                e.printStackTrace();
                out.println("Error: " + e.getMessage());
            }
        
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
