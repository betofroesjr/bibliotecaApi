package br.com.faculdadedelta.bibliotecaapi.service;

import org.springframework.stereotype.Service;

import br.com.faculdadedelta.bibliotecaapi.model.Cliente;
import br.com.faculdadedelta.bibliotecaapi.repository.ClienteRepository;

@Service
public class ClienteService extends BaseService<Cliente, ClienteRepository> {

}
