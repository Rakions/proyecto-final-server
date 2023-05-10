package com.example.demo.Repository;

import com.example.demo.Entity.categories;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CategoriesRepository extends CrudRepository<categories, Integer> {
    //consultar
    String getCategoriasQuery = "SELECT * FROM categories";

    @Query(nativeQuery = true, value = getCategoriasQuery)
    List<categories> getCategories();

    //buscar
    String getCategoriaQuery = "SELECT * FROM categories WHERE category_id = :category_id";

    @Query(nativeQuery = true, value = getCategoriaQuery)
    List<categories> getCategoriaPorId(Set<Integer> category_id);

    //crear
    String crearCategoriaQuery = "INSERT INTO categories (category_name) VALUES (:category_name)";

    @Modifying
    @Query(nativeQuery = true, value = crearCategoriaQuery)
    void crearCategoria(String category_name);

    //modificar
    String modificarNombreCategoriaQuery = "update categories set category_name = :category_name where categories.category_id = :category_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarNombreCategoriaQuery)
    void modificarCategoriaNombrePorId(Integer category_id, String category_name);

     //borrar
     String borrarCategoriaQuery = "DELETE FROM categories WHERE category_id = :category_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarCategoriaQuery)
     void borrarCategoriaPorId(Integer category_id);
 }