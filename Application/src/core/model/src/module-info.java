module core.model {
    requires java.base;
    requires java.logging;
    requires lombok;
    requires jakarta.jakartaee.web.api;

  //Exporting model to the DAO module, so that DAO can access the entities code here
  //Source is at "core" folder, that's why you need to use "core.dao" to refer to the dao module without import issues
  exports ReviewModel to core.dao , core.repository , core.services , core.controller;
  // Need to export to any other module that needs to access the entities, even by "transitive" dependency
}