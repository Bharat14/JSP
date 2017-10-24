<%-- 
    Document   : newjsp
    Created on : Oct 24, 2017, 4:23:22 PM
    Author     : bsc3
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
            String str=(String)(request.getParameter("num"));
            int len=str.length();
            for (int i=len;i>0;i--)
            {
                System.out.println(str.charAt(i));
            }
        %>
    </body>
</html>
