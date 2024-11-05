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
import java.time.LocalDate;
import java.util.List;

public class ThongKeHangHoaServlet extends HttpServlet {
    private final HangHoa803DAO hangHoa803DAO = new HangHoa803DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("index.jsp"); // Hoặc trang đăng nhập phù hợp
            return;
        }
        String startDateStr = request.getParameter("startDate");
        String endDateStr = request.getParameter("endDate");

        // Kiểm tra nếu startDate và endDate bị thiếu
        if (startDateStr == null || endDateStr == null) {
            request.setAttribute("error", "Vui lòng nhập ngày bắt đầu và ngày kết thúc.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("thongkehanghoa.jsp");
            dispatcher.forward(request, response);
            return;
        }
        LocalDate startDate = LocalDate.parse(startDateStr);
        LocalDate endDate = LocalDate.parse(endDateStr);

        // Kiểm tra startDate phải trước endDate
        if (startDate.isAfter(endDate)) {
            request.setAttribute("error", "Ngày bắt đầu phải trước ngày kết thúc.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("thongkehanghoa.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Lấy danh sách hàng hóa từ DAO
        try {
            List<HangHoa803> danhSachHangHoa = hangHoa803DAO.getAllHangHoaBan(startDateStr , endDateStr);

            // Đưa danh sách hàng hóa vào request
            request.setAttribute("danhSachHangHoa", danhSachHangHoa);

            // Chuyển tiếp đến trang khachhang.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("thongkehanghoa.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace(); // In ra thông báo lỗi để kiểm tra
            throw new ServletException("Error while getting product list", e);
        }
    }
}
