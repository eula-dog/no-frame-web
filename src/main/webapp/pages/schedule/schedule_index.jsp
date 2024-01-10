<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>schedule</title>
    <script src="/frxxz/static/jquery-3.7.1.js" type="text/javascript"></script>
    <script src="/frxxz/script/schedule_script/schedule_index_js.js" type="text/javascript"></script>
    <link rel="stylesheet" href="/frxxz/css/schedule_css/schedule_index_css.css">
</head>
<body>
<a href="http://localhost:8080/frxxz/schedule?action=goToScheduleAddPage">add-schedule</a>

<%--style="border: 3px solid lightblue; width: 60%; padding: 10px; margin-top: 40px; text-align: center;"--%>
<%--style="border: 3px solid lightblue; padding: 10px; margin: 30px auto; text-align: center; width: 60%;"--%>
<div id="select-condition" style="border: 3px solid lightblue; padding: 10px; margin: 30px auto; text-align: center; width: 60%;">
    <label for="date-input">日期：</label>
    <input type="date" id="date-input">
    &nbsp;&nbsp;&nbsp;&nbsp;
    <label for="select-schedule-status">状态：</label>
    <select id="select-schedule-status">
        <option value="option1">选项1</option>
        <option value="option2">选项2</option>
        <option value="option3">选项3</option>
    </select>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <label for="date-input">关键字：</label>
    <input id="schedule-key-word">

    &nbsp;&nbsp;&nbsp;
    <button id="select-schedule-with-condition">查询</button>
</div>

<div>
    <table id="schedule-select-result-table">
        <tr>
            <th class="time-column">start-time</th>
            <th class="schedule-column">schedule</th>
            <th class="detail-column">detail</th>
        </tr>
        <tbody id="schedule-table-body">

        </tbody>
    </table>
</div>
</body>
</html>