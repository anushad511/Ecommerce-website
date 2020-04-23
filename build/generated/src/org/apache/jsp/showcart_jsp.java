package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class showcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <title>Products</title>\n");
      out.write("\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\"\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#mynavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"index.html\" class=\"navbar-brand\"><b>AngelAnu stores</b></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"mynavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                        <li><a href=\"showcart.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></li>\n");
      out.write("                      \n");
      out.write("                        <li><a href=\"logout.html\"><span class=\"glyphicon glyphicon-log-out\">Logout</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row row_style\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <center><h2>Your Shopping Cart</h2></center>\n");
      out.write("    <table align=\"center\" cellpadding=\"10\" cellspacing=\"12\" border=\"1\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        <tr bgcolor=\"cyan\">\n");
      out.write("            <td><b>Product id</b></td>\n");
      out.write("            <td><b>Product name</b></td>\n");
      out.write("            <td><b>Product Price</b></td>\n");
      out.write("        </tr>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("            <td><b>");
      out.print(rs.getString("pid"));
      out.write("</b></td>\n");
      out.write("            <td><b>");
      out.print(rs.getString("pname"));
      out.write("</b></td>\n");
      out.write("            <td><b>");
      out.print(rs.getString("price"));
      out.write("</b></td>\n");
      out.write("            <td><a href=\"delete.jsp?pid=");
      out.print(rs.getString("pid") );
      out.write("\"><button type=\"button\" class=\"delete\">Delete</button></a></td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        ");

            }
}
catch(Exception e)
{
e.printStackTrace();
       
    }

      out.write("\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("            \n");
      out.write(" <center><h3><a href='bill.jsp'>Click here to pay the bill</a></h3></center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
