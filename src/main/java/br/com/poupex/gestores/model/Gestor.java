package br.com.poupex.gestores.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_GESTOR")
public class Gestor {

	@Id
	@Column(name = "ID_GESTOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOME", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
	
	@Column(name = "MATRICULA", nullable = false)
	private Long matricula;
	
	@Column(name = "DATA_NASCIMENTO", nullable = false)
	private Date dataNascimento;
	
	@OneToOne
	@JoinColumn(name = "ID_SETOR", referencedColumnName = "ID_SETOR")
	private Setor setor;
	
	
	public Gestor() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getMatricula() {
		return matricula;
	}


	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Setor getSetor() {
		return setor;
	}


	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	
}
