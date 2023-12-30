package com.example.EasyFood.controller.alimento;

import com.example.EasyFood.controller.alimento.request.IncluirAlimentoRequest;
import com.example.EasyFood.controller.alimento.response.IncluirAlimentoResponse;
import com.example.EasyFood.service.alimento.InlcuirAlimentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/alimentos")
public class AlimentoController {

    @Autowired
    private InlcuirAlimentoService inlcuirAlimentoService;

    @PostMapping("/incluir")
    @ResponseStatus(value = OK, reason = "Alimento incluído com sucesso")
    public IncluirAlimentoResponse incluir(@Valid @RequestBody IncluirAlimentoRequest request){
        return inlcuirAlimentoService.incluir(request);
    }
}
