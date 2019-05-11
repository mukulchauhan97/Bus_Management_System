

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> route </title>   
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
    <h1>Bus Management</h1>
    
  </div>
  <div class="demo">
    <a href="#">Home</a>
    
    <a href="createroutes.jsp">Create Route</a>
    <a href="#">View Route</a>
    <a href="#">New Registration</a>
    <a href="#">Log Out</a>
      
  </div>
  <div class="mid">
    <div id="login-box">
      <div class="left-box">
        <h1>Add Stoppage</h1>
        <form action="routeServlet" method="POST">

          <input type="text" name="rc" placeholder="Route code"/>

          <input type="text" name="rn" placeholder="Route Name"/>
          
          <input type="text" name="pp" placeholder="Pick-UP Point"/>
          
          <input type="text" name="dn" placeholder="Driver Name"/>
          
          <input type="text" name="des" placeholder="Destination"/>
          
          <input type="text" name="time" placeholder="Time"/>

          
         

          <input type="submit" name="signup-button" value="Finish"/>
        
        </form>
        </div>
      </div>
  </div>
  
  <div class="footer">@All rights reserved</div>


   
    
</body>    
</html>
