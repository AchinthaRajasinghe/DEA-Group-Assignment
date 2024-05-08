package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.PrintWriter;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/78e4720a2a.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('images/blur.jpg'); background-size: cover; background-attachment: fixed; position: relative;\">\n");
      out.write("        <div style=\"position: absolute; top: 0; left: 0; width: 100%; height: 100%; background-color: rgba(0, 0, 0, 0.4);\"></div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/navbar.jsp", out, false);
      out.write("\n");
      out.write("    ");

        String sqlQuery = "     ";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dea_project", "root", "mysql"); PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, name, price, description, image FROM product")) {

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
    
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row row-cols-1 row-cols-md-4 g-5\">\n");
      out.write("            ");
 while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String price = resultSet.getString("price");
                    String description = resultSet.getString("description");
                    String image = resultSet.getString("image");

            
      out.write("\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <div class=\"card\" style=\"width: 300px; height: 400px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); background: rgba(255, 255, 255, 0.9); border-radius: 15px; overflow: hidden; position: relative; left: -20px; margin-top: 20px;\">\n");
      out.write("                    <!-- Picture on top half -->\n");
      out.write("                    <div style=\"height: 50%; overflow: hidden;\">\n");
      out.write("                        <img src=\"images/");
      out.print( image);
      out.write("\" class=\"card-img-top\" alt=\"Product Image\" style=\"width: 100%; height: 200px; position: absolute; top: 0; left: 0; overflow: hidden \">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card-body\" style=\"padding-top: 10px;\">\n");
      out.write("                        <h5 class=\"card-title\" style=\"font-size: 24px;\"> ");
      out.print( name);
      out.write("</h5>\n");
      out.write("                        <p class=\"card-text\" style=\"font-weight: bold;\"> ");
      out.print( description);
      out.write("</p>\n");
      out.write("                        <p class=\"card-text\">Rs: ");
      out.print( price);
      out.write("</p>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <form action=\"cart\" method=\"post\" style=\"display: inline-block;\">\n");
      out.write("                                    <input type=\"hidden\" name=\"productId\" value=\"");
      out.print( id);
      out.write("\">\n");
      out.write("                                    <input type=\"hidden\" name=\"name\" value=\"");
      out.print( name);
      out.write("\">\n");
      out.write("                                    <input type=\"hidden\" name=\"price\" value=\"");
      out.print( price);
      out.write("\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Add to cart</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <a href=\"checkout.jsp?productId=");
      out.print( id);
      out.write("\" class=\"btn btn-primary\" style=\"width: 100px;\">Buy now</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

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
