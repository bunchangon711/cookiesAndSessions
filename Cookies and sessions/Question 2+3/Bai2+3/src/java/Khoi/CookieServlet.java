package Khoi;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String saveCookie = request.getParameter("saveCookie");

        // Kiểm tra xem người dùng đã chọn lưu cookie hay không
        if (saveCookie != null && saveCookie.equals("true")) {
            String username = (String) request.getSession().getAttribute("username");
            
            // Tạo cookie mới để lưu thông tin đăng nhập
            Cookie usernameCookie = new Cookie("username", username);
            usernameCookie.setMaxAge(30 * 24 * 60 * 60); // Thời gian sống của cookie: 30 ngày
            response.addCookie(usernameCookie);
        }

        // Chuyển hướng người dùng trở lại trang dashboard
        response.sendRedirect("dashboard.jsp");
    }
}
