

<%@page import="java.util.List"%>
<%@page import="model.route"%>

<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
    
    if(request.getSession().getAttribute("uname")==null)
    {
%>
<script>
        location = "log.jsp";
    </script>
    <%
    }
    else
    {
    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
               <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
            body 
            {
                background-image: url("oi1.jpg");
                background-repeat: no-repeat;
            }
             .header 
          {
              height: 100px;
              background-color: red;
              color: white;
            
              
              font-size: 20px;
              width: 600px;
              position: relative;
              left: 330px;
              top: 50px;
              flex-wrap: wrap;
              border: 3px solid white;
              box-shadow: 10px 10px 10px white;
          }
         .main
         {
             background-color: black;
             height: 200px;
             display: flex;
             border: 2px solid black;
             flex-wrap: wrap;
             
         }
         #customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 3px solid black;
    padding: 20px;
}

#customers tr:nth-child(even){background-color: white;}

#customers tr:hover {background-color: #303952;color: white;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: dodgerblue;
    color: white;
}
.head 
{
	display: flex;
	justify-content: center;
	align-items: center;
/*	background-color:#16d1ef;*/
        background-color: lightgrey;
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
}

.demo{
			display: flex;
			background-color: black;

		}

		.demo a{
			width: 20%;
			color: #f1f1f1;
			text-decoration: none;
			padding: 12px 14px;
			text-align: center;
			

		}

		.demo a:hover{
			background-color: #999;
			color: #333;
		}
         </style>
    </head>
    <body>
        <div class="head">
             <b>Route Details</b>
        </div> <br>
        
        <div class="demo">
		<a href="studenthome.jsp">Home</a>
                <%
                   String rno = (String) session.getAttribute("uname");
                   System.out.println(rno);
                %>
		<a href="stuprofile?rno=<%= rno %>">Profile</a>
		<a href="stuRoute?ro=<%= rno %>">View Route</a>
                <a href="search.jsp">Search</a>
                <a href="logmeout.jsp">Log Out</a>
	    
        </div><br>
        
        <div class="cont">
            <table class="table table-dark table-hover">
<tr>
    <th><B>Route Code</b></th>
    <th><B>Route Name</b></th>
    <th><b>Pick-Up-Point</b></th>
    <th><b>Destination</b></th>
    <th><b>Driver Name</b></th>
   
    <th><B>Time</b></th>
    
</tr>
<%
   List<route> records =  (List<route>)session.getAttribute("lrecords");
   System.out.print(records); 
   if(records!=null){
   for(route s: records)
   {

     
%>
<tr>
<td><%=s.getRcode()%></td>
<td><%=s.getRname()%></td>
<td><%=s.getPpoint()%></td>
<td><%=s.getDestination()%></td>
<td><%=s.getDname()%></td>
<td><%=s.getTime()%></td>
</tr>
<%
}
}
else{
%>
<tr>
    <td>Nothing to display</td>
</tr>
<%
    }
%>
</table>
            
            
        </div>
    </body>
</html>

<%
  }  
%>
