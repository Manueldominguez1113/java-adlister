<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: manuel.dominguez
  Date: 4/1/22
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<h1> pizza order form</h1>

<form action="/pizza-order" method="post">
    <label for="crust">Select a crust type:</label>
    <select name="crust" id="crust">
        <option value="Thin">Thin crust</option>
        <option value="Regular">Regular crust</option>
        <option value="Square">Square crust</option>
        <option value="Stuffed">Stuffed crust</option>
    </select>

    <label for="sauce">Select a Sauce:</label>
    <select name="sauce" id="sauce">
        <option value="Marinara">Marinara sauce</option>
        <option value="BBQ">BBQ sauce</option>
        <option value="Ketchup">Ketchup sauce</option>
        <option value="Ranch">Ranch sauce</option>
    </select>

    <label for="size">Select a Size:</label>
    <select name="size" id="size">
        <option value="Personal">Personal</option>
        <option value="Medium">Medium</option>
        <option value="Large">Large</option>
        <option value="Extra Large">Extra Large</option>
    </select>

    <br><br>
    <input type="submit" value="Submit">
</form>

<h2> So you would like one ${size},${crust},with ${sauce}?</h2>
</body>
</html>
