package com.example.EasyFood.mapper.alimento;

import com.example.EasyFood.controller.alimento.response.DetalharAlimentoResponse;
import com.example.EasyFood.domain.alimento.Alimento;

public class DetalharAlimentoMapper {
    public static DetalharAlimentoResponse toResponse(Alimento alimento) {
        return DetalharAlimentoResponse
                .builder()
                .id(alimento.getId())
                .nome(alimento.getNome())
                .calorias(alimento.getCalorias())
                .carboidratos(alimento.getCarboidratos())
                .proteinas(alimento.getProteinas())
                .gorduras(alimento.getGorduras())
                .sodio(alimento.getSodio())
                .fibras(alimento.getFibras())
                .build();
    }
}
