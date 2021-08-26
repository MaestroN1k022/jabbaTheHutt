package br.com.expertTeam.jabbaTheHuttbackend.adapters.outbound.persistence;

import br.com.expertTeam.jabbaTheHuttbackend.adapters.outbound.persistence.springData.JpaProdutoRepository;
import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Produto;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.ProdutoRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProdutoRepositoryImpl implements ProdutoRepository {

    private final JpaProdutoRepository produtoRepository;

    public ProdutoRepositoryImpl(JpaProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public void deletar(Produto produto) {
        produtoRepository.delete(produto);
    }
}
