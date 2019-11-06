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

import com.pobreflix.projeto.models.CartaoCredito;
import com.pobreflix.projeto.repository.CartaoCreditoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pobreflix")
@CrossOrigin(origins="*")
public class CartaoCreditoResource {
	
	@Autowired
	CartaoCreditoRepository cartaoRepository;
	
	@GetMapping("/cartoes")
	@ApiOperation(value="Retorna a lista de cartões")
	public List<CartaoCredito> listaCartoes(){
		return cartaoRepository.findAll();
	}
	
	@GetMapping("/cartao/{id}")
	@ApiOperation(value="Retorna um cartão específico")
	public CartaoCredito listaCartao(@PathVariable(value="id") long id){
		return cartaoRepository.findById(id);
	}
	
	@PostMapping("/cartao")
	@ApiOperation(value="Salva um cartão de crédito")
	public CartaoCredito salvaCartao(@RequestBody CartaoCredito cartao) {
		return cartaoRepository.save(cartao);
	}
	
	@DeleteMapping("/cartao")
	@ApiOperation(value="Exclui um cartão de crédito")
	public void excluiCartao(@RequestBody CartaoCredito cartao) {
		cartaoRepository.delete(cartao);
	}
	
	@PutMapping("/cartao")
	@ApiOperation(value="Atualiza uma série")
	public CartaoCredito atualizaCartao(@RequestBody CartaoCredito cartao) {
		return cartaoRepository.save(cartao);
	}

}
