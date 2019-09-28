package br.com.faculdadedelta.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.faculdadedelta.bibliotecaapi.model.type.Sexo;

@Entity
public class Autor extends Entidade<Autor> {

	@NotBlank(message = "A nome é obrigatória")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@NotNull(message = "O campo tipo sexo não pode estar vazio!")
	private Sexo sexo;

	public Autor() {
		super(null);
	}

	public Autor(
			Long id,
			@NotBlank(message = "A nome é obrigatória") String nome,
			@NotNull(message = "O campo tipo sexo não pode estar vazio!") Sexo sexo) {
		super(id);
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
