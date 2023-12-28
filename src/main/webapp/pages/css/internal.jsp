<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <script src="/frxxz/static/jquery-3.7.1.js" type="text/javascript"></script>
    <script src="/frxxz/script/common_script/add_catalogue.js"></script>
    <link rel="stylesheet" href="/frxxz/css/css/internal.css">
</head>
<body>
<form id="add_form">
    <input id="catalogue_type" name="type" style="display: none;" value="2">
    <input  name="level" style="display: none;">
    <label for="name">名称：</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="name">链接：</label>
    <input  type="text" name="href"><br><br>
    <input type="submit"/>
</form>
</body>
</html>