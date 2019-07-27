<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-24
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        // 1. js监听文档是否加载完：
        window.onload = function () {
            document.getElementById("div1").innerHTML = "div1";
        };

        // 2. 代替方案 使用jquery 相当于window.onload = function () {}
        $(function () {
            document.getElementById("div2").innerHTML = "div2";
            
        });

        // 3.使用jquery 没有前一种简洁
        $(document).ready(function () {
            document.getElementById("div3").innerHTML = "div3";
        });


    </script>
</head>
<body>
<div id="div1"></div>
<div id="div2"></div>
<div id="div3"></div>
</body>
</html>
