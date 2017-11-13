<%-- 
    Document   : index
    Created on : Nov 11, 2017, 11:05:13 AM
    Author     : Bharat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name=(String)request.getParameter("name");
            session.setAttribute("name",name);        
        %>
        Hello ${sessionScope.name}<br>
        Select an item.<br>
        <form action="product.jsp" method="post">
            <input type="radio" name="product" value="silk" checked> Cadbury Silk<br>
            <input type="radio" name="product" value="kitkat"> KitKat<br>
            <input type="radio" name="product" value="bourn"> Bournville<br>
            <input type="submit" value="Proceed"><br>
        </form>
    </body>
</html>
