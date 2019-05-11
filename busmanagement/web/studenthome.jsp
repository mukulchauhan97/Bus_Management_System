<%-- 
    Document   : home
    Created on : 26 Mar, 2019, 9:48:02 AM
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
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>main</title>
		<link rel="stylesheet" href="css/animate.css">
	<style type="text/css">
	body{
		
		width: 100%;
		height: 100%;
		padding: 0;
		margin: 0px;


	}
		.container{
			display: flex;
			justify-content: center;
			background-color: lightgrey;
			height: 100px;
			align-items: center;
			color: dodgerblue;

		}

		.wrapper{
			display: flex;
			background-color: grey;
		}

		.wrapper img{
			height: 100px;
			position: absolute;
			top: 0px;
			left: 0px;
			

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

		.mid{
			display: flex;
			height: 500px;
			background-repeat: no-repeat;
		}
		.mid img{
			width: 100%;
		}

		.animate_image{
			width: 150px;
			
			margin: auto;

		}

		.animate_image img{
			height: 200px;
			width: 200px;
			cursor: pointer;
		}

		h3{
			
			text-align: center;
		}

		.welcome p{
			display: flex;
			text-align: center;
			margin: auto;
			
		}

	   .div_text{
	   	display: flex;
	   	
	   	width: 290px;
	   	height: 300px;
	   	margin: 75px;
	    display: inline-block;

	   	

	   }

	   .contact_image
	   {
	   	  width: 150px;
			
			margin: auto;
	   }


	   .contact_image img{
			height: 90px;
			width: 90px;
			cursor: pointer;
		}

		.footer{
/*			display: flex;
*/			height: 40px;
			background-color: lightgrey;
			text-align: center;
    		padding: 70px;			
		}



	</style>
</head>
<body>

	<div class="container">
		<h1 class="wow bounceInDown">Bus Management</h1>
		</div>
		<div class="wrapper">
			<img src="school-bus.png">
		</div>
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
	    
	</div>

	<div class="mid"><img src="setra-topclass-500-w820xh328-cutout.jpg"></div>

	<div class="animate_image">
		<img src="bus.png" onmouseover="this.src='bus2.png'" onmouseout="this.src='bus.png'">
	</div>


	<div class="">
		<div class="welcome">
			<h3>Welcome to Our Website</h3>
			<p>
				Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
			tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
			quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
			consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
			cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
			proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
			</p>

			
		</div>
	</div>

	<div class="div_text">
		
		<h3>Our Services</h3>

		<div class="contact_image" >
			<img src="contact.png" onmouseover="this.src='contact2.png'" onmouseout="this.src='contact.png'">
		</div>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>

			<div class="div_text">
				<h3>Our Services</h3>

				<div class="contact_image" >
			<img src="complain.png" onmouseover="this.src='complain1.png'" onmouseout="this.src='complain.png'">
		</div>

				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>

			<div class="div_text">
				<h3>Our Services</h3>
				<div class="contact_image" >
			<img src="smartphone1.png" onmouseover="this.src='smartphone.png'" onmouseout="this.src='smartphone1.png'">
		</div>

				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
			</div><br><br><br>



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