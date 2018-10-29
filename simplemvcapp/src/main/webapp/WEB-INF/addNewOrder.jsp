<%--
  Created by IntelliJ IDEA.
  User: Kate
  Date: 29.10.2018
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Addition order</title>
</head>
<body>
<form action="/add-new-order" method="post">
    <label>Title</label>
    <input name="title" type="text" placeholder="Enter title">
    <label>Price</label>
    <input name="price" type="text" placeholder="Enter price">
    <input type="submit" value="Add order">
</form>
</body>
</html>
