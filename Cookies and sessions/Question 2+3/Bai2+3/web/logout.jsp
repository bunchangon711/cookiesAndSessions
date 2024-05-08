<!DOCTYPE html>
<html>
<head>
    <title>Logout</title>
</head>
<body>
    <h1>Logout</h1>
    <%
        session.invalidate();
    %>
    <p>B?n ?ã ??ng xu?t thành công.</p>
    <a href="index.jsp">??ng nh?p l?i</a>
</body>
</html>
