<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-12
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎您！${loginUsername} <a href="${pageContext.request.contextPath}/LogoutServlet">注销</a>
</body>
</html>
