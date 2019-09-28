package br.com.faculdadedelta.bibliotecaapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Livro extends Entidade<Livro>{

	@NotBlank(message = "A nome é obrigatória")
	private String nome;
	
	@NotNull(message = "O volume é obrigatória")
	private Integer volume;

	@NotNull(message = "O data publicação é obrigatória")
	private LocalDate dataPublicacao;

	@NotNull(message = "O valor é obrigatória")
	private BigDecimal valor;

	@NotNull(message = "O genero é obrigatória")
	@ManyToOne
	@JoinColumn(name="id_genero")
	private Genero genero;

	@NotNull(message = "O editora é obrigatória")
	@ManyToOne
	@JoinColumn(name="id_editora")
	private Editora editora;

	@NotNull(message = "O autor é obrigatória")
	@ManyToOne
	@JoinColumn(name="id_autor")
	private Autor autor;
	
	public Livro() {
		super(null);
	}

	public Livro(
			Long id,
			@NotBlank(message = "A nome é obrigatória") String nome,
			@NotNull(message = "O volume é obrigatória") Integer volume,
			@NotNull(message = "O data publicação é obrigatória") LocalDate dataPublicacao,
			@NotNull(message = "O valor é obrigatória") BigDecimal valor,
			@NotNull(message = "O genero é obrigatória") Genero genero,
			@NotNull(message = "O editora é obrigatória") Editora editora,
			@NotNull(message = "O editora é obrigatória") Autor autor) {
		super(id);
		this.nome = nome;
		this.volume = volume;
		this.dataPublicacao = dataPublicacao;
		this.valor = valor;
		this.genero = genero;
		this.editora = editora;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
