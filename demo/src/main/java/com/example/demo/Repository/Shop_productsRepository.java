package com.example.demo.Repository;

import com.example.demo.Entity.shop_products;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Shop_productsRepository extends CrudRepository<shop_products, Integer> {
    //consultar
    String getShop_productsQuery = "SELECT * FROM shop_products";

    @Query(nativeQuery = true, value = getShop_productsQuery)
    List<shop_products> getShop_products();

    //buscar
    String getShop_productShopQuery = "SELECT * FROM shop_products WHERE shop_id = :id";
    String getShop_productProductQuery = "SELECT * FROM shop_products WHERE product_id = :id";

    @Query(nativeQuery = true, value = getShop_productShopQuery)
    List<shop_products> getShop_productsShopPorId(Set<Integer> id);

    @Query(nativeQuery = true, value = getShop_productProductQuery)
    List<shop_products> getShop_productsProductPorId(Set<Integer> id);
    
    //crear
    String crearShop_productsQuery = "INSERT INTO shop_products (shop_id,product_id) VALUES (:shop_id,:product_id)";

    @Modifying
    @Query(nativeQuery = true, value = crearShop_productsQuery)
    void crearShop_products(int shop_id, int product_id);

    
    //borrar
    String borrarShop_productsQuery = "DELETE FROM Shop_products WHERE shop_id = :shop_id and product_id = :product_id";

    @Modifying
    @Query(nativeQuery = true, value = borrarShop_productsQuery)
    void eliminarShop_productsPorId(Integer shop_id, Integer product_id);
}