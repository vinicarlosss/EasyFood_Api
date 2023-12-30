package com.example.EasyFood.service.alimento;

import com.example.EasyFood.controller.alimento.request.IncluirAlimentoRequest;
import com.example.EasyFood.controller.alimento.response.IncluirAlimentoResponse;
import com.example.EasyFood.domain.alimento.Alimento;
import com.example.EasyFood.mapper.alimento.IncluirAlimentoMapper;
import com.example.EasyFood.repository.alimento.AlimentoRepository;
import com.example.EasyFood.validator.alimento.DadosAlimentosValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.EasyFood.mapper.alimento.IncluirAlimentoMapper.*;

@Service
public class InlcuirAlimentoService {

    @Autowired
    private DadosAlimentosValidator dadosAlimentosValidator;
    @Autowired
    private AlimentoRepository alimentoRepository;

    @Transactional
    public IncluirAlimentoResponse incluir(IncluirAlimentoRequest request) {
        dadosAlimentosValidator.validar(request);
        Alimento alimento = toEntity(request);
        alimentoRepository.save(alimento);
        return toResponse(alimento);
    }
}
