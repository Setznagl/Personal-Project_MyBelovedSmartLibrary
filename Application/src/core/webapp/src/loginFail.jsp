<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Falha no login</title>
</head>
<body>
<jsp:include page="menubar.jsp" />
<h1> <br>  Não encontramos o Nome: ${name} e o E-mail:  ${email} em nosso banco de dados, tente novamente</h1>
</body>
<footer>
    <jsp:include page="footer.jsp" />
</footer>
</html>