package com.example.demo.Repository;

import com.example.demo.Entity.products;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductsRepository extends CrudRepository<products, Integer> {
    //consultar
    String getProductsQuery = "SELECT * FROM products";

    @Query(nativeQuery = true, value = getProductsQuery)
    List<products> getProducts();

    //buscar
    String getProductQuery = "SELECT * FROM products WHERE products_id = :id";

    @Query(nativeQuery = true, value = getProductQuery)
    List<products> getProductPorId(Set<Integer> id);

    //crear
    String crearProductQuery = "INSERT INTO products (product_name,product_description,stock,reviews,category_id,price) VALUES (:product_name,:product_description,:stock,:reviews,:category_id,:price)";

    @Modifying
    @Query(nativeQuery = true, value = crearProductQuery)
    void crearProduct(String product_name, String product_description, int stock, int reviews, int category_id, int price);

    //modificar
    String modificarProductsProduct_nameQuery = "UPDATE products SET product_name = :product_name WHERE products.products_id = :id";
    String modificarProductsProduct_descriptionQuery = "UPDATE products SET product_description = :product_description WHERE products.products_id = :id";
    String modificarProductsStockQuery = "UPDATE products SET stock = :stock WHERE products.products_id = :id";
    String modificarProductsReviewsQuery = "UPDATE products SET reviews = :reviews WHERE products.products_id = :id";
    String modificarProductsCatagory_idQuery = "UPDATE products SET category_id = :category_id WHERE products.products_id = :id";
    String modificarProductsPriceQuery = "UPDATE products SET price = :price WHERE products.products_id = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarProductsProduct_nameQuery)
    void modificarProductsProduct_namePorId(Integer id, String product_name);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductsProduct_descriptionQuery)
    void modificarProductsProduct_descriptionPorId(Integer id, String product_description);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductsStockQuery)
    void modificarProductsStockPorId(Integer id, int stock);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductsReviewsQuery)
    void modificarProductsReviewsPorId(Integer id, int reviews);


    @Modifying
    @Query(nativeQuery = true, value = modificarProductsCatagory_idQuery)
    void modificarProductsCategory_idPorId(Integer id, int category_id);


    @Modifying
    @Query(nativeQuery = true, value = modificarProductsPriceQuery)
    void modificarProductsPricePorId(Integer id, int price);

    //borrar
    String borrarProductsQuery = "DELETE FROM products WHERE products_id = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarProductsQuery)
    void eliminarProductsPorId(Integer id);
}