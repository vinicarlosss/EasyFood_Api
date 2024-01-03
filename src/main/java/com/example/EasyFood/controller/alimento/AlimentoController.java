package com.example.EasyFood.controller.alimento;

import com.example.EasyFood.controller.alimento.request.AlterarAlimentoRequest;
import com.example.EasyFood.controller.alimento.request.IncluirAlimentoRequest;
import com.example.EasyFood.controller.alimento.response.AlterarAlimentoResponse;
import com.example.EasyFood.controller.alimento.response.DetalharAlimentoResponse;
import com.example.EasyFood.controller.alimento.response.IncluirAlimentoResponse;
import com.example.EasyFood.controller.alimento.response.ListarAlimentoResponse;
import com.example.EasyFood.service.ListarAlimentoService;
import com.example.EasyFood.service.alimento.AlterarAlimentoService;
import com.example.EasyFood.service.alimento.DeletarAlimentoService;
import com.example.EasyFood.service.alimento.DetalharAlimentoService;
import com.example.EasyFood.service.alimento.InlcuirAlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/alimentos")
public class AlimentoController {

    @Autowired
    private InlcuirAlimentoService inlcuirAlimentoService;
    @Autowired
    private AlterarAlimentoService alterarAlimentoService;
    @Autowired
    private DeletarAlimentoService deletarAlimentoService;
    @Autowired
    private DetalharAlimentoService detalharAlimentoService;
    @Autowired
    private ListarAlimentoService listarAlimentoService;

    @PostMapping("/incluir")
    public IncluirAlimentoResponse incluir(@RequestBody IncluirAlimentoRequest request){
        return inlcuirAlimentoService.incluir(request);
    }

    @PutMapping("/alterar/{alimentoId}")
    @ResponseStatus(value = OK, reason = "Alimento alterado com sucesso")
    public AlterarAlimentoResponse alterar(@PathVariable Long alimentoId, @RequestBody AlterarAlimentoRequest request){
        return alterarAlimentoService.alterar(alimentoId, request);
    }

    @DeleteMapping("/deletar/{alimentoId}")
    @ResponseStatus(value = OK, reason = "Alimento removido com sucesso")
    public void deletar(@PathVariable Long alimentoId){
        deletarAlimentoService.deletar(alimentoId);
    }

    @GetMapping("/detalhar/{alimentoId}")
    public DetalharAlimentoResponse detalhar(@PathVariable Long alimentoId){
        return detalharAlimentoService.detalhar(alimentoId);
    }
    @GetMapping
    public Page<ListarAlimentoResponse> listar(@RequestParam(required = false, defaultValue = "") String search, Pageable pageable){
        return listarAlimentoService.listar(search, pageable);
    }
}
