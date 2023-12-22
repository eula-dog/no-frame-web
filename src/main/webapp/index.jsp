<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2023/12/19
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
程序启动
<form action="/" method="post">
        <!-- 标题输入框 -->
        <label for="name">标题:</label>
        <input type="text" id="name" name="name" required>

        <br>   

        <!-- 描述输入框 -->
        <label for="description">描述:</label>

        <input type="text" id="description" name="description" required>

        <br>


    <!-- 提交按钮 -->
   <input type="submit" value="提交">
</form>
</body>
</html>
