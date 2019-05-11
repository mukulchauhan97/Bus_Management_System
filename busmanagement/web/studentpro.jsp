<%-- 
    Document   : studentpro
    Created on : 28 Mar, 2019, 1:40:48 PM
    Author     : Intel
--%>
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



<%@page import="model.sign1"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> route </title>  
<link rel="stylesheet" href="css/animate.css"> 
<style type="text/css">
  body
{
    margin: 0;
    padding: 0;
    background: #efefef;
    font-size: 16px;
    color: #777;
    
    font-weight: 300;
}

.header{
      display: flex;
      justify-content: center;
      background-color: lightgrey;
      height: 100px;
      
      align-items: center;
      color: dodgerblue;
    }

    .header h1
{
    margin: 0 0 20px 0;
    font-weight: bold;
    font-size: 2em;
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

    .container{
      display: flex;
      background-color: grey;
      color: #f1f1f1;
      height: 700px;
    }

    .left{
      flex: 1;
      background-color: grey;


    }
    .right{
      flex: 2;
      background-color: powderblue;
    }

    .footer{
/*      display: flex;
*/      height: 50px;
      background-color: lightgrey;
      text-align: center;
        padding: 70px;      
    }

    .lef{
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 12px;
      height: 250px;
      background-color: white;
      margin: 15px;
    }

    .rig{
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 12px;
      height: 250px;
      background-color: white;
      margin: 15px;
    }

    .mid{
      display: flex;
      height: 600px;
      background-repeat: no-repeat;
      background-image: url(setra-topclass-500-w820xh328-cutout.jpg);

      background-size: cover;
      background-position: center;
      background-repeat: no-repeat;

    }
     image{
      
      width: 100%;
    }

#login-box
{
    position: relative;
    margin: 5% auto;
    height: 450px;
    width: 400px;
    color: white;
    background: rgba(0, 0, 0, 0.5);
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.6);
}

.left-box
{
    position: absolute;
    top: 0;
    left: 0;
    box-sizing: border-box;
    padding: 40px;
    width: 300px;
    height: 400px;    
}

h1
{
    margin: 0 0 20px 0;
    font-weight: 300;
    font-size: 28px;
}

input[type="text"],
input[type="password"]
{
    display: block;
    box-sizing: border-box;
    margin-bottom: 20px;
    padding: 4px;
    width: 320px;
    height: 32px;
    border: none;
    border-radius: 10px;
    outline: none;
    border-bottom: 1px solid #aaa;
    font-family: sans-serif;
    font-weight: 400;
    font-size: 15px;
    transition: 0.2s ease;
}

input[type="submit"]
{
    margin-bottom: 28px;
    width: 120px;
    height: 32px;
    background: #f44336;
    border: none;
    border-radius: 2px;
    color: #fff;
    font-family: sans-serif;
    font-weight: 500;
    text-transform: uppercase;
    transition: 0.2s ease;
    cursor: pointer;
    
}

input[type="submit"]:hover,
input[type="submit"]:focus
{
    background: #ff5722;
    transition: 0.2s ease;
}



/* table start */

@media screen and (max-width: 600px) {
  .mid table {
    border: 0;
  }

  .mid table caption {
    font-size: 1.3em;
  }
  
 .mid  table thead {
    border: none;
    clip: rect(0 0 0 0);
    height: 1px;
    margin: -1px;
    overflow: hidden;
    padding: 0;
    position: absolute;
    width: 1px;
  }
  
  .mid table tr {
    border-bottom: 3px solid #ddd;
    display: block;
    margin-bottom: .625em;
  }
  
  .mid table td{
    border-bottom: 1px solid #141111cc;
    display: block;
    font-size: .8em;
    text-align: right;
  }
  .mid table td a{
    border-bottom: 1px solid #ddd;
    display: block;
    font-size: .8em;
    text-align: center;
  }
  
  .mid table td::before {
    /*
    * aria-label has no advantage, it won't be read inside a table
    content: attr(aria-label);
    */
    content: attr(data-label);
    float: left;
    font-weight: bold;
    text-transform: uppercase;
  }
  
  .mid table td:last-child {
    border-bottom: 0;
  }
}


.mid table {
  width:100%;


}
.mid table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  margin-top: 200px;

}
.mid table th, td {
  padding: 15px;
  text-align: center;
}
.mid table#t01 tr:nth-child(even) {
  background-color: #eee;
}
.mid table#t01 tr:nth-child(odd) {
 background-color: #fff;
}
.mid table#t01 th {
  background-color: black;
  color: white;
}





</style>
    <link rel="stylesheet" type="text/css" href="">
</head>
<body>

  <div class="header">
    <h1 class="wow bounceInDown">Bus Management</h1>
    
  </div>
  <div class="demo">
    <a href="studenthome.jsp">Home</a>
    <%
                   String rno = (String) session.getAttribute("uname");
                   System.out.println(rno);
                %>
		<a href="stuprofile?rno=<%= rno %>">Profile</a>
		<a href="stuRoute?ro=<%= rno %>">View Route</a>
		
    <a href="logmeout.jsp">Log Out</a>
      
  </div>
  <div class="mid">

    <table id="t01">
        <%
            ArrayList<sign1> sd = (ArrayList<sign1>)session.getAttribute("stuinfo");  
            if(sd!=null && sd.size()!=0){
                System.out.println("inn"+sd.size());
        %>
  <tr>
    <th>Sno.</th>
    <th>Roll Number</th> 
    <th>Name</th>
    <th>Mobile</th>
    <th>Pick Up Point</th>
    <th>Route</th>
    <%
       session.setAttribute("rname",sd.get(0).getRoutename());
       for(int i=0;i<sd.size();i++){     
    %>
  </tr>
  <tr>
    <td><%= i+1%></td>
    <td><%= sd.get(i).getRno() %></td>
    <td><%= sd.get(i).getFname() + " " +sd.get(i).getLname() %></td>
    <td><%= sd.get(i).getMobile() %></td>
    <td><%= sd.get(i).getPp() %></td>
    <td><%= sd.get(i).getRoutename() %></td>
  </tr>
  <%
      }
}
else{
   %>
   <tr>Nothing to show</tr>
   <%
       }
       %>
</table>
    
  </div>
  
  <div class="footer">@All rights reserved</div>
 

   
    <script src="js/wow.min.js"></script>
              <script>
              new WOW().init();
              </script>
</body>    
</html>


<%
  }  
%>