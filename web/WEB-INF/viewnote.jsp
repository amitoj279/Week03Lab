<%-- 
    Document   : viewnote
    Created on : Sep 23, 2019, 6:50:06 PM
    Author     : 794473
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
         <form action="note" method="get">
        <h1>Simple Note Keeper</h1>
        <br>
        <h3>View Note</h3>
        
        <h4>Title: ${note.title}</h4>
        <h4>Content: ${note.text}</h4>
        
        <a href="note?edit"> Edit</a>
</form>
    </body>
</html>
