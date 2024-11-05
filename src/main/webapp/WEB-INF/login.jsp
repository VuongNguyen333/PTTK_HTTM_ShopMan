<!DOCTYPE html>
<html>
<head>
    <title>Đăng Nhập</title>
</head>
<body>
<h2>Đăng Nhập</h2>
<form action="user" method="post">
    <%--@declare id="username"--%><%--@declare id="password"--%>
    <input type="hidden" name="action" value="login">
    <label for="username">Username:</label>
    <input type="text" name="username" required>
    <label for="password">Password:</label>
    <input type="password" name="password" required>
    <button type="submit">Đăng Nhập</button>
</form>

<c:if test="${param.error != null}">
    <div style="color:red;">Tài khoản hoặc mật khẩu không đúng!</div>
</c:if>
</body>
</html>
