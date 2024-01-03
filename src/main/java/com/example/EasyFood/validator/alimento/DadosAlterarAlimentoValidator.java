package com.example.EasyFood.validator.alimento;

import com.example.EasyFood.controller.alimento.request.AlterarAlimentoRequest;
import com.example.EasyFood.domain.alimento.Alimento;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;
import java.util.Optional;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Component
public class DadosAlterarAlimentoValidator {
    public void validar(Alimento alimento, AlterarAlimentoRequest request) {
        if(Objects.isNull(request.getNome()) || request.getNome().trim().length() == 0)
            request.setNome(alimento.getNome());
        if(request.getNome().trim().length() < 3)
            throw new ResponseStatusException(BAD_REQUEST, "O nome do alimento deve conter ao menos 3 caracteres.");
        if(Objects.isNull(request.getCalorias()))
            request.setCalorias(alimento.getCalorias());
        if(Objects.isNull(request.getGorduras()))
            request.setGorduras(alimento.getGorduras());
        if(Objects.isNull(request.getProteinas()))
            request.setProteinas(alimento.getProteinas());
        if(Objects.isNull(request.getCarboidratos()))
            request.setCarboidratos(alimento.getCarboidratos());
        if(Objects.isNull(request.getFibras()))
            request.setFibras(alimento.getFibras());
        if(Objects.isNull(request.getSodio()))
            request.setSodio(alimento.getSodio());
    }
}
