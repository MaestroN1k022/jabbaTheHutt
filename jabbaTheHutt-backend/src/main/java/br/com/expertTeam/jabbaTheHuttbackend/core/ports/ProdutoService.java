package br.com.expertTeam.jabbaTheHuttbackend.core.ports;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Produto;

import java.util.List;

public interface ProdutoService {
    Produto salvar(Produto produto);
    Produto buscarPorId(Long id);
    List<Produto> buscarTodos();
    Produto atualizar(Long id, Produto produto);
    void deletar(Long id);
}
