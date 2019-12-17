package br.com.poupex.gestores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.poupex.gestores.model.Setor;
import br.com.poupex.gestores.repository.SetorRepository;

@Service
public class SetorService {

	@Autowired
	private SetorRepository setorDAO;
	
	
	public List<Setor> buscaTodosOsSetores() {
		return (List<Setor>) setorDAO.findAll();
	}
}
