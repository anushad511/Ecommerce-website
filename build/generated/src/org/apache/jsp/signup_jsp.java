package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <title>Login</title>\n");
      out.write("<div class=\"collapse navbar-collapse\" id=\"mynavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"index.html\"><span class=\"glyphicon glyphicon-log-in\"> Logout</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row row_style\">\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-5 col-lg-offset-2\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h2>Registered</h2>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("      \n");
      out.write("       \n");
      out.write("\n");
      out.write("   \n");
      out.write("                \n");
      out.write("                       \n");
      out.write("      \n");
      out.write("        \n");
      out.write("  \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("      \n");
      out.write("      ");

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
  
   
      out.write("\n");
      out.write("    <center> <a href=\"login.html\"><h2><b>Login</b></h1></a>\n");
      out.write("   <br>\n");
      out.write("   <a href=\"index.html\"><h2><b>Home</b></h2></a></center>\n");
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
