package com.bs.servlet;

import com.bs.bean.User;
import com.bs.service.IUserService;
import com.bs.service.impl.UserServiceImpl;
import com.bs.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends BaseServlet {

    private IUserService userService = new UserServiceImpl();

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求参数
        User user = WebUtils.copyParamToBean(req.getParameterMap(), new User());
        // 调用 userService 的处理程序
        User login = userService.login(new User(null, user.getUsername(), user.getPassword(), null));
        if (login == null) {
            // 登录失败
            // 把错误信息和会回填的表单项信息保存到 request 域中
            req.setAttribute("msg", "用户名或密码错误");
            req.setAttribute("username", user.getUsername());
            req.setAttribute("password", user.getPassword());

            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
        } else {
            // 登录成功
            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req, resp);
        }
    }

    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取注册参数
        String repwd = req.getParameter("repwd");
        String code = req.getParameter("code");

        User user = WebUtils.copyParamToBean(req.getParameterMap(), new User());

        // 记录回填信息
        req.setAttribute("username", user.getUsername());
        req.setAttribute("password", user.getPassword());
        req.setAttribute("repwd", repwd);
        req.setAttribute("email", user.getEmail());

        // 检查验证码是否正确
        if ("bnbnp".equals(code)) {
            // 检查用户名是否可用
            if (userService.existUsername(user.getUsername())) {
                // 用户名已经存在
                req.setAttribute("msg", "用户名已存在");

                System.out.println("用户名[" + user.getUsername() + "]已经存在");
                // 跳回注册页面
                req.getRequestDispatcher("/pages/user/register.jsp").forward(req, resp);
            } else {
                // 用户名不存在，可以注册
                // 保存到数据库
                userService.register(user);
                // 跳到注册成功页面
                req.getRequestDispatcher("/pages/user/register_success.jsp").forward(req, resp);
            }

        } else {
            // 验证码不正确，跳回注册页面
            req.setAttribute("msg", "验证码错误");
            System.out.println("验证码[" + code + "]错误");
            req.getRequestDispatcher("/pages/user/register.jsp").forward(req, resp);
        }
    }
}
