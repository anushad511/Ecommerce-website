<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  
    <title>Products</title>

    <link href="style.css" rel="stylesheet"
    </head>
<body>
    
  
       
  
        
    
    
       <%@page import ="java.sql.*"%>
      <%@page import="javax.sql.*"%>
      <%
          String pid=request.getParameter("pid");
           String pname=request.getParameter("pname");
           String price=request.getParameter("price");
         
      Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
      
      Statement stmt=con.createStatement();
   ResultSet rs;
    int i=stmt.executeUpdate("insert into aaproducts values('"+pid+"','"+pname+"','"+price+"')");
    response.sendRedirect("pro.jsp");
   
    
   
%>