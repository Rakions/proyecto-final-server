package com.example.demo.Service;

import com.example.demo.Entity.categories;
import com.example.demo.Repository.UsuariosRepository;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class CategoriasService {

  @Autowired
  private CategoriesRepository categoriasRepo;

  // -----------------------------------------Categoria-----------------------------------------\\
  public List<categories> ConsultarCategorias() {
    List<categories> listaCategorias = categoriasRepo.getCategories();
    return listaCategorias;
  }

  public List<categories> BuscarCategoria(Set<Integer> category_id) {
    List<categories> listaCategorias = categoriasRepo.getCategoriaPorId(category_id);
    return listaCategorias;
  }

  public void CrearCategoria(String category_name) {
    categoriasRepo.crearCategoria(category_name);
  }

  public void ModificarCategoriaNombre(Integer category_id, String category_name) {
    categoriasRepo.modificarCategoriaNombrePorId(category_id, category_name);
  }

  public void EliminarCategoria(Integer category_id){
    categoriasRepo.borrarCategoriaPorId(category_id);
  }

}