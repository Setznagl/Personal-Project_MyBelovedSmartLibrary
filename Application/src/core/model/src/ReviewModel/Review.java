package ReviewModel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Entity @Getter @Setter
@NamedQueries ({
  @NamedQuery (name = "Review.AnnotationFindById", query = "SELECT r FROM Review r WHERE r.id = :id"),
  @NamedQuery (name = "Review.AnnotationFindAll", query = "SELECT r FROM Review r"),
  @NamedQuery (name = "Review.AnnotationDeleteById", query = "DELETE FROM Review r WHERE r.id = :id"),
  // JPQL does not support Save directly as it is handled by EntityManager's persist method
  @NamedQuery (name = "Review.AnnotationUpdateById", query = "UPDATE Review r SET" +
    " r.bookName = :bookName, r.coverUrl = :coverUrl, r.rating = :rating, r.description = :description WHERE r.id = :id"),
  @NamedQuery (name = "Review.AnnotationCountAll", query = "SELECT COUNT(r) FROM Review r"),
})
public class Review {

  @Id
  @GeneratedValue (strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false, length = 50)
  private String bookName;

  @Column(nullable = false, length = 100)
  private String coverUrl;

  @Column(nullable = false, length = 2, columnDefinition = "INT CHECK (rating >= 1 AND rating <= 10)")
  private Integer rating;

  @Column(nullable = false, unique = true, length = 500)
  private String description;

}
