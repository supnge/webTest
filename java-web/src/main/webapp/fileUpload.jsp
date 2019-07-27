<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-26
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/UploadServlet" method="post" enctype="multipart/form-data">
    用户：<input type="text" id="username" name="username" placeholder="请输入用户名"><br>
    密码：<input type="password" id="password" name="password" placeholder="请输入密码"><br>
    文件：<input type="file" name="file">
    <input type="submit" value="提交">
</form>
</body>
</html>
