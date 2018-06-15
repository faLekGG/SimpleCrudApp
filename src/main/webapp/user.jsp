<%--
  Created by IntelliJ IDEA.
  User: Vitaly
  Date: 31.05.2018
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Add a new user</title>
    <link type="text/css"
          href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
</head>
<body>
<script>
    $(function() {
        $('input[name=dob]').datepicker();
    });
</script>
<center>
    <h1>Users Management</h1>
    <h2>
        <a href="UserController?action=insert">Add New User</a>
        &nbsp;&nbsp;&nbsp;
        <a href="UserController?action=listUser">List All Users</a>

    </h2>
</center>
<div align="center">
<form method="POST" action='UserController' name="frmAddUser">
    <table border="1" cellpadding="5">
    <tr>
        <th>First Name </th>
        <td>
            <input type="text" name="firstName"
                   value="<c:out value="${user.firstName}" />" />
        </td>
    </tr>
    <tr>
        <th>Last Name </th>
        <td>
            <input type="text" name="lastName"
                   value="<c:out value="${user.lastName}" />" />
        </td>
    </tr>
    <tr>
        <th>Email </th>
        <td>
            <input type="text" name="email"
                   value="<c:out value="${user.email}" />" />
        </td>
    </tr>
    <tr>
        <th>Date </th>
        <td>
            <input type="text" name="dob"
                   value="<fmt:formatDate pattern="MM/dd/yyyy" value="${user.date}" />" />
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="Submit" />
        </td>
    </tr>
    </table>
</form>
</div>
</body>
</html>
