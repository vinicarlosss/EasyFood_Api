package com.example.EasyFood.controller.alimento;

import com.example.EasyFood.controller.alimento.request.AlterarAlimentoRequest;
import com.example.EasyFood.controller.alimento.request.IncluirAlimentoRequest;
import com.example.EasyFood.controller.alimento.response.AlterarAlimentoResponse;
import com.example.EasyFood.controller.alimento.response.IncluirAlimentoResponse;
import com.example.EasyFood.service.alimento.AlterarAlimentoService;
import com.example.EasyFood.service.alimento.InlcuirAlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/alimentos")
public class AlimentoController {

    @Autowired
    private InlcuirAlimentoService inlcuirAlimentoService;

    @Autowired
    private AlterarAlimentoService alterarAlimentoService;

    @PostMapping("/incluir")
    @ResponseStatus(value = OK, reason = "Alimento incluído com sucesso")
    public IncluirAlimentoResponse incluir(@RequestBody IncluirAlimentoRequest request){
        return inlcuirAlimentoService.incluir(request);
    }

    @PutMapping("/alterar/{alimentoId}")
    public AlterarAlimentoResponse alterar(@PathVariable Long alimentoId, @RequestBody AlterarAlimentoRequest request){
        return alterarAlimentoService.alterar(alimentoId, request);
    }
}
