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
</head>
<body>
<form method="POST" action="uploadFile" enctype="multipart/form-data">
    File to upload: <input type="file" name="file">

    Name: <input type="text" name="name">


    <input type="submit" value="Upload"> Press here to upload the file!
</form>
<br>
<form method="get" action="uploadCsv">
    <input type="submit" value="Download">
</form>
</body>
</html>
