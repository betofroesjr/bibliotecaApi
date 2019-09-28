package br.com.faculdadedelta.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Editora extends Entidade<Editora>{

	@NotBlank(message = "A nome é obrigatória")
	private String nome;
	
	public Editora() {
		super(null);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
