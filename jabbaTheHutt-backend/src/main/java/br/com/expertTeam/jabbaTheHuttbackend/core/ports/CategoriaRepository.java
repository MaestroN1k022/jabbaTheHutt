package br.com.expertTeam.jabbaTheHuttbackend.core.ports;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;

public interface CategoriaRepository {
    Categoria salvar(Categoria categoria);
    Categoria buscarPorId(Long id);
    Categoria atualizar(Long id, Categoria categoria);
    void deletar(Long id);
}
