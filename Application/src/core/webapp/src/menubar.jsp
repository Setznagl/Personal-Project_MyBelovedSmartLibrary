<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
<div class="navbar">
    <a href="index.jsp">Home</a>
    <a href="sobre.jsp">Sobre</a>
    <a href="exibirLivros.jsp">Livros</a>
    <c:choose>
        <c:when test="${not empty SessionUser}">
            <a href="logout.jsp">Logout</a>
        </c:when>
        <c:otherwise>
            <a href="loginTry.jsp">Login</a>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>
