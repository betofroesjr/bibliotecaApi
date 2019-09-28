package br.com.faculdadedelta.bibliotecaapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Emprestimo extends Entidade<Emprestimo>{

	@NotNull(message = "A data do emprestimo é obrigatória")
	private LocalDate dataDoEmprestimo;

	@NotNull(message = "A data da devolução é obrigatória")
	private LocalDate dataDaDevolucao;
	
	@NotNull(message = "O valor do emprestimo é obrigatória")
	private BigDecimal valorDoEmprestimo;
	
	@NotNull(message = "O livro é obrigatória")
	@ManyToOne
	@JoinColumn(name="id_livro")
	private Livro livro;

	@NotNull(message = "O cliente é obrigatória")
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	public Emprestimo() {
		super(null);
	}

	public Emprestimo(
			Long id,
			@NotNull(message = "A data do emprestimo é obrigatória") LocalDate dataDoEmprestimo,
			@NotNull(message = "A data da devolução é obrigatória") LocalDate dataDaDevolucao,
			@NotNull(message = "O valor do emprestimo é obrigatória") BigDecimal valorDoEmprestimo,
			@NotNull(message = "O livro é obrigatória") Livro livro,
			@NotNull(message = "O cliente é obrigatória") Cliente cliente) {
		super(id);
		this.dataDoEmprestimo = dataDoEmprestimo;
		this.dataDaDevolucao = dataDaDevolucao;
		this.valorDoEmprestimo = valorDoEmprestimo;
		this.livro = livro;
		this.cliente = cliente;
	}

	public LocalDate getDataDoEmprestimo() {
		return dataDoEmprestimo;
	}

	public void setDataDoEmprestimo(LocalDate dataDoEmprestimo) {
		this.dataDoEmprestimo = dataDoEmprestimo;
	}

	public LocalDate getDataDaDevolucao() {
		return dataDaDevolucao;
	}

	public void setDataDaDevolucao(LocalDate dataDaDevolucao) {
		this.dataDaDevolucao = dataDaDevolucao;
	}

	public BigDecimal getValorDoEmprestimo() {
		return valorDoEmprestimo;
	}

	public void setValorDoEmprestimo(BigDecimal valorDoEmprestimo) {
		this.valorDoEmprestimo = valorDoEmprestimo;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
