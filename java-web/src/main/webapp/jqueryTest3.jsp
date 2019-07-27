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
        #div1{width: 100px; height: 100px; background-color: #0066FF}
        #div2{width: 100px; height: 100px; background-color: crimson}
    </style>
    <script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        console.log("*****");
        $(function () {
            $('#div1').css('background-color','red');
            $('span#span1').css('background-color', 'yellow');
            $('div p.p2').css('background-color','#0066FF')
        })


    </script>
</head>
<body>
<div id="div1">
    <span id="span1">AA</span>
    <span class="span2">BB</span>
</div>
<div id="div2">
    <p>段落1</p>
    <p class="p2">段落2</p>
    <p>段落3</p>
</div>
</body>
</html>
