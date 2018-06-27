package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InsertProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../CSS/Ad_UpdateForm.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sidenav\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\"> <img src=\"../images/cactus1.jpg\" class=\"avatar\"/></div>\n");
      out.write("                <div class=\"col-sm-8\" id=\"ava_name\">\n");
      out.write("                    <h3>Hello</h3>\n");
      out.write("                    <h3>HLX !!</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#\" style=\"color: #f1f1f1\">Product</a>\n");
      out.write("            <a href=\"#\">Order</a>\n");
      out.write("            <a href=\"#\">Blog</a>\n");
      out.write("            <a href=\"#\">User</a>\n");
      out.write("            <a href=\"#\" style=\"float: bottom\">Change password</a>\n");
      out.write("            <a href=\"#\" style=\"float: bottom\">Add admin</a>\n");
      out.write("            <a href=\"#\" style=\"float: bottom\">Log Out</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <h1 style=\"text-align: center;padding-bottom: 20px\">Update Products</h1>\n");
      out.write("            <form>\n");
      out.write("                <table border=\"1 solid black\" cellspacing=\"0\" style=\"align-content: center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <td><input value=\"\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <td><input value=\"\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Price</th>\n");
      out.write("                        <td><input value=\"\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Type</th>\n");
      out.write("                        <td><input value=\"\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Description</th>\n");
      out.write("                        <td>​<textarea id=\"txtArea\" rows=\"10\" cols=\"70\"></textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <input type=\"submit\" value=\"Insert\" style=\"margin-top: 20px;margin-bottom: 20px;padding: 10px\"/> \n");
      out.write("                <input type=\"submit\" value=\"Cancel\" style=\"margin-top: 20px;margin-bottom: 20px;padding: 10px\"/> \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
