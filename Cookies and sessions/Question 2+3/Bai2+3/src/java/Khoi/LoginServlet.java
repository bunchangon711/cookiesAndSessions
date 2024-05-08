package Khoi;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra cookie xem người dùng đã từng đăng nhập trước đó hay không
        Cookie[] cookies = request.getCookies();
        String savedUsername = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    savedUsername = cookie.getValue();
                    break;
                }
            }
        }

        if ("123456".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Thiết lập cookie mới
            Cookie usernameCookie = new Cookie("username", username);
            usernameCookie.setMaxAge(30 * 24 * 60 * 60); // Thời gian sống của cookie: 30 ngày
            response.addCookie(usernameCookie);

            response.sendRedirect("dashboard.jsp");
        } else {
            // Truyền thông tin username từ cookie vào request để hiển thị trên form
            request.setAttribute("savedUsername", savedUsername);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}


