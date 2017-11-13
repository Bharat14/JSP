<%-- 
    Document   : product
    Created on : Nov 11, 2017, 11:48:02 AM
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
        Hello ${sessionScope.name}<br>
        <%
            if(request.getParameterValues("product")!=null)
            {
                if(request.getParameter("product").equals("silk")) 
                {
                    out.println("You have purchased Cadbury Silk.<br>");
                }
                else
                if(request.getParameter("product").equals("kitkat")) 
                {
                    out.println("You have purchased KitKat.<br>");
                }
                else
                if(request.getParameter("product").equals("bourn")) 
                {
                    out.println("You have purchased Bournville.<br>");
                }
            }
        %>
        <a href="index.jsp">Return</a>
    </body>
</html>
