package com.example.EasyFood.service.alimento;

import com.example.EasyFood.controller.alimento.response.DetalharAlimentoResponse;
import com.example.EasyFood.domain.alimento.Alimento;
import com.example.EasyFood.mapper.alimento.DetalharAlimentoMapper;
import com.example.EasyFood.repository.alimento.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class DetalharAlimentoService {

    @Autowired
    private AlimentoRepository alimentoRepository;

    public DetalharAlimentoResponse detalhar(Long alimentoId) {
        Alimento alimento = alimentoRepository.findById(alimentoId)
                .orElseThrow(()->{
                   throw new ResponseStatusException(NOT_FOUND, "Alimento não encontrado.");
                });
        return DetalharAlimentoMapper.toResponse(alimento);
    }
}
