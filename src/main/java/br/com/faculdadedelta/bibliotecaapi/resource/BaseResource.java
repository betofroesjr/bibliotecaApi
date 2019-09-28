package br.com.faculdadedelta.bibliotecaapi.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.faculdadedelta.bibliotecaapi.model.Entidade;
import br.com.faculdadedelta.bibliotecaapi.service.BaseServiceInterface;

public abstract class BaseResource<E extends Entidade<E>, S extends BaseServiceInterface<E>> {

	@Autowired
	private S service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public E inserir(@RequestBody @Valid E entidade, HttpServletResponse response){
		E entidadeCadastrado = service.inserir(entidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entidade.getId()).toUri();
		response.setHeader(HttpHeaders.LOCATION, uri.toString());
		return entidadeCadastrado;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public E alterar(@RequestBody @Valid E entidade, @PathVariable("id") Long id){
		return service.alterar(entidade, id);
	}
	

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletarPorId(@PathVariable("id") Long id){
		service.deletarPorId(id);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<E> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public E pesquisarPorId(@PathVariable("id") Long id){
		return service.pesquisarPorId(id);
	}
	
}
