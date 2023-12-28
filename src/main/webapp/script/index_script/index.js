$(document).ready(function() {

    var question = $('<div class="question"></div>');
    var questionContent = $('<div class="question-content"></div>');
    var questionTitle = $('<h2 class="question-title">这是一个测试问题标题</h2>');
    var questionSummary = $('<p class="question-summary">这是一个测试问题摘要，只是用来填充内容的，没有实际意义。</p>');
    var questionMeta = $('<p class="question-meta">作者：某某某 &nbsp;&nbsp; 发布时间：2022-01-01</p>');
    var showCommentsBtn = $('<a class="show-comments-btn">查看评论</a>');
    var hideCommentsBtn = $('<a class="hide-comments-btn">收起评论</a>');
    var commentList = $('<div class="comment-list"></div>');
    var comment1 = $('<div class="comment">这是一条评论。</div>');
    var comment2 = $('<div class="comment">这是另一条评论。</div>');

    questionContent.append(questionTitle, questionSummary, questionMeta, showCommentsBtn, hideCommentsBtn, commentList);
    commentList.append(comment1, comment2);
    question.append(questionContent);

    $('.container').append(question);


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
});




