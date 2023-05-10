package com.example.demo.Repository;

import com.example.demo.Entity.orders_employees;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface orders_employeesRepository extends CrudRepository<orders_employees, Integer> {
    //consultar
    String getOrders_employeesQuery = "SELECT * FROM order_employees";

    @Query(nativeQuery = true, value = getOrders_employeesQuery)
    List<orders_employees> getOrders_employees();

    //buscar
    String getOrder_employeesQuery = "SELECT * FROM orders_employees WHERE orders_id = :orders_id";

    @Query(nativeQuery = true, value = getOrder_employeesQuery)
    List<orders_employees> employees(Set<Integer> orders_id);

    //crear
    String crearOrder_employees = "INSERT INTO order_details (quantity) VALUES (:quantity)";

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