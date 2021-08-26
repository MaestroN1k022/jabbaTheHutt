package br.com.expertTeam.jabbaTheHuttbackend.core.services;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import br.com.expertTeam.jabbaTheHuttbackend.core.exceptions.NaoEncontradoException;
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
        return categoriaRepository.buscarPorId(id)
                .orElseThrow(() -> new NaoEncontradoException("Categoria não encontrada."));
    }

    @Override
    public Categoria atualizar(Long id, Categoria categoria) {
        Categoria categoriaEncontrada = buscarPorId(id);
        return categoriaRepository.salvar(categoriaEncontrada);
    }

    @Override
    public void deletar(Long id) {
        Categoria categoriaEncontrada = buscarPorId(id);
        categoriaRepository.deletar(categoriaEncontrada);
    }
}
