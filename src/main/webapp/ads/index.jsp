<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: manuel.dominguez
  Date: 4/4/22
  Time: 9:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>welcome!</h1>
<h3>this is where all my ads shall be..</h3>
<c:forEach var="ad" items="ads">
<div class="ad">${ad.}</div>
</c:forEach>
</body>
</html>
