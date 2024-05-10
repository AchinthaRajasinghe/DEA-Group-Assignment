package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About Us</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #container {\n");
      out.write("                height: 500px;\n");
      out.write("                max-width: 900px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 20px;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header {\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            section {\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1, h2 {\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p {\n");
      out.write("                line-height: 1.5;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #navbar {\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #333;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"navbar\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/navbar.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <header>\n");
      out.write("                <h1>About Us</h1>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <p>\n");
      out.write("                    Green Supermarket, your trusted destination for sustainable living. We're more than a grocery store; we're a community that believes in conscious choices for a healthier planet. Our curated selection of eco-friendly products reflects our commitment to transparency and quality.\n");
      out.write("                </p>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <h2>Who we are</h2>\n");
      out.write("                <p>\n");
      out.write("                    Green Supermarket is one of the leading supermarkets in the country. This is a family business that has been passed on from generation to generation, now celebrating 30 years for our chain of Green Supermarket.\n");
      out.write("                </p>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section id=\"about-us\">\n");
      out.write("                <h2>Meet the Team</h2>\n");
      out.write("                <p>\n");
      out.write("                    Get to know the amazing individuals behind this creation. We are a group of individuals studying at NSBM Green University, following the Software Engineering degree program. If you have any complaints, suggestions, and innovative ideas, please contact us through our contact us page.\n");
      out.write("                </p>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
