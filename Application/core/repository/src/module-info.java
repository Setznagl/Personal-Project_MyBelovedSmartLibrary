module core.repository {
  requires jakarta.persistence;
  //requires core.model; <- already available via core.dao "transitive" export

  exports Review to core.dao;
}
