$(function () {
    // 给注册绑定单击事件
    $("#sub_btn").click(function () {
        // 验证用户名：必须由字母，数字下划线组成，并且长度为5到12位
        // 1 获取用户名输入框里的内容
        let usernameText = $("#username").val();
        // 2 创建正则表达式对象
        let userNameRegExp = /^\w{5,12}$/;
        // 错误信息
        let $spanErrorMsg = $("span.errorMsg");
        // 3 使用test方法验证
        if (!userNameRegExp.test(usernameText)) {
            // 4 提示用户结果
            $spanErrorMsg.text("用户名不合法！");
            return false;
        }
        // 验证密码：必须由字母，数字下划线组成，并且长度为5到12位
        // 1 获取用户名输入框里的内容
        let passwordText = $("#password").val();
        // 2 创建正则表达式对象，至少 5 位
        let passwordRegExp = /^\w{5,}$/;
        // 3 使用test方法验证
        if (!passwordRegExp.test(passwordText)) {
            //4 提示用户结果
            $spanErrorMsg.text("密码不合法！");

            return false;
        }

        // 验证确认密码：和密码相同
        // 1 获取确认密码内容
        let val = $("#repwd").val();
        // 2 和密码相比较
        if (val !== passwordText) {
            //3 提示用户
            $spanErrorMsg.text("确认密码和密码不一致！");
            return false;
        }
        // 邮箱验证：xxxxx@xxx.com
        // 1 获取邮箱里的内容
        let emailText = $("#email").val();
        // 2 创建正则表达式对象
        let emailRegExp = /^[a-z\w]+(\.\w+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
        // 3 使用test方法验证是否合法
        if (!emailRegExp.test(emailText)) {
            //4 提示用户
            $spanErrorMsg.text("邮箱格式不合法！");
            return false;
        }

        // 验证码：现在只需要验证用户已输入。因为还没讲到服务器。验证码生成。
        let codeText = $("#code").val();

        // 去掉验证码前后空格
        // alert("去空格前：["+codeText+"]")
        codeText = $.trim(codeText);
        // alert("去空格后：["+codeText+"]")
        if (codeText == null || codeText === "") {
            //4 提示用户
            $spanErrorMsg.text("验证码不能为空！");

            return false;
        }

        // 去掉错误信息
        $spanErrorMsg.text("");

    });

});