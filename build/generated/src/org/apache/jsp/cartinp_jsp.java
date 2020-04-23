package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartinp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <li><a href=\"showcart.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\">Cart</span></a></li>\n");
      out.write("                      \n");
      out.write("                        <li><a href=\"logout.html\"><span class=\"glyphicon glyphicon-log-out\">Logout</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("<main>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row row_style\">\n");
      out.write("                <div class=\"col-xs-5 col-lg-offset-2\">\n");
      out.write("                    <form action=\"cartdb.jsp\" method=\"post\">\n");
      out.write("                        <h2>Enter Product Details here</h2>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pid\"><h4>Choose the pid: </h4></label>\n");
      out.write("  <select id=\"pid\" name=\"pid\">\n");
      out.write("    <option value=\"10\">10</option>\n");
      out.write("    <option value=\"11\">11</option>\n");
      out.write("    <option value=\"12\">12</option>\n");
      out.write("    <option value=\"13\">13</option>\n");
      out.write("    <option value=\"14\">14</option>\n");
      out.write("    <option value=\"15\">15</option>\n");
      out.write("    <option value=\"16\">16</option>\n");
      out.write("    <option value=\"17\">17</option>\n");
      out.write("    <option value=\"18\">18</option>\n");
      out.write("    <option value=\"19\">19</option>\n");
      out.write("    <option value=\"20\">20</option>\n");
      out.write("    <option value=\"21\">21</option>\n");
      out.write("     </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"product name\"><h4>Choose the product name: </h4></label>\n");
      out.write("  <select id=\"pname\" name=\"pname\">\n");
      out.write("    <option value=\"Nikon NX21\">Nikon NX21</option>\n");
      out.write("        <option value=\"Burberry\">Burberry</option>\n");
      out.write("    <option value=\"One Plus 7t\">One Plus 7t</option>\n");
      out.write("    <option value=\"Audio Technica\">Audio Technica</option>\n");
      out.write("    <option value=\"Titan Raga\">Titan Raga</option>\n");
      out.write("    <option value=\"Priya Earings collections\">Priya Earings collections</option>\n");
      out.write("\n");
      out.write("        <option value=\"Marie Claire\">Marie Claire</option>\n");
      out.write("\n");
      out.write("            <option value=\"Diesel 3bar\">Diesel 3bar</option>\n");
      out.write("\n");
      out.write("                <option value=\"The Wishing Chair\">The Wishing Chair</option>\n");
      out.write("\n");
      out.write("                    <option value=\"Homebase Kitchens\">Homebase Kitchens</option>\n");
      out.write("\n");
      out.write("                        <option value=\"Allen Solly\">Allen Solly</option>\n");
      out.write("\n");
      out.write("                            <option value=\"Deepam sarees\">Deepam sarees</option>\n");
      out.write("  </select>\n");
      out.write("    \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                           <label for=\"product price\"><h4>Choose the product price: </h4></label>\n");
      out.write("  <select id=\"price\" name=\"price\">\n");
      out.write("    <option value=\"36000\">36000</option>\n");
      out.write("    <option value=\"10000\">10000</option>\n");
      out.write("    <option value=\"40000\">40000</option>\n");
      out.write("    <option value=\"12000\">12000</option>\n");
      out.write("    <option value=\"7000\">7000</option>\n");
      out.write("    <option value=\"600\">600</option>\n");
      out.write("    <option value=\"3000\">3000</option>\n");
      out.write("    <option value=\"3300\">3300</option>\n");
      out.write("    <option value=\"36000\">36000</option>\n");
      out.write("    <option value=\"5000\">5000</option>\n");
      out.write("    <option value=\"2900\">2900</option>\n");
      out.write("        <option value=\"3000\">3000</option>\n");
      out.write("  </select>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                       <button class=\"btn btn-primary\">Add to cart</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("   ");
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
