
<html>
        <head>
            <title>Login Success</title>
        </head>
            
        <body>
            <%@page import="com.LoginBean"%>  
            <p>You are successfully logged in!</p>  
            <%  
                LoginBean bean=(LoginBean)request.getAttribute("bean");  
                out.print("Welcome, "+bean.getName());  
            %>
            <form action="index.html" method="post">  
                <br><input type="submit" value="Logout">  
            </form> 
        </body>    
    </html>    