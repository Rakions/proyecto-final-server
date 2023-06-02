package com.example.demo.Repository;

import com.example.demo.Entity.cart;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface cartRepository extends CrudRepository<cart, Integer> {
    //consultar
    String getCartsQuery = "SELECT * FROM cart";

    @Query(nativeQuery = true, value = getCartsQuery)
    List<cart> getCarts();

    //buscar
    String getCartQuery = "SELECT * FROM cart WHERE cart_id = :cart_id";

    @Query(nativeQuery = true, value = getCartQuery)
    List<cart> getCart(Set<Integer> cart_id);

    String getCartProductQuery = "SELECT * FROM cart WHERE user_id = :user_id";

    @Query(nativeQuery = true, value = getCartProductQuery)
    List<cart> getCartProduct(Set<Integer> user_id);

    String getCartOrderProductQuery = "SELECT * FROM cart WHERE user_id = :user_id and product_id = :product_id";

    @Query(nativeQuery = true, value = getCartOrderProductQuery)
    List<cart> getCartOrderProduct(Set<Integer> user_id, Set<Integer> product_id);

    //crear
    String crearCart = "INSERT INTO cart (user_id,product_id,quantity) VALUES (:user_id,:product_id,:quantity)";

    @Modifying
    @Query(nativeQuery = true, value = crearCart)
    void crearCart(int user_id,int product_id,int quantity);

    //modificar
    String modificarCartCantidadQuery = "update cart set quantity = :quantity where cart.user_id = :user_id and product_id = :product_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarCartCantidadQuery)
    void modificarCartQuantityPorId(int user_id, int product_id, int quantity);

     //borrar
     String borrarCartQuery= "DELETE FROM cart WHERE orders_id = :orders_id and product_id = :product_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarOrder_detailsQuery)
     void borrarOrder_deailsPorId(int orders_id, int product_id);
 }