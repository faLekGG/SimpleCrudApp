<%--
  Created by IntelliJ IDEA.
  User: Vitaly
  Date: 29.05.2018
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
  <title>Get all users</title>
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
<jsp:forward page="/UserController?action=listUser" />
</div>
</body>
</html>
