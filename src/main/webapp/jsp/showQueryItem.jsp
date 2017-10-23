<%--
  Created by IntelliJ IDEA.
  User: zhangguoliang
  Date: 2017/9/10/0010
  Time: 下午 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>查询结果</title>
    <link rel="stylesheet" type="text/css" href="/css/simpleTable.css">
</head>
<body>
<form action="" method="post">
    <table width="100%" border=1>
        <tr>
            <td colspan="5" style="font-size: 16px">查询结果</td>
        </tr>
        <tr>
            <th>商品名称</th>
            <th>商品价格</th>
            <th>生产日期</th>
            <th>商品描述</th>
            <th>操作</th>
        </tr>
            <tr>
                <td>${item.name }</td>
                <td>${item.price }</td>
                <td>
                    <fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                </td>
                <td>${item.detail }</td>

                <td><a href="${pageContext.request.contextPath }/item/itemEdit?id=${item.id}">修改</a></td>

            </tr>
        <tr>
            <td colspan="5"><a style="font-size: 16px" href="${pageContext.request.contextPath }/item/itemList">返回商品列表</a></td>
        </tr>
    </table>
</form>
</body>
</html>
