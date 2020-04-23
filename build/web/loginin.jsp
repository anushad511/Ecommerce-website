<%-- 
    Document   : loginin.jsp
    Created on : 20 Apr, 2020, 11:45:39 PM
    Author     : Anusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title></title>
    <link href="style.css" rel="stylesheet">

</head>

<body>
    <header>
        <nav class="navbar  navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mynavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="index.html" class="navbar-brand"><b>Angelanu stores</b></a>
                </div>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="sign.html"><span class="glyphicon glyphicon-user">SignUp</span></a></li>
                        <li><a href="login.html"><span class="glyphicon glyphicon-log-in">Login</span></a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <main>
        
    
        <main>
        <div class="container">
            <div class="row row_style">

                <div class="col-xs-5 col-lg-offset-2">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h2></h2>
                        </div>
                        <div class="panel-body">
                            <h1 class="text-warning">Invalid email or password</h1>
    <h2><a href=login.html>Go back</a></h2>                        
                            <form action="loginin.jsp" method="post">
        <%@page import ="java.sql.*"%>
      <%@page import="javax.sql.*"%>
       
        <%
           String email=request.getParameter("email");
            String pwd=request.getParameter("pwd");
            Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
      
     Statement stmt=con.createStatement();
   ResultSet rs=stmt.executeQuery("select email,pwd from aausers where pwd='"+pwd+"'");
   
   
   if(rs.next())
   {
       if(rs.getString(2).equals(pwd))
       {
            response.sendRedirect("pro.jsp");
            
       }
   }
       else
       {
          out.println("<center><b><h1></h1></b></center>");
    
       }
   
        
       %>
    
   
             
            
            
            
        
       
    </body>
</html>
