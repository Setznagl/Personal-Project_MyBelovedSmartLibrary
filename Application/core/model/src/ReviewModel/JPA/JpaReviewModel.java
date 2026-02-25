package ReviewModel.JPA;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

import ENUMS.BookType;
import ENUMS.ReadingStatus;

@Entity
@Table(name = "bookreviews")
@Getter @Setter
@NamedQueries ({
  @NamedQuery (name = "JpaReview.AnnotationFindById", query = "SELECT r FROM JpaReviewModel r WHERE r.id = :id"),
  @NamedQuery (name = "JpaReview.AnnotationFindAll", query = "SELECT r FROM JpaReviewModel r"),
  @NamedQuery (name = "JpaReview.AnnotationDeleteById", query = "DELETE FROM JpaReviewModel r WHERE r.id = :id"),
  // JPQL does not support Save directly as it is handled by EntityManager's persist method
  @NamedQuery (name = "JpaReview.AnnotationUpdateById", query = "UPDATE JpaReviewModel r SET" +
    " r.bookName = :bookName, r.author = :author, r.type = :type, r.rating = :rating," +
    " r.current_page = :current_page, r.last_page = :last_page, r.status = :status," +
    " r.reading_date = :reading_date, r.last_rereading_date = :last_rereading_date," +
    " r.cover = :cover, r.resume = :resume WHERE r.id = :id"),
  @NamedQuery (name = "JpaReview.AnnotationCountAll", query = "SELECT COUNT(r) FROM JpaReviewModel r"),
})
public class JpaReviewModel {

  @Id
  @GeneratedValue (strategy = GenerationType.UUID)
  private UUID id;

  @Column (name = "bookname", nullable = false, length = 150)
  private String bookName;

  @Column (nullable = false, length = 50)
  private String author;

  @Column(name = "type", columnDefinition = "booktype", nullable = false)
  private BookType type;

  @Column(nullable = false, length = 2, columnDefinition = "INT CHECK (rating >= 1 AND rating <= 10)")
  private Integer rating;

  @Column(name = "current_page", nullable = false, length = 4)
  private Integer current_page;

  @Column(name = "last_page", nullable = false, length = 4)
  private Integer last_page;

  @Column(name = "completion_percentage", insertable = false, updatable = false)
  private Float completion_percentage;

  @Column(name = "status", columnDefinition = "bookstatus", nullable = false)
  private ReadingStatus status;

  @Temporal(TemporalType.DATE)
  @Column(name = "reading_date", nullable = false)
  private Date reading_date;

  @Temporal(TemporalType.DATE)
  @Column(name = "last_rereading_date")
  private Date last_rereading_date = reading_date;

  @Column
  private String cover;

  @Lob
  @Column
  private Byte[] resume;

}
