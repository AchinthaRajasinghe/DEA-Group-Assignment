package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("        body\n");
      out.write("{\n");
      out.write("  background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url(\"350.jpg\") center/cover no-repeat;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container\n");
      out.write("{\n");
      out.write("  background-color: rgba(0,0,0,.6);\n");
      out.write("  border-radius: 20px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  height: 800px;\n");
      out.write("  padding: 20px;\n");
      out.write("  width: 500px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo img\n");
      out.write("{\n");
      out.write("    width:  150px;\n");
      out.write("    float:  left;\n");
      out.write("    height:  auto;\n");
      out.write("    margin: 2rem;\n");
      out.write("    border-radius: 5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo img:hover\n");
      out.write("{\n");
      out.write("    transform: scale(1.2);\n");
      out.write("    border: 3px solid #ff1a1a;\n");
      out.write("    border-radius: 5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title\n");
      out.write("{\n");
      out.write("  color: #eee;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  font-size: 20px;\n");
      out.write("  font-weight: 700;\n");
      out.write("  margin-top: 10px;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".subtitle \n");
      out.write("{\n");
      out.write("  color: #eee;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  font-size: 16px;\n");
      out.write("  font-weight: 300;\n");
      out.write("  margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit \n");
      out.write("{\n");
      out.write("  background-color: #08d;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  border: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  color: #eee;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 18px;\n");
      out.write("  height: 40px;\n");
      out.write("  margin-top: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("  width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit:hover\n");
      out.write("{\n");
      out.write("  background-color: #0000e6;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  border: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  color: #eee;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 19px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit2 \n");
      out.write("{\n");
      out.write("  background-color: #08d;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  border: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  color: #eee;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 16px;\n");
      out.write("  height: 30px;\n");
      out.write("  width: 18%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit2:hover\n");
      out.write("{\n");
      out.write("  background-color: #0000e6;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  border: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  color: #eee;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 17px;\n");
      out.write("  height: 30px;\n");
      out.write("  width: 18%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".submit:active \n");
      out.write("{\n");
      out.write("  background-color: #06b;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction Cancle()\n");
      out.write("\t\t{\n");
      out.write("\t\t\twindow.location.href=\"main.jsp\"\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t function closeform()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"login\").style.display=\"none\";\n");
      out.write("        }\n");
      out.write("\t\t\n");
      out.write("\t\tfunction totalIt() \n");
      out.write("\t\t{\n");
      out.write("\t\tvar input = document.getElementsByName(\"ddlselect\");\n");
      out.write("\t\tvar total = 0;\n");
      out.write("\t\tfor (var i = 0; i < input.length; i++) \n");
      out.write("\t\t{\n");
      out.write("\t\tif (input[i].checked) \n");
      out.write("\t\t{\n");
      out.write("\t\t  total += parseFloat(input[i].value);\n");
      out.write("\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tdocument.getElementById(\"total\").value = total.toFixed();\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction totalIt2() \n");
      out.write("\t\t{\n");
      out.write("\t\tvar input = document.getElementsByName(\"ddlselect2\");\n");
      out.write("\t\tvar total = 0;\n");
      out.write("\t\tfor (var i = 0; i < input.length; i++) \n");
      out.write("\t\t{\n");
      out.write("\t\tif (input[i].checked) \n");
      out.write("\t\t{\n");
      out.write("\t\t  total += parseFloat(input[i].value);\n");
      out.write("\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tdocument.getElementById(\"total2\").value =  total.toFixed();\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction TotalPrice()\n");
      out.write("   \t\t{\n");
      out.write("   \t\tvar P;\n");
      out.write("   \t\tvar Q; \n");
      out.write("   \t\tvar cal;\n");
      out.write("   \t\tP=Number(document.bill.total.value);\n");
      out.write("   \t\tQ=Number(document.bill.total2.value);\n");
      out.write("   \t\tcal=P+Q;\n");
      out.write("   \t\tdocument.bill.txtResult.value=cal;\n");
      out.write("   \t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<center>\n");
      out.write("\t\t<div class=\"form-popup\" id=\"myform\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class = \"logo\" id= \"logo\" >\n");
      out.write("            <img src=\"air4.jpg\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<form name=\"bill\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"title\">Personal Details</div><br>\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"subtitle\">First Name</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"subtitle\">Last Name</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"subtitle\">Email</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"subtitle\">Contact</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<hr>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<div class=\"title\">Booking Details</div>\n");
      out.write("            <br>\n");
      out.write("\t\t\t<div class=\"subtitle\">Checkin Date \n");
      out.write("\t\t\t\t<input type=\"date\" name=\"Checking\"></div><br>\n");
      out.write("\n");
      out.write("\t\t\t\t<label class=\"subtitle\" >CLASS</label>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t<input name=\"ddlselect\" class=\"subtitle\" value=\"100\" type=\"radio\" id=\"p1\" onclick=\"totalIt()\"/>\n");
      out.write("            <font color=\"white\">First Class</font>\n");
      out.write("\n");
      out.write("            <input name=\"ddlselect\" class=\"subtitle\" value=\"50\" type=\"radio\" id=\"p1\" onclick=\"totalIt()\"/>\n");
      out.write("            <font color=\"white\">Business Class</font>\n");
      out.write("            <input name=\"ddlselect\" class=\"subtitle\" value=\"100\" type=\"radio\" id=\"p1\" onclick=\"totalIt()\"/>\n");
      out.write("            <font color=\"white\">Economy Class</font><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t<label class=\"subtitle\">Depature Airport</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<select name=\"ddlselect\" value=\"100\" id=\"p1\" onchange=\"totalIt()\">\n");
      out.write("\t\t\t\t<option>*Select*</option>\n");
      out.write("\t\t\t\t<option value=\"one\">Abu Dhabi - United Arab Phoenix</option>\n");
      out.write("\t\t\t\t<option value=\"two\">Adelaide - Australia (ADL)</option>\n");
      out.write("\t\t\t\t<option value=\"three\">Amman - Jordan (AMM)</option>\n");
      out.write("\t\t\t</select><br><br>\n");
      out.write("\n");
      out.write("\t\t\t<label>\n");
      out.write("\t\t\t\t<label class=\"subtitle\">Destination Airport</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<select name=\"ddlselect\" value=\"100\" id=\"p1\" onchange=\"totalIt()\">\n");
      out.write("\t\t\t\t<option>*Select*</option>\n");
      out.write("\t\t\t\t<option value=\"one\">Abu Dhabi - United Arab Phoenix</option>\n");
      out.write("\t\t\t\t<option value=\"two\">Adelaide - Australia (ADL)</option>\n");
      out.write("\t\t\t\t<option value=\"three\">Amman - Jordan (AMM)</option>\n");
      out.write("\t\t\t</select><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("        \t<br>\n");
      out.write("            <input type=\"button\" class=\"submit2\" name=\"Totalcal\" id=\"totalpricedisplay\" value=\"OK\"  onclick=\"TotalPrice()\"></button>\n");
      out.write("        \t<br>\n");
      out.write("\n");
      out.write("\t\t\t<label id=\"lblmess\"></label><br>\n");
      out.write("\t\t\t<button type=\"submit\" class=\"submit\">Booking Now</button>\n");
      out.write("\t\t\t<button type=\"button\" class=\"submit\" onclick=\"Cancle()\">Cancle Booking</button>\n");
      out.write("\t\t\t<button type=\"reset\" class=\"submit\" onclick=\"Closeform()\">Clear Booking</button>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t</center>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</body>\n");
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