<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>
    <link rel="stylesheet" type="text/css" href="../../css/simpleTable.css">
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/item/queryItem" method="post">

    <table width="100%" border=1>
        <tr>
            <th colspan="3">查询商品</th>
        </tr>
        <tr>
            <td>商品id<input type="text" name="id" title="1-4位阿拉伯数字"></td>
            <td>商品名称<input type="text" name="name" title="商品的正确名称"></td>
            <td><input class="_submit" type="submit" value="查询"/></td>
        </tr>
    </table>


    <table width="100%" border=1>
        <tr>
            <th colspan="6">某某假货网站商品列表</th>
        </tr>
        <tr>
            <th>商品ID</th>
            <th>商品名称</th>
            <th>商品价格</th>
            <th>生产日期</th>
            <th>商品描述</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${itemList}" var="item">
            <tr>
                <th>${item.id }</th>
                <td>${item.name }</td>
                <td>${item.price }</td>
                <td>
                    <fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                </td>
                <td>${item.detail }</td>

                <td>
                    <a href="${pageContext.request.contextPath }/item/itemEdit?id=${item.id}">修改</a>&nbsp;&nbsp;
                    <a>删除</a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6"><a href="${pageContext.request.contextPath }/item/toInsertItem">添加新商品</a></td>
        </tr>

    </table>
</form>
</body>

</html>