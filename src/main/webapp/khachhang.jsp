<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Hàng Hóa</title>
    <link rel="stylesheet" href="styles.css">
    <style>
        .card-container {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
            justify-content: center;
            padding: 20px;
        }

        .card {
            border: 1px solid #ccc;
            border-radius: 8px;
            padding: 15px;
            width: 200px;
            text-align: center;
        }

        .card img {
            max-width: 100%;
            height: auto;
            border-radius: 8px;
        }

        .card h3 {
            font-size: 1.2em;
            margin: 10px 0;
        }

        .card p {
            font-size: 0.9em;
            color: #666;
        }

        .add-to-cart {
            background-color: #28a745;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
        }

        .add-to-cart:hover {
            background-color: #218838;
        }
        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 20px;
            background-color: #f1f1f1;
        }

        .search-container {
            text-align: center;
            margin: 20px 0;
        }

        .search-container input[type="text"] {
            padding: 10px;
            width: 60%;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        .search-btn {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
        }

        .search-btn:hover {
            background-color: #0056b3;
        }

        .logout-btn {
            background-color: #dc3545;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
        }

        .logout-btn:hover {
            background-color: #c82333;
        }
        .clickable-title {
            cursor: pointer;
            color: #333;
            text-decoration: none;
        }

        .clickable-title:hover {
            color: #007bff;
            text-decoration: underline;
        }

        .modal {
            display: none; /* Ẩn dialog theo mặc định */
            position: fixed;
            z-index: 1;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            overflow: auto;
            background-color: rgba(0, 0, 0, 0.5); /* Nền mờ */
        }

        .modal-content {
            background-color: #fefefe;
            margin: 15% auto;
            padding: 20px;
            border: 1px solid #888;
            width: 80%;
        }

        .close {
            color: #aaa;
            float: right;
            font-size: 28px;
            font-weight: bold;
        }

        .close:hover,
        .close:focus {
            color: black;
            text-decoration: none;
            cursor: pointer;
        }
        .product-name {
            color: #007bff;
            text-decoration: underline;
            cursor: pointer;
            margin: 10px 0;
            display: inline-block;
        }

        .product-name:hover {
            color: #0056b3;
            text-decoration: none;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>
        <a href="/khachhang" class="clickable-title">Danh Sách Hàng Hóa</a>
    </h1>

    <!-- Hiển thị tên thành viên đã đăng nhập và nút Đăng xuất -->
    <div>
        <c:if test="${not empty sessionScope.user}">
            <span class="greeting">Xin chào, ${sessionScope.user.hoTen}!</span>
        </c:if>
        <form action="logout" method="get" style="display: inline;">
            <button type="submit" class="logout-btn">Đăng xuất</button>
        </form>
    </div>
</div>

<div class="search-container">
    <form action="search" method="get">
        <input type="text" name="query" placeholder="Tìm kiếm sản phẩm...">
        <button type="submit" class="search-btn">Tìm kiếm</button>
    </form>
</div>

<div class="card-container">
    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>
    <c:forEach var="hangHoa" items="${danhSachHangHoa}">
        <div class="card">
            <img src="${hangHoa.hinhAnh}" alt="${hangHoa.tenHangHoa}">
            <h3>${hangHoa.tenHangHoa}</h3>
            <p>Giá: ${hangHoa.gia} VNĐ</p>
        </div>
    </c:forEach>
</div>

<script>
    history.replaceState(null, null, location.href);
    window.addEventListener('popstate', function(event) {
        history.pushState(null, null, location.href);
    });
</script>
</body>
</html>
