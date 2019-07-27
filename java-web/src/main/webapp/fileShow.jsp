<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-27
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 引入JQuery -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
    <!-- 引入EasyUI -->
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-easyui-1.8.2/jquery.easyui.min.js"></script>
    <!-- 引入EasyUI的样式文件-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/jquery-easyui-1.8.2/themes/default/easyui.css"
          type="text/css"/>
    <!-- 引入EasyUI的图标样式文件-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/jquery-easyui-1.8.2/themes/icon.css"
          type="text/css"/>
</head>
<body>

<a
        href="${pageContext.request.contextPath}/ShowFileServlet?id=">
    <img
            src="${pageContext.request.contextPath}/admin/images/i_edit.gif"
            border="0" style="CURSOR: hand"> </a>

    <form action="${pageContext.request.contextPath}/ShowFileServlet">
        <input name ="sourcePath" name ="sourcePath" value="/Users/supeng/IdeaProjects/webTest/java-web/target/java-web-1.0-SNAPSHOT/WEB-INF/upload">
        <input type="submit" value="登录">
    </form>
</body>
</html>
