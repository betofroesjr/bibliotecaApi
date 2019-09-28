package br.com.faculdadedelta.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente extends Entidade<Cliente> {

	@NotBlank(message = "A nome é obrigatória")
	private String nome;

	@NotBlank(message = "A cpf é obrigatória")
	private String cpf;
	
	@NotBlank(message = "A email é obrigatória")
	private String email;
	
	@NotBlank(message = "A telefone é obrigatória")
	private String telefone;
	
	@NotNull(message = "O endereço é obrigatória")
	@ManyToOne
	@JoinColumn(name="id_endereco")
	private Endereco endereco;
	
	public Cliente() {
		super(null);
	}
	
	public Cliente(Long id,
			@NotBlank(message = "A nome é obrigatória") String nome,
			@NotBlank(message = "A cpf é obrigatória") String cpf,
			@NotBlank(message = "A email é obrigatória") String email,
			@NotBlank(message = "A telefone é obrigatória") String telefone,
			@NotNull(message = "O endereço é obrigatória") Endereco endereco) {
		super(id);
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
