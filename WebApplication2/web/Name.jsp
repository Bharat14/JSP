<%-- 
    Document   : newjsp
    Created on : Oct 24, 2017, 4:23:22 PM
    Author     : bsc3
--%>

<%@page import="java.time.LocalDateTime"%>
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
            int hours = LocalDateTime.now().getHour();
            if(hours<12)
            {
                out.println("Good Morning! "+name);
            }
            else
            if(hours>=12&&hours<=17)
            {
                out.println("Good Afternoon! "+name);
            }
            else
            {
                out.println("Good Evening! "+name);
            }
            %>
    </body>
</html>
