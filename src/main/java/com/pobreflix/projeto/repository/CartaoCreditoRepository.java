package com.pobreflix.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoCreditoRepository extends JpaRepository<CartaoCreditoRepository, Long>{
	
	CartaoCreditoRepository findById(long id);
	
}
