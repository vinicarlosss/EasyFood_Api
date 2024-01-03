package com.example.EasyFood.mapper.alimento;


import com.example.EasyFood.controller.alimento.response.ListarAlimentoResponse;
import com.example.EasyFood.domain.alimento.Alimento;

public class ListarAlimentoMapper {
    public static ListarAlimentoResponse toResponse(Alimento alimento) {
        return ListarAlimentoResponse
                .builder()
                .id(alimento.getId())
                .nome(alimento.getNome())
                .build();
    }
}
