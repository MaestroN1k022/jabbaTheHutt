package br.com.expertTeam.jabbaTheHuttbackend.core.ports;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository {
    Categoria salvar(Categoria categoria);
    Optional<Categoria> buscarPorId(Long id);
    List<Categoria> buscarTodos();
    void deletar(Categoria categoria);
}
