<%@ page import="com.team.servlet.repository.DAO.ReviewDAO" %>
<%@ page import="jakarta.persistence.EntityManager" %>
<%@ page import="jakarta.persistence.EntityManagerFactory" %>
<%@ page import="jakarta.persistence.Persistence" %>
<%@ page import="java.util.List" %>
<%@ page import="com.team.servlet.model.Livros" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PostgresPU");
    EntityManager em = emf.createEntityManager();
    ReviewDAO tmp_dao = new ReviewDAO (em);
    List<Livros> tmp_list = tmp_dao.ListarTodos();
    request.setAttribute("livros", tmp_list);
    em.close();
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exibir Livros</title>
</head>
<body>
<jsp:include page="menubar.jsp" />
<div class="grid" style="grid-template-columns: repeat(${not empty SessionUser ? 6 : 4}, 1fr);">
    <div class="grid-item header">id</div>
    <div class="grid-item header">nome</div>
    <div class="grid-item header">categoria</div>
    <div class="grid-item header">QUANTIDADE</div>
    <c:if test="${not empty SessionUser}">
        <div class="grid-item header"></div>
        <div class="grid-item header"></div>
    </c:if>
    <c:forEach var="livro" items="${livros}">
        <div class="grid-item">${livro.id}</div>
        <div class="grid-item">${livro.nome}</div>
        <div class="grid-item">${livro.categoria}</div>
        <div class="grid-item">${livro.QUANTIDADE}</div>
        <c:if test="${not empty SessionUser}">
            <div class="grid-item">
                <a href="editarLivro?id=${livro.id}" class="navbar a">Editar</a>
            </div>
            <div class="grid-item">
                <a href="deletarLivro?id=${livro.id}" class="navbar a">Deletar</a>
            </div>
        </c:if>
    </c:forEach>
</div>
</body>
<footer>
    <jsp:include page="footer.jsp" />
</footer>
</html>
