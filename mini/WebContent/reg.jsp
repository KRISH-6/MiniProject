<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  heigth:100%;
  margin:0;
}

* {
  box-sizing: border-box;
}

.container {
  position: absolute;
  right: 0;
  max-height: 20px;
  max-width: 400px;
  padding: 16px;
  background-color:transparent;

}
.bg-img {
  background-image: url("https://www.door2door.co.in/blog/wp-content/uploads/2018/03/online-shopping.jpg");

  min-height: 900px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background:white smoke;
}
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}
textarea[type=text] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: white smoke;
  font-family: Arial, Helvetica, sans-serif;

}

textarea[type=text]:focus
{
 background-color:#ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

a {
  color: dodgerblue;
}

.header {
  background-image:url("https://cdn.dnaindia.com/sites/default/files/styles/full/public/2018/03/30/666686-online-shopping-tt.jpg");
  padding: 20px;
  text-align: center;
  color:chocolate;
}
</style>
</head>
<body>


<div class="header"><h1 ><b>en ligne achats</b></h1></div>

<div class="bg-img">

  <form action="Mainprog" class="container" method="post">
     
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    <div>
    <table>
    <tr>
    <td><b>Name</b></td>
    <td><input type="text" placeholder="Enter Name" name="username"  required></td>
    </tr>
    <tr>
    <td><b>Email</b></td>
    <td><input type="text" placeholder="Enter Email" name="mail"  required></td>
    </tr>
    <tr>
    <td><b>Address</b></td>
   <td><textarea rows="3" cols="50" type="text" placeholder="Enter Address" name="address"></textarea></td>
</tr>
   <tr>
   <td><b>Area</b></td>
   <td><select name="area" >
<option value="o1">Select your area</option>
<option value="o2">Chennai</option>
<option value="o3">Thiruvalur</option>
<option value="o4">Ambattur</option>
<option value="o5">Avadi</option>
</select></td>
</tr>
  <tr>
    <td><b>Password</b></td>
    <td><input type="password" placeholder="Enter Password" name="password"  required></td>
</tr>
</table>
</div>
<hr>
   
    <button type="submit" class="registerbtn">Register</button>
    <p>Already have an account? <a href="login.html">Login</a></p>

</div>
</form>
</body>
</html>
    