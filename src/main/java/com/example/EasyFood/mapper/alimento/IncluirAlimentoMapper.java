package com.example.EasyFood.mapper.alimento;

import com.example.EasyFood.controller.alimento.request.IncluirAlimentoRequest;
import com.example.EasyFood.controller.alimento.response.IncluirAlimentoResponse;
import com.example.EasyFood.domain.alimento.Alimento;

public class IncluirAlimentoMapper {
    public static Alimento toEntity(IncluirAlimentoRequest request){
        return Alimento.builder()
                .nome(request.getNome())
                .calorias(request.getCalorias())
                .carboidratos(request.getCarboidratos())
                .proteinas(request.getProteinas())
                .gorduras(request.getGorduras())
                .fibras(request.getFibras())
                .sodio(request.getSodio())
                .build();
    }

    public static IncluirAlimentoResponse toResponse(Alimento alimento) {
        return IncluirAlimentoResponse.builder()
                .id(alimento.getId())
                .nome(alimento.getNome())
                .build();
    }
}
