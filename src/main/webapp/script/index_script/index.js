$(document).ready(function() {

    $.ajax(
        {
            url: "http://localhost:8080/frxxz/index?action=settingIndexQuestion", // 替换为您的请求地址
            method: "GET", // 根据需要选择请求方法
            data:'',
            success: function(response) {
                // 请求成功时的回调函数
                console.log(response);
                var jsonResponse = JSON.parse(response);

                $('selector').setQuestion(jsonResponse);
                $('selector').setComment();

            }
        }
    )

});


$.fn.setQuestion = function(jsonResponse) {

    $.each(jsonResponse,function (index, item) {
        var question = $('<div class="question"></div>');
        var questionContent = $('<div class="question-content"></div>');
        var questionTitle = $('<h2 class="question-title">'+item.name+'</h2>');
        var questionSummary = $('<p class="question-summary">'+'详细描述：'+item.description+'</p>');

        //隐藏的questionId
        var questionIdHidden = $('<input class="question-hidden-id" style="display: none;" value="' + item.id +'"/>');
        //隐藏域  判断comment是否已经查询过
        var firstSelectCommentFlag = $('<input class="fist-select-comment-flag" style="display: none;" value=0 />');

        //有作者 以后可能会用
        //var questionMeta = $('<p class="question-meta">作者：某某某 &nbsp;&nbsp; 发布时间：' + item.datetime+ '</p>');
        var questionMeta = $('<p class="question-meta">发布时间：' + (item.datetime==undefined?'未知':item.datetime)+ '</p>');
        var showCommentsBtn = $('<a class="show-comments-btn">查看评论</a>');
        var hideCommentsBtn = $('<a class="hide-comments-btn">收起评论</a>');

        var addComment = $('<div class="add-comment"></div>');
        var inputcomment = $('<input  type="text" id="add-comment-input" placeholder="发布一条评论吧："><br>');
        var addCommentBtn = $('<button class="submit-btn" id="add-comment-btn">发布</button>');

        //var commentList = $('<div class="comment-list"></div>');
        // var comment1 = $('<div class="comment">这是一条评论。</div>');
        // var comment2 = $('<div class="comment">这是另一条评论。</div>');

        question.append(questionContent);
        //questionContent.append(questionTitle, questionSummary, questionMeta, showCommentsBtn, hideCommentsBtn,addComment, commentList);
        questionContent.append(questionTitle, questionSummary, questionMeta, questionIdHidden,firstSelectCommentFlag,showCommentsBtn, hideCommentsBtn,addComment);
        //commentList.append(comment1, comment2);

        addComment.append(inputcomment,addCommentBtn)

        $('.container').append(question);
    })

};




$.fn.setComment = function () {
    // 获取所有“查看评论”按钮
    var showButtons = document.querySelectorAll('.show-comments-btn');

    // 遍历每个按钮，为其添加点击事件处理函数
    for (var i = 0; i < showButtons.length; i++) {
        showButtons[i].addEventListener('click', function(event) {

            // 找到当前按钮所在的问题元素
            var questionElement = event.target.closest('.question');

            questionElement.querySelector('.add-comment').style.display = 'block';

            //question-hidden-id
            var id = questionElement.querySelector('.question-hidden-id').value

            var firstSelectCommentFlag = questionElement.querySelector('.fist-select-comment-flag').value

            console.log(firstSelectCommentFlag)

            if(firstSelectCommentFlag>0){
                // 显示评论列表
                questionElement.querySelector('.comment-list').style.display = 'block';
                // 隐藏“查看评论”按钮
                questionElement.querySelector('.show-comments-btn').style.display = 'none';
                // 显示“收起评论”按钮
                questionElement.querySelector('.hide-comments-btn').style.display = 'inline-block';
            }else{
                console.log(id)
                var data = {
                    "id":id
                }
                $.ajax({
                    url: "http://localhost:8080/frxxz/index?action=selectCommentsByQuestionId", // 替换为您的请求地址
                    method: "POST", // 根据需要选择请求方法
                    data:data,
                    success: function(response) {
                        // 请求成功时的回调函数
                        console.log(response);

                        var jsonRes = JSON.parse(response);


                        var questionContent =  questionElement.querySelector('.question-content');

                        var commentList = document.createElement('div');
                        commentList.classList.add('comment-list');
                        questionContent.appendChild(commentList)

                        $.each(jsonRes,function (index, item) {
                            var cm = document.createElement('div');
                            cm.classList.add('comment');
                            cm.textContent = item.comment;
                            commentList.appendChild(cm)
                        })

                        firstSelectCommentFlag = commentList.size

                        questionElement.querySelector('.comment-list').style.display = 'block';
                        // 隐藏“查看评论”按钮
                        questionElement.querySelector('.show-comments-btn').style.display = 'none';
                        // 显示“收起评论”按钮
                        questionElement.querySelector('.hide-comments-btn').style.display = 'inline-block';
                    }
                })
            }

        });
    }

    // 获取所有“收起评论”按钮
    var hideButtons = document.querySelectorAll('.hide-comments-btn');

    // 遍历每个按钮，为其添加点击事件处理函数
    for (var i = 0; i < hideButtons.length; i++) {
        hideButtons[i].addEventListener('click', function(event) {
            // 找到当前按钮所在的问题元素
            var questionElement = event.target.closest('.question');

            questionElement.querySelector('.add-comment').style.display = 'none';
            // 隐藏评论列表
           // questionElement.querySelector('.comment-list').style.display = 'none';
            // 隐藏“收起评论”按钮
            questionElement.querySelector('.hide-comments-btn').style.display = 'none';
            // 显示“查看评论”按钮
            questionElement.querySelector('.show-comments-btn').style.display = 'inline-block';
        });
    }
}




