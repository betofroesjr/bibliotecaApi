package br.com.faculdadedelta.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faculdadedelta.bibliotecaapi.model.Endereco;
import br.com.faculdadedelta.bibliotecaapi.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoResource extends BaseResource<Endereco, EnderecoService> {

}
