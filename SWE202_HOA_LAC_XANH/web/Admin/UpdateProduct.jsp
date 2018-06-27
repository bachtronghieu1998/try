<%-- 
    Document   : UpdateForm
    Created on : Jun 10, 2018, 11:05:06 AM
    Author     : hieu bach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../CSS/Ad_UpdateForm.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <jsp:include page="SideNav.html"></jsp:include>
        
        <div class="main">
            <h1 style="text-align: left;padding-bottom: 20px">Update Products</h1>
            <form>
                <table border="1 solid black" cellspacing="0" >
                    <tr>
                            <th>ID</th>
                        <td><input value="MH370"/></td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td><input value="Sen Đá Cỏ Ngọc"/></td>
                    </tr>
                    <tr>
                        <th>Price</th>
                        <td><input value="60.000"/></td>
                    </tr>
                    <tr>
                        <th>Type</th>
                        <td><input value="Succulent"/></td>
                    </tr>
                    <tr>
                        <th>Description</th>
                        <td>​<textarea id="txtArea" rows="10" cols="70">Sen Đá Cỏ Ngọc nay còn được gọi với một cái tên vô cùng duyên dáng ...</textarea></td>
                    </tr>
                    
                </table>
                <input type="submit" value="Update" style="margin-top: 20px;margin-bottom: 20px;padding: 10px"/> 
                 <input type="submit" value="Cancel" style="margin-top: 20px;margin-bottom: 20px;padding: 10px"/> 

               
            </form>
        </div>
    </body>
</html>
