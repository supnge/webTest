<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-12
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/RegisterServlet" method="post">
    <table border="1">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" value="${uf.username}">${uf.err.username}</td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" value="${uf.password}">${uf.err.password}</td>
        </tr>
        <tr>
            <td>确认密码：</td>
            <td><input type="password" name="repassword" value="${uf.repassword}">${uf.err.repassword}</td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td><input type="text" name="email" value="${uf.email}">${uf.err.email}</td>
        </tr>
        <tr>
            <td>生日：</td>
            <td><input type="text" name="birthday" value="${uf.birthday}">${uf.err.birthday}</td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
