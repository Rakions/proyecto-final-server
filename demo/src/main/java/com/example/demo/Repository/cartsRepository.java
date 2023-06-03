package com.example.demo.Repository;

import com.example.demo.Entity.carts;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface cartsRepository extends CrudRepository<carts, Integer> {
    //consultar
    String getCartsQuery = "SELECT * FROM carts";

    @Query(nativeQuery = true, value = getCartsQuery)
    List<carts> getCarts();

    //buscar
    String getCartQuery = "SELECT * FROM carts WHERE cart_id = :cart";

    @Query(nativeQuery = true, value = getCartQuery)
    List<carts> getCart(Set<Integer> cart_id);

    String getCartUserQuery = "SELECT * FROM carts WHERE user_id = :user_id";

    @Query(nativeQuery = true, value = getCartUserQuery)
    List<carts> getCartUser(Set<Integer> user_id);

    //crear
    String crearCart = "INSERT INTO carts (user_id) VALUES (:user_id)";

    @Modifying
    @Query(nativeQuery = true, value = crearCart)
    void crearCart(int user_id);

     //borrar
     String borrarCartQuery= "DELETE FROM carts WHERE cart_id = :cart_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarCartQuery)
     void borrarCartPorId(int user_id);
 }