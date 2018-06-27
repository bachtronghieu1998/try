package org.apache.jsp.Elements;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../CSS/Cart.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header2\"></div>\n");
      out.write("        <div id=\"menu\"></div>\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <h1 style=\"text-align: center;padding-top: 50px\">My Cart</h1>\n");
      out.write("            <div class=\"cartItems\">\n");
      out.write("                <div class=\"row line row_temp\">\n");
      out.write("                    <div class=\"font\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <p>MyCart (3)</p> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            <p>Price</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            <p> Quantity</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            <p> Total</p>\n");
      out.write("                        </div>  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--       item 1-->\n");
      out.write("                <div class=\"row line row_temp\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"row row_temp\">\n");
      out.write("                            <div class=\"col-sm-4 col_temp\">\n");
      out.write("                                <img src=\"../images/cactus2.jpg\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <p>Cactus 1</p>\n");
      out.write("                                <p><a href=\"#\">Remove</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        10000\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        <p><input type=\"number\" style=\"width: 60px\" value=\"1\" min=\"0\"/></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        10000đ\n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--item 2-->\n");
      out.write("                <div class=\"row line row_temp\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"row row_temp\">\n");
      out.write("                            <div class=\"col-sm-4 col_temp\">\n");
      out.write("                                <img src=\"../images/cactus4.jpg\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <p>Cactus 1</p>\n");
      out.write("                                <p><a href=\"#\">Remove</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        10000\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        <p><input type=\"number\" style=\"width: 60px\" value=\"1\" min=\"0\"/></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        10000đ\n");
      out.write("                    </div>        \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--item 3-->\n");
      out.write("                <div class=\"row line row_temp\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"row row_temp\">\n");
      out.write("                            <div class=\"col-sm-4 col_temp\">\n");
      out.write("                                <img src=\"../images/cactus6.jpg\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <p>Cactus 1</p>\n");
      out.write("                                <p><a href=\"#\">Remove</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        10000\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        <p><input type=\"number\" style=\"width: 60px\" value=\"1\" min=\"0\"/></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 col_infor\">\n");
      out.write("                        10000đ\n");
      out.write("                    </div>  \n");
      out.write("                </div>         \n");
      out.write("\n");
      out.write("                <!--                Get total-->\n");
      out.write("                <div class=\"total\">\n");
      out.write("                    <h3>\n");
      out.write("                        <span>Total:</span><span style=\"padding-left: 30px\"> 30000đ</span>  \n");
      out.write("                    </h3>\n");
      out.write("                    <p><input type=\"button\" style=\"width: 70%;margin-top: 10px\" class=\"btn btn-danger\" value=\"Check Out\"/></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
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
