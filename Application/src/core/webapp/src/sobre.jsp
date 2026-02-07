<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Sobre</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
<!-- Navbar -->
<jsp:include page="menubar.jsp" />
</body>
<div class="main-section">
    <p id="about-text" style="text-align: center;">Este é um exercício prático de Servlets com JSP.<br>
        Aqui, criamos uma aplicação web dinâmica usando Java Servlets para processar,<br>
        requisições do lado do servidor e JSP para criar interfaces de usuário interativas.
    </p>
</div>
<footer>
    <jsp:include page="footer.jsp" />
</footer>
</html>
