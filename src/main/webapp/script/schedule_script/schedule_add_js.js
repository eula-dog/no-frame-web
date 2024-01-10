$(document).ready(function () {
    var formattedDateTime = getTime()

    $("#datetime").val(formattedDateTime);



    $('#add-schedule-button').click(function (event) {

        event.preventDefault();

        var schedule = $('#schedule').val()
        var detail = $('#detail').val()
        var datetime = $('#datetime').val()

        var Data = {
            schedule:schedule,
            detail:detail,
            dateTime:datetime
        }
        var formData = JSON.stringify(Data)
        console.log(formData)
        $.ajax(
            {
                url: "http://localhost:8080/frxxz/schedule?action=addSchedule", // 替换为您的请求地址
                method: "POST", // 根据需要选择请求方法
                data:Data,
                success: function(response) {
                    // 显示提交成功消息
                    $('#success-message').fadeIn();

                    // 清空表单字段的值
                    $('#add-schedule-form')[0].reset();

                    var formattedDateTime = getTime()
                    console.log(formattedDateTime)
                    $("#datetime").val(formattedDateTime);

                    // 在3秒后隐藏提交成功消息
                    setTimeout(function() {
                        $('#success-message').fadeOut();
                    }, 3000);
                },
                error: function (response) {
                    console.log(response)
                }
            }
        )
    })
})


function getTime(){
    // 获取当前日期和时间
    var currentDateTime = new Date();

    // 格式化日期和时间
    var year = currentDateTime.getFullYear();
    var month = ("0" + (currentDateTime.getMonth() + 1)).slice(-2);
    var day = ("0" + currentDateTime.getDate()).slice(-2);
    var hours = ("0" + currentDateTime.getHours()).slice(-2);
    var minutes = ("0" + currentDateTime.getMinutes()).slice(-2);

    // 构造日期时间字符串
    var formattedDateTime = year + "-" + month + "-" + day + " " + hours + ":" + minutes;

    return formattedDateTime;
}