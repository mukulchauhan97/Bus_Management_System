package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        location = \"Login.jsp\";\n");
      out.write("    </script>\n");
      out.write("    ");

    }
    else
    {
    
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Home</title>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("* {\n");
      out.write("box-sizing: border-box;\n");
      out.write("}\n");
      out.write("   body{\n");
      out.write("      background-image: url(t.jpg);\n");
      out.write("      -webkit-background-size:cover;\n");
      out.write("      background-size: cover;\n");
      out.write("      background-position: center center;\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("      background-attachment: fixed;\n");
      out.write("          background-color: #999;\n");
      out.write("      height: 100%;\n");
      out.write("      margin: 0;\n");
      out.write("      font-family: Arial, Helvetica, sans-serif;\n");
      out.write("     }\n");
      out.write("header {\n");
      out.write("  text-align: center;\n");
      out.write("  color:white;\n");
      out.write("  border: 5px solid rgba(0,0,0,.5); \n");
      out.write("  background: rgba(0,0,0,.5);\n");
      out.write("  box-sizing: content-box;\n");
      out.write("}\n");
      out.write("nav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #e9e9e9;\n");
      out.write("}\n");
      out.write("nav a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("nav a:hover {\n");
      out.write("  background-color: #c6c6c6;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("nav a.active {\n");
      out.write("  background-color: #2980B9;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("nav .search-container {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("nav input[type=text] {\n");
      out.write("  padding: 6px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("nav .search-container button {\n");
      out.write("  float: right;\n");
      out.write("  padding: 6px 10px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  margin-right: 16px;\n");
      out.write("  background: #c6c6c6;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("nav .search-container button:hover {\n");
      out.write("  background: #9a9a9a;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (max-width: 768px) {\n");
      out.write("  nav .search-container {\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("  nav a, nav input[type=text], nav .search-container button {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("    width: 100%;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 14px;\n");
      out.write("  }\n");
      out.write("  nav input[type=text] {\n");
      out.write("    border: 1px solid #ccc;  \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("<h1>Bus Management System</h1>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("            <a class=\"active\" href=\"AdminDashboard.jsp\">Home</a>\n");
      out.write("            <a href=\"CreateRoutes.jsp\">Create Route</a>\n");
      out.write("            <a href=\"DeleteRoute.jsp\">Delete Route</a>\n");
      out.write("            <a href=\"UpdateRoute.jsp\">Update Route</a>\n");
      out.write("            <a href=\"vwRoute\">View Routes</a>\n");
      out.write("            <a href=\"getAllPermission\">New Registration</a>\n");
      out.write("            <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("</nav>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

    }

      out.write('\n');
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
