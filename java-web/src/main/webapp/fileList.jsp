<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-27
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <!-- 引入JQuery -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
    <!-- 引入EasyUI -->
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-easyui-1.8.2/jquery.easyui.min.js"></script>
    <!-- 引入EasyUI的样式文件-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/jquery-easyui-1.8.2/themes/default/easyui.css"
          type="text/css"/>
    <!-- 引入EasyUI的图标样式文件-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/jquery-easyui-1.8.2/themes/icon.css"
          type="text/css"/>
    <script type="text/javascript">
        console.log(${fileString});
        $('#tt').treegrid({
            url: 'data/treegrid_data.json',
            idField: 'id',
            treeField: 'name',
            columns: [[
                {title: 'name', field: 'name', width: 180},
                {field: 'size', title: 'size', width: 60, align: 'right'},
                {field: 'date', title: 'date', width: 80}
            ]]
        });

        $('#test').treegrid({
            url: 'data/treegrid_data.json',
            idField: 'id',
            treeField: 'name',
            columns: [[
                {title: 'name', field: 'name', width: 180},
                {field: 'size', title: 'Persons', width: 60, align: 'right'},
                {field: 'date', title: 'Begin Date', width: 80}
            ]]

        });
    </script>
</head>
<body>

<meta http-equiv="X-UA-Compatible" content="IE=9"/>
<div class="easyui-layout" fit="true">
    <div region="center" id="FileLog" style="padding:0px;border:0px">
        <table id="tt" style="width:600px;height:400px"></table>

        <table id="test" title="Folder Browser" class="easyui-treegrid" style="width:400px;height:300px">
        </table>
    </div>
</div>

</body>
</html>
