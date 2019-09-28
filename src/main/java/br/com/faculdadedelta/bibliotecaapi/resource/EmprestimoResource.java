package br.com.faculdadedelta.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faculdadedelta.bibliotecaapi.model.Emprestimo;
import br.com.faculdadedelta.bibliotecaapi.service.EmprestimoService;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoResource extends BaseResource<Emprestimo, EmprestimoService> {

}
