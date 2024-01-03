package com.example.EasyFood.mapper.alimento;

import com.example.EasyFood.controller.alimento.request.AlterarAlimentoRequest;
import com.example.EasyFood.controller.alimento.response.AlterarAlimentoResponse;
import com.example.EasyFood.domain.alimento.Alimento;

public class AlterarAlimentoMapper {


    public static AlterarAlimentoResponse toResponse(Alimento alimento) {
        return AlterarAlimentoResponse.builder()
                .id(alimento.getId())
                .nome(alimento.getNome())
                .calorias(alimento.getCalorias())
                .carboidratos(alimento.getCarboidratos())
                .proteinas(alimento.getProteinas())
                .gorduras(alimento.getGorduras())
                .fibras(alimento.getFibras())
                .sodio(alimento.getSodio())
                .build();
    }

    public static Alimento change(Alimento alimento, AlterarAlimentoRequest request) {
        alimento.setNome(request.getNome());
        alimento.setCalorias(request.getCalorias());
        alimento.setCarboidratos(request.getCarboidratos());
        alimento.setProteinas(request.getProteinas());
        alimento.setGorduras(request.getGorduras());
        alimento.setFibras(request.getFibras());
        alimento.setSodio(request.getSodio());
        return alimento;
    }
}
