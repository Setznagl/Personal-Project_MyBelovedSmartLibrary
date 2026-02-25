package JDBC;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.util.Map;

public interface database_connectivity {
  Dotenv dotenv = Dotenv.load();

  Map<String , String> config = Map.of(
    "user", dotenv.get("DB_USER"),
    "password", dotenv.get("DB_PASSWORD"),
    "url", "jdbc:postgresql://postgres:" + dotenv.get("DB_HOST_PORT") + "/" + dotenv.get("DB_DATASOURCE")
  );
  Object lock = new Object();

  static Connection getConnection () {
    synchronized (lock) {
      try { return java.sql.DriverManager.getConnection(config.get("url"), config.get("user"), config.get("password")); }
      catch (java.sql.SQLException e) { return null; }
    }
  }

}
