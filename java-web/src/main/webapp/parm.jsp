<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-06
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--提交参数 获取参数--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/webTest/HelloServlet" method="get">
    用户名：<input type="text" name="username"><br>
    密---码：<input type="password" name="password"><br>
    性---别：<input type="radio" name="gender" value="男">男
    <input type="radio" name="gender" value="女">女<br>
    爱---好：<input type="checkbox" name="hobby" value="写代码">写代码
    <input type="checkbox" name="hobby" value="看书">看书
    <input type="checkbox" name="hobby" value="听课">听课<br>
    备---注：<textarea rows="5" cols="20" name="remark"></textarea><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
