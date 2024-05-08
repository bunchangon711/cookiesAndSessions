<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h1>Dashboard</h1>
    <p>Chào m?ng, <%= session.getAttribute("username") %>!</p>
    
    <!-- Form ?? l?a ch?n l?u thông tin ??ng nh?p trong cookie -->
    <form action="CookieServlet" method="post">
        <label for="saveCookie">L?u thông tin ??ng nh?p trong cookie:</label>
        <input type="checkbox" id="saveCookie" name="saveCookie" value="true"><br><br>
        <input type="submit" value="L?u">
    </form>

    <a href="logout.jsp">??ng xu?t</a>
</body>
</html>
