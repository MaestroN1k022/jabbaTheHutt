package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.response;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class ProdutoDto {
    private Long id;
    private String nome;
    private BigDecimal preco;
    private Categoria Categoria;

    public static ProdutoDto converter(Produto produto) {
        return new ProdutoDto(produto.getId(), produto.getNome(), produto.getPreco(), produto.getCategoria());
    }

    public static List<ProdutoDto> converter(List<Produto> produtos) {
        return produtos.stream()
                .map(produto -> converter(produto))
                .collect(Collectors.toList());
    }
}