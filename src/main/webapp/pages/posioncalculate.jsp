<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Poison Calculate</title>
    <style>
        body {
            justify-content: center;
        }
    </style>

    <script src="/frxxz/static/jquery-3.7.1.js" type="text/javascript"></script>

    <script>
        $(document).ready(function () {
            $('#poisoncalculate').submit(
                function (event){
                    console.log('poisoncalculate submit')
                    //阻止表单默认提交
                    event.preventDefault()
                    var formdata = $(this).serialize();
                    console.log(formdata)
                    $.ajax({
                        url:'http://localhost:8080/frxxz/poisoncalculate',
                        type:'post',
                        data:formdata,
                        success:function (response){
                            console.log(response)
                        }
                    })
                    console.log('结束')
                }
            );
        });
    </script>
</head>
<body>
<h1 align="center">Poison Calculate</h1>
<br>
<br>
<br>
<br>


<form id='poisoncalculate'>
    物理伤害 <input name="phydamagesmall"/> <input name="phydamagebig"/><br>
    闪电伤害 <input name="lightdamagesmall"/> <input name="lightdamagebig"/><br>
    火焰伤害 <input name="firedamagesmall"/> <input name="firedamagebig"/><br>
    冰霜伤害 <input name="icedamagesmall"/> <input name="icedamagebig"/><br>
    <input type="submit"/><br>
    总伤害<input disabled/></textarea><br>
</form>
<br>
<button onclick="alert('Hello World!')">按钮</button>

<!--src="/frxxz/static/jquery-3.7.1.js"-->



</body>
</html>