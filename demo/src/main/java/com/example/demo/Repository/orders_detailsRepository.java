package com.example.demo.Repository;

import com.example.demo.Entity.order_details;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface orders_detailsRepository extends CrudRepository<order_details, Integer> {
    //consultar
    String getOrder_detailsQuery = "SELECT * FROM order_details";

    @Query(nativeQuery = true, value = getOrder_detailsQuery)
    List<order_details> getOrder_details();

    //buscar
    String getOrder_detailQuery = "SELECT * FROM order_details WHERE orders_id = :orders_id";

    @Query(nativeQuery = true, value = getOrder_detailQuery)
    List<order_details> getOrder_detail(Set<Integer> orders_id);

    String getOrder_detailProductQuery = "SELECT * FROM order_details WHERE product_id = :product_id";

    @Query(nativeQuery = true, value = getOrder_detailProductQuery)
    List<order_details> getOrder_detailProduct(Set<Integer> product_id);

    String getOrder_detailOrderProductQuery = "SELECT * FROM order_details WHERE orders_id = :orders_id and product_id = :product_id";

    @Query(nativeQuery = true, value = getOrder_detailOrderProductQuery)
    List<order_details> getOrder_detailOrderProduct(Set<Integer> orders_id, Set<Integer> product_id);

    //crear
    String crearOrder_details = "INSERT INTO order_details (orders_id,product_id,quantity) VALUES (:orders_id,:product_id,:quantity)";

    @Modifying
    @Query(nativeQuery = true, value = crearOrder_details)
    void crearOrder_details(int orders_id,int product_id,int quantity);

    //modificar
    String modificarOrder_detailsCantidadQuery = "update order_details set quantity = :quantity where order_details.orders_id = :orders_id and product_id = :product_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarOrder_detailsCantidadQuery)
    void modificarOrders_detailsQuantityPorId(int orders_id, int product_id, int quantity);

     //borrar
     String borrarOrder_detailsQuery= "DELETE FROM order_details WHERE orders_id = :orders_id and product_id = :product_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarOrder_detailsQuery)
     void borrarOrder_deailsPorId(int orders_id, int product_id);
 }