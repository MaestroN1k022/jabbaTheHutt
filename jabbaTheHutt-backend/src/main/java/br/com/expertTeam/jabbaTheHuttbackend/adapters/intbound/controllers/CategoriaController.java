package br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.controllers;

import br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.requests.CategoriaForm;
import br.com.expertTeam.jabbaTheHuttbackend.adapters.intbound.dto.response.CategoriaDto;
import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import br.com.expertTeam.jabbaTheHuttbackend.core.ports.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("{id}")
    public ResponseEntity<CategoriaDto> buscarPorId(@PathVariable Long id) {
        Categoria categoriaResponse = categoriaService.buscarPorId(id);
        return new ResponseEntity<>(CategoriaDto.converter(categoriaResponse), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CategoriaDto> salvar(@RequestBody CategoriaForm categoriaForm) {
        Categoria categoria = CategoriaForm.converter(categoriaForm);
        Categoria categoriaResponse = categoriaService.salvar(categoria);
        return new ResponseEntity<>(CategoriaDto.converter(categoriaResponse), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<CategoriaDto> salvar(@PathVariable Long id, @RequestBody CategoriaForm categoriaForm) {
        Categoria categoria = CategoriaForm.converter(categoriaForm);
        Categoria categoriaResponse = categoriaService.atualizar(id, categoria);
        return new ResponseEntity<>(CategoriaDto.converter(categoriaResponse),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        categoriaService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
