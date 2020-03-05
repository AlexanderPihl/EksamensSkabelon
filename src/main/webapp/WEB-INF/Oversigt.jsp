<%--
  Created by IntelliJ IDEA.
  User: alexa
  Date: 04/03/2020
  Time: 13.05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <style>
        table {
            border-collapse: collapse;
            width: 60%;
        }
        td, th {
            border: 1px solid #dddddd;
            tetxt-align: left;
            padding: 8px;
        }
    </style>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Id.</th>
        <th>email</th>
        <th>role</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="element" items = "${requestScope.Oversigt}">
        <tr>
            <td>${element.id}</td>
            <td>${element.email}</td>
            <td>${element.role}</td>
        </tr>

    </c:forEach>
    <h2>Antal kunder: ${fn:length(requestScope.Oversigt)}</h2>
    </tbody>
</table>

<table>
        <td>
            <form name="NewEmployee" action="FrontController" method="POST">
                <input type="hidden" name="taget" value="NewEmployee">
                Email:<br>
                <input type="text" name="email">
                <br>
                Password:<br>
                <input type="text" name="password">
                <br>
                Role:<br>
                <input type="text" name="role">
                <br>
                <input type="submit" value="NewEmployee">
            </form>
        </td>
        <td>
            <form name="DeleteUser" action="FrontController" method="POST">
                <input type="hidden" name="taget" value="DeleteUser">
                Email:<br>
                <input type="text" name="email">
                <br>
                <input type="submit" value="DeleteUser">
            </form>
        </td>
        <td>
            <form name="UpdateUser" action="FrontController" method="POST">
                <input type="hidden" name="taget" value="UpdateUser">
                Email:<br>
                <input type="text" name="email">
                <br>
                Password:<br>
                <input type="text" name="password">
                <br>
                <input type="submit" value="UpdateUser">
            </form>
        </td>
        <td>
            <form name="ResetUser" action="FrontController" method="POST">
                <input type="hidden" name="taget" value="ResetUser">
                Email:<br>
                <input type="text" name="email">
                <br>
                <input type="submit" value="ResetUser">
            </form>
        </td>

    </tr>
</table>

<br>
<br>
<br>
<br>

<form>

    <input type="hidden" name="taget" value="employeepage">
    <input type="submit" value="Gå tilbage">

</form>

</body>
</html>
