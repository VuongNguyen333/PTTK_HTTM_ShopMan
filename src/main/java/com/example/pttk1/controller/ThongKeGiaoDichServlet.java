package com.example.pttk1.controller;

import com.example.pttk1.dao.ThongKeHangHoa803DAO;
import com.example.pttk1.model.ThongKeHangHoa803;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet("/ThongKeGiaoDichServlet")
public class ThongKeGiaoDichServlet extends HttpServlet {
    private final ThongKeHangHoa803DAO thongKeHangHoa803DAO = new ThongKeHangHoa803DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("index.jsp"); // Hoặc trang đăng nhập phù hợp
            return;
        }
        String startDateStr = request.getParameter("startDate");
        System.out.println(startDateStr);
        String endDateStr = request.getParameter("endDate");
        int hangHoaId = Integer.parseInt(request.getParameter("id"));
        System.out.println("1: " + endDateStr);
        System.out.println("2: " + hangHoaId);

        // Lấy danh sách hàng hóa từ DAO
        try {
            List<ThongKeHangHoa803> danhSachGiaoDich = thongKeHangHoa803DAO.getThongKeGiaoDich(hangHoaId, startDateStr , endDateStr);

            // Đưa danh sách hàng hóa vào request
            request.setAttribute("danhSachGiaoDich", danhSachGiaoDich);
            request.setAttribute("startDate", startDateStr);
            request.setAttribute("endDate", endDateStr);
            request.setAttribute("id", hangHoaId);

            // Chuyển tiếp đến trang khachhang.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("thongkegiaodich.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace(); // In ra thông báo lỗi để kiểm tra
            throw new ServletException("Error while getting product list", e);
        }
    }
}
