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

import com.pobreflix.projeto.models.Serie;
import com.pobreflix.projeto.repository.SerieRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pobreflix")
@CrossOrigin(origins="*")
public class SerieResource {
	
	@Autowired
	SerieRepository serieRepository;
	
	@GetMapping("/series")
	@ApiOperation(value="Retorna a lista de series")
	public List<Serie> listaSeries(){
		return serieRepository.findAll();
	}
	
	@GetMapping("/serie/{id}")
	@ApiOperation(value="Retorna uma série específica")
	public Serie listaSerie(@PathVariable(value="id") long id){
		return serieRepository.findById(id);
	}
	
	@PostMapping("/serie")
	@ApiOperation(value="Salva uma série")
	public Serie salvaSerie(@RequestBody Serie serie) {
		return serieRepository.save(serie);
	}
	
	@DeleteMapping("/serie")
	@ApiOperation(value="Exclui uma série")
	public void excluiSerie(@RequestBody Serie serie) {
		serieRepository.delete(serie);
	}
	
	@PutMapping("/serie")
	@ApiOperation(value="Atualiza uma série")
	public Serie atualizaSerie(@RequestBody Serie serie) {
		return serieRepository.save(serie);
	}

}
