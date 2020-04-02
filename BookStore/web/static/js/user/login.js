$(function () {
    // 给登录绑定单击事件
    $("#sub_btn").click(function () {
        // 验证用户名不为空
        let usernameText = $("#username").val().trim();
        let $spanErrorMsg = $("span.errorMsg");
        if (usernameText === null || usernameText.length === 0) {
            $spanErrorMsg.text("请输入用户名");
            return false;
        }
        // 验证密码不为空
        let passwordText = $("#password").val();

        if (passwordText == null || passwordText.length === 0) {
            $spanErrorMsg.text("请输入密码");
            return false;
        }
        // 去掉错误信息
        $spanErrorMsg.text("");
    });
});