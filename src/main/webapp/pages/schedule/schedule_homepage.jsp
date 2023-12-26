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

                $("#select_one_description").click(
                    function (event){
                        console.log("select one description")
                        var descriptionId = $('#descriptionId').val();
                        console.log(descriptionId)
                        var data = {
                            id: descriptionId
                        };
                        $.ajax({
                            url:'http://localhost:8080/frxxz/description?action=getOneDescription',
                            type:'post',
                            data:data,
                            success:function (response) {
                                console.log('---------------------')
                                console.log(response)
                                var jsonResponse = JSON.parse(response);
                                $('#id').val(jsonResponse.id)
                                $('#name').val(jsonResponse.name)
                                $('#des').val(jsonResponse.description)
                                console.log('---------------------')
                            }
                        })
                        console.log('end...')
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

<br>
<br>
<br>
<form id='description'>
    id<input id="id" name="descriptionId"></form>
    name<input id="name" name="descriptionName"></form><br>
    description<input id="des" name="descriptionDescription"></form><br>
<input type="submit"/><br>
</form>

<input id="descriptionId">
<button id="select_one_description">查询一条信息</button>

</body>
</html>