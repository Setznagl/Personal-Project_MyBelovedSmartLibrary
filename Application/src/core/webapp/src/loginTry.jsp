<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
<div class="main-section" id="login-section">
    <h1 id="login-title">Login</h1>
    <form action="loginTry" method="post" id="login-form">
        <label for="email" id="email-label">Email:</label>
        <input type="email" id="email" name="email" required />
        <br/>
        <label for="password" id="password-label">Password:</label>
        <input type="password" id="password" name="password" required />
        <br/>
        <button type="submit" id="login-button">Login</button>
    </form>
</div>
</body>
<footer>
    <jsp:include page="footer.jsp" />
</footer>
</html>
