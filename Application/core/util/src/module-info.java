module core.util {
  requires jakarta.persistence;

  exports ENUMS to core.model;

  opens ENUMS to jakarta.persistence;
  opens JPA to jakarta.persistence;
}