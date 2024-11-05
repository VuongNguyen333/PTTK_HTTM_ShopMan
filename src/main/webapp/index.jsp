<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Đăng Nhập</title>
    <style>
        /* Đặt lại các giá trị mặc định */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            display: flex;
            align-items: center;
            justify-content: center;
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            min-height: 100vh;
            padding: 20px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        .login-container {
            background-color: #fff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        label {
            font-weight: bold;
            color: #555;
            display: block;
            margin-bottom: 8px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
            margin-bottom: 15px;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #007BFF;
            color: #fff;
            padding: 12px;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        .register-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
            color: #007BFF;
            text-decoration: none;
        }

        .register-link:hover {
            text-decoration: underline;
        }

        .error-message {
            color: red;
            text-align: center;
            margin-top: 15px;
            font-size: 14px;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Đăng Nhập</h2>
    <form action="login" method="post">
        <input type="hidden" name="action" value="login"/>
        <label for="username">Tên người dùng:</label>
        <input type="text" id="username" name="username" required/>

        <label for="password">Mật khẩu:</label>
        <input type="password" id="password" name="password" required/>

        <input type="submit" value="Đăng Nhập"/>
    </form>
    <a href="register.jsp" class="register-link">Chưa có tài khoản? Đăng ký ngay!</a>
    <c:if test="${not empty errorMessage}">
        <div class="error-message">${errorMessage}</div>
    </c:if>
</div>

<script>
    history.replaceState(null, null, location.href);
    window.addEventListener('popstate', function(event) {
        history.pushState(null, null, location.href);
    });
</script>
</body>
</html>
