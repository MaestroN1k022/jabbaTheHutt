package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.response;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class CategoriaDto {
    private Long id;
    private String nome;

    public static CategoriaDto converter(Categoria categoria) {
        return new CategoriaDto(categoria.getId(), categoria.getNome());
    }

    public static List<CategoriaDto> converter(List<Categoria> categorias) {
        return categorias.stream()
                .map(categoria -> converter(categoria))
                .collect(Collectors.toList());
    }
}