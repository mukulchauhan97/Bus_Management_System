<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Login Form</title>
		<style type="text/css">
body {
  background: url(setra-topclass-500-w820xh328-cutout.jpg) no-repeat center center fixed;
  background-size: cover;
  height: 100%;
  overflow: hidden;
font-family: sans-serif;
}

.loginBox
{
	position: absolute;
	top: 50%;
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
	</style>
	</head>
	<body>
		<div class="loginBox">
			    <img src="avatar.png" class="user">
			    <h2>Login Here</h2>
                <form name="myForm" method="post" action="Userlog" onsubmit="return myValidation()">
				<p>Username</p>
				<input type="text" name="uname" placeholder="Enter Username">
				<p>Password</p>
                <input type="password" name="pass" placeholder="Enter Password">
                <p>Select Status</p><p>  </p>
                <select name="status">
                <option value="default" disabled selected>Status</option>
                <option value="student">Student</option>
                <option value="faculty">Faculty</option>
                <option value="admin">Admin</option>
                </select><br><br>							
				<input type="submit" name=""   value="Login">
				<script type="text/javascript">
					         function myValidation(){
 			                   var uname = document.forms["myForm"]["uname"];
 					           var pwd = document.forms["myForm"]["pass"];
 			                   var stat = document.forms["myForm"]["status"];
 			                   var flag=true;
 							   
                               if(uname.value==""){
                               	  alert("UserName cannot be empty");
                               	  
                               	  flag=false;
                               }
                               if(pwd.value==""){
                               	  alert("Password cannot be empty");
                               	 
                               	  flag=false;
                               }
                               if(stat.value=="" || !(stat.value=="student" || stat.value=="faculty" || stat.value=="admin")){
                               	  alert("Status is Invalid");
                               	  
                               	  flag=false;
                               }
 			                   return flag;
 		                     }
				</script>
			</form>
		</div>
	</body>
</html>