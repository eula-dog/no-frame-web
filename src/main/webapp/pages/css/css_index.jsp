<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>css</title>
    <script src="/frxxz/static/jquery-3.7.1.js" type="text/javascript"></script>
    <script src="/frxxz/script/common_script/load_catalogue.js"></script>
    <script src="/frxxz/script/common_script/add_catalogue.js"></script>
    <link rel="stylesheet" href="/frxxz/css/common_css/common.css">
</head>
<body>
<h1 align="center">eula</h1>
<input id="index_catalogue_type" name="id" style="display: none;" value="2">
<div class="container_navigation">
    <div class="row">
        <div class="col nav">
            <ul class="pc-nav" id="runoob-detail-nav">
                <li> <a href="http://localhost:8080/frxxz/">index</a></li>
                <li> <a href="http://localhost:8080/frxxz/jump-poisoncalculate-page">poe</a></li>
                <li><a href="http://localhost:8080/frxxz/jump-schedule-page">schedule</a></li>
                <li>javaSE</li>
                <li><a href="http://localhost:8080/frxxz/html?action=jumpHtml">html</a></li>
                <li><a href="http://localhost:8080/frxxz/css?action=jumpCss">css</a></li>
                <li>javascript</li>
            </ul>
        </div>
    </div>
</div>

<nav id="cemian_nav">
    <ul id="index_catalogue">

    </ul>
</nav>

<!--<iframe src="/frxxz/pages/css/internal.jsp" width="80%" height="700"></iframe>-->
<div id="main_internal_frame">
    <br>
    <form id="add_form">
        <input id="catalogue_type" name="type" style="display: none;" value="2">
        <input  name="level" style="display: none;">
        <label for="name">名称：</label>
        <input type="text" id="name" name="name"><br><br>
        <label for="name">链接：</label>
        <input  type="text" name="href"><br><br>
        <input type="submit"/>
    </form>
</div>

</body>
</html>