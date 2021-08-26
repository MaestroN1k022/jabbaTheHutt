package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.response;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CategoriaDto {
    private Long id;
    private String nome;

    public static CategoriaDto converter(Categoria categoria) {
        return new CategoriaDto(categoria.getId(), categoria.getNome());
    }
}