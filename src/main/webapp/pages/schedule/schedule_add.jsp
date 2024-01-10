<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>schedule_add</title>
    <link rel="stylesheet" href="/frxxz/css/schedule_css/schedule_add_css.css">
    <script src="/frxxz/static/jquery-3.7.1.js" type="text/javascript"></script>
    <script src="/frxxz/script/schedule_script/schedule_add_js.js"></script>
</head>
<body>
schedule-add
<div class="form-container">
    <form id="add-schedule-form">
        <label>schedule：</label>
        <input type="text" id="schedule" name="schedule" required>

        <label>detail：</label>
        <input id="detail" name="detail" required>

        <label>datetime：</label>
        <input id="datetime" name="datetime" disabled="true">
        <br>
        <button id="add-schedule-button">提交</button>
    </form>
</div>

<div id="success-message" class="success-message">提交成功</div>
</body>
</html>