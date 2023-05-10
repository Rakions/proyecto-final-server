package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.CategoriasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.sql.Date;

@RestController
@RequestMapping("API")
public class CategoriesController {

  @Autowired
  private CategoriasService impl;

  // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
  @CrossOrigin(origins = "http://localhost:5173")
  @GetMapping("/categorias/consultar")
  public List<categories> consultarCategoriasQuery() {
    return impl.ConsultarCategorias();
  }

  @CrossOrigin(origins = "http://localhost:5173")
  @GetMapping("/categorias/buscar")
  public List<categories> buscarCategoriaQuery(@RequestParam(value = "id") Set<Integer> category_id) {
    return impl.BuscarCategoria(category_id);
  }

  @CrossOrigin(origins = "http://localhost:5173")
  @PostMapping("/categorias/crear")
  public void crearCategoriaQuery(@RequestBody categories categoria) {
    impl.CrearCategoria(categoria.getCategory_name());
  }

  @CrossOrigin(origins = "http://localhost:5173")
  @PutMapping("/categorias/modificar/nombre")
  public void modificarCategoriaNombreQuery(@RequestBody categories categoria) {
    impl.ModificarCategoriaNombre(categoria.getCategory_id(),categoria.getCategory_name());
  }

  @CrossOrigin(origins = "http://localhost:5173")
  @DeleteMapping("/categorias/eliminar")
  public void eliminarCategoria(@RequestBody categories categoria) {
    impl.EliminarCategoria(categoria.getCategory_id());
  }
}