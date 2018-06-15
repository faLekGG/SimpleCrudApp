<%--
  Created by IntelliJ IDEA.
  User: Vitaly
  Date: 31.05.2018
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>My Users</title>
</head>
<body>
<center>
    <h1>Users Management</h1>
    <h2>
        <a href="UserController?action=insert">Add New User</a>
        &nbsp;&nbsp;&nbsp;
        <a href="UserController?action=listUser">List All Users</a>

    </h2>
</center>
<div align="center">
<table border=1>
    <thead>
    <tr>
        <th>User Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Date</th>
        <th>Email</th>
        <th colspan=2>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}" /></td>
            <td><c:out value="${user.firstName}" /></td>
            <td><c:out value="${user.lastName}" /></td>
            <td><fmt:formatDate pattern="yyyy-MMM-dd" value="${user.date}" /></td>
            <td><c:out value="${user.email}" /></td>
            <td><a href="UserController?action=edit&userId=<c:out value="${user.id}"/>">Update</a></td>
            <td><a href="UserController?action=delete&userId=<c:out value="${user.id}"/>">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
