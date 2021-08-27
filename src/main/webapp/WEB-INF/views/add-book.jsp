<%--
  Created by IntelliJ IDEA.
  User: magdalena
  Date: 27.08.2021
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/css/style.css"%></style>

<html>
<head>
    <title>Add Book</title>
</head>
<body>

<form action="/books" method="POST">
    <div>
        <label for="isbn">Podaj isbn</label>
        <input type="text" id="isbn" name="isbn">
    </div>
    <div>
        <label for="title">Podaj tytuł</label>
        <input type="text" id="title" name="title">
    </div>
    <div>
        <label for="author">Podaj autora</label>
        <input type="text" id="author" name="author">
    </div>
    <div>
        <label for="publisher">Podaj wydawcę</label>
        <input type="text" id="publisher" name="publisher">
    </div>
    <div>
        <label for="type">Podaj gatunek</label>
        <input type="text" id="type" name="type">
    </div>
    <div>
        <button type="submit">Zapisz książkę</button>
    </div>

</form>

</body>
</html>
