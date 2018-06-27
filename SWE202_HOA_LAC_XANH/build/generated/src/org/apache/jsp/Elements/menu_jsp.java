package org.apache.jsp.Elements;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"../CSS/CSS_nav.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"nav-bar navbar-fixed-top\" id=\"temp_menu\">\n");
      out.write("            <a href=\"TrangChu.jsp\">Home</a>\n");
      out.write("            <a  href=\"CategoryProduct.jsp\">Shop</a>\n");
      out.write("            <a  href=\"Blog.jsp\">Blog</a>\n");
      out.write("            <a  href=\"Cart.jsp\" ><span class=\"glyphicon glyphicon-shopping-cart\"></span></a>\n");
      out.write("            <a  href=\"#\" class=\"right\" onclick=\"document.getElementById('login').style.display = 'block'\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!--        Modal-->\n");
      out.write("        <div id=\"login\" class=\"modal\">\n");
      out.write("            <span onclick=\"document.getElementById('login').style.display = 'none'\" class=\"close\">&times;</span>\n");
      out.write("            <form class=\"modal-content animate\">\n");
      out.write("                <h2 align=\"center\">LOGIN</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-7\">\n");
      out.write("                        <label><b>User name</b></label><br/>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\"/><br/>\n");
      out.write("                        <label><b>PassWord</b></label><br/>\n");
      out.write("                        <input type=\"password\" placeholder=\"Enter PassWord\" name=\"psw\"/><br/>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Login</button>\n");
      out.write("                        <button type=\"button\"  onclick=\"document.getElementById('login').style.display = 'none'\" class=\"btn btn-danger\">Cancel</button>\n");
      out.write("                        <p style=\"padding-top: 15px\"><a href=\"#\" onclick=\"document.getElementById('SignUp').style.display = 'block'\" >Sign Up</a> if you dont have account</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <button class=\"btn btn-primary btn-block\" style=\"padding: 20px\"><a style=\"text-decoration: none;color: white\">Facebook</a></button>\n");
      out.write("                        <br>\n");
      out.write("                        <button style=\"background: #dd4b39;padding: 20px;color: white;width: 100%\"><a style=\"text-decoration: none;color: white\">Google</a></button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"SignUp\" class=\"modal\">\n");
      out.write("            <span onclick=\"document.getElementById('SignUp').style.display = 'none'\" class=\"close\">&times;</span>\n");
      out.write("            <form class=\"modal-content animate\">\n");
      out.write("                <h2 align=\"center\">Sign Up</h2>\n");
      out.write("                <label><b>User name</b></label><br/>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Username\" name=\"su_uname\" required/><br/>\n");
      out.write("                <label><b>PassWord</b></label><br/>\n");
      out.write("                <input type=\"password\" placeholder=\"Enter PassWord\" name=\"su_psw\" required/><br/>\n");
      out.write("                <label><b>Confirm PassWord</b></label><br/>\n");
      out.write("                <input type=\"password\" placeholder=\"Confirm PassWord\" name=\"cf_psw\" required/><br/>\n");
      out.write("                <p> By creating an account you agree to our <a>Terms & Privacy.</a></p>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success\">Sign Up</button>\n");
      out.write("                <button type=\"button\"  onclick=\"document.getElementById('SignUp').style.display = 'none'\" class=\"btn btn-danger\">Cancel</button>\n");
      out.write("                <br/>\n");
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
