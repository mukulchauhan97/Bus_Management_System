package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modal.RouteInfo;

public final class AddStoppages_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <title>Add Stoppages</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        /*--------------------------Nav bar--------------------------------*/\n");
      out.write("        *{\n");
      out.write("           box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("          background-image: url(t.jpg);\n");
      out.write("          -webkit-background-size:cover;\n");
      out.write("          background-size: cover;\n");
      out.write("          background-position: center center;\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-color: #999;\n");
      out.write("          height: 100%;\n");
      out.write("          margin: 0;\n");
      out.write("          font-family: Arial, Helvetica, sans-serif;\n");
      out.write("         }\n");
      out.write("        header {\n");
      out.write("          text-align: center;\n");
      out.write("          color:white;\n");
      out.write("          border: 5px solid rgba(0,0,0,.5); \n");
      out.write("          border-radius: 5px;\n");
      out.write("          background: rgba(0,0,0,.5);\n");
      out.write("          box-sizing: content-box;\n");
      out.write("        }\n");
      out.write("        nav {\n");
      out.write("          overflow: hidden;\n");
      out.write("          background-color: #e9e9e9;\n");
      out.write("          /*height: 50px;*/\n");
      out.write("        }\n");
      out.write("        nav a {\n");
      out.write("          float: left;\n");
      out.write("          display: block;\n");
      out.write("          color: black;\n");
      out.write("          text-align: center;\n");
      out.write("          padding: 14px 16px;\n");
      out.write("          text-decoration: none;\n");
      out.write("          font-size: 18px;\n");
      out.write("        }\n");
      out.write("        nav a:hover {\n");
      out.write("          background-color: #c6c6c6;\n");
      out.write("          color: black;\n");
      out.write("        }\n");
      out.write("        nav a.active {\n");
      out.write("          background-color: #2980B9;\n");
      out.write("          color: white;\n");
      out.write("        }\n");
      out.write("        nav .search-container {\n");
      out.write("          float: right;\n");
      out.write("        }\n");
      out.write("        nav input[type=text] {\n");
      out.write("          padding: 6px;\n");
      out.write("          margin-top: 8px;\n");
      out.write("          font-size: 17px;\n");
      out.write("          border: none;\n");
      out.write("        }\n");
      out.write("        nav .search-container button {\n");
      out.write("          float: right;\n");
      out.write("          padding: 6px 10px;\n");
      out.write("          margin-top: 8px;\n");
      out.write("          margin-right: 16px;\n");
      out.write("          background: #c6c6c6;\n");
      out.write("          font-size: 17px;\n");
      out.write("          border: none;\n");
      out.write("          cursor: pointer;\n");
      out.write("        }\n");
      out.write("        nav .search-container button:hover {\n");
      out.write("          background: #9a9a9a;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /*----------------------------------------------------------*/\n");
      out.write("\n");
      out.write("\n");
      out.write("        .envelope form label{\n");
      out.write("              color: black;\n");
      out.write("              padding: 2px;\n");
      out.write("              margin-top: 0;\n");
      out.write("              font-size: 20px;        \n");
      out.write("          }\n");
      out.write("        /*----------------------------------------------------------*/\n");
      out.write("\n");
      out.write("        @media (max-width: 600px) {\n");
      out.write("          nav .search-container {\n");
      out.write("            float: none;\n");
      out.write("          }\n");
      out.write("        nav a, nav input[type=text], nav .search-container button {\n");
      out.write("            float: none;\n");
      out.write("            display: block;\n");
      out.write("            text-align: left;\n");
      out.write("            width: 100%;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 14px;\n");
      out.write("          }\n");
      out.write("        nav input[type=text] {\n");
      out.write("            border: 1px solid #ccc;  \n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /*--------------------------------*/\n");
      out.write("\n");
      out.write(".wrapper{\n");
      out.write("  margin:0 auto;\n");
      out.write("  padding-top:1%;\n");
      out.write("  position:relative;\n");
      out.write("}\n");
      out.write(".wrapper-2{\n");
      out.write("  width:14%;\n");
      out.write("  margin:0 auto;\n");
      out.write("  text-align:right;\n");
      out.write("}\n");
      out.write(".bus{\n");
      out.write("  width:120px;\n");
      out.write("  z-index:10;\n");
      out.write("  animation: bounce 100ms infinite alternate;\n");
      out.write("}\n");
      out.write(".road{\n");
      out.write("  position:absolute;\n");
      out.write("  bottom:2px;\n");
      out.write("  right:inherit;\n");
      out.write("  animation: road 1s ease-out infinite;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes road{\n");
      out.write("  0%{\n");
      out.write("    transform: translateX(0);\n");
      out.write("  }\n");
      out.write("  75%{\n");
      out.write("    opacity:1;\n");
      out.write("  }\n");
      out.write("  100%{\n");
      out.write("    transform: translateX(-250%);\n");
      out.write("    opacity:0;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes size{\n");
      out.write("  from{\n");
      out.write("    transform: scale3d(0.75, 0.75, 0.75);\n");
      out.write("    transform: translateX(-350%);\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  20%{\n");
      out.write("            transform: scale3d(1, 1, 1); \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  to {\n");
      out.write("       transform: scale3d(0.75, 0.75, 0.75);\n");
      out.write("       transform: translateX(-350%);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes bounce{\n");
      out.write("  0%{\n");
      out.write("  transform:translateY(0)\n");
      out.write("  }\n");
      out.write("  100%{\n");
      out.write("    transform:translateY(-1%)\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <!-----Including CSS for different screen sizes----->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"responsiveform.css\">\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen and (max-width: 1200px) and (min-width: 601px)\" href=\"responsiveform1.css\" />\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen and (max-width: 600px) and (min-width: 351px)\" href=\"responsiveform2.css\" />\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen and (max-width: 350px)\" href=\"responsiveform3.css\" />\n");
      out.write("\n");
      out.write("      <!-- JavaScript Code for create new input boxes -->\n");
      out.write("      <script>\n");
      out.write("                             var flag = true;\n");
      out.write("                             var c=0;\n");
      out.write("                             function addTextBox(btn) {\n");
      out.write("                                c++;\n");
      out.write("                              \n");
      out.write("                                var element1 = document.createElement(\"input\");\n");
      out.write("                                var element2 = document.createElement(\"input\");\n");
      out.write("\n");
      out.write("                                element1.setAttribute(\"type\", \"text\");\n");
      out.write("                                element1.setAttribute(\"value\", \"\");\n");
      out.write("                                element1.setAttribute(\"name\", \"sPoint\"+c);\n");
      out.write("                                element1.setAttribute(\"placeholder\",\"Stoppage\");\n");
      out.write("                                element2.setAttribute(\"type\", \"text\");\n");
      out.write("                                element2.setAttribute(\"value\", \"\");\n");
      out.write("                                element2.setAttribute(\"name\", \"Tim\"+c);\n");
      out.write("                                element2.setAttribute(\"placeholder\",\"hh:mm\");\n");
      out.write("\n");
      out.write("                                btn.parentNode.insertBefore(element1, btn);\n");
      out.write("                                \n");
      out.write("                                btn.parentNode.insertBefore(element2, btn);\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            function getCount()\n");
      out.write("                            {\n");
      out.write("                              return c;\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            function Multiple(btn){\n");
      out.write("                               // var f = return myValidation();\n");
      out.write("                               if(myValidation())\n");
      out.write("                               {\n");
      out.write("                                  addTextBox(btn);\n");
      out.write("                               }\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            function myValidation()\n");
      out.write("                            {\n");
      out.write("                               var sPoint = document.forms[\"myForm\"][\"sPoint\"+c];\n");
      out.write("                               var obj = document.forms[\"myForm\"][\"Tim\"+c];\n");
      out.write("                               \n");
      out.write("                               var flag=true;\n");
      out.write("\n");
      out.write("                               if(sPoint.value==\"\"){\n");
      out.write("                                  alert(\"Starting Point cannot be empty\");\n");
      out.write("                                  sPoint.style.border= 2+\"px\"+\" solid red\";\n");
      out.write("                                  flag=false;\n");
      out.write("                               }\n");
      out.write("\n");
      out.write("                                var timeValue = obj.value;\n");
      out.write("                                if(timeValue == \"\" || timeValue.indexOf(\":\")<0)\n");
      out.write("                                {\n");
      out.write("                                    alert(\"Invalid Time format\");\n");
      out.write("                                    obj.style.border=2+\"px\"+\" solid red\";\n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                {\n");
      out.write("                                    var sHours = timeValue.split(':')[0];\n");
      out.write("                                    var sMinutes = timeValue.split(':')[1];\n");
      out.write("\n");
      out.write("                                    if(sHours == \"\" || isNaN(sHours) || parseInt(sHours)>23)\n");
      out.write("                                    {\n");
      out.write("                                        alert(\"Invalid Time format\");\n");
      out.write("                                        obj.style.border=2+\"px\"+\" solid red\";\n");
      out.write("                                    }\n");
      out.write("                                    else if(parseInt(sHours) == 0)\n");
      out.write("                                        sHours = \"00\";\n");
      out.write("                                    else if (sHours <10)\n");
      out.write("                                        sHours = \"0\"+sHours;\n");
      out.write("\n");
      out.write("                                    if(sMinutes == \"\" || isNaN(sMinutes) || parseInt(sMinutes)>59)\n");
      out.write("                                    {\n");
      out.write("                                        alert(\"Invalid Time format\");\n");
      out.write("                                        return false;\n");
      out.write("                                    }\n");
      out.write("                                    else if(parseInt(sMinutes) == 0)\n");
      out.write("                                        sMinutes = \"00\";\n");
      out.write("                                    else if (sMinutes <10)\n");
      out.write("                                        sMinutes = \"0\"+sMinutes;    \n");
      out.write("\n");
      out.write("                                    //obj.value = sHours + \":\" + sMinutes;        \n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                          \n");
      out.write("                               return flag;\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            function validateTime(obj)\n");
      out.write("                            {\n");
      out.write("                                var timeValue = obj.value;\n");
      out.write("                                if(timeValue == \"\" || timeValue.indexOf(\":\")<0)\n");
      out.write("                                {\n");
      out.write("                                    alert(\"Invalid Time format\");\n");
      out.write("                                    return false;\n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                {\n");
      out.write("                                    var sHours = timeValue.split(':')[0];\n");
      out.write("                                    var sMinutes = timeValue.split(':')[1];\n");
      out.write("\n");
      out.write("                                    if(sHours == \"\" || isNaN(sHours) || parseInt(sHours)>23)\n");
      out.write("                                    {\n");
      out.write("                                        alert(\"Invalid Time format\");\n");
      out.write("                                        return false;\n");
      out.write("                                    }\n");
      out.write("                                    else if(parseInt(sHours) == 0)\n");
      out.write("                                        sHours = \"00\";\n");
      out.write("                                    else if (sHours <10)\n");
      out.write("                                        sHours = \"0\"+sHours;\n");
      out.write("\n");
      out.write("                                    if(sMinutes == \"\" || isNaN(sMinutes) || parseInt(sMinutes)>59)\n");
      out.write("                                    {\n");
      out.write("                                        alert(\"Invalid Time format\");\n");
      out.write("                                        return false;\n");
      out.write("                                    }\n");
      out.write("                                    else if(parseInt(sMinutes) == 0)\n");
      out.write("                                        sMinutes = \"00\";\n");
      out.write("                                    else if (sMinutes <10)\n");
      out.write("                                        sMinutes = \"0\"+sMinutes;    \n");
      out.write("\n");
      out.write("                                    obj.value = sHours + \":\" + sMinutes;        \n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                                return true;    \n");
      out.write("                            }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("            <div>\n");
      out.write("            <img src=\"bus2.png\" alt=\"\" class=\"bus\"/>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper-2\">\n");
      out.write("            <img src=\"road.png\" alt=\"\" class=\"road\"/>\n");
      out.write("            </div>\n");
      out.write("            </div>  \n");
      out.write("            <h1>Bus Management System</h1>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"AdminDashboard.jsp\">Home</a>\n");
      out.write("            <a class=\"active\" href=\"CreateRoutes.jsp\">Create Route</a>\n");
      out.write("            <a href=\"DeleteRoute.jsp\">Delete Route</a>\n");
      out.write("            <a href=\"UpdateRoute.jsp\">Update Route</a>\n");
      out.write("            <a href=\"vwRoute\">View Routes</a>\n");
      out.write("            <a href=\"getAllPermission\">New Registration</a>\n");
      out.write("            <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("        </nav>\n");
      out.write("        ");

            RouteInfo ri = (RouteInfo)session.getAttribute("route");
            String st = (String)session.getAttribute("rname");  
            //System.out.println("String : "+st+" "+session.getId());
        
      out.write("\n");
      out.write("        ");

           int c;
        
      out.write("\n");
      out.write("        <div class=\"envelope\">\n");
      out.write("            <form action=\"saveStoppage?id=\" name=\"myForm\" method=\"post\" onsubmit=\"return myValidation()\">\n");
      out.write("                <input type=\"text\" name=\"rName\" placeholder=\"");
      out.print(st);
      out.write("\" value=\"");
      out.print(st);
      out.write("\" readonly=\"readonly\" id=\"nroute\">\n");
      out.write("                <input type=\"text\" name=\"sPoint0\" placeholder=\"Enter Stoppage\">\n");
      out.write("                <input type=\"text\" name=\"Tim0\" placeholder=\"Enter Time (hh:mm)\">\n");
      out.write("                <input type=\"submit\" value=\"Next\" style=\"width:50%;\">\n");
      out.write("            </form>\n");
      out.write("            <form action=\"vwRoute\" name=\"myForm\" method=\"post\">\n");
      out.write("                <input type=\"submit\" value=\"Finish\" style=\"width:50%;\">\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");

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
