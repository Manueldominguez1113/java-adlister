<%--
  Created by IntelliJ IDEA.
  User: manuel.dominguez
  Date: 4/3/22
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick-a-Color</title>
</head>
<body>
<h1> pick a color you would like the background to be!</h1>

<form action="/pickColor" method="post">
    <label for="color">enter your color here</label>
    <input type="text" id="color" name="color" value="white">
    <input type="submit" value="Submit">
</form>
</body>
</html>
