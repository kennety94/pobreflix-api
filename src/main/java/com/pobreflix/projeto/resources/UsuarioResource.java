package com.pobreflix.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pobreflix.projeto.models.Usuario;
import com.pobreflix.projeto.repository.UsuarioRepository;

@RestController
@RequestMapping(value="/api")
public class UsuarioResource {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario listaUsuario(@PathVariable(value="id") long id){
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/usuario")
	public Usuario salvaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/usuario")
	public void excluiUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	@PutMapping("/usuario")
	public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
