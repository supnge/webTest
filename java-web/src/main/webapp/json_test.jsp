<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-24
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        console.log("--------------json字符串转对象--------------");
        var str = '{ "firstName":"Thomas" , "lastName":"Carter" }';
        console.log(str);

        // 转成json对象
        var jsonObj = JSON.parse(str);
        console.log(jsonObj);

        // 转成
        console.log("--------------json对象转字符串--------------");
        var jsonObj2 = {firstName:"zhang", lastName:"san"};
        console.log(jsonObj2);

        var jsonStr = JSON.stringify(jsonObj2);
        console.log(jsonStr);

        // 便利json字符串：
        var jsonArray = '[\n' +
            '{ "firstName":"Bill" , "lastName":"Gates" },\n' +
            '{ "firstName":"George" , "lastName":"Bush" },\n' +
            '{ "firstName":"Thomas" , "lastName":"Carter" }\n' +
            ']';
        var objArray = JSON.parse(jsonArray);

        for(var i =0; i<objArray.length; i++){
            console.log("firstName="+objArray[i].firstName + "  lastName="+ objArray[i].lastName);
        }

        // 编码 解码
        var urlStr = 'LoginServlet?username=张三丰&password=123';
        var url1 = encodeURI(urlStr);
        var url2 = encodeURIComponent(urlStr);

        console.log('加密，使用encodeURI：'+url1);
        console.log('加密，使用encodeURIComponent：'+url2);

        console.log('解密，使用decodeURI：'+decodeURI(url1));
        console.log('解密，使用decodeURIComponent：'+decodeURIComponent(url2));

    </script>
</head>
<body>


</body>
</html>
