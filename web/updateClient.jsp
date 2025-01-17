<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Изменить данные пользователя</title>
</head>
<body>

Редактировать пользователя

<form action="/Client/${param.id}" method="post">
    <input type="hidden" name = "id" value="${param.id}">
    <label>
        <input type="text" name="name" value="${param.name}" placeholder=${param.name}>
    </label>
    <label>
        <input type="text" name="age" value="${param.age}" placeholder=${param.age}>
    </label>
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="Обновить">
</form>

</body>
</html>