package com.pobreflix.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pobreflix.projeto.models.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long>{

	Serie findById(long id);
	
}
