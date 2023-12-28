$(document).ready(
    function () {
        var formdata = $('#add_form').serialize()
        $("#add_form").submit(function (event) {
                //阻止表单默认提交
                event.preventDefault()
                var formdata = $(this).serialize();
                console.log(formdata)
                $.ajax({
                    url:'http://localhost:8080/frxxz/catalogue?action=addCatalogue',
                    type:'post',
                    data:formdata,
                    success:function (response){
                        console.log(response)
                        location.reload()
                    }
                })
                console.log('结束')
        })
    }
)