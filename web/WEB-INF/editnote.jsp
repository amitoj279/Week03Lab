<%-- 
    Document   : editnote
    Created on : Sep 23, 2019, 6:57:27 PM
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
        <h1>Simple Note Keeper</h1>
        <br>
        
        <h2>Edit Note</h2>
        
        <form action="note" method="post">
            
        Title: <input type="text" name="showTitle" size="20" value="${note.title}">
        <br>
        <br>
        Contents: ​<input type="text" name="showContent" size="60" value="${note.text}" style="width:150px; height:100px">
        <br>
         <input type="submit" value="Save">
</form>
    </body>
</html>
