<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng Ký</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            margin-top: 10px;
            display: block;
            color: #666;
        }
        input[type="text"],
        input[type="password"],
        input[type="date"],
        select {
            width: 90%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        button {
            background-color: #5cb85c;
            color: white;
            border: none;
            border-radius: 4px;
            padding: 10px;
            cursor: pointer;
            width: 100%;
            margin-top: 10px;
        }
        button:hover {
            background-color: #4cae4c;
        }
        .message {
            color: red;
            text-align: center;
            margin-bottom: 15px;
        }
        a {
            display: block;
            text-align: center;
            margin-top: 15px;
            color: #007bff;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Đăng Ký</h2>
    <c:if test="${not empty errorMessage}">
        <div class="message">${errorMessage}</div>
    </c:if><c:if test="${not empty message}">
        <div class="message">${message}</div>
    </c:if>
    <form action="register" method="post">
        <input type="hidden" name="action" value="register">
        <label for="username">Username:</label>
        <input type="text" name="username" required>
        <label for="password">Password:</label>
        <input type="password" name="password" required>
        <label for="hoTen">Họ Tên:</label>
        <input type="text" name="hoTen" required>
        <label for="diaChi">Địa Chỉ:</label>
        <input type="text" name="diaChi">
        <label for="soDienThoai">Số Điện Thoại:</label>
        <input type="text" name="soDienThoai">
        <label for="ngaySinh">Ngày Sinh:</label>
        <input type="date" name="ngaySinh">
        <label for="gioiTinh">Giới Tính:</label>
        <select name="gioiTinh">
            <option value="Nam">Nam</option>
            <option value="Nữ">Nữ</option>
        </select>
        <button type="submit">Đăng Ký</button>
    </form>
    <a href="index.jsp">Đã có tài khoản? Đăng Nhập ngay!</a>
</div>
</body>
</html>
