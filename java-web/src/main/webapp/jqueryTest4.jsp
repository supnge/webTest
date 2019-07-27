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
        #div1 {
            width: 100px;
            height: 100px;
            background-color: #0066FF
        }

        #div2 {
            width: 100px;
            height: 100px;
            background-color: crimson
        }
    </style>
    <script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function() {
            // $('li').css('background-color','red');
            //第一个
            $('li:first').css('background-color','red');

            //第二个
            //$('li:last').css('background-color','red');

            //奇数个
            //$('li:odd').css('background-color','red');

            //偶数个
            //$('li:even').css('background-color','blue');

            //指定索引
            //$('li:eq(2)').css('background-color','blue');

            //小于
            //$('li:lt(2)').css('background-color','blue');

            //大于
            //$('li:gt(2)').css('background-color','gray');

            //不等于
            // $('li:not(.show)').css('background-color','gray');
        });
    </script>
</head>
<body>
<ul>
    <li>Java基础从入门到精通</li>
    <li>JavaWeb从入门到精通</li>
    <li class='show'>J2EE框架从入门到精通</li>
    <li>MySql数据库从入门到精通</li>
</ul>
</body>
</html>
