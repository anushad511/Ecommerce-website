<%-- 
    Document   : showcart
    Created on : 22 Apr, 2020, 3:54:00 PM
    Author     : Anusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                      
                        <li><a href="index.html"><span class="glyphicon glyphicon-log-out">Logout</span></a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <main>
        <div class="container">
            <div class="row row_style">

      
                    <div class="panel panel-primary">
    
        <%@ page import="java.sql.*"%>
        <%@ page import="javax.sql.*"%>
        
        <center><h2>Your Shopping Cart</h2></center>
    <table align="center" cellpadding="10" cellspacing="12" border="1">
        
        
        <tr>
            
        </tr>
        <tr bgcolor="cyan">
            <td><b>Product id</b></td>
            <td><b>Product name</b></td>
            <td><b>Product Price</b></td>
        </tr>
        <%
        try
        {
        
        
            String pid=request.getParameter("pid");
           String pname=request.getParameter("pname");
           String price=request.getParameter("price");
          
               Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
      
      Statement stmt=con.createStatement();
    String sql="Select * from aaproducts";
    ResultSet rs=stmt.executeQuery(sql);
    while(rs.next())
    {
        %>
        <tr>
            
            <td><b><%=rs.getString("pid")%></b></td>
            <td><b><%=rs.getString("pname")%></b></td>
            <td><b><%=rs.getString("price")%></b></td>
            <td><a href="delete.jsp?pid=<%=rs.getString("pid") %>"><button type="button" class="delete">Delete</button></a></td>

        </tr>
        
        <%
            }
}
catch(Exception e)
{
e.printStackTrace();
       
    }
%>

    </table>
    
            
 <center><h3><a href='bill.jsp'>Click here to place the order</a></h3></center>
    </body>
</html>
