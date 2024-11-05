<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Thống Kê Giao Dịch</title>
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

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px;
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

        td {
            color: #333;
        }

        .no-data {
            text-align: center;
            color: #999;
        }

        /* Responsive Design */
        @media (max-width: 600px) {
            th, td {
                padding: 8px;
                font-size: 14px;
            }
        }
    </style>
</head>
<body>
<h2>Thống Kê Giao Dịch của Mặt Hàng</h2>
<a href="/quanly.jsp" class="btn-back">Trở về Trang Chủ</a>
<form action="thongkegiaodich" method="get">
    <p>Khoảng thời gian: từ ${param.startDate} đến ${param.endDate}</p>
</form>

<table>
    <thead>
    <tr>
        <th>STT</th>
        <th>Tên Mặt Hàng</th>
        <th>Mã Hóa Đơn</th>
        <th>Người Mua</th>
        <th>Ngày Bán</th>
        <th>Số Lượng Bán</th>
        <th>Thành Tiền</th>
    </tr>
    </thead>
    <tbody>
    <c:choose>
        <c:when test="${not empty danhSachGiaoDich}">
            <c:set var="tongSoLuongBan" value="0" />
            <c:set var="tongTien" value="0" />
            <c:forEach var="giaoDich" items="${danhSachGiaoDich}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${giaoDich.tenHangHoa}</td>
                    <td>HĐ${giaoDich.maHoaDon}</td>
                    <td>${giaoDich.nguoiMua}</td>
                    <td>${giaoDich.ngayBan}</td>
                    <td>${giaoDich.soLuong}</td>
                    <td>${giaoDich.tongTien} VNĐ</td>
                </tr>
                <!-- Cộng dồn số lượng bán và thành tiền vào tổng -->
                <c:set var="tongSoLuongBan" value="${tongSoLuongBan + giaoDich.soLuong}" />
                <c:set var="tongTien" value="${tongTien + giaoDich.tongTien}" />
            </c:forEach>
            <!-- Thêm hàng tổng kết -->
            <tr style="font-weight: bold;">
                <td colspan="5" style="text-align: right;">Tổng Cộng:</td>
                <td>${tongSoLuongBan}</td>
                <td>${tongTien} VNĐ</td>
            </tr>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="7" class="no-data">Không có giao dịch nào trong khoảng thời gian đã chọn.</td>
            </tr>
        </c:otherwise>
    </c:choose>
    </tbody>
</table>


</body>
</html>
