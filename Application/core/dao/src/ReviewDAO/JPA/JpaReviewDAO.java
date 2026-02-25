/*

package ReviewDAO;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;


public interface JpaReviewDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory ("PostgresPU");
    EntityManager em = emf.createEntityManager ();
    TypedQuery<JpaReviewDAO> reviewDAOFindByIdQuery = em.createNamedQuery ("Review.AnnotationFindById", JpaReviewDAO.class);
    TypedQuery<JpaReviewDAO> reviewDAOFindAllQuery = em.createNamedQuery ("Review.AnnotationFindAll" , JpaReviewDAO.class);
    TypedQuery<JpaReviewDAO> reviewDAODeleteByIdQuery = em.createNamedQuery ("Review.AnnotationDeleteById" , JpaReviewDAO.class);
    //TypedQuery<JpaReviewDAO> reviewDAOUpdateByIdQuery = em.createNamedQuery ("Review.AnnotationUpdateById" , JpaReviewDAO.class);
    TypedQuery<Long> reviewDAOCountAllQuery = em.createNamedQuery ("Review.AnnotationCountAll" , Long.class);
    Function<TypedQuery<JpaReviewDAO> , List<JpaReviewDAO>> reviewDAOQueryToOjectProcessor = TypedQuery::getResultList;

    Function<UUID, TypedQuery<JpaReviewDAO>> reviewDAOFindById = (id) -> reviewDAOFindByIdQuery.setParameter("id", id);

    Supplier<TypedQuery<JpaReviewDAO>> reviewDAOFindAll = () -> reviewDAOFindAllQuery;

    Function<UUID , TypedQuery<JpaReviewDAO>> reviewDAODeleteById = (id) -> reviewDAODeleteByIdQuery.setParameter("id", id);

    BiFunction<UUID, JpaReviewDAO, TypedQuery<JpaReviewDAO>> reviewDAOUpdateById = (id, updatedJpaReviewDAO) -> reviewDAOUpdateByIdQuery
              .setParameter("bookName", updatedJpaReviewDAO.getBookName())
              .setParameter("coverUrl", updatedJpaReviewDAO.getCoverUrl())
              .setParameter("rating", updatedJpaReviewDAO.getRating())
              .setParameter("description", updatedJpaReviewDAO.getDescription())
              .setParameter("id", id);

    Supplier<Long> reviewDAOCountAll = reviewDAOCountAllQuery::getSingleResult;



}
  */

/*
// 1. O Contrato (Imutável por definição)
public interface PessoaRepository {
    void salvar(Pessoa pessoa);
}

// 2. A Implementação usando Record (Imutabilidade das dependências)
public record JdbcPessoaDAO(Connection connection) implements PessoaRepository {

    @Override
    public void salvar(Pessoa pessoa) {
        // Lógica JDBC usando 'connection' (que é final e imutável aqui)
        System.out.println("Salvando " + pessoa.nome() + " via JDBC");
    }
}

// 3. Outra Implementação (para trocar rápido)
public record JpaPessoaDAO(EntityManager em) implements PessoaRepository {

    @Override
    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }
}
 */