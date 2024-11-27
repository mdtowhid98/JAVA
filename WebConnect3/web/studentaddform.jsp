<%-- 
    Document   : studentaddform
    Created on : Jul 2, 2024, 3:22:33 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Employee</h1>
        
        <form action="savestudent.jsp">
            
            Name:<input type="text" name="name"><br> 
            Email:<input type="email" name="email"><br> 
            Address:<input type="text" name="address"><br> 
           Cell:<input type="text" name="cell"><br> 
            
            <input type="submit" value="Save">
            
            
        </form>
    </body>
</html>
