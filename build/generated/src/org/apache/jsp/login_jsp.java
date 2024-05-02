package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            * \n");
      out.write("{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-family: 'Poppins', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body \n");
      out.write("{\n");
      out.write("    width: 100%;\n");
      out.write("    min-height: 100vh;\n");
      out.write("    background-image: linear-gradient(rgba(0,0,0,.5), rgba(0,0,0,.5)), url(456.jpg);\n");
      out.write("    background-position: center;\n");
      out.write("    background-size: cover;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container \n");
      out.write("{\n");
      out.write("    width: 400px;\n");
      out.write("    min-height: 400px;\n");
      out.write("    background: #FFF;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-shadow: 0 0 5px rgba(0,0,0,.3);\n");
      out.write("    padding: 40px 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-text \n");
      out.write("{\n");
      out.write("    color: #111;\n");
      out.write("    font-weight: 500;\n");
      out.write("    font-size: 1.1rem;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    display: block;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-text-1 \n");
      out.write("{\n");
      out.write("    color: #111;\n");
      out.write("    font-weight: 500;\n");
      out.write("    font-size: 1.1rem;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    display: block;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-social \n");
      out.write("{\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: repeat(auto-fit, minmax(50%, 1fr));\n");
      out.write("    margin-bottom: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-social a \n");
      out.write("{\n");
      out.write("    padding: 12px;\n");
      out.write("    margin: 10px;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    box-shadow: 0 0 5px rgba(0,0,0,.3);\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 1rem;\n");
      out.write("    text-align: center;\n");
      out.write("    color: #FFF;\n");
      out.write("    transition: .3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-social a i \n");
      out.write("{\n");
      out.write("    margin-right: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-form .input-group \n");
      out.write("{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 50px;\n");
      out.write("    margin-bottom: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-form .input-group input \n");
      out.write("{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    border: 2px solid #e7e7e7;\n");
      out.write("    padding: 15px 20px;\n");
      out.write("    font-size: 1rem;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    background: transparent;\n");
      out.write("    outline: none;\n");
      out.write("    transition: .3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-form .input-group input:focus, .container .login-form .input-group input:valid \n");
      out.write("{\n");
      out.write("    border-color: #a29bfe;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-form .input-group .btn \n");
      out.write("{\n");
      out.write("    display: block;\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 15px 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    border: none;\n");
      out.write("    background: #a29bfe;\n");
      out.write("    outline: none;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    font-size: 1.2rem;\n");
      out.write("    color: #FFF;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: .3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .login-form .input-group .btn:hover \n");
      out.write("{\n");
      out.write("    transform: translateY(-5px);\n");
      out.write("    background: #6c5ce7;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-admin-text \n");
      out.write("{\n");
      out.write("    color: #111;\n");
      out.write("    font-weight: 600;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-admin-text a \n");
      out.write("{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: #6c5ce7;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (max-width: 430px) \n");
      out.write("{\n");
      out.write("    .container \n");
      out.write("    {\n");
      out.write("        width: 300px;\n");
      out.write("    }\n");
      out.write("    .container .login-social \n");
      out.write("    {\n");
      out.write("        display: block;\n");
      out.write("    }\n");
      out.write("    .container .login-social a \n");
      out.write("    {\n");
      out.write("        display: block;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<title>Login</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<form action=\"\" method=\"POST\" name=\"login\" class=\"login-form\">\n");
      out.write("\t\t\t<p class=\"login-text\" style=\"font-size: 2rem; font-weight: 800;\">Login</p>\n");
      out.write("            <p class=\"login-text-1\" style=\"font-size: 1rem; font-weight: 700;\">***Welcome to SriLankan Airline***</p>\n");
      out.write("\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Enter your Membership ID\" name=\"membership\" id=\"membership\" value=\"\" required>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"Enter your Password\" name=\"password\" id=\"password\" value=\"\" required>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <input type=\"checkbox\" name=\"checkbox\" value=\"Clear\" class=\"checkbox\" onchange=\"document.getElementById('password').type=this.checked?'text':'password'\">\n");
      out.write("                <font>Show Password</font>\n");
      out.write("            </div><br>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"input-group\">\n");
      out.write("                <input type=\"button\" name=\"submit\" value=\"Login\" class=\"btn\" onclick=\"loggingform()\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"reset\" name=\"reset\" value=\"Clear\" class=\"btn\" onclick=\"Closeform()\">\n");
      out.write("            </div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
