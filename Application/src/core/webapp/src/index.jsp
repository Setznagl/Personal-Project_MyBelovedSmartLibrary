<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
<jsp:include page="menubar.jsp" />

<div class="main-section">
    <div id="text-section">
        <h1>Biblioteca Digital</h1>
        <p>Bem vindos ao nosso sistema <br>
            de gerenciamento.</p>
    </div>
</div>

</body>
<footer>
    <jsp:include page="footer.jsp" />
</footer>
</html>