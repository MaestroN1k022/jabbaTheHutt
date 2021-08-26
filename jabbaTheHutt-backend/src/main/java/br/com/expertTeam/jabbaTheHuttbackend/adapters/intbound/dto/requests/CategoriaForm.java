package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.requests;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import lombok.Getter;

@Getter
public class CategoriaForm {
    private String nome;

    public static Categoria converter(CategoriaForm categoriaForm) {
        return new Categoria(null, categoriaForm.getNome());
    }
}