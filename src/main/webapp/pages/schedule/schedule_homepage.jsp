<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>首页</title>
    <style>
        body {
            justify-content: center;
        }
    </style>
    <script src="/frxxz/static/jquery-3.7.1.js" type="text/javascript"></script>
    <script>
        $(document).ready(
            function () {
                $("#scheduleform").submit(
                    function (event) {
                        console.log("scheduleform submit...")
                        event.preventDefault()
                        var formdata = $(this).serialize();
                        $.ajax({
                            url:'http://localhost:8080/frxxz/schedule/schedule_form_submit',
                            type:'post',
                            data:formdata,
                            success:function (response){
                                console.log(response)
                            }
                        })
                        console.log('结束')
                    }
                )

            }
        )
    </script>
</head>
<body>
<h1 align="center">schedule</h1>
<br>
<button onclick="window.location.href='http://localhost:8080/frxxz/common/return_to_homepage'">return to homepage</button>
<br><br><br><br>
<form id='scheduleform'>
    1<input name="scheduleform_first"></form>
    2<input name="scheduleform_second"></form><br>
    3<input name="scheduleform_third"></form><br>
    <input type="submit"/><br>
</form>

</body>
</html>