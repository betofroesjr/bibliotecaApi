package br.com.faculdadedelta.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faculdadedelta.bibliotecaapi.model.Autor;
import br.com.faculdadedelta.bibliotecaapi.service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorResource extends BaseResource<Autor, AutorService> {

}
