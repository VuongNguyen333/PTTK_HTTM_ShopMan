<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Trang Quản Lý</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        form {
            margin-bottom: 20px;
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #007BFF;
            color: white;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        img {
            width: 50px;
            height: 50px;
            object-fit: cover;
        }

        .error {
            color: red;
            text-align: center;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<h2>Thống Kê Mặt Hàng Theo Doanh Thu</h2>
<a href="/quanly.jsp" class="btn-back">Trở về Trang Chủ</a>
<form action="thongkehanghoa" method="get">
    <label for="startDate">Ngày Bắt Đầu:</label>
    <input type="date" id="startDate" name="startDate" value="${param.startDate}" required>

    <label for="endDate">Ngày Kết Thúc:</label>
    <input type="date" id="endDate" name="endDate" value="${param.endDate}" required>

    <button type="submit">Xem Thống Kê</button>
</form>

<h3>Danh Sách Mặt Hàng</h3>
<div class="error">
    <c:if test="${not empty error}">
        ${error}
    </c:if>
</div>
<table>
    <thead>
    <tr>
        <th>Tên Mặt Hàng</th>
        <th>Giá Bán</th>
        <th>Hình Ảnh</th>
        <th>Ngày Sản Xuất</th>
        <th>Ngày Hết Hạn</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:choose>
        <c:when test="${not empty danhSachHangHoa}">
            <c:forEach var="item" items="${danhSachHangHoa}">
                <tr>
                    <td>
                                ${item.tenHangHoa}
                    </td>
                    <td>${item.gia != null ? item.gia : 'N/A'}</td>
                    <td><img src="${item.hinhAnh != null ? item.hinhAnh : 'default-image.png'}" alt="hinh anh"/></td>
                    <td>${item.ngaySanXuat != null ? item.ngaySanXuat : 'N/A'}</td>
                    <td>${item.ngayHetHan != null ? item.ngayHetHan : 'N/A'}</td>
                    <td>
                        <button onclick="window.location.href='thongkegiaodich?id=${item.id}&startDate=${param.startDate}&endDate=${param.endDate}'">Xem Danh sách giao dịch</button>
                    </td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="5">Không có mặt hàng nào.</td>
            </tr>
        </c:otherwise>
    </c:choose>
    </tbody>
</table>
</body>
</html>
