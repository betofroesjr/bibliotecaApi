package br.com.faculdadedelta.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faculdadedelta.bibliotecaapi.model.Genero;
import br.com.faculdadedelta.bibliotecaapi.service.GeneroService;

@RestController
@RequestMapping("/generos")
public class GeneroResource extends BaseResource<Genero, GeneroService>{
	
}
