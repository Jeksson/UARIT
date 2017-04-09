<%--
  Created by IntelliJ IDEA.
  User: jekss
  Date: 18.07.16
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<jsp:include page="_header.jsp"/>


<form name="Form">
    <ul id="ul" class="ul">

    </ul>
</form>

<form method="POST" action="upload" enctype="multipart/form-data">
    File to upload: <input type="file" name="file" accept="text/csv">


    <input type="submit" value="Upload"> Press here to upload the file!

    <br>

</form>
<br>


<progress id="progressbar" value="0" max="100" style="border-radius: 2px;"></progress>


<form id="button">
    <button class="btn_reg" type="button" onclick="start()"> update</button>
    <br>
    <span id="span"></span>
</form>

<span id="sp"></span>
<ul id="tabl">

</ul>


<script src="${pageContext.request.contextPath}/pages/js/jquery-2.1.4.min.js"></script>
<script>

    $(window).load(function () {
        $.ajax({
            url: 'listfileindirectory',
            type: 'GET',
            dataType: 'json',
            data: {},
            success: function (data) {

                var res = JSON.parse(JSON.stringify(data));


                $('#ul').each(function () {
                    $.each(res, function (index, value) {
                        if (value === "folse") {
                            $('#ul').append("<span> <h2>Файлов нет</h2></span>");
                        } else {
                            $('#ul').append("<li style='list-style-type: none'>" + "<div class='checkbox'><label><input type='checkbox'  id=\"" + value + "\">" + value + "</label></div></li>");
                        }
                    });
                });
            }
        });
    });


    //отдает id на чекбоксе
    var var_form = function f() {
        var forma = document.forms.Form;
        var n = forma.querySelectorAll('[type="checkbox"]'),
                l = forma.querySelectorAll('[type="checkbox"]:checked');
        return $(l).attr('id');
    };

// запускает апгрейд
    function start() {

        document.getElementById('span').innerHTML = "";
        console.log(var_form() + " start");

        if (var_form() === undefined) {
            document.getElementById('span').innerHTML = "Выберите файл";

        } else {

            $.ajax({
                url: 'uploadCsv',
                type: 'get',
                data: ({
                    name: var_form()
                }),
                success: function (data) {
                    if(data == "ok") {
                        $('#progressbar').val(100);
                    }
                }
            });


            var eventSource = new EventSource("testSSE");

            eventSource.onmessage = function (event) {
                if(event.data < 100) {
                    $('#progressbar').val(event.data);
                    document.getElementById('span').innerHTML = event.data;
                }else if (event.data >= 100) {
                    $('#progressbar').val(event.data);
                    document.getElementById('span').innerHTML = event.data;

                    eventSource.close();
                } else { eventSource.close();}
            };
        }
    }

//блокирует чекбоксы если выбрано больше одого
    var f = document.forms.Form;
    f.onchange = function () {
        var n = f.querySelectorAll('[type="checkbox"]'),
                l = f.querySelectorAll('[type="checkbox"]:checked');
        for (var j = 0; j < n.length; j++)
            if (l.length >= 1) { // если отметить три и более галочки
                n[j].disabled = true; // все чекбоксы становятся disabled
                for (var i = 0; i < l.length; i++)
                    l[i].disabled = false; // но disabled убирается с помеченных галочками чекбоксов
            } else {
                n[j].disabled = false; // если выделить менее трёх галочек, то disabled снимается со всех чекбоксов
            }
    }


</script>

</body>

</html>
