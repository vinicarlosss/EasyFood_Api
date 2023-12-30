package com.example.EasyFood.validator.alimento;

import com.example.EasyFood.controller.alimento.request.IncluirAlimentoRequest;
import com.example.EasyFood.repository.alimento.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CONFLICT;

@Component
public class DadosAlimentosValidator {
    @Autowired
    private AlimentoRepository alimentoRepository;

    public void validar(IncluirAlimentoRequest request){
        if(alimentoRepository.existsByNome(request.getNome()))
            throw new ResponseStatusException(CONFLICT, "O alimento já está cadastrado.");
        if(request.getNome().trim().length() < 3)
            throw new ResponseStatusException(BAD_REQUEST, "O nome do alimento deve conter ao menos 3 caracteres.");
    }
}
