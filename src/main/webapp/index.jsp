<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>eula</title>
    <script src="/frxxz/static/jquery-3.7.1.js" type="text/javascript"></script>
    <script>
        $(document).ready(
            function () {

                $.ajax(
                    {
                        url: "http://localhost:8080/frxxz/index?action=settingIndexCatalogue", // 替换为您的请求地址
                        method: "GET", // 根据需要选择请求方法
                        success: function(response) {
                            // 请求成功时的回调函数
                            console.log(response);
                            var jsonResponse = JSON.parse(response);
                            var menu = $("#index_catalogue");
                            $.each(jsonResponse,function (index, item) {
                                var newItem = $("<li></li>");
                                var newLink = $("<a></a>");
                                newLink.attr("href", item.href).text(item.name);
                                newItem.append(newLink);
                                menu.append(newItem);
                            })
                        }
                    }
                )
            }
        )
    </script>
    <style>
        body {
            background-color: lightgrey; /* 将整个页面的背景颜色设置为灰色 */
            margin: 0; /* 去掉默认外边距 */
            padding: 0; /* 去掉默认内边距 */
        }
         #runoob-detail-nav{
            background-color: aqua;
            display: flex; /* 将 ul 元素变为弹性容器 */
            justify-content: center; /* 沿主轴方向居中对齐 */
            align-items: center; /* 沿交叉轴方向居中对齐 */
            list-style: none; /* 去掉列表样式 */
            margin: 0; /* 去掉默认外边距 */
            padding: 0; /* 去掉默认内边距 */
            width: 100%; /* 设置宽度为父元素的100% */
        }

        li {
            margin-right: 10px; /* 为每个元素设置右外边距，使它们之间有间隔 */
        }

        #index_catalogue{
            list-style-type: none; /* 将列表样式设置为无样式 */
            margin: 0; /* 去掉默认外边距 */
            padding: 0; /* 去掉默认内边距 */

            position: fixed; /* 设置导航条为固定定位 */
            /*top: 50%; /* 将导航条向下移动50%的高度 */
            /*transform: translateY(-50%); /* 使用 transform 属性将导航条再向上移动50%的高度，以居中对齐 */
            left: 60px; /* 将导航条距离左侧边距离设为20px */
        }
    </style>
</head>
<body>
<h1 align="center">eula</h1>

<div class="container_navigation">
    <div class="row">
        <div class="col nav">
            <ul class="pc-nav" id="runoob-detail-nav">
                <li> <a href="http://localhost:8080/frxxz/jump-poisoncalculate-page">poe</a></li>
                <li><a href="http://localhost:8080/frxxz/jump-schedule-page">schedule</a></li>
                <li>javaSE</li>
                <li><a href="http://localhost:8080/frxxz/html?action=jumpHtml">html</a></li>
                <li>css</li>
                <li>javascript</li>
            </ul>
        </div>
    </div>
</div>

<nav id="cemian_nav">
    <ul id="index_catalogue">

    </ul>
</nav>
</body>
</html>