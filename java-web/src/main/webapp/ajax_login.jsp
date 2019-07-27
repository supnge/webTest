<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-24
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function getLogin() {
            // 1.获取表单值

            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;

            var params = 'username='+username+'&password='+password;

            console.log(params);

            // 2. 获取XMLHttpRequest 对象
            var request = new XMLHttpRequest();

            // 3. 发送get请求，把请求参数放到？后面
            <%--request.open('get','${pageContext.request.contextPath}/AjaxLoginServlet?'+params);--%>
            <%--request.send();--%>

            // 3. 发送post请求，把请求参数放到send方法中：
            request.open('post', '${pageContext.request.contextPath}/AjaxLoginServlet');
            // 设置请求头
            request.setRequestHeader("Content-type","application/x-www-form-urlencoded");

            request.send(params);


            // 4.监听准备状态的改变
            request.onreadystatechange= function(){
                console.log(request.readyState + ' - ' + request.status);
                if(request.readyState == 4 && request.status == 200){
                    var respTxt = request.responseText;
                    console.log("响应信息为："+ respTxt);

                    var respText = JSON.parse(respTxt);

                    if(respText.success ==1){
                        alert('登录成功！');
                    }else {
                        alert('登录失败')
                    }

                    /*
                    if(respTxt =="success"){
                        alert('登录成功');
                    }else {
                        alert('登录失败')
                    }
                    */
                }
            }

        }
        
    </script>
</head>
<body>
<form action="" method="get">
    <table border="1">
        <tr>
            <td colspan="2" align="center">Get的登录请求，使用ajax实现</td>
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
                <input type="button" value="登录" onclick="getLogin();">
            </td>
        </tr>

    </table>
</form>

</body>
</html>
