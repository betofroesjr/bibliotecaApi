package br.com.faculdadedelta.bibliotecaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.faculdadedelta.bibliotecaapi.model.Entidade;

public abstract class BaseService<E extends Entidade<E>, R extends JpaRepository<E, Long>> implements BaseServiceInterface<E> {

	@Autowired
	private R repository;
	
	public void consistirPersistencia(E entidade){
	};
	
	@Override
	@Transactional
	public E inserir(E entidade) {
		consistirPersistencia(entidade);
		entidade.setId(null);
		E entidadeCadastrado = repository.save(entidade);
		return entidadeCadastrado;
	}

	@Override
	@Transactional
	public E alterar(E entidade, Long id) {
		pesquisarPorId(id);
		consistirPersistencia(entidade);
		entidade.setId(id);
		return repository.save(entidade);
	}

	@Override
	public void deletarPorId(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<E> listar() {
		return repository.findAll();
	}

	@Override
	public E pesquisarPorId(Long id) {
		return repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(getMessageError(),1));
	}

	protected String getMessageError() {
		return "Recurso não encontrado!";
	}

}
