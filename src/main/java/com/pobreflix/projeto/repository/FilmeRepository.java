package com.pobreflix.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pobreflix.projeto.models.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{
	
	Filme findById(long id);
	
}
