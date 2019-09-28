package br.com.faculdadedelta.bibliotecaapi.service;

import org.springframework.stereotype.Service;

import br.com.faculdadedelta.bibliotecaapi.model.Emprestimo;
import br.com.faculdadedelta.bibliotecaapi.repository.EmprestimoRepository;

@Service
public class EmprestimoService extends BaseService<Emprestimo, EmprestimoRepository> {

}
