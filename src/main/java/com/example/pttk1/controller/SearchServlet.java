package com.example.pttk1.controller;

import com.example.pttk1.dao.HangHoa803DAO;
import com.example.pttk1.model.HangHoa803;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchServlet extends HttpServlet {
    private final HangHoa803DAO hangHoaDAO = new HangHoa803DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        List <HangHoa803> searchResults;
        if (query == null || query.isEmpty()) {
            searchResults = hangHoaDAO.getAllHangHoa();
        } else {
            searchResults = hangHoaDAO.searchHangHoa(query);
            if (searchResults == null) {
                request.setAttribute("errorMessage", "Không tìm thấy kết quả phù hợp!");
            }
        }
        request.setAttribute("danhSachHangHoa", searchResults);
        RequestDispatcher dispatcher = request.getRequestDispatcher("khachhang.jsp");
        dispatcher.forward(request, response);
    }
}
