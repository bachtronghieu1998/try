<%-- 
    Document   : CategoryProduct
    Created on : Jun 4, 2018, 9:37:53 AM
    Author     : hieu bach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>       
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script>
            $(function () {
                $('#header2').load("header.html");
                $('#menu').load("menu.jsp");
                $('#footer').load("footer.html");
            });
        </script>
        <title>JSP Page</title>
        <link href="../CSS/CSS_CategoryProduct.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="header2"></div>
        <div id="menu"></div>
        <div class="Category2">
            <a href="#">Cactus</a>
            <a href="#">Succulent</a>    
            <a href="#">Gardening tool</a>
        </div>
        <div style="padding-top: 30px">
            <p style="padding-left: 1050px"> From <input style="width: 100px" value=""/>  To <input style="width: 100px" value=""/> <a href="#"><span class="glyphicon glyphicon-search"></span></a>
        </div>
        <!--       Contain-->
        <div class="tbl">
            <table>
                <!--                row 1-->
                <tr>
                    <td> 
                        <a href="ProductDetail.jsp">
                            <div id="item">
                                <p><img src="../images/cactus1.jpg"/></p>
                                <p>Hoa sương rồng 1</p>
                                <p>10.000đ</p>
                            </div>
                        </a>
                    </td>
                    <td> 
                        <a href="ProductDetail.jsp">
                            <div id="item">
                                <p><img src="../images/cactus1.jpg"/></p>
                                <p>Hoa sương rồng 1</p>
                                <p>10.000đ</p>
                            </div>
                        </a>
                    </td>
                    <td> 
                        <a href="ProductDetail.jsp">
                            <div id="item">
                                <p><img src="../images/cactus1.jpg"/></p>
                                <p>Hoa sương rồng 1</p>
                                <p>10.000đ</p>
                            </div>
                        </a>
                    </td>

                    <td> 
                        <a href="ProductDetail.jsp">
                            <div id="item">
                                <p><img src="../images/cactus1.jpg"/></p>
                                <p>Hoa sương rồng 1</p>
                                <p>10.000đ</p>
                            </div>
                        </a>
                    </td>
                </tr>
                <!--                Row 2-->
                <tr>
                    <td> 
                        <a href="ProductDetail.jsp">
                            <div id="item">
                                <p><img src="../images/cactus2.jpg"/></p>
                                <p>Hoa sương rồng 1</p>
                                <p>10.000đ</p>
                            </div>
                        </a>
                    </td>
                    <td> 
                         <a href="ProductDetail.jsp">
                            <div id="item">
                                <p><img src="../images/cactus1.jpg"/></p>
                                <p>Hoa sương rồng 1</p>
                                <p>10.000đ</p>
                            </div>
                        </a>
                    </td>
                    <td> 
                        <a href="ProductDetail.jsp">
                            <div id="item">
                                <p><img src="../images/cactus3.jpg"/></p>
                                <p>Hoa sương rồng 1</p>
                                <p>10.000đ</p>
                            </div>
                        </a>
                    </td>
                    <td> 
                        <a href="ProductDetail.jsp">
                            <div id="item">
                                <p><img src="../images/cactus4.jpg"/></p>
                                <p>Hoa sương rồng 1</p>
                                <p>10.000đ</p>
                            </div>
                        </a>
                    </td>
                </tr>
            </table>

        </div>

        <!--Pagination-->
        <div class="text-center">
            <ul class="pagination">
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
            </ul>
        </div>


        <div id="footer"></div>


    </body>
</html>
