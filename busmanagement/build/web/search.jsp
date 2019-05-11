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


<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="css/animate.css">
	<style type="text/css">

	body{
		margin: 0;
	}
		.header{
			display: flex;
			justify-content: center;
			background-color: lightgrey;
			height: 100px;
			align-items: center;
			color: dodgerblue;
		}
                
                .loginBox
{
	position: absolute;
	top: 60%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 350px;
	height: 420px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
}
.user
{
	width: 100px;
	height: 100px;
	border-radius: 50%;
	overflow: hidden;
	position: absolute;
	top: calc(-100px/2);
	left: calc(50% - 50px);
}
h2
{
	margin: 0;
	padding: 0 0 20px;
	color: white;
	text-align: center;
}
.loginBox p
{
	margin: 0;
	padding: 0;
	font-weight: bold;
	color: #fff;
}
.loginBox input
{
	width: 100%;
	margin-bottom: 20px;
}
.loginBox input[type="text"],
.loginBox input[type="password"]
{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}
.loginBox select
{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	width:100%;
	color:#fff;
	height: 40px;
	font-size: 16px;
}
.loginBox option{
	color:black;
}
.loginBox option[value=""][disabled] {
  display: none;
}
::placeholder
{
	color: rgba(255,255,255,.5);
}
.loginBox input[type="submit"]
{
	border: none;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
	background: dodgerblue;
	cursor: pointer;
	border-radius: 20px;
}
.loginBox input[type="submit"]:hover
{
	background: #39dc79;
	color: #262626;
        
}
.loginBox a
{
	color: #fff;
	font-size: 14px;
	font-weight: bold;
	text-decoration: none;
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
/*			display: flex;
*/			height: 50px;
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
			height: 500px;
			background-repeat: no-repeat;
		}
		.mid img{
			width: 100%;
		}

	</style>
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
                <a href="search.jsp">Search</a>
                <a href="logmeout.jsp">Log Out</a>
	    
	</div>
    
    <div class="loginBox">
<!--			    <img src="" class="user">-->
			    <h2>Search</h2>
                <form name="myForm" method="post" action="searchbus" onsubmit="return myValidation()">
				<p>Route Code</p>
				<input type="text" name="rcode" placeholder="Enter Route Code">
<!--				<p>Route Name</p>
                                <input type="text" name="pass" placeholder="Enter Route Name">-->
				<input type="submit" name=""  action="same.html" value="Search">
				<script type="text/javascript">
					         function myValidation(){
// 			                   var uname = document.forms["myForm"]["uname"];
// 					           var pwd = document.forms["myForm"]["pass"];
// 			                   var stat = document.forms["myForm"]["status"];
 			                   var flag=true;
// 							   
//                               if(uname.value==""){
//                               	  alert("UserName cannot be empty");
//                               	  
//                               	  flag=false;
//                               }
//                               if(pwd.value==""){
//                               	  alert("Password cannot be empty");
//                               	 
//                               	  flag=false;
//                               }
//                               if(stat.value=="" || !(stat.value=="student" || stat.value=="faculty" || stat.value=="admin")){
//                               	  alert("Status is Invalid");
//                               	  
//                               	  flag=false;
//                               }
 			                   return flag;
 		                     }
				</script>
			</form>
		</div>
	<div class="mid"><img src="setra-topclass-500-w820xh328-cutout.jpg">
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