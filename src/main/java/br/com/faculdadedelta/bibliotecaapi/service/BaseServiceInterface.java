package br.com.faculdadedelta.bibliotecaapi.service;

import java.util.List;

import br.com.faculdadedelta.bibliotecaapi.model.Entidade;

public interface BaseServiceInterface<E extends Entidade<E>> {

	public E inserir(E entidade);
	public E alterar(E entidade, Long id);
	public void deletarPorId(Long id);
	public List<E> listar();
	public E pesquisarPorId(Long id);
}
