<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>HL</title>
    <style>
        /* 公共样式 */
        body {
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .navbar {
            background-color: #fff;
            height: 64px;
            box-shadow: 0 1px 2px rgba(0, 0, 0, 0.06);
        }

        .navbar-inner {
            max-width: 1140px;
            margin: 0 auto;
            display: flex;
            align-items: center;
            justify-content: space-between;
            height: 100%;
        }
        .navbar-brand {
            font-size: 32px;
            font-weight: bold;
            color: #0084ff;
        }
        .navbar-nav {
            display: flex;
            align-items: center;
            justify-content: flex-end;
            margin: 0;
            padding: 0;
            list-style: none;
        }

        .nav-item {
            margin-left: 16px;
        }

        .nav-link {
            font-size: 16px;
            color: #333;
            transition: all 0.3s ease;
        }

        .nav-link:hover {
            color: #0084ff;
        }

        /* 页面样式 */
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 32px 16px;
        }

        h1, h2 {
            margin: 0;
            font-weight: normal;
        }

        h1 {
            font-size: 36px;
            line-height: 1.4;
            margin-bottom: 32px;
            text-align: center;
        }

        h2 {
            font-size: 24px;
            line-height: 1.4;
            margin-bottom: 16px;
        }

        .question {
            display: flex;
            margin-bottom: 32px;
            border: 1px solid #ccc;
            border-radius: 4px;
            padding: 16px;
            transition: border-color 0.3s ease;
        }

        .question:hover {
            border-color: #999;
        }

        .question-content {
            flex-grow: 1;
        }

        .question-title {
            font-size: 20px;
            font-weight: bold;
            margin: 0;
            color: #333;
        }

        .question-summary {
            font-size: 16px;
            color: #666;
            margin: 8px 0;
        }

        .question-meta {
            font-size: 14px;
            color: #999;
        }

        .comment-list {
            margin-top: 16px;
            padding-left: 16px;
        }

        .comment {
            font-size: 14px;
            color: #666;
            margin-bottom: 8px;
        }

        .show-comments-btn, .hide-comments-btn {
            display: inline-block;
            font-size: 14px;
            color: #999;
            text-decoration: none;
            margin-left: 16px;
            cursor: pointer;
        }

        .hide-comments-btn {
            display: none;
        }
    </style>
</head>
<body>

<nav class="navbar">
    <div class="navbar-inner">
        <a href="#" class="navbar-brand">HL</a>
        <ul class="navbar-nav">
            <li class="nav-item">
                <a href="http://localhost:8080/frxxz/" class="nav-link">index</a>
            </li>

            <li class="nav-item">
                <a href="http://localhost:8080/frxxz/jump-poisoncalculate-page" class="nav-link">poe</a>
            </li>

            <li class="nav-item">
                <a href="http://localhost:8080/frxxz/jump-schedule-page" class="nav-link">schedule</a>
            </li>

            <li class="nav-item">
                <a href="http://localhost:8080/frxxz/html?action=jumpHtml" class="nav-link">html</a>
            </li>

            <li class="nav-item">
                <a href="http://localhost:8080/frxxz/css?action=jumpCss" class="nav-link">css</a>
            </li>
        </ul>
    </div>
</nav>


<div class="container">
    <div class="question">
        <div class="question-content">
            <h2 class="question-title">这是一个测试问题标题</h2>
            <p class="question-summary">这是一个测试问题摘要，只是用来填充内容的，没有实际意义。</p>
            <p class="question-meta">作者：某某某 &nbsp;&nbsp; 发布时间：2022-01-01</p>
            <a class="show-comments-btn">查看评论</a>
            <a class="hide-comments-btn">收起评论</a>
            <div class="comment-list">
                <div class="comment">这是一条评论。</div>
                <div class="comment">这是另一条评论。</div>
            </div>
        </div>
    </div>

    <div class="question">
        <div class="question-content">
            <h2 class="question-title">这是一个测试问题标题</h2>
            <p class="question-summary">这是一个测试问题摘要，只是用来填充内容的，没有实际意义。</p>
            <p class="question-meta">作者：某某某 &nbsp;&nbsp; 发布时间：2022-01-01</p>
            <a class="show-comments-btn">查看评论</a>
            <a class="hide-comments-btn">收起评论</a>
            <div class="comment-list">
                <div class="comment">这是一条评论。</div>
                <div class="comment">这是另一条评论。</div>
            </div>
        </div>
    </div>

    <div class="question">
        <div class="question-content">
            <h2 class="question-title">这是一个测试问题标题</h2>
            <p class="question-summary">这是一个测试问题摘要，只是用来填充内容的，没有实际意义。</p>
            <p class="question-meta">作者：某某某 &nbsp;&nbsp; 发布时间：2022-01-01</p>
            <a class="show-comments-btn">查看评论</a>
            <a class="hide-comments-btn">收起评论</a>
            <div class="comment-list">
                <div class="comment">这是一条评论。</div>
                <div class="comment">这是另一条评论。</div>
            </div>
        </div>
    </div>

    <div class="question">
        <div class="question-content">
            <h2 class="question-title">这是一个测试问题标题</h2>
            <p class="question-summary">这是一个测试问题摘要，只是用来填充内容的，没有实际意义。</p>
            <p class="question-meta">作者：某某某 &nbsp;&nbsp; 发布时间：2022-01-01</p>
            <a class="show-comments-btn">查看评论</a>
            <a class="hide-comments-btn">收起评论</a>
            <div class="comment-list">
                <div class="comment">这是一条评论。</div>
                <div class="comment">这是另一条评论。</div>
            </div>
        </div>
    </div>

    <div class="question">
        <div class="question-content">
            <h2 class="question-title">这是一个测试问题标题</h2>
            <p class="question-summary">这是一个测试问题摘要，只是用来填充内容的，没有实际意义。</p>
            <p class="question-meta">作者：某某某 &nbsp;&nbsp; 发布时间：2022-01-01</p>
            <a class="show-comments-btn">查看评论</a>
            <a class="hide-comments-btn">收起评论</a>
            <div class="comment-list">
                <div class="comment">这是一条评论。</div>
                <div class="comment">这是另一条评论。</div>
            </div>
        </div>
    </div>
</div>

<script>
    // 获取所有“查看评论”按钮
    var showButtons = document.querySelectorAll('.show-comments-btn');

    // 遍历每个按钮，为其添加点击事件处理函数
    for (var i = 0; i < showButtons.length; i++) {
        showButtons[i].addEventListener('click', function(event) {
            // 找到当前按钮所在的问题元素
            var questionElement = event.target.closest('.question');
            // 显示评论列表
            questionElement.querySelector('.comment-list').style.display = 'block';
            // 隐藏“查看评论”按钮
            questionElement.querySelector('.show-comments-btn').style.display = 'none';
            // 显示“收起评论”按钮
            questionElement.querySelector('.hide-comments-btn').style.display = 'inline-block';
        });
    }

    // 获取所有“收起评论”按钮
    var hideButtons = document.querySelectorAll('.hide-comments-btn');

    // 遍历每个按钮，为其添加点击事件处理函数
    for (var i = 0; i < hideButtons.length; i++) {
        hideButtons[i].addEventListener('click', function(event) {
            // 找到当前按钮所在的问题元素
            var questionElement = event.target.closest('.question');
            // 隐藏评论列表
            questionElement.querySelector('.comment-list').style.display = 'none';
            // 隐藏“收起评论”按钮
            questionElement.querySelector('.hide-comments-btn').style.display = 'none';
            // 显示“查看评论”按钮
            questionElement.querySelector('.show-comments-btn').style.display = 'inline-block';
        });
    }
</script>
</body>
</html>