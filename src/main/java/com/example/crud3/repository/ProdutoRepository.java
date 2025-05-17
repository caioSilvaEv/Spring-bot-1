package com.example.crud3.repository;

import com.example.crud3.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Buscar produtos pelo nome (parcial e case-insensitive)
    List<Produto> findByNomeContainingIgnoreCase(String nome);

    // Buscar produtos pela marca (parcial e case-insensitive)
    List<Produto> findByMarcaContainingIgnoreCase(String marca);
}


