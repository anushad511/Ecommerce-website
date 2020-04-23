<%-- 
    Document   : signup
    Created on : 20 Apr, 2020, 9:56:59 PM
    Author     : Anusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="style.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Login</title>
<div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="nav navbar-nav navbar-right">
                        
                        <li><a href="index.html"><span class="glyphicon glyphicon-log-in"> Logout</span></a></li>
                    </ul>
                </div>
                      
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <main>
      
                       
      
       

   
                
                       
      
        
  
    <body>
        
       <%@page import ="java.sql.*"%>
      <%@page import="javax.sql.*"%>
      <%
          String name=request.getParameter("name");
           String email=request.getParameter("email");
           String pwd=request.getParameter("pwd");
           String contact=request.getParameter("contact");
           String city=request.getParameter("city");
           String state=request.getParameter("state");
      Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
      
      Statement stmt=con.createStatement();
   ResultSet rs;
   int i=stmt.executeUpdate("insert into aausers(name,email,pwd,contact,city,state)"
           + " values('"+name+"','"+email+"','"+pwd+"','"+contact+"','"+city+"','"+state+"')");
  response.sendRedirect("login.html");
   %>
  
    </body>
</html>
