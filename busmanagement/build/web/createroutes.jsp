<%-- 
    Document   : createroute
    Created on : 26 Mar, 2019, 1:16:01 PM
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
    height: 500px;
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





</style>
    <link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body>

  <div class="header">
    <h1 class="wow bounceInDown">Bus Management</h1>
    
  </div>
  <div class="demo">
    <a href="home.jsp">Home</a>
    
    <a href="createroutes.jsp">Create Route</a>
    <a href="viewRouteServlet">View Route</a>
    
<!--    <a href="#">Update Route</a>-->
    <a href="DeleteRoute.jsp">Delete Route</a>
    <a href="logmeout.jsp">Log Out</a>
  </div>
  <div class="mid">
    <div id="login-box">
      <div class="left-box">
        <h1>Create Route</h1>
        <form action="saveroute" method="POST" name="myForm" onsubmit="return myValidation()">

		<input type="text" name="Rname" placeholder="Route Name"/>
          <input type="text" name="Regnumber" placeholder="Enter Vehicle Registration number"/>
          <input type="text" name="DName" placeholder="Enter Driver Name"/>

          <input type="text" name="DNumber" placeholder="Enter Driver Number"/>

          <input type="text" name="BName" placeholder="Bus Number"/>

          

 	  <input type="text" name="Spoint" placeholder="Starting Point"/>

	<input type="text" name="Tcost" placeholder="Travelling cost"/>
          
        
         
        
          <input type="submit" name="signup-button" value="Create"/>

          <script type="text/javascript">
                   function myValidation(){
                         
                         var regnumber = document.forms["myForm"]["Regnumber"];
                     var  dName= document.forms["myForm"]["DName"];
                         var dnumber = document.forms["myForm"]["DNumber"];
                          var bname = document.forms["myForm"]["BName"];
                      var bcontact = document.forms["myForm"]["BContact"];
			

                         var flag=true;

				
                 
                               if(regnumber.value==""){
                                  alert("Regnumber cannot be empty");
                                  
                                  flag=false;
                               }
                               if(dName.value==""){
                                  alert("DName cannot be empty");
                                 
                                  flag=false;
                               }
                                if(dnumber.value==""){
                                  alert("DNumber cannot be empty");
                                 
                                  flag=false;
                               }
                                if(bname.value==""){
                                  alert("BName cannot be empty");
                                 
                                  flag=false;
                               }
                                if(bcontact.value=="" || isNaN(bcontact.value)){
                                  alert("BContact cannot be empty or Invalid");
                                 
                                  flag=false;
                               }
                         return flag;
                         }
        </script>
        
        </form>
        </div>
      </div>
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