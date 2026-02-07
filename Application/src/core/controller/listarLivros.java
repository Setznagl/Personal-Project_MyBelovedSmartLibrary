//import com.team.servlet.model.Livros;
//import com.team.servlet.repository.DAO.ReviewDAO;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//
//@WebServlet("/exibirLivros")
//public class listarLivros extends HttpServlet {
//
//    /* Cria a conexao entre a perssistencia  de dados e o banco */
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//
//        try {
//            // Obter o EntityManager através do contexto de persistência
//            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Postgres");
//            EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//            // Criar a instância da LivrosDAO com o EntityManager
//            ReviewDAO reviewDAO = new ReviewDAO (entityManager);
//
//            // Recuperar a lista de livros utilizando o método ListarTodos da LivrosDAO
//            List<Livros> livros = reviewDAO.ListarTodos();
//
//            // Fechar o EntityManager
//            entityManager.close();
//
//            // Definir o atributo na requisição para a página JSP
//            request.setAttribute("livros", livros);
//
//            // Encaminhar para a página JSP que irá exibir os livros
//            request.getRequestDispatcher("/exibirLivros.jsp").forward(request, response);
//        } catch (Exception e) {
//            throw new ServletException("Erro ao listar os livros", e);
//        }
//
//    }
//}
//
//
//
///*
//            Livros livros2 = new Livros();
//            livros2.setNome("Silmariolon");
//            livros2.setCategoria("Fantasia");
//            livros2.setQUANTIDADE(10);
//            dao.salvar(livros2);
//
//
//           dao.deletarPorId(6);
//
//         int idLivro = 8; // Substitua 1 pelo ID do livro que deseja atualizar
//         Livros livroAtualizado = new Livros();
//         livroAtualizado.setId(idLivro); // Setar o ID do livro que quer atualizar
//         livroAtualizado.setNome(" Teste de atualização");
//         livroAtualizado.setCategoria("Magico");
//         livroAtualizado.setQUANTIDADE(10);
//         dao.atualizarPorid(idLivro, livroAtualizado);
//
//
//        //    int idLivro = 6; // Substitua 1 pelo ID do livro que deseja buscar, quando usar no front usar esta função
//        //    Livros livroEncontrado = dao.buscaPorId(idLivro);
//        //    if (livroEncontrado != null) {
//        //        System.out.println("Livro encontrado:");
//        //        System.out.println("ID : " + livroEncontrado.getId() + " Nome do livro : " + livroEncontrado.getNome() + " Categoria : " + livroEncontrado.getCategoria() + " Quantidade :" + livroEncontrado.getQUANTIDADE());
//        //    } else {
//        //        System.out.println("Livro com ID " + idLivro + " não encontrado.");
//        //    }
//
//
//                List<Livros> listaLivros = dao.ListarTodos();
//        for (Livros livro : listaLivros) {
//            System.out.println("ID : " + livro.getId() + " Nome do livro : " + livro.getNome() + " Categoria : " + livro.getCategoria() + " Quantidade :" + livro.getQUANTIDADE());
//
//        }
//
//*/