module core.dao {
  requires java.sql;
  requires core.model;
  requires core.config;
  requires core.util;
}

// Kubernetes, ideia para Node, bash para criar Runner do Github Actions, orquestrador derruba com o comando de remover