package com.example.EasyFood.service.alimento;

import com.example.EasyFood.controller.alimento.request.AlterarAlimentoRequest;
import com.example.EasyFood.controller.alimento.response.AlterarAlimentoResponse;
import com.example.EasyFood.domain.alimento.Alimento;
import com.example.EasyFood.mapper.alimento.AlterarAlimentoMapper;
import com.example.EasyFood.repository.alimento.AlimentoRepository;
import com.example.EasyFood.validator.alimento.DadosAlterarAlimentoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static com.example.EasyFood.mapper.alimento.AlterarAlimentoMapper.*;
import static com.example.EasyFood.mapper.alimento.AlterarAlimentoMapper.toResponse;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class AlterarAlimentoService {
    @Autowired
    private AlimentoRepository alimentoRepository;
    @Autowired
    private DadosAlterarAlimentoValidator dadosAlterarAlimentoValidator;

    @Transactional
    public AlterarAlimentoResponse alterar(Long alimentoId, AlterarAlimentoRequest request) {
        Alimento alimento = alimentoRepository.findById(alimentoId)
                .orElseThrow(()->{
                    throw new ResponseStatusException(BAD_REQUEST, "Alimento não encontrado");
                });
        dadosAlterarAlimentoValidator.validar(alimento, request);
        alimento = change(alimento ,request);
        alimentoRepository.save(alimento);
        return toResponse(alimento);
    }
}
