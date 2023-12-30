package com.example.EasyFood.service.alimento;

import com.example.EasyFood.controller.alimento.request.AlterarAlimentoRequest;
import com.example.EasyFood.controller.alimento.response.AlterarLivroResponse;
import com.example.EasyFood.domain.alimento.Alimento;
import com.example.EasyFood.repository.alimento.AlimentoRepository;
import com.example.EasyFood.validator.alimento.DadosAlterarAlimentoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlterarAlimentoService {
    @Autowired
    private AlimentoRepository alimentoRepository;
    @Autowired
    private DadosAlterarAlimentoValidator dadosAlterarAlimentoValidator;


    public AlterarLivroResponse alterar(Long alimentoId, AlterarAlimentoRequest request) {
        Optional<Alimento> alimento = alimentoRepository.findById(alimentoId);
        dadosAlterarAlimentoValidator.validar(alimento, request);
    }
}
