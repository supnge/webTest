<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-07
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/webTest/LoginServlet" method="get">

    <table border="1">
        <tr>
            <td colspan="2"><span style="color: red;">${exception.message}</span></td>
        </tr>
        <tr>
            <td>
                用户名：
            </td>
            <td><input id="username" type="text" name = "username"></td>
        </tr>
        <tr>
            <td>
                密码：
            </td>
            <td><input id="password" type="password" name = "password"></td>
        </tr>

    </table>
</form>

<form action="/webTest/LoginServlet" method="post">

    <table border="1">
        <tr>
            <td colspan="2"><span style="color: red;">${exception.message}</span></td>
        </tr>
        <tr>
            <td>
                用户名：
            </td>
            <td><input id="username2" type="text" name = "username2"></td>
        </tr>
        <tr>
            <td>
                密码：
            </td>
            <td><input id="password2" type="password" name = "password2"></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
