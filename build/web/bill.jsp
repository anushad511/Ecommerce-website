<%-- 
    Document   : bill
    Created on : 23 Apr, 2020, 12:06:15 AM
    Author     : Anusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title><head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Login</title>

    <link href="style.css" rel="stylesheet">
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
                    <a href="index.html" class="navbar-brand"><b>Angelanu store</b></a>
                </div>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="nav navbar-nav navbar-right">
                      
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <main>
        <div class="container">
            <div class="row row_style">

                <div class="col-xs-5 col-lg-offset-2">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3>Your bill amount</h3>
                        </div>
                        <div class="panel-body">
                    <%@ page import="java.sql.*"%>
        <%@ page import="javax.sql.*"%>
        <%
            try
            {
            
           String price=request.getParameter("price");
          
               Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
      
      Statement stmt=con.createStatement();
    String sql="Select sum(price) from aaproducts";
    ResultSet rs=stmt.executeQuery(sql);
    String Countrun="";
while(rs.next()){
Countrun = rs.getString(1);
out.println("<b><h3>Total amount :</h3></b>" +Countrun);
out.println("<h4><center><a href='pay.jsp'>Confirm Order</center></h4>");
}
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

    %>
  
                    
                    
    </body>
</html>
