package br.com.poupex.gestores.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.poupex.gestores.model.Gestor;

public interface GestorRepository extends CrudRepository<Gestor, Long> {

}
