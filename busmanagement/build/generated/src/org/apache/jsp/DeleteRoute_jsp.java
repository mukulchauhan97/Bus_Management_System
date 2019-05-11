package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DeleteRoute_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title> route </title>   \n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  body\n");
      out.write("{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background: #efefef;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: #777;\n");
      out.write("    \n");
      out.write("    font-weight: 300;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header{\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      background-color: lightgrey;\n");
      out.write("      height: 100px;\n");
      out.write("      \n");
      out.write("      align-items: center;\n");
      out.write("      color: dodgerblue;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .header h1\n");
      out.write("{\n");
      out.write("    margin: 0 0 20px 0;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    .demo{\n");
      out.write("      display: flex;\n");
      out.write("      background-color: black;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .demo a{\n");
      out.write("      width: 20%;\n");
      out.write("      color: #f1f1f1;\n");
      out.write("      text-decoration: none;\n");
      out.write("      padding: 12px 14px;\n");
      out.write("      text-align: center;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .demo a:hover{\n");
      out.write("      background-color: #999;\n");
      out.write("      color: #333;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container{\n");
      out.write("      display: flex;\n");
      out.write("      background-color: grey;\n");
      out.write("      color: #f1f1f1;\n");
      out.write("      height: 700px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .left{\n");
      out.write("      flex: 1;\n");
      out.write("      background-color: grey;\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    .right{\n");
      out.write("      flex: 2;\n");
      out.write("      background-color: powderblue;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer{\n");
      out.write("/*      display: flex;\n");
      out.write("*/      height: 50px;\n");
      out.write("      background-color: lightgrey;\n");
      out.write("      text-align: center;\n");
      out.write("        padding: 70px;      \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .lef{\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      padding: 12px;\n");
      out.write("      height: 250px;\n");
      out.write("      background-color: white;\n");
      out.write("      margin: 15px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .rig{\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      padding: 12px;\n");
      out.write("      height: 250px;\n");
      out.write("      background-color: white;\n");
      out.write("      margin: 15px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .mid{\n");
      out.write("      display: flex;\n");
      out.write("      height: 600px;\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("      background-image: url(setra-topclass-500-w820xh328-cutout.jpg);\n");
      out.write("\n");
      out.write("      background-size: cover;\n");
      out.write("      background-position: center;\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("     image{\n");
      out.write("      \n");
      out.write("      width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("#login-box\n");
      out.write("{\n");
      out.write("    position: relative;\n");
      out.write("    margin: 5% auto;\n");
      out.write("    height: 500px;\n");
      out.write("    width: 400px;\n");
      out.write("    color: white;\n");
      out.write("    background: rgba(0, 0, 0, 0.5);\n");
      out.write("    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.6);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-box\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 40px;\n");
      out.write("    width: 300px;\n");
      out.write("    height: 400px;    \n");
      out.write("}\n");
      out.write("\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("    margin: 0 0 20px 0;\n");
      out.write("    font-weight: 300;\n");
      out.write("    font-size: 28px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"password\"]\n");
      out.write("{\n");
      out.write("    display: block;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    padding: 4px;\n");
      out.write("    width: 320px;\n");
      out.write("    height: 32px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    outline: none;\n");
      out.write("    border-bottom: 1px solid #aaa;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-weight: 400;\n");
      out.write("    font-size: 15px;\n");
      out.write("    transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("    margin-bottom: 28px;\n");
      out.write("    width: 120px;\n");
      out.write("    height: 32px;\n");
      out.write("    background: #f44336;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 2px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-weight: 500;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    transition: 0.2s ease;\n");
      out.write("    cursor: pointer;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]:hover,\n");
      out.write("input[type=\"submit\"]:focus\n");
      out.write("{\n");
      out.write("    background: #ff5722;\n");
      out.write("    transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <h1 class=\"wow bounceInDown\">Bus Management</h1>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <div class=\"demo\">\n");
      out.write("    <a href=\"#\">Home</a>\n");
      out.write("    <a href=\"#\">About Us</a>\n");
      out.write("    <a href=\"createroute.html\">Create Route</a>\n");
      out.write("    <a href=\"viewroute.html\">View Route</a>\n");
      out.write("    <a href=\"#\">New Registration</a>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("  <div class=\"mid\">\n");
      out.write("    <div id=\"login-box\">\n");
      out.write("      <div class=\"left-box\">\n");
      out.write("        <h1>Delete Route</h1>\n");
      out.write("        <form action=\"deleteRoute\" method=\"POST\" name=\"myForm\" onsubmit=\"return myValidation()\">\n");
      out.write("\n");
      out.write("\t\t<input type=\"text\" name=\"rc\" placeholder=\"Route Code\"/>\n");
      out.write("          <input type=\"text\" name=\"rn\" placeholder=\"Route Name\"/>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("          <input type=\"submit\" name=\"signup-button\" value=\"Delete\"/>\n");
      out.write("\n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("                   function myValidation(){\n");
      out.write("                         \n");
      out.write("                         var regnumber = document.forms[\"myForm\"][\"Regnumber\"];\n");
      out.write("                     var  dName= document.forms[\"myForm\"][\"DName\"];\n");
      out.write("                         var dnumber = document.forms[\"myForm\"][\"DNumber\"];\n");
      out.write("                          var bname = document.forms[\"myForm\"][\"BName\"];\n");
      out.write("                      var bcontact = document.forms[\"myForm\"][\"BContact\"];\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("                         var flag=true;\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("                 \n");
      out.write("                               if(regnumber.value==\"\"){\n");
      out.write("                                  alert(\"Regnumber cannot be empty\");\n");
      out.write("                                  \n");
      out.write("                                  flag=false;\n");
      out.write("                               }\n");
      out.write("                               if(dName.value==\"\"){\n");
      out.write("                                  alert(\"DName cannot be empty\");\n");
      out.write("                                 \n");
      out.write("                                  flag=false;\n");
      out.write("                               }\n");
      out.write("                                if(dnumber.value==\"\"){\n");
      out.write("                                  alert(\"DNumber cannot be empty\");\n");
      out.write("                                 \n");
      out.write("                                  flag=false;\n");
      out.write("                               }\n");
      out.write("                                if(bname.value==\"\"){\n");
      out.write("                                  alert(\"BName cannot be empty\");\n");
      out.write("                                 \n");
      out.write("                                  flag=false;\n");
      out.write("                               }\n");
      out.write("                                if(bcontact.value==\"\" || isNaN(bcontact.value)){\n");
      out.write("                                  alert(\"BContact cannot be empty or Invalid\");\n");
      out.write("                                 \n");
      out.write("                                  flag=false;\n");
      out.write("                               }\n");
      out.write("                         return flag;\n");
      out.write("                         }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"footer\">@All rights reserved</div>\n");
      out.write("\n");
      out.write("  <script src=\"js/wow.min.js\"></script>\n");
      out.write("              <script>\n");
      out.write("              new WOW().init();\n");
      out.write("              </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("    \n");
      out.write("</body>    \n");
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