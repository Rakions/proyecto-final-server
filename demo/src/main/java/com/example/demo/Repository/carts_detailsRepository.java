package com.example.demo.Repository;

import com.example.demo.Entity.cart_details;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface carts_detailsRepository extends CrudRepository<cart_details, Integer> {
    //consultar
    String getCart_detailsQuery = "SELECT * FROM cart_details";

    @Query(nativeQuery = true, value = getCart_detailsQuery)
    List<cart_details> getCart_details();

    //buscar
    String getCart_detailQuery = "SELECT * FROM cart_details WHERE carts_id = :carts_id";

    @Query(nativeQuery = true, value = getCart_detailQuery)
    List<cart_details> getCart_detail(Set<Integer> carts_id);

    String getCart_detailProductQuery = "SELECT * FROM cart_details WHERE product_id = :product_id";

    @Query(nativeQuery = true, value = getCart_detailProductQuery)
    List<cart_details> getCart_detailProduct(Set<Integer> product_id);

    String getCart_detailCartProductQuery = "SELECT * FROM cart_details WHERE carts_id = :carts_id and product_id = :product_id";

    @Query(nativeQuery = true, value = getCart_detailCartProductQuery)
    List<cart_details> getCart_detailCartProduct(Set<Integer> carts_id, Set<Integer> product_id);

    //crear
    String crearCart_details = "INSERT INTO cart_details (carts_id,product_id,quantity) VALUES (:carts_id,:product_id,:quantity)";

    @Modifying
    @Query(nativeQuery = true, value = crearCart_details)
    void crearCart_details(int carts_id,int product_id,int quantity);

    //modificar
    String modificarCart_detailsCantidadQuery = "update cart_details set quantity = :quantity where cart_details.carts_id = :carts_id and product_id = :product_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarCart_detailsCantidadQuery)
    void modificarCarts_detailsQuantityPorId(int carts_id, int product_id, int quantity);

     //borrar
     String borrarCart_detailsQuery= "DELETE FROM cart_details WHERE carts_id = :carts_id and product_id = :product_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarCart_detailsQuery)
     void borrarCart_deailsPorId(int carts_id, int product_id);
 }