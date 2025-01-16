<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Список пользователей</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Имя</td>
        <td>Возраст</td>
        <td>Действия</td>
    </tr>
    <c:forEach items="${client}" var = "client">
        <tr>
            <td>${client.getId()}</td>
            <td>${client.getName()}</td>
            <td>${client.getAge()}</td>
            <td>
                <form action = "updateClient.jsp" method="post">
                    <input type="hidden" name="id" value="${client.getId()}">
                    <input type="hidden" name="name" value="${client.getName()}">
                    <input type="hidden" name="age" value="${client.getAge()}">
                    <input type="submit" value="Изменить" style="float:left">
                </form>
                <form action="deleteClient.jsp" method="post">
                    <input type="hidden" name="id" value="${client.getId()}">
                    <input type="submit" value="Удалить" style="float:left">
                </form></td>
        </tr>
    </c:forEach>
</table>

<form action = "addClient.jsp">
    <input type="submit" value="Добавить нового пользователя">
</form>
</body>
</html>