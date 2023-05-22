package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.CategoriasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class CategoriesController {

  @Autowired
  private CategoriasService impl;

  // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/categorias/consultar")
  public List<categories> consultarCategoriasQuery() {
    return impl.ConsultarCategorias();
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/categorias/buscar")
  public List<categories> buscarCategoriaQuery(@RequestParam(value = "id") Set<Integer> category_id) {
    return impl.BuscarCategoria(category_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PostMapping("/categorias/crear")
  public void crearCategoriaQuery(@RequestBody categories categoria) {
    impl.CrearCategoria(categoria.getCategory_name());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/categorias/modificar/nombre")
  public void modificarCategoriaNombreQuery(@RequestBody categories categoria) {
    impl.ModificarCategoriaNombre(categoria.getCategory_id(),categoria.getCategory_name());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @DeleteMapping("/categorias/eliminar")
  public void eliminarCategoria(@RequestBody categories categoria) {
    impl.EliminarCategoria(categoria.getCategory_id());
  }
}