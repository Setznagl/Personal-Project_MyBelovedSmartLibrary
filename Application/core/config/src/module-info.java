module core.config {
  requires java.sql;
  requires transitive io.github.cdimascio.dotenv.java;

  exports JDBC to core.dao;
  exports JPA to core.dao;
}