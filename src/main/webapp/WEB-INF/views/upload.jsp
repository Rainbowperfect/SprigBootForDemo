<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring boot上传图片测试</title>
</head>
<body>
<form action="/upload/uploadImage" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadImage"><br>
    <input type="submit">
</form>
</body>
</html>
