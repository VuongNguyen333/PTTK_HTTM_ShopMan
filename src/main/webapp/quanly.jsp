<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>
<html>
<head>
    <title>Trang Chủ Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 20px;
        }
        .header {
            display: flex;
            justify-content: space-between;
            width: 100%;
            padding: 10px;
            background-color: #333;
            color: white;
        }
        .header h2 {
            margin: 0;
        }
        .header .logout-button {
            background-color: #ff4d4d;
            color: white;
            padding: 5px 10px;
            border: none;
            cursor: pointer;
        }
        .menu {
            display: flex;
            flex-direction: column;
            align-items: center;
            margin-top: 20px;
            width: 300px;
        }
        .menu button {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            font-size: 16px;
            cursor: pointer;
            border: 1px solid #333;
            border-radius: 5px;
        }
        .menu button:hover {
            background-color: #f0f0f0;
        }
    </style>
</head>
<body>
<div class="header">
    <h2>Quản Lý Hệ Thống</h2>
    <form action="logout" method="get">
        <button type="submit" class="logout-button">Đăng Xuất</button>
    </form>
</div>
<div class="menu">
    <button onclick="window.location.href='thongke.jsp'">Xem Thống Kê</button>
    <button onclick="window.location.href='quanlyhanghoa.jsp'">Quản Lý Hàng Hóa</button>
    <button onclick="window.location.href='quanlytaikhoan.jsp'">Quản Lý Tài Khoản</button>
    <button onclick="window.location.href='thongkehanghoa'">Thống kê mặt hàng theo doanh thu</button>
</div>
<script>
    history.replaceState(null, null, location.href);
    window.addEventListener('popstate', function(event) {
        history.pushState(null, null, location.href);
    });
</script>
</body>
</html>
