<%-- 
    Document   : logmeout
    Created on : 28 Mar, 2019, 3:18:38 PM
    Author     : Intel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
   session.invalidate();
   response.sendRedirect("log.jsp");
%>
