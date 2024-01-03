package com.example.EasyFood.service;

import com.example.EasyFood.controller.alimento.response.ListarAlimentoResponse;
import com.example.EasyFood.mapper.alimento.ListarAlimentoMapper;
import com.example.EasyFood.repository.alimento.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListarAlimentoService {

    @Autowired
    private AlimentoRepository alimentoRepository;

    public Page<ListarAlimentoResponse> listar(String search, Pageable pageable) {
        return alimentoRepository.findByNomeContainingIgnoreCase(search, pageable).map(ListarAlimentoMapper::toResponse);
    }
}
