module core.repository {
  requires transitive core.dao; // <- depend on core.dao module
  requires jakarta.jakartaee.web.api;
  //requires core.model; <- already available via core.dao "transitive" export

  exports ReviewRepository to core.services;
}
