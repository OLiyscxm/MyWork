package com.zym.boot.model.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @MyFunction
 */
public class PreInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser!=null){
            return true;
        }
        else {
            request.setAttribute("msg","请先登录!");
            request.getRequestDispatcher("/").forward(request,response);
            return  false;

        }


    }
}
