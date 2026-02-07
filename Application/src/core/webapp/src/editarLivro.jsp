<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial</title>
    <link rel="stylesheet" href="style.css" />
</head>

<body>
<div class="main-section">
<div id="editarLivro-section">
    <h1 id="editarLivro-title">Editar Livro</h1>
    <form action="editarLivro" method="post" id="editarLivro-form">
        <input type="hidden" name="id" value="${livro.id}">
        <label for="nome" id="nome-label">Título:</label>
        <input type="text" id="nome" name="nome" value="${livro.nome}" required />
        <br/>
        <label for="categoria" id="categoria-label">Categoria:</label>
        <input type="text" id="categoria" name="categoria" value="${livro.categoria}" required />
        <br/>
        <label for="quantidade" id="quantidade-label">Quantidade:</label>
        <input type="text" id="quantidade" name="quantidade" value="${livro.QUANTIDADE}" required />
        <br/>
        <button type="submit" id="editarLivro-button">Salvar</button>
    </form>
</div>
</div>
</body>

</html>
