<%-- 
    Document   : arithmeticcalculator
    Created on : 29-Jan-2023, 2:45:47 PM
    Author     : Krushang Prajapati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <div id="main">
            <h1>Arithmetic Calculator</h1>
            <hr>
            <div id="child1">
                <form method="post" action="arithmetic">
                    <lable for="first">First number: </lable>
                    <input type="text" name="first" value="${first}"><br><br>
                    <lable for="second">Second Number: </lable>
                    <input type="text" name="second" value="${second}"><br><br>
                    <input type="submit" value="+" name="submit">
                    <input type="submit" value="-" name="submit">
                    <input type="submit" value="*" name="submit">
                    <input type="submit" value="%" name="submit">
                </form>
                <p id="arithmeticReturn">${arithmeticOutput}</p>
            </div>
            <div id="child2">
                <a href="age"><span>Go to</span> Age Calculator</a>
            </div>
        </div>
    </body>
</html>
