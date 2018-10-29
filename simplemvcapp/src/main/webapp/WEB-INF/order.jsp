<%--
  Created by IntelliJ IDEA.
  User: Kate
  Date: 29.10.2018
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
</head>
<body>
<table>
    <tr>
        <td>Title</td>
        <td>Price</td>
        <td>Action</td>
    </tr>
    <c:forEach var="order" items="${orderList}">
        <tr>
            <td>${order.title}</td>
            <td>${order.price}</td>
            <td><a href="/delete/${order.id}">Delete this item</a> </td>
        </tr>

    </c:forEach>
</table>
<a href="/add-new-order">Add new order</a>
</body>
</html>
