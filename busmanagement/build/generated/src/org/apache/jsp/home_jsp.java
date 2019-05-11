package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write('\n');
      out.write('\n');

    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
    
    if(request.getSession().getAttribute("uname")==null)
    {

      out.write("\n");
      out.write("<script>\n");
      out.write("        location = \"log.jsp\";\n");
      out.write("    </script>\n");
      out.write("    ");

    }
    else
    {
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>main</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\tbody{\n");
      out.write("\t\t\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t\tpadding: 0;\n");
      out.write("\t\tmargin: 0px;\n");
      out.write("\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t\t.container{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tjustify-content: center;\n");
      out.write("\t\t\tbackground-color: lightgrey;\n");
      out.write("\t\t\theight: 100px;\n");
      out.write("\t\t\talign-items: center;\n");
      out.write("\t\t\tcolor: dodgerblue;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.wrapper{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tbackground-color: grey;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.wrapper img{\n");
      out.write("\t\t\theight: 100px;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\ttop: 0px;\n");
      out.write("\t\t\tleft: 0px;\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.demo{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.demo a{\n");
      out.write("\t\t\twidth: 20%;\n");
      out.write("\t\t\tcolor: #f1f1f1;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tpadding: 12px 14px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.demo a:hover{\n");
      out.write("\t\t\tbackground-color: #999;\n");
      out.write("\t\t\tcolor: #333;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.mid{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\theight: 500px;\n");
      out.write("\t\t\tbackground-repeat: no-repeat;\n");
      out.write("\t\t}\n");
      out.write("\t\t.mid img{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.animate_image{\n");
      out.write("\t\t\twidth: 150px;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tmargin: auto;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.animate_image img{\n");
      out.write("\t\t\theight: 200px;\n");
      out.write("\t\t\twidth: 200px;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\th3{\n");
      out.write("\t\t\t\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.welcome p{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tmargin: auto;\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t   .div_text{\n");
      out.write("\t   \tdisplay: flex;\n");
      out.write("\t   \t\n");
      out.write("\t   \twidth: 290px;\n");
      out.write("\t   \theight: 300px;\n");
      out.write("\t   \tmargin: 75px;\n");
      out.write("\t    display: inline-block;\n");
      out.write("\n");
      out.write("\t   \t\n");
      out.write("\n");
      out.write("\t   }\n");
      out.write("\n");
      out.write("\t   .contact_image\n");
      out.write("\t   {\n");
      out.write("\t   \t  width: 150px;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tmargin: auto;\n");
      out.write("\t   }\n");
      out.write("\n");
      out.write("\n");
      out.write("\t   .contact_image img{\n");
      out.write("\t\t\theight: 90px;\n");
      out.write("\t\t\twidth: 90px;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.footer{\n");
      out.write("/*\t\t\tdisplay: flex;\n");
      out.write("*/\t\t\theight: 40px;\n");
      out.write("\t\t\tbackground-color: lightgrey;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("    \t\tpadding: 70px;\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1 class=\"wow bounceInDown\">Bus Management</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<img src=\"school-bus.png\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"demo\">\n");
      out.write("\t\t<a href=\"#\">Home</a>\n");
      out.write("\t\t\n");
      out.write("\t\t<a href=\"createroutes.jsp\">Create Route</a>\n");
      out.write("\t\t<a href=\"viewRouteServlet\">View Route</a>\n");
      out.write("\t\t<a href=\"sign.jsp\">New Registration</a>\n");
      out.write("                <a href=\"logmeout.jsp\">Log Out</a>\n");
      out.write("\t    \n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"mid\"><img src=\"setra-topclass-500-w820xh328-cutout.jpg\"></div>\n");
      out.write("\n");
      out.write("\t<div class=\"animate_image\">\n");
      out.write("\t\t<img src=\"bus.png\" onmouseover=\"this.src='bus2.png'\" onmouseout=\"this.src='bus.png'\">\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"\">\n");
      out.write("\t\t<div class=\"welcome\">\n");
      out.write("\t\t\t<h3>Welcome to Our Website</h3>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("\t\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n");
      out.write("\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"div_text\">\n");
      out.write("\t\t\n");
      out.write("\t\t<h3>Our Services</h3>\n");
      out.write("\n");
      out.write("\t\t<div class=\"contact_image\" >\n");
      out.write("\t\t\t<img src=\"contact.png\" onmouseover=\"this.src='contact2.png'\" onmouseout=\"this.src='contact.png'\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\t\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\t\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\t\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\t\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("\t\t\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"div_text\">\n");
      out.write("\t\t\t\t<h3>Our Services</h3>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"contact_image\" >\n");
      out.write("\t\t\t<img src=\"complain.png\" onmouseover=\"this.src='complain1.png'\" onmouseout=\"this.src='complain.png'\">\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\t\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\t\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\t\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\t\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("\t\t\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"div_text\">\n");
      out.write("\t\t\t\t<h3>Our Services</h3>\n");
      out.write("\t\t\t\t<div class=\"contact_image\" >\n");
      out.write("\t\t\t<img src=\"smartphone1.png\" onmouseover=\"this.src='smartphone.png'\" onmouseout=\"this.src='smartphone1.png'\">\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\t\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\t\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\t\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\t\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("\t\t\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("\t\t\t</div><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer\">@All rights reserved</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<script src=\"js/wow.min.js\"></script>\n");
      out.write("              <script>\n");
      out.write("              new WOW().init();\n");
      out.write("              </script>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

  }  

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
