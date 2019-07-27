<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-24
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            // 监听按钮事件
            $('#loginBtn').click(function () {

                // 表单的序列化：
                console.log('把表单封装成字符串'+$('#loginForm').serialize());
                console.log('把表单封装成数组'+$('#loginForm').serializeArray());

                // 遍历数组对象
                var array = $('#loginForm').serializeArray();
                for(var i=0; i<array.length; i++){
                    console.log(array[i]);
                    console.log(array[i].name+":"+array[i].value);
                }




                // 获取参数：
                var username = $('#username').val();
                var password = $('#password').val();
                // url和参数：
                var url = '${pageContext.request.contextPath}/AjaxLoginServlet';
                var params = {'username':username, 'password':password};

                //默认json对象处理， 使用get方法 ：
                /*$.get(url, params, function (data) {
                    console.log(data);
                }, 'text');*/

                //默认json对象处理， 使用get方法 ：
                $.post(url, params, function (data) {
                    console.log(data);
                }, 'text');

            });
            
        })
    </script>
</head>
<body>
<form action="" method="get" id="loginForm">
    <table border="1">
        <tr>
            <td colspan="2" align="center">Get的登录请求，使用jquery实现</td>
        </tr>
        <tr>
            <td>用户：</td>
            <td><input type="text" id="username" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" id="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" value="登录" id = "loginBtn">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
