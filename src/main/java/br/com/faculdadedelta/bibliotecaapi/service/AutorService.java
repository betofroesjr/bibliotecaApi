package br.com.faculdadedelta.bibliotecaapi.service;

import org.springframework.stereotype.Service;

import br.com.faculdadedelta.bibliotecaapi.model.Autor;
import br.com.faculdadedelta.bibliotecaapi.repository.AutorRepository;

@Service
public class AutorService extends BaseService<Autor, AutorRepository> {

}
