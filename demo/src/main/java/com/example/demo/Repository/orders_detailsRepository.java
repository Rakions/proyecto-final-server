package com.example.demo.Repository;

import com.example.demo.Entity.order_details;

import java.sql.Date;
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

    //crear
    String crearOrder_details = "INSERT INTO order_details (quantity) VALUES (:quantity)";

    @Modifying
    @Query(nativeQuery = true, value = crearOrder_details)
    void crearOrder_details(int quantity);

    //modificar
    String modificarOrder_detailsCantidadQuery = "update order_details set quantity = :quantity where order_details.orders_id = :orders_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarOrder_detailsCantidadQuery)
    void modificarOrder_detailsCantidadPorId(Integer orders_id, int quantity);

     //borrar
     String borrarOrder_deailsQuery= "DELETE FROM orders_details WHERE orders_id = :orders_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarOrder_deailsQuery)
     void borrarOrder_deailsPorId(Integer orders_id);
 }