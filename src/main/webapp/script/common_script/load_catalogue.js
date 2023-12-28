$(document).ready(
    function () {
        var formdata = $('#index_catalogue_type').serialize()
        $.ajax(
            {
                url: "http://localhost:8080/frxxz/index?action=settingIndexCatalogue", // 替换为您的请求地址
                method: "GET", // 根据需要选择请求方法
                data:formdata,
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