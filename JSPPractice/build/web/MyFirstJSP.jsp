<%-- 
    Document   : MyFirstJSP
    Created on : 25 Oct, 2018, 10:37:14 AM
    Author     : Mannat Gupta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int count=0;%>
        this page was accessed<%=++count%> times
    </body>
</html>
