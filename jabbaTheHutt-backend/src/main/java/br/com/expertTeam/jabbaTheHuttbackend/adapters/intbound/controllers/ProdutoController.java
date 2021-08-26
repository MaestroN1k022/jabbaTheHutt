package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.controllers;

import br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.requests.ProdutoForm;
import br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.response.ProdutoDto;
import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Produto;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.CategoriaService;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("{id}")
    public ResponseEntity<ProdutoDto> buscarPorId(@PathVariable Long id) {
        Produto produtoResponse = produtoService.buscarPorId(id);
        return new ResponseEntity<>(ProdutoDto.converter(produtoResponse), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> buscarTodos() {
        List<Produto> produtosResponse = produtoService.buscarTodos();
        return new ResponseEntity<>(ProdutoDto.converter(produtosResponse), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProdutoDto> salvar(@RequestBody ProdutoForm produtoForm) {
        Categoria categoria = categoriaService.buscarPorId(produtoForm.getIdCategoria());
        Produto produto = ProdutoForm.converter(produtoForm, categoria);
        Produto produtoResponse = produtoService.salvar(produto);
        return new ResponseEntity<>(ProdutoDto.converter(produtoResponse), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProdutoDto> salvar(@PathVariable Long id, @RequestBody ProdutoForm produtoForm) {
        Categoria categoria = categoriaService.buscarPorId(produtoForm.getIdCategoria());
        Produto produto = ProdutoForm.converter(produtoForm, categoria);
        Produto produtoResponse = produtoService.atualizar(id, produto);
        return new ResponseEntity<>(ProdutoDto.converter(produtoResponse),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        produtoService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
