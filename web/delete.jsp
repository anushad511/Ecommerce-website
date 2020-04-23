<%-- 
    Document   : delete
    Created on : 22 Apr, 2020, 6:44:16 PM
    Author     : Anusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete page</title>
        <head>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Products</title>

    <link href="style.css" rel="stylesheet"
    </head>
<body>
    <header>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mynavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="index.html" class="navbar-brand"><b>AngelAnu stores</b></a>
                </div>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="nav navbar-nav navbar-right">

                        <li><a href="showcart.jsp"><span class="glyphicon glyphicon-shopping-cart">Cart</span></a></li>
                      
                        <li><a href="logout.html"><span class="glyphicon glyphicon-log-out">Logout</span></a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
  
    
        <main>
        <div class="container">
            <div class="jumbotron jumbotron_style">
                <h1>Deleted</h1>
                <h4> <a href='pro.jsp'>Continue shopping</h4>
            </div>
          
        <%@page import="java.sql.*"%>
        <%@page import="javax.sql.*"%>
        <%
            
            String pid=request.getParameter("pid");
          try
          {
            Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
      
      Statement stmt=con.createStatement();
   int i=stmt.executeUpdate("delete from aaproducts where pid="+pid);
   
   
            
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
   %>
    </body>
</html>
