package com.example.pttk1.controller;

import com.example.pttk1.constants.VaiTroConstants;
import com.example.pttk1.dao.ThanhVien803DAOImpl;
import com.example.pttk1.model.ThanhVien803;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private final ThanhVien803DAOImpl thanhVien803DAO = new ThanhVien803DAOImpl();
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ThanhVien803 thanhVien = thanhVien803DAO.login(username, password);
        if (thanhVien == null) {
            request.setAttribute("errorMessage", "Tên đăng nhập hoặc mật khẩu không đúng!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        } else {
            String vaiTro = thanhVien.getVaiTro();
            HttpSession session = request.getSession();
            session.setAttribute("user", thanhVien);
            switch (vaiTro) {
                case VaiTroConstants.KHACH_HANG:
                    response.sendRedirect("khachhang");
                    break;
                case VaiTroConstants.NHAN_VIEN_BAN_HANG:
                    response.sendRedirect("nhanvien.jsp");
                    break;
                case VaiTroConstants.NHAN_VIEN_QUAN_LY:
                    response.sendRedirect("quanly.jsp");
                    break;
            }
        }
    }
}
