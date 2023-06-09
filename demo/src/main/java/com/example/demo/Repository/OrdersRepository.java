package com.example.demo.Repository;

import com.example.demo.Entity.orders;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrdersRepository extends CrudRepository<orders, Integer> {
    //consultar
    String getOrdersQuery = "SELECT * FROM orders";

    @Query(nativeQuery = true, value = getOrdersQuery)
    List<orders> getOrders();

    //buscar
    String getOrderQuery = "SELECT * FROM orders WHERE orders_id = :id";

    @Query(nativeQuery = true, value = getOrderQuery)
    List<orders> getOrdersPorId(Set<Integer> id);

    String getOrderUser_idQuery = "SELECT * FROM orders WHERE user_id = :id";

    @Query(nativeQuery = true, value = getOrderUser_idQuery)
    List<orders> getOrdersPorUser_id(Set<Integer> id);

    //crear
    String crearOrdersQuery = "INSERT INTO orders (user_id,shop_id,order_date,address,total_price,order_state,order_name,order_surname) VALUES (:user_id,:shop_id,:order_date,:address,:total_price,:order_state,:order_name,:order_surname)";

    @Modifying
    @Query(nativeQuery = true, value = crearOrdersQuery)
    void crearOrders(int user_id, int shop_id, Date order_date, String address, float total_price, String order_state, String order_name, String order_surname);

    //modificar
    String modificarOrdersUser_idQuery = "UPDATE Orders SET user_id = :user_id WHERE orders.orders_id = :id";
    String modificarOrdersShop_idQuery = "UPDATE Orders SET shop_id = :shop_id WHERE orders.orders_id = :id";
    String modificarOrdersOrder_dateQuery = "UPDATE Orders SET order_date = :order_date WHERE orders.orders_id = :id";
    String modificarOrdersAddressQuery = "UPDATE Orders SET address = :address WHERE orders.orders_id = :id";
    String modificarOrdersTotal_priceQuery = "UPDATE Orders SET total_price = :total_price WHERE orders.orders_id = :id";
    String modificarOrdersOrder_stateQuery = "UPDATE Orders SET order_state = :order_state WHERE orders.orders_id = :id";
    String modificarOrdesOrder_nameQuery = "update orders set order_name = :order_name where orders.orders_id = :id";
    String modificarOrdersOrder_surnameQuery = "update orders set order_surname = :order_surname where orders.orders_id = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarOrdersUser_idQuery)
    void modificarOrdersUser_idPorId(Integer id, int user_id);

    @Modifying
    @Query(nativeQuery = true, value = modificarOrdersShop_idQuery)
    void modificarOrdersShop_idPorId(Integer id, int shop_id);

    @Modifying
    @Query(nativeQuery = true, value = modificarOrdersOrder_dateQuery)
    void modificarOrdersOrder_datePorId(Integer id, Date order_date);

    @Modifying
    @Query(nativeQuery = true, value = modificarOrdersAddressQuery)
    void modificarOrdersAddressPorId(Integer id, String address);


    @Modifying
    @Query(nativeQuery = true, value = modificarOrdersTotal_priceQuery)
    void modificarOrdersTotal_pricePorId(Integer id, float total_price);

    @Modifying
    @Query(nativeQuery = true, value = modificarOrdersOrder_stateQuery)
    void modificarOrdersOrder_statePorId(Integer id, String order_state);

    @Modifying
    @Query(nativeQuery = true, value = modificarOrdesOrder_nameQuery)
    void modificarOrdersOrder_namePorId(Integer id, String order_name);

    @Modifying
    @Query(nativeQuery = true, value = modificarOrdersOrder_surnameQuery)
    void modificarOrdersOrder_surnamePorId(Integer id, String order_surname);



    //borrar
    String borrarOrdersQuery = "DELETE FROM Orders WHERE id_Orders = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarOrdersQuery)
    void eliminarOrdersPorId(Integer id);
}