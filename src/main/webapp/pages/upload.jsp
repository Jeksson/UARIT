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
    <script>
        var progressBar = $('#progressbar')
        var progressBarMaxSize;

        function isSendToFormAjax() {

            $.ajax({
                url: 'uploadCsv',
                type: 'get',
                data: {},
                success: function (data) {
                    console.log(data);
                    progressBarMaxSize.val(data);
                    for (var i = 0; i < progressBarMaxSize; i++) {
                        $.ajax({
                            url: 'statusupload',
                            type: 'get',
                            data: {},
                            success: function (data) {
                                var percent = Math.ceil(progressBarMaxSize / data * 100);
                                progressBar.val(percent);
                            }
                        });
                    }
                }
            });
        }

    </script>
</head>
<body>
<form method="POST" action="uploadFile" enctype="multipart/form-data">
    File to upload: <input type="file" name="file">

    <%--Name: <input type="text" name="name">--%>


    <input type="submit" value="Upload"> Press here to upload the file!
</form>
<br>
<form method="get" action="uploadCsv">
    <input type="submit" value="Download">
</form>
<progress id="progressbar" value="0" max="100"></progress>
<form id="button">
    <button class="btn_reg" type="button" onclick="isSendToFormAjax()"> update </button>
</form>


</body>

</html>
