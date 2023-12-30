package com.example.EasyFood.validator.alimento;

import com.example.EasyFood.controller.alimento.request.AlterarAlimentoRequest;
import com.example.EasyFood.domain.alimento.Alimento;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public class DadosAlterarAlimentoValidator {
    public void validar(Optional<Alimento> alimento, AlterarAlimentoRequest request) {
        if(Objects.isNull(alimento))
            throw  new ResponseStatusException(NOT_FOUND, "Alimento não encontrado");
    }
}
