<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改商品信息</title>
    <link rel="stylesheet" type="text/css" href="/css/simpleTable.css">
    <script type="text/javascript" src="/js/pageContext.js"></script>
</head>
<body>
<!-- 上传图片是需要指定属性 enctype="multipart/form-data" -->
<!-- <form id="itemForm" action="" method="post" enctype="multipart/form-data"> -->
<form id="itemForm" action="${pageContext.request.contextPath }/item/updateItem" method="post">
    <input type="hidden" name="id" value="${item.id }"/>
    <table width="100%" border=1>
        <tr>
            <th colspan="2">修改${item.name }商品信息</th>
        </tr>
        <tr>
            <th>商品名称</th>
            <td><input type="text" name="name" value="${item.name }"/></td>
        </tr>
        <tr>
            <th>商品价格</th>
            <td><input type="text" name="price" value="${item.price }"/></td>
        </tr>
        <tr>
            <th>商品生产日期</th>
            <td><input type="text" name="createtime"
                       value="<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
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
                <textarea rows="3" cols="30" name="detail">${item.detail }</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input class="_submit" type="submit" value="提交"/>&nbsp;
                <input class="_submit" type="button" value="返回列表" onclick="returnItemList()">
            </td>
        </tr>
    </table>

</form>
</body>

<script type="text/javascript">
    function returnItemList() {
        window.location.href = "${pageContext.request.contextPath }/item/itemList"
    }
</script>

</html>