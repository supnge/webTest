<%--
  Created by IntelliJ IDEA.
  User: supeng
  Date: 2019-07-27
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
</head>
<body>

<meta http-equiv="X-UA-Compatible" content="IE=9"/>
<div class="easyui-layout" fit="true">
    <div region="center" id="FileLog" style="padding:0px;border:0px">
        <table id="test" title="" class="easyui-treegrid" style="width:80%;height:550px"
               url="js/treegrid_data.json" rownumbers="true"
               idField="id" treeField="name">
            <thead>
            <tr>
                <th field="name" width="80%">名称</th>
                <th field="size" width="10%" align="right">大小</th>
                <th field="date" width="10%">修改日期</th>
                <div style="margin-left:340px">
                    <a href="#" class="easyui-linkbutton" onclick="xiazai()" iconCls="icon-put">下 载</a>
                </div>
            </tr>
            </thead>
        </table>
    </div>
</div>

</body>
</html>
