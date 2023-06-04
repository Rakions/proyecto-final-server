package com.example.demo.Repository;

import com.example.demo.Entity.carts_details;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface carts_detailsRepository extends CrudRepository<carts_details, Integer> {
    //consultar
    String getCart_detailsQuery = "SELECT * FROM carts_details";

    @Query(nativeQuery = true, value = getCart_detailsQuery)
    List<carts_details> getCart_details();

    //buscar
    String getCart_detailQuery = "SELECT * FROM carts_details WHERE cart_id = :cart_id";

    @Query(nativeQuery = true, value = getCart_detailQuery)
    List<carts_details> getCart_detail(Set<Integer> cart_id);

    String getCart_detailProductQuery = "SELECT * FROM carts_details WHERE products_id = :products_id";

    @Query(nativeQuery = true, value = getCart_detailProductQuery)
    List<carts_details> getCart_detailProduct(Set<Integer> products_id);

    String getCart_detailCartProductQuery = "SELECT * FROM carts_details WHERE cart_id = :cart_id and products_id = :products_id";

    @Query(nativeQuery = true, value = getCart_detailCartProductQuery)
    List<carts_details> getCart_detailCartProduct(Set<Integer> cart_id, Set<Integer> products_id);

    //crear
    String crearCart_details = "INSERT INTO carts_details (cart_id,products_id,quantity) VALUES (:cart_id,:products_id,:quantity)";

    @Modifying
    @Query(nativeQuery = true, value = crearCart_details)
    void crearCart_details(int cart_id,int products_id,int quantity);

    //modificar
    String modificarCart_detailsCantidadQuery = "update carts_details set quantity = :quantity where carts_details.cart_id = :cart_id and products_id = :products_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarCart_detailsCantidadQuery)
    void modificarCarts_detailsQuantityPorId(int cart_id, int products_id, int quantity);

     //borrar
     String borrarCart_detailsQuery= "DELETE FROM carts_details WHERE cart_id = :cart_id and products_id = :products_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarCart_detailsQuery)
     void borrarCart_deailsPorId(int cart_id, int products_id);
 }