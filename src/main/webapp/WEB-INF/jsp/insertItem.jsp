<%--
  Created by IntelliJ IDEA.
  User: zhangguoliang
  Date: 2017/9/13/0013
  Time: 下午 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加新商品</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/simpleTable.css">
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/item/insertItem" method="post">
    <table width="100%" border=1>
        <tr>
            <th colspan="2">新增商品</th>
        </tr>
        <tr>
            <th>商品ID</th>
            <td><input type="text" name="id" title=""/></td>
        </tr>
        <tr>
            <th>商品名称</th>
            <td><input type="text" name="name" title=""/></td>
        </tr>
        <tr>
            <th>商品价格</th>
            <td><input type="text" name="price" title=""/></td>
        </tr>
        <tr>
            <th>商品生产日期</th>
            <td><input type="text" name="createtime" value="1999-01-01 00:00:00" title=""/></td>
        </tr>
        <%--
        <tr>
            <td>商品图片</td>
            <td>
                <c:if test="${item.pic !=null}">
                    <img src="/pic/${item.pic}" width=100 height=100/>
                    <br/>
                </c:if>
                <input type="file"  name="pictureFile"/>
            </td>
        </tr>
        --%>
        <tr>
            <th>商品简介</th>
            <td>
                <textarea rows="3" cols="30" name="detail" title=""></textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input class="_submit" type="submit" value="提交"/>
            </td>
        </tr>
    </table>

</form>
</body>
</html>
