package br.com.poupex.gestores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.poupex.gestores.model.Gestor;
import br.com.poupex.gestores.repository.GestorRepository;
/**
 * Classer de serviço com as operações referentes a entidade {@code Gestor}.
 * 
 * @author aline
 *
 */
@Service
public class GestorService {

	@Autowired
	private GestorRepository gestorDAO;
	
	
	public Gestor buscarGestorPorId(Long id) {
		return gestorDAO.findById(id).get();
	}
	
	public List<Gestor> buscarTodosOsGestores() {
		return (List<Gestor>) gestorDAO.findAll();
	}
	
	public void deletarGestorPorId(Long id) {
		gestorDAO.deleteById(id);
	}
	
	public void atualizarGestor(Gestor gestor) {
		gestorDAO.save(gestor);
	}
	
	public void cadastrarGestor(Gestor gestor) {
		gestorDAO.save(gestor);
	}
}
