<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: alexa
  Date: 04/03/2020
  Time: 13.05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oversigt</title>

    <h1>Her en en oversigt over kunderne</h1>

    <br>
    <br>
    <br>
    <br>

</head>
<body>

<c:forEach var="element" items="${requestScope.Oversigt}">

    ${element.id},
    ${element.email},
    ${element.role}
    <br>
    <br>

</c:forEach>

<h2>Kunder: ${fn:length(requestScope.Oversigt)}</h2>

<br>
<br>

<form>
    <input type="hidden" name="taget" value="employeepage">
    <input type="submit" value="Gå tilbage">
</form>

</body>
</html>
