package br.com.poupex.gestores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.poupex.gestores.model.Setor;

public interface SetorRepository extends CrudRepository<Setor, Long>{

	@Query("FROM Setor")
	public List<Setor> buscarTodos();
}
