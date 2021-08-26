package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.requests;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProdutoForm {
    private String nome;
    private BigDecimal preco;
    private Long idCategoria;

    public static Produto converter(ProdutoForm produtoForm, Categoria categoria){
        return new Produto(null, produtoForm.getNome(), produtoForm.getPreco(), categoria);
    }
}