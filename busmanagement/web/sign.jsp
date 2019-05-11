<%-- 
    Document   : sign
    Created on : 28 Mar, 2019, 10:30:21 AM
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
<html>  
   <head>
        <title>Sign Up</title>    
    <style>
    
        *{
            margin: 0; 
            padding: 0;
        }
        body{
              background-image: url(setra-topclass-500-w820xh328-cutout.jpg);
              -webkit-background-size:cover;
              background-size: cover;
              background-position: center center;
              background-repeat: repeat;
              background-attachment: fixed;
              background-color: #999;
              height: 100%;
              margin: 0;
              font-family: Arial, Helvetica, sans-serif;
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
    color: dodgerblue;
}

.form-wrap
{
  position: absolute;
  top: 75%;
  left: 50%;
  transform: translate(-50%,-50%);
  width: 350px;
  height: 630px;
  padding: 80px 40px;
  box-sizing: border-box;
  background: rgba(0,0,0,.5);
}
        
        /*.form-wrap{ 
            width: 420px; 
            height:733px;
                background: rgba(0, 0, 0, 0.19);
            padding: 40px 20px; 
            border-radius: 9px;
            box-sizing: border-box; 
            position: absolute; 
            left: 50%; 
            top: 80%; 
            transform: translate(-50%, -50%);
        }*/
        
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

        h1{
            text-align: center; 
            color: #fff; 
            font-weight: normal; 
            margin-bottom: 20px;
        }
        
        input{
            width: 100%; 
            background: transparent; 
            border: 1px solid #f1f1f1; 
            border-radius: 3px; 
            padding: 6px 15px; 
            box-sizing: border-box; 
            margin-bottom: 20px; 
            font-size: 16px; 
            color: #fff;
        }

        .form-wrap select
        {
            border: 1px solid #f1f1f1; 
            border-radius: 3px; 
            padding: 6px 15px; 
            box-sizing: border-box; 
            margin-bottom: 20px; 
            background: none;
            outline: none;
            width:100%;
            color:#fff;
            height: 40px;
            font-size: 16px;
        }

        .form-wrap option{
            color:black;
        }

        .form-wrap option[value=""][disabled] {
          display: none;
        }

        input[type="submit"]{ 
            background: dodgerblue;
            border: 0; 
            cursor: pointer; 
            color: white;
        }
        input[type="button"]:hover{ 
            background: #a4b15c; 
            transition: .6s;
        }
        
        ::placeholder{
            color: #fff;
        }

        .form-wrap a
        {
          color: #fff;
          font-size: 14px;
          font-weight: bold;
          text-decoration: none;
        }
      
    </style>

    <script type="text/javascript">
                             function myValidation(){
                               var fname = document.forms["myForm"]["fname"];
                               var lname = document.forms["myForm"]["lname"];
                               var branch = document.forms["myForm"]["branch"];
                               var rno = document.forms["myForm"]["rno"];
                               var email = document.forms["myForm"]["email"];
                               var pwd = document.forms["myForm"]["pwd"];
                               var cpwd = document.forms["myForm"]["cpwd"];
                               var stat = document.forms["myForm"]["status"];
                               var pick = document.forms["myForm"]["PickUppoint"];
                               var mob = document.forms["myForm"]["mobile"];
                               var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                               var flag=true;
                               
                               if(fname.value==""){
                                  alert("First Name cannot be empty");
                                  fname.style.border= 2+"px"+" solid red";
                                  flag=false;
                               }

                               if(lname.value==""){
                                  alert("Last Name cannot be empty");
                                  lname.style.border= 2+"px"+" solid red";
                                  flag=false;
                               }

                               if(branch.value=="" || !(branch.value=="CSE" || branch.value=="ECE" || branch.value=="CE" || branch.value=="ME" )){
                                  alert("Branch is Invalid or Empty");
                                  branch.style.border= 2+"px"+" solid red";
                                  flag=false;
                               }

                               if(rno.value==""){
                                alert("Roll No. cannot be empty");
                                flag=false;
                                rno.style.border= 2+"px"+" solid red";
                               }

                               if(email.value==""|| !(email.value.match(mailformat)))
                               {
                                 alert("Email cannot be Empty or Invalid");
                                 email.style.border = 2+"px"+" solid red";
                                 flag=false;
                               }

                               if(pick.value=="" || !(pick.value=="Panchkula" || pick.value=="Zirakpur" || pick.value=="Dhakoli" || pick.value=="Amravati" || pick.value=="Pinjore" || pick.value=="HMT")){
                                  alert("Pick-Up Point is Invalid");
                                  pick.style.border= 2+"px"+" solid red";
                                  flag=false;
                               }

                               if(pwd.value==""){
                                  alert("Password cannot be Empty");
                                  pwd.style.border= 2+"px"+" solid red";
                                  flag=false;
                               }

                               if(cpwd.value==""){
                                  alert("Conform Password cannot be Empty");
                                  cpwd.style.border= 2+"px"+" solid red";
                                  flag=false;
                               }

                               if(pwd.value!=cpwd.value){
                                  alert("Password and Conform Password must be same");
                                  pwd.style.border= 2+"px"+" solid red";
                                  cpwd.style.border= 2+"px"+" solid red";
                                  flag=false;
                               }

                               if(mob.value=="" || mob.value.length !=10)
                               {
                                  alert("Mobile Number is Invalid");
                                  mob.style.border=2+"px"+" solid red";
                                  flag=false;
                               }

                               if(stat.value=="" || !(stat.value=="student" || stat.value=="faculty" || stat.value=="admin")){
                                  alert("Status is Invalid");
                                  stat.style.border= 2+"px"+" solid red";
                                  flag=false;
                               }


                               return flag;
                             }
    </script>

    

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
        <div class="form-wrap">
        
            <form action="signServlet" name="myForm" method="post" onsubmit="return myValidation()">
                <h1>New Registration</h1>
                <input type="text" name="fname" placeholder="First Name">
                <input type="text" name="lname" placeholder="Last Name">
                <input type="text" name="rno" placeholder="Roll Number OR EmpId">
                
                <input type="text" name="email" placeholder="Email">
                
                <select name="pp">
                <option value="default" disabled selected>PickUp Point</option>
                <option value="Panchkula">Panchkula</option>
                <option value="Zirakpur">Zirakpur</option>
                <option value="Dhakoli">Dhakoli</option>
                <option value="Amravati">Amravati</option>
                <option value="HMT">HMT</option>
                <option value="Pinjore">Pinjore</option>
                </select> 
                <input type="text" name="mobile" placeholder="Mobile Number">
                <input type="password" name="pwd" placeholder="Password">
                <input type="password" name="cpwd" placeholder="Confirm Password">
                <input type ="text" name ="routename" placeholder="Route ID">
                <input type="submit" value="Register">
<!--                <a href="Log.html">A Member ? Login Here</a>-->
            </form>
        
        </div>
    
    
    
    </body>



</html>

<%
  }  
%>