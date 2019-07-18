<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>菜单</title>
    <link href="${pageContext.request.contextPath}/admin/css/left.css" rel="stylesheet" type="text/css">
    <link rel="StyleSheet" href="${pageContext.request.contextPath}/admin/css/dtree.css" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/dtree.js"></script>
</head>
<body>
<table width="100" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td height="12"></td>
    </tr>
</table>
<table width="100%" border="0">
    <tr>
        <td>
            <div class="dtree">

                <a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>

                <script type="text/javascript">
                    <!--
                    d = new dTree('d');
                    d.add(0, -1, '系统菜单树');
                    d.add(1, 0, '商品管理', '${pageContext.request.contextPath}/admin/login/welcome.jsp', '', 'mainFrame');
                    d.add(2, 0, '客户管理', '${pageContext.request.contextPath}/admin/login/welcome.jsp', '', 'mainFrame');


                    //商品管理的子目录添加
                    d.add(11, 1, '商品查看', '${pageContext.request.contextPath}/BookListServlet', '', 'mainFrame');
                    d.add(12, 1, '定单查看', '${pageContext.request.contextPath}/***Servlet', '', 'mainFrame');

                    //客户管理的子目录添加
                    d.add(13, 2, '商品查看', '${pageContext.request.contextPath}/BookListServlet', '', 'mainFrame');
                    d.add(14, 2, '定单查看', '${pageContext.request.contextPath}/***Servlet', '', 'mainFrame');

                    document.write(d);
                    //-->
                </script>
            </div>
        </td>
    </tr>
</table>
</body>
</html>
