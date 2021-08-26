package br.com.expertTeam.jabbaTheHuttbackend.adapters.outbound.persistence;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import br.com.expertTeam.jabbaTheHuttbackend.core.exceptions.NaoEncontradoException;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.CategoriaRepository;
import org.springframework.stereotype.Component;

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
    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new NaoEncontradoException("Categoria não encontrada."));
    }

    @Override
    public Categoria atualizar(Long id, Categoria categoria) {
        Categoria categoriaEncontrada = buscarPorId(id);
        categoriaEncontrada.setNome(categoria.getNome());
        return categoriaRepository.save(categoriaEncontrada);
    }

    @Override
    public void deletar(Long id) {
        Categoria categoriaEncontrada = buscarPorId(id);
        categoriaRepository.delete(categoriaEncontrada);
    }
}
