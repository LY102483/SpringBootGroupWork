package online.liuyang1024.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Create by LiuYang on 2022/5/29 18:17
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user != null) {
            return true;
        } else {
            request.setAttribute("msg", "请先登录!");
            response.sendRedirect("/showPages/showLogin");
            return false;
        }
    }
}
