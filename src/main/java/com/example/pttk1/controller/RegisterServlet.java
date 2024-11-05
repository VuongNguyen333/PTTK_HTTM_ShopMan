package com.example.pttk1.controller;

import com.example.pttk1.constants.MessageConstants;
import com.example.pttk1.dao.KhachHang803DAO;
import com.example.pttk1.dao.ThanhVien803DAOImpl;
import com.example.pttk1.model.ThanhVien803;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    private final ThanhVien803DAOImpl thanhVien803DAO = new ThanhVien803DAOImpl();
    private final KhachHang803DAO khachHang803DAO = new KhachHang803DAO();

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException, ServletException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String hoTen = request.getParameter("hoTen");
        String diaChi = request.getParameter("diaChi");
        String soDienThoai = request.getParameter("soDienThoai");
        String ngaySinh = request.getParameter("ngaySinh");
        String gioiTinh = request.getParameter("gioiTinh");
        String vaiTro = request.getParameter("vaiTro");
        if (username == null || username.trim().isEmpty() ||
            password == null || password.trim().isEmpty() ||
            hoTen == null || hoTen.trim().isEmpty() ||
            diaChi == null || diaChi.trim().isEmpty() ||
            soDienThoai == null || soDienThoai.trim().isEmpty() ||
            ngaySinh == null || ngaySinh.trim().isEmpty()) {

            request.setAttribute("errorMessage", "Tất cả các trường không được bỏ trống.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }
        String phoneRegex = "^[0-9]{10}$"; // Định dạng số điện thoại 10 chữ số
        if (soDienThoai != null && !soDienThoai.isEmpty() && !soDienThoai.matches(phoneRegex)) {
            request.setAttribute("errorMessage", "Số điện thoại không hợp lệ. Vui lòng nhập 10 chữ số.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }

        // Tạo đối tượng ThanhVien803
        ThanhVien803 thanhVien = new ThanhVien803(username, password, hoTen, diaChi, soDienThoai, ngaySinh, gioiTinh, vaiTro);

        // Thêm người dùng vào cơ sở dữ liệu
        String userAdded = thanhVien803DAO.addUser(thanhVien);
        if (userAdded.equals(MessageConstants.SIGNUP_FAIL)) {
            request.setAttribute("errorMessage", userAdded);
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }
        khachHang803DAO.addKhachHang(Integer.parseInt(userAdded));
        request.setAttribute("message", MessageConstants.SIGNUP_SUCCESS);
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }
}
