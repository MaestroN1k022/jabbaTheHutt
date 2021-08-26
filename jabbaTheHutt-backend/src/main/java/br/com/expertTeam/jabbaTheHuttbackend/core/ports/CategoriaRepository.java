package br.com.expertTeam.jabbaTheHuttbackend.core.ports;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;

import java.util.Optional;

public interface CategoriaRepository {
    Categoria salvar(Categoria categoria);
    Optional<Categoria> buscarPorId(Long id);
    void deletar(Categoria categoria);
}
