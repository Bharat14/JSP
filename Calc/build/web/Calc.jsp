<%-- 
    Document   : newjsp
    Created on : Oct 24, 2017, 4:23:22 PM
    Author     : bsc3
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int num1=Integer.parseInt(request.getParameter("num1"));
            int num2=Integer.parseInt(request.getParameter("num2"));
            
            
            if(request.getParameter("calc").equals("add"))
            {
                out.println(num1+num2);
            }
            else
            if(request.getParameter("calc").equals("sub"))
            {
                out.println(num1-num2);
            }
            else
            if(request.getParameter("calc").equals("mul"))
            {
                out.println(num1*num2);
            }
            %>
    </body>
</html>
