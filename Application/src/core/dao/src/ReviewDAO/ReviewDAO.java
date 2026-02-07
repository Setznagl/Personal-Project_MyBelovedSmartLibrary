package ReviewDAO;

import ReviewModel.Review;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;


public interface ReviewDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory ("PostgresPU");
    EntityManager em = emf.createEntityManager ();
    TypedQuery<Review> reviewDAOFindByIdQuery = em.createNamedQuery ("Review.AnnotationFindById", Review.class);
    TypedQuery<Review> reviewDAOFindAllQuery = em.createNamedQuery ("Review.AnnotationFindAll" , Review.class);
    TypedQuery<Review> reviewDAODeleteByIdQuery = em.createNamedQuery ("Review.AnnotationDeleteById" , Review.class);
    TypedQuery<Review> reviewDAOUpdateByIdQuery = em.createNamedQuery ("Review.AnnotationUpdateById" , Review.class);
    TypedQuery<Long> reviewDAOCountAllQuery = em.createNamedQuery ("Review.AnnotationCountAll" , Long.class);
    Function<TypedQuery<Review> , List<Review>> reviewDAOQueryToOjectProcessor = TypedQuery::getResultList;

    Function<UUID, TypedQuery<Review>> reviewDAOFindById = (id) -> reviewDAOFindByIdQuery.setParameter("id", id);

    Supplier<TypedQuery<Review>> reviewDAOFindAll = () -> reviewDAOFindAllQuery;

    Function<UUID , TypedQuery<Review>> reviewDAODeleteById = (id) -> reviewDAODeleteByIdQuery.setParameter("id", id);

    BiFunction<UUID, Review, TypedQuery<Review>> reviewDAOUpdateById = (id, updatedReview) -> reviewDAOUpdateByIdQuery
              .setParameter("bookName", updatedReview.getBookName())
              .setParameter("coverUrl", updatedReview.getCoverUrl())
              .setParameter("rating", updatedReview.getRating())
              .setParameter("description", updatedReview.getDescription())
              .setParameter("id", id);

    Supplier<Long> reviewDAOCountAll = reviewDAOCountAllQuery::getSingleResult;



}
