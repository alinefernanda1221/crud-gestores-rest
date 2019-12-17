package br.com.poupex.gestores.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poupex.gestores.model.Setor;
import br.com.poupex.gestores.service.SetorService;

@CrossOrigin
@RestController
@RequestMapping(value = "/setor")
public class SetorREST {

	
	@Autowired
	private SetorService setorService;
	
	
	@GetMapping("/buscarTodos")
	public List<Setor> buscarTodosOsSetores() {
		return setorService.buscaTodosOsSetores();
	}
}
