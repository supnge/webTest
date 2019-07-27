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
        $(function () {
            /* 知识点一、append添加的是子标签 */
            $('#btn1').click(function() {
                $('ul').append('<li>JS从入门到精通</li>');
            });
            $('#btn2').click(function() {
                $('ul').prepend('<li>H5从入门到精通</li>');
            });
            /* 知识点二、ul>li子标签的前面和后面添加元素 */
            $('#btn3').click(function () {
                $('ul').eq(2).before('<li>Oracle从入门到精通</li>');
            })
            $('#btn4').click(function() {
                $('li').eq(2).after('<li>SVN从入门到精通</li>');
            });
            /* 知识点三、删除li的最后一个标签 */
            $('#btn5').click(function () {
                $('ul').last().remove();
            })
            /* 知识点四、从被先元素中删除子元素 */
            $('#btn6').click(function() {
                $('ul').empty();
            });

            /* 知识点五、表单的值设置和获取 */
            $('#btn7').click(function() {
                alert($('#username').val());
            });
            $('#btn8').click(function() {
                $('#username').val('郭永峰');
            });
            /* 知识点六、表单的属性设置和获取 */
            $('#btn9').click(function() {
                alert($('#username').attr('placeholder'));
            });

            $('#btn10').click(function() {
                $('#username').attr('placeholder','please input your name');

                /* 知识点七、标签的内容设置和获取 */
                $('span').html('薛之千');//设置
                console.log($('span').html());//取内容
            });



        });
    </script>
</head>
<body>
    <button id="btn1">1.在被选元素结尾插入</button>
    <button id="btn2">2.在被选元素开头插入</button>
    <button id="btn3">3.在被选元素之前插入</button>
    <button id="btn4">4.在被选元素之后插入</button>
    <button id="btn5">5.删除被选元素（包括子元素）</button>
    <button id="btn6">6.从被选元素中删除子元素</button>
    <button id="btn7">7.获取html标签的内容</button>
    <button id="btn8">8.设置html标签的内容</button>
    <button id="btn9">9.获致html标签属性的内容</button>
    <button id="btn10">10.设置html标签属性的内容</button>
    <br>java开发工程师课程内容
    <br>
    <ul>
        <li>Java基础从入门到精通</li>
        <li>JavaWeb从入门到精通</li>
        <li class='show'>J2EE框架从入门到精通</li>
        <li>MySql数据库从入门到精通</li>
    </ul>
    <p></p>
    <input id="username" name="username" placeholder="请输入用户名" value="">
    <span>要处理的内容 </span>
</body>
</html>
