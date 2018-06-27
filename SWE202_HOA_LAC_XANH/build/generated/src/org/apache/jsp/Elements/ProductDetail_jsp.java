package org.apache.jsp.Elements;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>       \n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $('#header2').load(\"header.html\");\n");
      out.write("                $('#menu').load(\"menu.jsp\");\n");
      out.write("                $('#footer').load(\"footer.html\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <link href=\"../CSS/Css_ProductDetail.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header2\"></div>\n");
      out.write("        <div id=\"menu\"></div>\n");
      out.write("        <form class=\"padd\">\n");
      out.write("            <table class=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <img src=\"../images/cactus.jpg\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"infor\">\n");
      out.write("                        <h1>Cactus 1</h1>\n");
      out.write("                        <div>\n");
      out.write("                            <span class=\"fa fa-star checked\"></span>\n");
      out.write("                            <span class=\"fa fa-star checked\"></span>\n");
      out.write("                            <span class=\"fa fa-star checked\"></span>\n");
      out.write("                            <span class=\"fa fa-star\"></span>\n");
      out.write("                            <span class=\"fa fa-star\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <h3> 10.000d</h3>\n");
      out.write("                        <h3>Description</h3>\n");
      out.write("                        <p>Next I'm a product description. I'm a great place to add more details about your product such as sizing, material, care instructions and cleaning instructions</p>\n");
      out.write("                        <h3><span> Quantity </span></h3>\n");
      out.write("                         <input type=\"number\" name=\"quantity\" min=\"1\" max=\"5\">\n");
      out.write("                        <p style=\"padding-top: 10px\"><input type=\"submit\" value=\"Add to cart\" class=\"btn btn-danger\"/></p>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <div id=\"footer\"></div>\n");
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
