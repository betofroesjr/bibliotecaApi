package br.com.faculdadedelta.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faculdadedelta.bibliotecaapi.model.Cliente;
import br.com.faculdadedelta.bibliotecaapi.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource extends BaseResource<Cliente, ClienteService> {

}
