<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="home"/>
        </jsp:include>
</head>
<body>

        <h1>Variable names should be very descriptive</h1>
    <a href="/login">login</a>
<a href="/products">products</a>
<a href="/products/create">create</a>

</body>
</html>
