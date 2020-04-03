<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>网上书城会员注册</title>
    <%--静态包含头部信息的 jsp 文件--%>
    <%@include file="/pages/common/header.jsp" %>
    <script type="text/javascript">
        $(function () {
            // 刷新验证码
            $("#code_img").click(function () {
                this.src = "${basePath}code.jpg?d=" + new Date();
            });
        });
    </script>
    <style type="text/css">
        .login_form {
            height: 420px;
            margin-top: 25px;
        }
    </style>
</head>
<body>
<!--显示 logo 图片-->
<div id="header">
    <!--    <img class="logo_img" alt="" src="static/img/logo.gif">-->
    <span class="wel_word">网上书城</span>
</div>

<div class="login_banner">

    <div id="l_content">
        <span class="login_word">欢迎注册</span>
    </div>

    <div id="content">
        <div class="login_form">
            <div class="login_box">
                <div class="tit">
                    <h1>注册网上书城会员</h1>
                    <span class="errorMsg">
                        ${requestScope.msg}
                    </span>
                </div>
                <div class="form">
                    <form action="user" method="post">
                        <label><input type="hidden" name="action" value="register"></label>
                        <label>用户名称：</label>
                        <label for="username"></label>
                        <input class="itxt" type="text" placeholder="请输入用户名"
                               autocomplete="off" tabindex="1" name="username" id="username"
                               value="${requestScope.username}"
                        />
                        <br/>
                        <br/>
                        <label>用户密码：</label>
                        <label for="password"></label>
                        <input class="itxt" type="password" placeholder="请输入密码"
                               autocomplete="off" tabindex="1" name="password" id="password"
                               value="${requestScope.password}"
                        />
                        <br/>
                        <br/>
                        <label>确认密码：</label>
                        <label for="repwd"></label>
                        <input class="itxt" type="password" placeholder="确认密码"
                               autocomplete="off" tabindex="1" name="repwd" id="repwd"
                               value="${requestScope.repwd}"
                        />
                        <br/>
                        <br/>
                        <label>电子邮件：</label>
                        <label for="email"></label>
                        <input class="itxt" type="text" placeholder="请输入邮箱地址"
                               autocomplete="off" tabindex="1" name="email" id="email"
                               value="${requestScope.email}"
                        />
                        <br/>
                        <br/>
                        <label>&nbsp;&nbsp;&nbsp;&nbsp;验证码：</label>
                        <label for="code"></label>
                        <input class="itxt" type="text" style="width: 120px;" id="code" name="code"/>
                        <img id="code_img" alt="" src="code.jpg"
                             style="float: right; margin-right: 40px; width: 90px; height: 38px">
                        <br/>
                        <br/>
                        <input type="submit" value="注册" id="sub_btn"/>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<%--静态包含底部信息的 jsp 文件--%>
<%@include file="/pages/common/footer.jsp" %>
</body>
</html>