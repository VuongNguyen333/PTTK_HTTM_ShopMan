package com.example.pttk1.controller;

import com.example.pttk1.dao.HangHoa803DAO;
import com.example.pttk1.model.HangHoa803;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ProductServlet extends HttpServlet {
    private final HangHoa803DAO hangHoaDAO = new HangHoa803DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("index.jsp"); // Hoặc trang đăng nhập phù hợp
            return;
        }
        // Lấy danh sách hàng hóa từ DAO
        try {
            List<HangHoa803> danhSachHangHoa = hangHoaDAO.getAllHangHoa();

            // Đưa danh sách hàng hóa vào request
            request.setAttribute("danhSachHangHoa", danhSachHangHoa);

            // Chuyển tiếp đến trang khachhang.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("khachhang.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace(); // In ra thông báo lỗi để kiểm tra
            throw new ServletException("Error while getting product list", e);
        }
    }
}
