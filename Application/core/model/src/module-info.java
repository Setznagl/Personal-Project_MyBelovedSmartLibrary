module core.model {
    requires java.base;
    requires java.logging;
    requires lombok;
    requires java.sql;
    requires jakarta.persistence;
    requires core.util;

  exports ReviewModel.JDBC to core.dao;
  exports ReviewModel.JPA to core.dao; // <- make ReviewModel available to dao module

}
