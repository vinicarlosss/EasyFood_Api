package com.example.EasyFood.repository.alimento;

import com.example.EasyFood.domain.alimento.Alimento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlimentoRepository  extends JpaRepository<Alimento, Long> {

    boolean existsByNome(String nome);
    Page<Alimento> findByNomeContainingIgnoreCase(String search, Pageable pageable);

}
