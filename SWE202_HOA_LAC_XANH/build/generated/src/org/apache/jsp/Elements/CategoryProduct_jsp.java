package org.apache.jsp.Elements;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CategoryProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../CSS/CSS_CategoryProduct.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header2\"></div>\n");
      out.write("        <div id=\"menu\"></div>\n");
      out.write("        <div class=\"Category2\">\n");
      out.write("            <a href=\"#\">Cactus</a>\n");
      out.write("            <a href=\"#\">Succulent</a>    \n");
      out.write("            <a href=\"#\">Gardening tool</a>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"padding-top: 30px\">\n");
      out.write("            <p style=\"padding-left: 1050px\"> From <input style=\"width: 100px\" value=\"\"/>  To <input style=\"width: 100px\" value=\"\"/> <a href=\"#\"><span class=\"glyphicon glyphicon-search\"></span></a>\n");
      out.write("        </div>\n");
      out.write("        <!--       Contain-->\n");
      out.write("        <div class=\"tbl\">\n");
      out.write("            <table>\n");
      out.write("                <!--                row 1-->\n");
      out.write("                <tr>\n");
      out.write("                    <td> \n");
      out.write("                        <a href=\"ProductDetail.jsp\">\n");
      out.write("                            <div id=\"item\">\n");
      out.write("                                <p><img src=\"../images/cactus1.jpg\"/></p>\n");
      out.write("                                <p>Hoa sương rồng 1</p>\n");
      out.write("                                <p>10.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td> \n");
      out.write("                        <a href=\"ProductDetail.jsp\">\n");
      out.write("                            <div id=\"item\">\n");
      out.write("                                <p><img src=\"../images/cactus1.jpg\"/></p>\n");
      out.write("                                <p>Hoa sương rồng 1</p>\n");
      out.write("                                <p>10.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td> \n");
      out.write("                        <a href=\"ProductDetail.jsp\">\n");
      out.write("                            <div id=\"item\">\n");
      out.write("                                <p><img src=\"../images/cactus1.jpg\"/></p>\n");
      out.write("                                <p>Hoa sương rồng 1</p>\n");
      out.write("                                <p>10.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td> \n");
      out.write("                        <a href=\"ProductDetail.jsp\">\n");
      out.write("                            <div id=\"item\">\n");
      out.write("                                <p><img src=\"../images/cactus1.jpg\"/></p>\n");
      out.write("                                <p>Hoa sương rồng 1</p>\n");
      out.write("                                <p>10.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <!--                Row 2-->\n");
      out.write("                <tr>\n");
      out.write("                    <td> \n");
      out.write("                        <a href=\"ProductDetail.jsp\">\n");
      out.write("                            <div id=\"item\">\n");
      out.write("                                <p><img src=\"../images/cactus2.jpg\"/></p>\n");
      out.write("                                <p>Hoa sương rồng 1</p>\n");
      out.write("                                <p>10.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td> \n");
      out.write("                         <a href=\"ProductDetail.jsp\">\n");
      out.write("                            <div id=\"item\">\n");
      out.write("                                <p><img src=\"../images/cactus1.jpg\"/></p>\n");
      out.write("                                <p>Hoa sương rồng 1</p>\n");
      out.write("                                <p>10.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td> \n");
      out.write("                        <a href=\"ProductDetail.jsp\">\n");
      out.write("                            <div id=\"item\">\n");
      out.write("                                <p><img src=\"../images/cactus3.jpg\"/></p>\n");
      out.write("                                <p>Hoa sương rồng 1</p>\n");
      out.write("                                <p>10.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td> \n");
      out.write("                        <a href=\"ProductDetail.jsp\">\n");
      out.write("                            <div id=\"item\">\n");
      out.write("                                <p><img src=\"../images/cactus4.jpg\"/></p>\n");
      out.write("                                <p>Hoa sương rồng 1</p>\n");
      out.write("                                <p>10.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Pagination-->\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("            <ul class=\"pagination\">\n");
      out.write("                <li><a href=\"#\">1</a></li>\n");
      out.write("                <li><a href=\"#\">2</a></li>\n");
      out.write("                <li><a href=\"#\">3</a></li>\n");
      out.write("                <li><a href=\"#\">4</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"footer\"></div>\n");
      out.write("\n");
      out.write("\n");
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
