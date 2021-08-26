package br.com.expertTeam.jabbaTheHuttbackend.core.services;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Produto;
import br.com.expertTeam.jabbaTheHuttbackend.core.exceptions.NaoEncontradoException;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.ProdutoRepository;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto salvar(Produto produto) {
        return produtoRepository.salvar(produto);
    }

    @Override
    public Produto buscarPorId(Long id) {
        return produtoRepository.buscarPorId(id)
                .orElseThrow(() -> new NaoEncontradoException("Produto não encontrado."));
    }

    @Override
    public List<Produto> buscarTodos() {
        return produtoRepository.buscarTodos();
    }

    @Override
    public Produto atualizar(Long id, Produto produto) {
        Produto produtoEncontrado = buscarPorId(id);
        produtoEncontrado.setNome(produto.getNome());
        produtoEncontrado.setPreco(produto.getPreco());
        produtoEncontrado.setCategoria(produto.getCategoria());
        return produtoRepository.salvar(produtoEncontrado);
    }

    @Override
    public void deletar(Long id) {
        Produto produtoEncontrado = buscarPorId(id);
        produtoRepository.deletar(produtoEncontrado);
    }
}
