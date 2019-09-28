package br.com.faculdadedelta.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Endereco extends Entidade<Endereco>{

	@NotBlank(message = "A rua é obrigatória")
	private String rua;

	@NotBlank(message = "A bairro é obrigatória")
	private String bairro;

	@NotBlank(message = "A quadra é obrigatória")
	private String quadra;

	@NotBlank(message = "A lote é obrigatória")
	private String lote;

	@NotBlank(message = "A numero é obrigatória")
	private String numero;
	
	@NotBlank(message = "A complemento é obrigatória")
	private String complemento;
	
	@NotBlank(message = "A cidade é obrigatória")
	private String cidade;
	
	@NotBlank(message = "A estado é obrigatória")
	private String estado;
	
	@NotBlank(message = "A pais é obrigatória")
	private String pais;
	
	public Endereco() {
		super(null);
	}

	public Endereco(
			Long id,
			@NotBlank(message = "A rua é obrigatória") String rua,
			@NotBlank(message = "A bairro é obrigatória") String bairro,
			@NotBlank(message = "A quadra é obrigatória") String quadra,
			@NotBlank(message = "A lote é obrigatória") String lote,
			@NotBlank(message = "A numero é obrigatória") String numero,
			@NotBlank(message = "A complemento é obrigatória") String complemento,
			@NotBlank(message = "A cidade é obrigatória") String cidade,
			@NotBlank(message = "A estado é obrigatória") String estado,
			@NotBlank(message = "A pais é obrigatória") String pais) {
		super(id);
		this.rua = rua;
		this.bairro = bairro;
		this.quadra = quadra;
		this.lote = lote;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
