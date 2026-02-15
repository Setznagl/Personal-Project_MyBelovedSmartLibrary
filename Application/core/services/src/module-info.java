module core.services {
  requires transitive core.repository;
  //requires core.model; <- already available via core.dao "transitive" export

  exports ReviewService to core.controller;
}