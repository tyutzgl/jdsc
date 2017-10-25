<%--
  Created by IntelliJ IDEA.
  User: zhangguoliang
  Date: 2017/10/25
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="/css/reset.css"/>
    <link rel="stylesheet" href="/css/login.css"/>
</head>
<body>

<div class="loginwarrp">
    <div class="logo">管理员登陆</div>
    <div class="login_form">
        <form id="Login" name="Login" method="post" onsubmit="" action="${pageContext.request.contextPath }/item/itemList">
            <li class="login-item">
                <span>用户名：</span>
                <input type="text" id="username" name="UserName" class="login_input">
                <span id="count-msg" class="error"></span>
            </li>
            <li class="login-item">
                <span>密　码：</span>
                <input type="password" id="password" name="password" class="login_input">
                <span id="password-msg" class="error"></span>
            </li>
            <!--<li class="login-item verify">
                <span>验证码：</span>
                <input type="text" name="CheckCode" class="login_input verify_input">
            </li>
            <img src="images/verify.png" border="0" class="verifyimg" />
            <div class="clearfix"></div> -->
            <li class="login-sub">
                <input type="submit" name="Submit" value="登录"/>
                <input type="reset" name="Reset" value="重置"/>
            </li>
        </form>
    </div>
</div>

</body>
</html>
