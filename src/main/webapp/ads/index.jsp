<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: manuel.dominguez
  Date: 4/5/22
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
<jsp:param name="title" value="Ads home page"/>
    </jsp:include>
</head>
<body>
<h1> welcome! this is where ill post the ads</h1>

<c:forEach var="ad"  items="ads">
<div class="ads">example</div>
</c:forEach>
</body>
</html>
