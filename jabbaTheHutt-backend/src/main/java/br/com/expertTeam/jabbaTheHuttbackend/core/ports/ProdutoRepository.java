package br.com.expertTeam.jabbaTheHuttbackend.core.ports;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository {
    Produto salvar(Produto produto);
    Optional<Produto> buscarPorId(Long id);
    List<Produto> buscarTodos();
    void deletar(Produto produto);
}
