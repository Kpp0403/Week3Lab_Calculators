<%-- 
    Document   : agecalculator
    Created on : 28-Jan-2023, 7:59:32 PM
    Author     : Krushang Prajapati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div id="main">
            <h1>Age Calculator</h1>
            <hr>
            <div id="child1">
                <form method="post" action="age">
                    <lable for="age">Enter your age: </lable>
                    <input type="text" name="age"><br><br>
                    <input type="submit" value="Age next Birthday">
                </form>
                <p id="ageReturn">${ageOutput}</p>
                <p id="message">${message}</p>
            </div>
            <div id="child2">
                <a href="arithmetic"><span>Go to</span> Arithmetic Calculator</a>
            </div>
        </div>
    </body>
</html>