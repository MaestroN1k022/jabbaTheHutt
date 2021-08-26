package br.com.expertTeam.jabbaTheHuttbackend.core.services;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.CategoriaRepository;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl  implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.salvar(categoria);
    }

    @Override
    public Categoria buscarPorId(Long id) {
        return categoriaRepository.buscarPorId(id);
    }

    @Override
    public Categoria atualizar(Long id, Categoria categoria) {
        return categoriaRepository.atualizar(id, categoria);
    }

    @Override
    public void deletar(Long id) {
        categoriaRepository.deletar(id);
    }
}
