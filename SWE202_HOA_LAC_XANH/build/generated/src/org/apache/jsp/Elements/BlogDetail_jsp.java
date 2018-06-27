package org.apache.jsp.Elements;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BlogDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>       \n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(function () {\n");
      out.write("                $('#header2').load(\"header.html\");\n");
      out.write("                $('#menu').load(\"menu.jsp\");\n");
      out.write("                $('#footer').load(\"footer.html\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <link href=\"../CSS/BlogDetail.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header2\"></div>\n");
      out.write("        <div id=\"menu\"></div>\n");
      out.write("        <div class=\"blog_detail\" style=\"border: 1px solid #cccccc\">\n");
      out.write("            <p style=\"float: right\">Date: 17/6/2018</p>\n");
      out.write("            <h1> QUÁI VẬT RỪNG XANH – MONSTERA</h1>\n");
      out.write("            <img src=\"../images/cactus1.jpg\">\n");
      out.write("            <p>   \n");
      out.write("                Bạn có đặc biệt cảm tình với một loại cây nào trong đời không? \n");
      out.write("                Đó là câu hỏi mở đầu cho bài chia sẻ về trải nghiệm xanh của bạn Thuỷ, một trong những admin của cộng đồng Yêu Cây Xanh và là founder của 2 thương hiệu Cá eii Teo eii, THONGDALAT.space.         \n");
      out.write("                “Có một loại cây thường sống trong rừng ẩm, dưới tán lá của những cây cổ thụ to lớn. Khi những tia nắng xuyên qua tầng lá phía trên chiếu trực tiếp lên chiếc lá tạo thành những lỗ nhỏ trên lá đó, làm cho cây có một hình dáng rất đặc biệt. Đó là những gì mình nghĩ ra khi vô tình thấy chiếc lá đó trong một cuốn sách.”\n");
      out.write("                “Và bạn biết không,giống như kiểu mình yêu ngay từ cái nhìn đầu tiên loại cây này. Điều này thôi thúc mình phải tìm cho được một em mang về nuôi. Tất nhiên đầu tiên phải tìm hiểu về em ấy đã nha.”\n");
      out.write("                “Monstera Deliciosa-đó là tên khoa học đầy đủ của loại cây ấy. Mình thấy cái tên quá phù hợp luôn. Đây là một loại cây thuộc họ trầu bà nhưng lại mang một hình dáng đặc biệt. Chúng có xuất xứ từ vùng có khí hậu ôn đới như Trung Mỹ hay các hòn đảo gần xích đạo. Với tán lá to rộng, xẻ sâu và có nhiều lỗ nhỏ trên lá, bạn sẽ nhận ra loại cây này ngay khi trông thấy nó. Đối với một cây phát triển trong điều kiện lý tưởng, một chiếc lá có thể có đường kính 1m (là 1m luôn đấy, to bành luôn). Chúng thường leo lên cây chủ bằng rễ, trong tự nhiên có thể phát triển cao tới 20m. Đúng như tên gọi của nó – Monstera-Quái vật.”\n");
      out.write("                Một điểm đặc biệt mình nghĩ nhiều người không biết đến là quả Monstera Deliciosa có hình dáng bên ngoài giống với bắp ngô mà chúng ta hay ăn, có các vảy hình lục giác và chứa rất nhiều axit Oxalic khi chưa chín, lượng độc tố này có thể khiến người ăn bỏng rát, đau đớn khi tiếp xúc phải. Tuy nhiên, khi quả chín lớp vảy này sẽ tự động bong ra để lộ lớp thịt quả màu trắng có mùi vị giống chuối và dứa vô cùng thơm ngon bên trong.\n");
      out.write("                Nhiều nơi ở Trung Mỹ, Monstera Deliciosa từ lâu đã trở thành thức ăn hàng ngày trong gia đình. Mình đã thử và đúng như vậy nhé. Tới đây, bạn hiểu vì sao có cái tên Monstera Deliciosa rồi chứ.\n");
      out.write("                Nếu bạn là người yêu cây xanh, yêu không gian tự nhiên hay chỉ là vô tình đọc qua vài bài báo về không gian nội thất, chắc hẳn đã từng nhìn thấy loại cây này được dùng làm trang trí. Với hình dáng lá hết sức đặc biệt, Monstera Deliciosa thường được các nhà thiết kế đưa vào không gian nội thất để tạo điểm nhấn. Ở các nước phương tây, bạn dễ dàng bắt gặp nó trong nhiều không gian từ nhà ở, showroom, quán cafe hay văn phòng làm việc.\n");
      out.write("                Quái vật xanh đầu tiên mình sở hữu, khi bắt gặp em ấy trong một góc vườn ở Đà Lạt, đã trưởng thành và xinh đẹp.\n");
      out.write("                Càng chăm mình càng thích loại cây này. Monstera Deliciosa không cần nhiều ánh sáng trực tiếp, phát triển tốt trong mát và ưa ẩm nên bạn hoàn toàn có thể đặt cây ở các vị trí trong nhà,gần cửa sổ hay văn phòng làm việc. Đặc biệt là khả năng thích ứng môi trường và sinh tồn cực kì mạnh mẽ. Mình đã từng chiết nhiều cây nhỏ mang đi tặng, và bạn bè mình rất vui khi gửi hình những chiếc lá mới từ những cây con ấy.\n");
      out.write("                Có cây mình tưởng đã sắp chết rồi, vậy mà vẫn đâm chồi và sống lại khoẻ mạnh. Mình cũng từng thử nuôi trong hũ thuỷ tinh với phần rễ hoàn toàn trong nước, và bất ngờ là cây vẫn phát triển tốt. Mỗi cây mang về,mình đều có một câu chuyện để kể bạn nghe,nhưng mà sẽ để dành kể dần nhé.\n");
      out.write("                Với mình, Monstera Deliciosa là một cái cây rất đặc biệt. Nó mang nhiều ý nghĩa với mình, và cũng mang lại cho mình thật nhiều cảm hứng nữa. Nếu như có cơ hội, hãy mang về chăm một em “quái vật rừng xanh” thử đi bạn.\n");
      out.write("            </p>        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"blog_recent\">\n");
      out.write("            <h4>Recently post</h4>\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-md-3\" >\n");
      out.write("                    <a href=\"BlogDetail.jsp\">\n");
      out.write("                        <img src=\"../images/cactus1.jpg\">\n");
      out.write("                        <h4>Get to know with Cactus xxxxxxxxxxx</h4>\n");
      out.write("                    </a>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <a href=\"BlogDetail.jsp\">\n");
      out.write("                        <img src=\"../images/cactus5.jpg\">\n");
      out.write("                        <h4>Get to know with Cactus xxxxxxxxxxx</h4>\n");
      out.write("                    </a>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <a href=\"BlogDetail.jsp\">\n");
      out.write("                        <img src=\"../images/cactus4.jpg\">\n");
      out.write("                        <h4>Get to know with Cactus xxxxxxxxxxx</h4>\n");
      out.write("                    </a>\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
