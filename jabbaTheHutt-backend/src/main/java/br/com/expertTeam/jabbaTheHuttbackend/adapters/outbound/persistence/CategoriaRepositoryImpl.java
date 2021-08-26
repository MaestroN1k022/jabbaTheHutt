package br.com.expertTeam.jabbaTheHuttbackend.adapters.outbound.persistence;

import br.com.expertTeam.jabbaTheHuttbackend.adapters.outbound.persistence.springData.JpaCategoriaRepository;
import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.CategoriaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoriaRepositoryImpl implements CategoriaRepository {

    private final JpaCategoriaRepository categoriaRepository;

    public CategoriaRepositoryImpl(JpaCategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> buscarPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    @Override
    public void deletar(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }
}
