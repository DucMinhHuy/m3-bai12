<%--
  Created by IntelliJ IDEA.
  User: minhhuyduc
  Date: 04/10/2022
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
  <h1>User Management</h1>
  <h2>
    <a href="/users?action=create">Add New User</a>
  </h2>
</center>
<div align="center">
  <table border="1" cellpadding="5">
    <caption><h2>List of Users</h2></caption>
    <tr>
      <td>Id</td>
      <td>Name</td>
      <td>Email</td>
      <td>Country</td>
      <td>Actions</td>
    </tr>
    <c:forEach var="user" items="${listUser}">
      <tr>
        <td><c:out value="${user.id}"/></td>
        <td><c:out value="${user.name}"/></td>
        <td><c:out value="${user.email}"/></td>
        <td><c:out value="${user.country}"/></td>
        <td>
          <form action="/us" method="post">
<%--          <a href="/users?action=edit&id=${user.id}">Edit</a>--%>
            <input type="text" name="abc"/>
            <input type="submit" value="cac"/>
          </form>
          <a href="/users?action=delete&id=${user.id}">Delete</a>

        </td>
      </tr>
    </c:forEach>
  </table>

</div>

</body>
</html>
