package br.com.bncgabriel.servicex.categoria.resource;

import br.com.bncgabriel.servicex.categoria.domain.Categoria;
import br.com.bncgabriel.servicex.categoria.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria novaCategoria) {
        Categoria categoriaCriada = categoriaService.criarCategoria(novaCategoria);
        return new ResponseEntity<>(categoriaCriada, HttpStatus.CREATED);
    }
}
