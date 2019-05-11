package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class log_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<title>Login Form</title>\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("  background: url(setra-topclass-500-w820xh328-cutout.jpg) no-repeat center center fixed;\n");
      out.write("  background-size: cover;\n");
      out.write("  height: 100%;\n");
      out.write("  overflow: hidden;\n");
      out.write("font-family: sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginBox\n");
      out.write("{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%,-50%);\n");
      out.write("\twidth: 350px;\n");
      out.write("\theight: 420px;\n");
      out.write("\tpadding: 80px 40px;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tbackground: rgba(0,0,0,.5);\n");
      out.write("}\n");
      out.write(".user\n");
      out.write("{\n");
      out.write("\twidth: 100px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: calc(-100px/2);\n");
      out.write("\tleft: calc(50% - 50px);\n");
      out.write("}\n");
      out.write("h2\n");
      out.write("{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0 0 20px;\n");
      out.write("\tcolor: white;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".loginBox p\n");
      out.write("{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write(".loginBox input\n");
      out.write("{\n");
      out.write("\twidth: 100%;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"text\"],\n");
      out.write(".loginBox input[type=\"password\"]\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-bottom: 1px solid #fff;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write(".loginBox select\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-bottom: 1px solid #fff;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\toutline: none;\n");
      out.write("\twidth:100%;\n");
      out.write("\tcolor:#fff;\n");
      out.write("\theight: 40px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write(".loginBox option{\n");
      out.write("\tcolor:black;\n");
      out.write("}\n");
      out.write(".loginBox option[value=\"\"][disabled] {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("::placeholder\n");
      out.write("{\n");
      out.write("\tcolor: rgba(255,255,255,.5);\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tbackground: dodgerblue;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"submit\"]:hover\n");
      out.write("{\n");
      out.write("\tbackground: #39dc79;\n");
      out.write("\tcolor: #262626;\n");
      out.write("        \n");
      out.write("}\n");
      out.write(".loginBox a\n");
      out.write("{\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\t</style>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"loginBox\">\n");
      out.write("\t\t\t    <img src=\"avatar.png\" class=\"user\">\n");
      out.write("\t\t\t    <h2>Login Here</h2>\n");
      out.write("                <form name=\"myForm\" method=\"post\" action=\"Userlog\" onsubmit=\"return myValidation()\">\n");
      out.write("\t\t\t\t<p>Username</p>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"uname\" placeholder=\"Enter Username\">\n");
      out.write("\t\t\t\t<p>Password</p>\n");
      out.write("                <input type=\"password\" name=\"pass\" placeholder=\"Enter Password\">\n");
      out.write("                <p>Select Status</p><p>  </p>\n");
      out.write("                <select name=\"status\">\n");
      out.write("                <option value=\"default\" disabled selected>Status</option>\n");
      out.write("                <option value=\"student\">Student</option>\n");
      out.write("<!--                <option value=\"faculty\">Faculty</option>-->\n");
      out.write("                <option value=\"admin\">Admin</option>\n");
      out.write("                </select><br><br>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"\"  action=\"same.html\" value=\"Login\">\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t         function myValidation(){\n");
      out.write(" \t\t\t                   var uname = document.forms[\"myForm\"][\"uname\"];\n");
      out.write(" \t\t\t\t\t           var pwd = document.forms[\"myForm\"][\"pass\"];\n");
      out.write(" \t\t\t                   var stat = document.forms[\"myForm\"][\"status\"];\n");
      out.write(" \t\t\t                   var flag=true;\n");
      out.write(" \t\t\t\t\t\t\t   \n");
      out.write("                               if(uname.value==\"\"){\n");
      out.write("                               \t  alert(\"UserName cannot be empty\");\n");
      out.write("                               \t  \n");
      out.write("                               \t  flag=false;\n");
      out.write("                               }\n");
      out.write("                               if(pwd.value==\"\"){\n");
      out.write("                               \t  alert(\"Password cannot be empty\");\n");
      out.write("                               \t \n");
      out.write("                               \t  flag=false;\n");
      out.write("                               }\n");
      out.write("                               if(stat.value==\"\" || !(stat.value==\"student\" || stat.value==\"faculty\" || stat.value==\"admin\")){\n");
      out.write("                               \t  alert(\"Status is Invalid\");\n");
      out.write("                               \t  \n");
      out.write("                               \t  flag=false;\n");
      out.write("                               }\n");
      out.write(" \t\t\t                   return flag;\n");
      out.write(" \t\t                     }\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
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
