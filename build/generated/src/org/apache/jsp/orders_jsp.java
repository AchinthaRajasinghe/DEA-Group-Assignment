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

public final class orders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>All products</title>\n");
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

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dea_project", "root", "mysql"); PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, name, price, description FROM product")) {

                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table class=\"table table-bordered table-hover\" style=\"margin-top: 20px;\">\n");
      out.write("                <thead class=\"table-dark\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\" style=\"text-align: center; vertical-align: middle; background-color: #343a40; color: white;\">Product No</th>\n");
      out.write("                        <th scope=\"col\" style=\"text-align: center; vertical-align: middle; background-color: #343a40; color: white;\">Item</th>\n");
      out.write("                        <th scope=\"col\" style=\"text-align: center; vertical-align: middle; background-color: #343a40; color: white;\">price</th>\n");
      out.write("                        <th scope=\"col\" style=\"text-align: center; vertical-align: middle; background-color: #343a40; color: white;\">Description</th>\n");
      out.write("                        <th scope=\"col\" style=\"text-align: center; vertical-align: middle; background-color: #343a40; color: white;\">Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 while (resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String item = resultSet.getString("name");
                            String volume = resultSet.getString("price");
                            String price = resultSet.getString("description");
                    
      out.write("\n");
      out.write("                    <tr style=\"text-align: center; vertical-align: middle;\">\n");
      out.write("                        <td style=\"width: 100px;\">00");
      out.print( id);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( item);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( volume);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( price);
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <form action=\"RemoveServlet\" method=\"post\" style=\"display: inline-block;\">\n");
      out.write("                                <input type=\"hidden\" name=\"productId\" value=\"");
      out.print( id);
      out.write("\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-danger\" style=\"width: 100px;\">Remove</button>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a href=\"update.jsp?productId=");
      out.print( id);
      out.write("\" class=\"btn btn-primary\" style=\"width: 100px;\">Update</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
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
