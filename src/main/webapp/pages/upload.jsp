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

<form id="button">
    <button class="btn_reg" type="button" onclick="start()"> test</button>
</form>

<span id="sp"></span>


<script>


    // срабатывание кнопки
    // срабатывание кнопки
    function isSendToFormAjax() {

        console.log("log");
        //попытка загрузить файл в базу
        $.ajax({
            url: 'uploadCsv',
            type: 'get'
        });

        console.log("log============");


    }


    function start() {
        $.ajax({
            url: 'uploadCsv',
            type: 'get'
        });



        var eventSource = new EventSource("testSSE");

        eventSource.onmessage = function(event) {
            console.log(event.data);

            $('#progressbar').val(event.data);
            document.getElementById('sp').innerHTML = event.data;

        };

    }


</script>

</body>

</html>
