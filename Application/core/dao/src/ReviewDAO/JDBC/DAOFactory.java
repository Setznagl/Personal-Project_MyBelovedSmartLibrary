package ReviewDAO.JDBC;

import JDBC.database_connectivity;

public enum DAOFactory {
  INSTANCE; //Singleton instance of the factory

  private final DAO_BookReview bookReviewDAO;

  // The constructor of the enum is called once when the instance is created, ensuring that the DAO is initialized only once.
  DAOFactory() {
    // 1. Establish a connection to the database using the database_connectivity interface
    java.sql.Connection c = database_connectivity.getConnection();
    // 2. Initialize the DAO_BookReview with the established connection
    this.bookReviewDAO = new DAO_BookReview(c);
  }

  public DAO_BookReview getBookReviewDAO() {
    return bookReviewDAO;
  }
}