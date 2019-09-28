package br.com.faculdadedelta.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faculdadedelta.bibliotecaapi.model.Editora;
import br.com.faculdadedelta.bibliotecaapi.service.EditoraService;

@RestController
@RequestMapping("/editoras")
public class EditoraResource extends BaseResource<Editora, EditoraService> {

}
