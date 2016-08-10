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
<html>
<head>
    <title>Upload File Request Page</title>
    <script type="text/JavaScript" src="${pageContext.request.contextPath}/pages/js/jquery-2.1.4.min.js">
    </script>

</head>
<body>


<c:if test="${not empty lists}">

    <ul>
        <c:forEach var="listValue" items="${lists}">
            <li>${listValue}</li>
        </c:forEach>
    </ul>

</c:if>


<form method="POST" action="uploadFile" enctype="multipart/form-data">
    File to upload: <input type="file" name="file">

    <%--Name: <input type="text" name="name">--%>


    <input type="submit" value="Upload"> Press here to upload the file!

    <br>

    ${upload}
</form>
<br>
<%--<c:forEach var="file" items="${listFile}">--%>

<%--<c:out value="${file.getName()}"/>--%>

<%--</c:forEach>--%>

<progress id="progressbar" value="0" max="100"></progress>


<form id="button">
    <button class="btn_reg" type="button" onclick="isSendToFormAjax()"> update</button>
</form>



<script>


    // срабатывание кнопки
    function isSendToFormAjax() {


        isCountAll();
        console.log("log");
        $.ajax({
            url: 'uploadCsv',
            type: 'get'
        });

        console.log("log============");

        isProcent();
    }

    // вычитание процента и запись показателя в progressbar
    function isProcent() {
        var serverdata = 0;
        console.log("isprocent")
        do {
            $.ajax({

                url: 'uploadprocent',
                type: 'get',
                dataType: 'json',
                data: {},
                success: function (data) {
                    console.log(data);
                    serverdata = data;
                    $('#progressbar').val(data);
                }
            });
        } while (serverdata < 100)
    }
    // запуск на сервере метода вичитания оббш=щего колличества строк в файле
    function isCountAll() {
        $.ajax({
            url: 'uploadcountall',
            type: 'get'
        });
    }

</script>

</body>

</html>
