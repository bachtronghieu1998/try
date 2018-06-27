<%-- 
    Document   : AdminSanPham
    Created on : Jun 10, 2018, 12:15:29 PM
    Author     : hieu bach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html>
    <head>
        <link rel="stylesheet" type="text/css" href="Admin.css">
        <meta charset="UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="../CSS/Admin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="SideNav.html"></jsp:include>
        <!--Load Data-->
        <div class="main">
            <h1 style="text-align: left; padding-bottom: 20px">View Product</h1>
            <table border="1 solid black" style="table-layout: fixed" >
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Type</th>
                    <th colspan="2"></th>
                    
                </tr>
                <tr></tr>
                 <tr>
                        <td>MH370</td>
                        <td>Sen Đá Cỏ Ngọc</td>
                        <td><div class="crop">Sen Đá Cỏ Ngọc nay còn được gọi với một cái tên vô cùng duyên dáng ...</div></td>
                        <td>60.000</td>
                        <td>Succulent</td>
                        <td><a href="UpdateProduct.jsp">Update</a></td>
                        <td><a href="#">Delete</a></td>
                 </tr>
                  <tr>
                        <td>MH370</td>
                        <td>Sen Đá Cỏ Ngọc</td>
                        <td><div class="crop">Sen Đá Cỏ Ngọc nay còn được gọi với một cái tên vô cùng duyên dáng ..</div></td>
                        <td>60.000</td>
                        <td>Succulent</td>
                        <td><a href="#">Update</a></td>
                        <td><a href="#">Delete</a></td>
                 </tr>
                  <tr>
                        <td>MH370</td>
                        <td>Sen Đá Cỏ Ngọc</td>
                         <td><div class="crop">Sen Đá Cỏ Ngọc nay còn được gọi với một cái tên vô cùng duyên dáng ..</div></td>
                        <td>60.000</td>
                        <td>Succulent</td>
                        <td><a href="#">Update</a></td>
                        <td><a href="#">Delete</a></td>
                 </tr>
                   <tr>
                        <td>MH370</td>
                        <td>Sen Đá Cỏ Ngọc</td>
                         <td><div class="crop">Sen Đá Cỏ Ngọc nay còn được gọi với một cái tên vô cùng duyên dáng ..</div></td>
                        <td>60.000</td>
                        <td>Succulent</td>
                        <td><a href="#">Update</a></td>
                        <td><a href="#">Delete</a></td>
                 </tr>
                   <tr>
                        <td>MH370</td>
                        <td>Sen Đá Cỏ Ngọc</td>
                        <td><div class="crop">Sen Đá Cỏ Ngọc nay còn được gọi với một cái tên vô cùng duyên dáng ..</div></td>
                        <td>60.000</td>
                        <td>Succulent</td>
                        <td><a href="#">Update</a></td>
                        <td><a href="#">Delete</a></td>
                 </tr>
                   <tr>
                        <td>MH370</td>
                        <td>Sen Đá Cỏ Ngọc</td>
                         <td><div class="crop">Sen Đá Cỏ Ngọc nay còn được gọi với một cái tên vô cùng duyên dáng ..</div></td>
                        <td>60.000</td>
                        <td>Succulent</td>
                        <td><a href="#">Update</a></td>
                        <td><a href="#">Delete</a></td>
                 </tr>
                 
            </table>
            <br>
            <a href="InsertProduct.jsp"> <input type="submit" value="Insert"/></a>
            
            
            
        </div>


</body>
</html>
