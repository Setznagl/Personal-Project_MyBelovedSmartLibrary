package ReviewDAO.JDBC;

import ReviewModel.JDBC.JdbcReviewModel;

import java.sql.Connection;

public record DAO_BookReview(Connection c) {
  //CRUD operations for BookReview entity using JDBC

  public static void insert (JdbcReviewModel review) {
    // Code to insert a new review into the database
  }

  public JdbcReviewModel read(String bookName) {
    // Code to retrieve a review from the database based on book name
    return null; // Placeholder return
  }

  public void update(JdbcReviewModel review) {
    // Code to update an existing review in the database
  }

  public void delete(String bookName) {
    // Code to delete a review from the database based on book name
  }
}
