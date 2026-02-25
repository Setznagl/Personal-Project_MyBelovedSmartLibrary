package ReviewModel.JDBC;

import ENUMS.BookType;
import ENUMS.ReadingStatus;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JdbcReviewModel {

  //Generated from PostgreSQL with UUID type, but can be generated in Java as well
  //private UUID id;

  private String bookName;

  private String author;

  private BookType type;

  private Integer rating;

  private Integer current_page;

  private Integer last_page;

  //Never updated directly, calculated from current_page and last_page
  private Float completion_percentage;

  private ReadingStatus status;

  private Date reading_date;

  private Date last_rereading_date = reading_date;

  private String cover;

  private Byte[] resume;

}
