module core.dao {
  requires jakarta.jakartaee.web.api;
  requires transitive core.model; // <- make core.model available to dependent modules

  exports ReviewDAO to core.repository; // <- make ReviewDAO available to repository module
}