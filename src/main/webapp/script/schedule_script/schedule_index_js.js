$(document).ready(function (){
    $('#select-schedule-with-condition').click(function (event) {
        //清空表格
        event.preventDefault();
        //查询内容
        selectSchedule();
    })
})


function selectSchedule(){
    //清空表格数据
    $("#schedule-table-body").empty();

    var datetime = $('#date-input').val()
    var status = $('#select-schedule-status').val()
    var keyword = $('#schedule-key-word').val()

    var data = {
        datetime:datetime,
        status:status,
        keyword:keyword
    }

    console.log(JSON.stringify(data))

    $.ajax({
        url:'http://localhost:8080/frxxz/schedule?action=selectSchedule',
        method:'GET',
        data:data,
        success:function (response) {
            //设置表格数据
            setTableContent(response)
        }
    })
}

function setTableContent(response){
    var tableBody = $("#schedule-table-body");
    console.log(response)
    var list = JSON.parse(response)
    $.each(list,function (index, item) {
        var row = $("<tr>");
        row.append($("<td>").text(item.dateTime));
        row.append($("<td>").text(item.schedule));
        row.append($("<td>").text(item.detail));
        tableBody.append(row);
    })
}

