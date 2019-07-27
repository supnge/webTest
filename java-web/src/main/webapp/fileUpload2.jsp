<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-26
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        function addFile() {
            // $('#div1').innerHTML = "123123";

            // var div1 = document.getElementById("div1");
            var div1 = $('#div1');
            div1.get(0).innerHTML +=  "<div><input type='file' name='photo' /><input type='button' value='删除' onclick='delFile(this)'/><br /></div>";
        }
        function delFile(input) {
            // input.parentNode.parentNode.removeChild(input.parentNode);
            var div1 = $('#div1');
            div1.get(0).removeChild(input.parentNode);

        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/UploadServlet"  method="post" enctype="multipart/form-data">
    用户名:<input type="text" name="username" placeholder="请输入用户名"><br>
    密码：<input type="password" name="password" placeholder="请输入密码"><br>
    <div id="div1">
        <div>
            <input type="file" name="photo" /><input type="button" value="添加" onclick="addFile()"/><br />
        </div>
    </div>
    <input type="submit" value="提交">
</form>
</body>
</html>
