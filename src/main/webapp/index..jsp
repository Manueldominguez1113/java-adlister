<%--
  Created by IntelliJ IDEA.
  User: manuel.dominguez
  Date: 3/31/22
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setAttribute("message","thank you for listening to my long speech"); %>
<%!int counterLocal=0;%>
<%!int counterLocal2=2;%>
<% counterLocal +=1; %>
<% counterLocal2 *=2;%>
<html>
<head>
    <title>counter page</title>
</head>
<body>
<%--<%@include file="partials/navbar.jsp"%>--%>
<h1>The current count is <%= counterLocal %>.</h1>
<h3>Our hardcoded counter of "2" started at 2 and multiplies by 2. Currently that
    counter is = <%= counterLocal2 %></h3>


<h5>Experiment #3 - do we need a servlet to access param?</h5>

<h5>Do we see the result from our query string? «br>
-My favorite food is: ${param.fav_food}</h5>
<h5>What was our secret message?<br>
    ${message}</h5>

</body>
</html>
