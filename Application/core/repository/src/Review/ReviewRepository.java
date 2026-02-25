package Review;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public interface ReviewRepository {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PostgresPU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();



}

/*
    Consumer<Review> save = review -> {
      entityManager.getTransaction ().begin ();
      entityManager.persist (review);
      entityManager.getTransaction ().commit ();
    };

    Function<UUID , Review> findById = (UUID id) -> {
      return reviewDAOQueryToOjectProcessor.apply (reviewDAOFindById.apply (id)).get(0); // prevent explicit cast
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
 */
