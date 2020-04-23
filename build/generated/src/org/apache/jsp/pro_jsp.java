package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <title>Products</title>\n");
      out.write("\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
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
      out.write("                        <li><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></li>\n");
      out.write("                      \n");
      out.write("                        <li><a href=\"logout.html\"><span class=\"glyphicon glyphicon-log-out\">Logout</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron jumbotron_style\">\n");
      out.write("                <h1>Welcome to Angelanu Collections!</h1>\n");
      out.write("                <p> We have the best cameras,watches,gowns and shirts for you.No need to hunt it around,we have all in one\n");
      out.write("                    place.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"padding-20\"></div>\n");
      out.write("            <div class=\"row text-center\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"img/camera.jpg\" alt=\"Nikon\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Nikon NX21</h3>\n");
      out.write("                            <h4>10</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.36000.00</p>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\coolg.jpg\" alt=\"coolglass\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Burberry</h3>\n");
      out.write("                            <h4>11</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.10000.00</p>\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\mobile.jpg\" alt =\"mobile\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>One Plus 7t</h3>\n");
      out.write("                            <h4>12</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.40000.00</p>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\headphone.jpg\" alt=\"headphone\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Audio Technica</h3>\n");
      out.write("                            <h4>13</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.12000.00</p>\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row text-center\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\wwatch.jpg\" alt=\"wwatch\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Titan Raga</h3>\n");
      out.write("                            <h4>14</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.7000.00</p>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\earings.jpg\" alt=\"earings\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Priya Earings collections</h3>\n");
      out.write("                            <h4>15</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.600.00</p>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\heels.jpg\" alt=\"heels\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Marie Claire</h3>\n");
      out.write("                            <h4>16</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.3000.00</p>\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"img/watch4.jpg \" alt=\"Watch\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Diesel 3bar</h3>\n");
      out.write("                            <h4>17</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.3300.00</p>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row text-center\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\homedecor.jpg\" alt=\"homedecor\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>The Wishing Chair</h3>\n");
      out.write("                            <h4>18</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.36000.00</p>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\kitchen.jpg\" alt=\"Kitchen\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Homebase Kitchens</h3>\n");
      out.write("                            <h4>19</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.5000.00</p>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"img/shirt3.jpg\" alt=\"cannon\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Allen Solly</h3>\n");
      out.write("                            <h4>20</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.2900.00</p>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 \">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"C:\\Users\\Anusha\\Downloads\\images\\sary1.jpg\" alt=\"sary\">\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <h3>Deepam sarees</h3>\n");
      out.write("                            <h4>21</h4>\n");
      out.write("                            <p>Add here</p><h4><a href=\"cartinp.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></h4>\n");
      out.write("                            <p>Rs.3000.00</p>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"padding-20\"></div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("          \n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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