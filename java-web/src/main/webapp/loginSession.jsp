<%@ page import="com.easygo.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-07
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>

<%--验证码存session--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User("lisi", "123");
    pageContext.setAttribute("user", user);
    pageContext.setAttribute("user2", null);
    pageContext.setAttribute("user3", "hello");
%>

${empty user}<br>
${empty user2}<br>
${empty user3}<br>


${user.username}<br>
${user.password}
<br>
${pageContext.request.contextPath}<br>
${param.username}<br>
${header.Accept}<br>
${header["Accept"]}<br>
设置:<br><c:set scope="page" var="num" value="${5+3}"><br>
    输入:<br><c:out value="${num}"><br>
        移除:<br><c:remove var="num"></c:remove><br>
        测试:<br><c:out value="${num}"><br>
            <form action="/webTest/LoginServlet" method="post">

            <table border="1" >
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
            <tr>
            <td colspan="2">
            请输入验证码：<input type="text" name="clientCode">
            <img alt="" src="/webTest/ValidateCodeServlet">
            </td>
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
