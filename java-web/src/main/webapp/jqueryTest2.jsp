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
    <style type="text/css">
        .div1{width: 100px; height: 100px; background-color: #0066FF}
        .div2{width: 100px; height: 100px; background-color: crimson}
    </style>
    <script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $('button').click(function () {
                $('.div1').width(200);
                $('.div1').height(200);
            })
        })

    </script>
</head>
<body>
<div class="div1"></div>
<div class="div2"></div>
<button id = "btn">点击放大</button>
</body>
</html>
