package ReviewRepository;

import ReviewDAO.ReviewDAO;
import ReviewModel.Review;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface ReviewRepository extends ReviewDAO {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PostgresPU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Consumer<Review> save = review -> {
      entityManager.getTransaction ().begin ();
      entityManager.persist (review);
      entityManager.getTransaction ().commit ();
    };

    Function<UUID , Review> findById = (UUID id) -> {
      return reviewDAOQueryToOjectProcessor.apply (reviewDAOFindById.apply (id)).getFirst (); // prevent explicit cast
    };

    Supplier <List<Review>> findAll = () -> {
      return reviewDAOQueryToOjectProcessor.apply (reviewDAOFindAll.get ()); // prevent explicit cast
    };

    Consumer<UUID> deleteById = (UUID id) -> {
      entityManager.getTransaction().begin();
      reviewDAODeleteById.apply (id).executeUpdate ();
      entityManager.getTransaction().commit();
    };

    BiConsumer<UUID , Review> updateById = (UUID id, Review updatedReview) -> {
      entityManager.getTransaction().begin();
      reviewDAOUpdateById.apply (id, updatedReview).executeUpdate ();
      entityManager.getTransaction().commit();
    };

    Supplier<Long> countAll = reviewDAOCountAll;

}
