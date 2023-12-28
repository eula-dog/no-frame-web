$(document).ready(
    function () {
        $('#add').click(function () {
            var name = $('#name').val()
            var content = $('#content').val()
            var data = {
                "name":name,
                "content":content
            }
            console.log(JSON.stringify(data))
            $.ajax({
                url:'http://localhost:8080/frxxz/index?action=addQuestion',
                method:'post',
                data:data,
                success:function (response){
                    alert('新增成功');
                },
                error:function (){

                }
            })
        })
    }
)