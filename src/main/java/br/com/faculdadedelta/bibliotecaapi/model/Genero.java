package br.com.faculdadedelta.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Genero extends Entidade<Genero>{
	
	@NotBlank(message = "A descrição é obrigatória")
	private String descricao;
	
	public Genero() {
		super(null);
	}
	public Genero(Long id, String descricao) {
		super(id);
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
