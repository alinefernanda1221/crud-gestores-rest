package br.com.poupex.gestores.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.poupex.gestores.model.Gestor;
import br.com.poupex.gestores.service.GestorService;

@CrossOrigin
@RestController
@RequestMapping(
		  value = "/gestor", 
		  produces = "application/json",
		  method = {RequestMethod.GET, RequestMethod.PUT, 
				  	RequestMethod.POST, RequestMethod.DELETE,
				  	RequestMethod.OPTIONS, RequestMethod.HEAD}) 

public class GestorREST {
	
	@Autowired
	private GestorService gestorService;
	
	
	@GetMapping("/buscar/{id}")
	public @ResponseBody Gestor buscarGestorPorId(@PathVariable(name = "id") Long id) {
		return gestorService.buscarGestorPorId(id);
	}
	
	@GetMapping("/buscarTodos")
	public @ResponseBody List<Gestor> buscarTodosOsGestores() {
		return gestorService.buscarTodosOsGestores();
	}
	
	@DeleteMapping("/excluir/{id}")
	public @ResponseBody String deletarGestorPorId(@PathVariable(name = "id") Long id) {
		gestorService.deletarGestorPorId(id);
		return null;
	}
	
	@PutMapping("/atualizar")
	public @ResponseBody String atualizarGestor(@RequestBody Gestor gestor) {
		gestorService.atualizarGestor(gestor);
		return null;
	}
	
	@PostMapping("/salvar")
	public @ResponseBody String cadastrarGestor(@RequestBody Gestor gestor) {
		gestorService.cadastrarGestor(gestor);
		return null;
	}
}
