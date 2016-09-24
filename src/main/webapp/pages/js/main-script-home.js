$(window).load(function () {
    $.ajax({
        url: 'catname1',
        type: 'GET',
        dataType: 'json',
        data: {},
        success: function (data) {

            var res = JSON.parse(JSON.stringify(data));


            $('#category1').each(function () {
                $.each(res, function (index, value) {
                    if (value === "folse") {
                        $('#category1').append("<span> <h2>Категорий нет</h2></span>");
                    } else {
                        $('#category1').append("<li><a href=\"#\">" + value + "<i class=\"icons icon-right-dir\"></i></a></li>");
                    }
                });
            });
        }
    });
});