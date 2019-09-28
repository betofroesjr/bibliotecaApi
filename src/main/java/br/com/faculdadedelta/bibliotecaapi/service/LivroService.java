package br.com.faculdadedelta.bibliotecaapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faculdadedelta.bibliotecaapi.model.Livro;
import br.com.faculdadedelta.bibliotecaapi.repository.LivroRepository;

@Service
public class LivroService extends BaseService<Livro, LivroRepository> {

	@Autowired
	private GeneroService generoService;
	
	@Override
	public void consistirPersistencia(Livro entidade) {
		if(entidade.getGenero() != null){
			generoService.pesquisarPorId(entidade.getGenero().getId());
		}
	}

}
