package com.pobreflix.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pobreflix.projeto.models.Filme;
import com.pobreflix.projeto.repository.FilmeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pobreflix")
@CrossOrigin(origins="*")
public class FilmeResource {

	@Autowired
	FilmeRepository filmeRepository;
	
	@GetMapping("/filmes")
	@ApiOperation(value="Retorna a lista de filmes")
	public List<Filme> listaFilmes(){
		return filmeRepository.findAll();
	}
	
	@GetMapping("/filme/{id}")
	@ApiOperation(value="Retorna um filme específico")
	public Filme listaFilme(@PathVariable(value="id") long id){
		return filmeRepository.findById(id);
	}
	
	@PostMapping("/filme")
	@ApiOperation(value="Salva um filme")
	public Filme salvaFilme(@RequestBody Filme filme) {
		return filmeRepository.save(filme);
	}
	
	@DeleteMapping("/filme")
	@ApiOperation(value="Exclui um filme")
	public void excluiFilme(@RequestBody Filme filme) {
		filmeRepository.delete(filme);
	}
	
	@PutMapping("/filme")
	@ApiOperation(value="Atualiza um filme")
	public Filme atualizaFilme(@RequestBody Filme filme) {
		return filmeRepository.save(filme);
	}
	
}
