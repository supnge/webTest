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
    <script type="text/javascript" >
        var cookies = document.cookie.split(";");
        // console.log(cookies);

        function getCK(mkey) {

            for(var i = 0;i<cookies.length;i++){
                var kv = cookies[i].split('=');
                //key有可能空字符串
                if( kv[0].trim() == mkey){
                    return kv[1].trim();
                }
            }

            return '';
        }

        window.onload = function(){
            var remember = getCK('remember');
            var username = getCK('username');

            console.log(remember + "---");
            console.log(username);

            if(remember=="true"){
                var userNameInput = document.getElementById('username');
                userNameInput.value = username;

                var rememberInput = document.getElementById('remember');
                rememberInput. checked="checked";
            }

        }



    </script>
</head>
<body>
<form action="/webTest/HelloServlet" method="post">

    <table border="1">
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
                <input id="remember" type="checkbox" name="remember" value="true">记住密码
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
