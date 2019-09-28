package br.com.faculdadedelta.bibliotecaapi.service;

import org.springframework.stereotype.Service;

import br.com.faculdadedelta.bibliotecaapi.model.Genero;
import br.com.faculdadedelta.bibliotecaapi.repository.GeneroRepository;

@Service
public class GeneroService extends BaseService<Genero, GeneroRepository> {
	
	@Override
	protected String getMessageError() {
		return "Não foi possivel encontrar o Genero informado!";
	}

}
