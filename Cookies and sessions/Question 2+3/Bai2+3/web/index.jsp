<!DOCTYPE html>
<html>
<head>
    <title>??ng nh?p</title>
</head>
<body>
    <h1>??ng nh?p</h1>
    <form action="login" method="post">
        <label for="username">T�n ??ng nh?p:</label>
        <input type="text" id="username" name="username" value="<%= request.getAttribute("savedUsername") %>" required><br><br>
        <label for="password">M?t kh?u:</label>
        <input type="password" id="password" name="password" required><br><br>
        <label for="remember">Ghi nh? th�ng tin ??ng nh?p:</label>
        <input type="checkbox" id="remember" name="remember"><br><br>
        <input type="submit" value="??ng nh?p">
    </form>
</body>
</html>
