package br.com.faculdadedelta.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faculdadedelta.bibliotecaapi.model.Livro;
import br.com.faculdadedelta.bibliotecaapi.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroResource extends BaseResource<Livro, LivroService>{
	
}
