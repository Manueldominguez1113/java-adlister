<%--
  Created by IntelliJ IDEA.
  User: manuel.dominguez
  Date: 3/31/22
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>login page</title>
</head>
<body>
<form action="login.jsp">
    <label for="username">username:</label><br>
    <input type="text" id="username" name="username"><br>
    <label for="password">password:</label><br>
    <input type="text" id="password" name="password"><br>
    <input type="submit" value="Submit">
</form>
<c:if
        test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
    <c:redirect url="profile.jsp"/>
</c:if>
<%--<c:when
        test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
    <c:redirect url="profile.jsp"/>
</c:when>
<c:otherwise> <c:redirect url="login.jsp" /> </c:otherwise>--%>

</body>
</html>
