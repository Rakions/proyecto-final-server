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
    String getOrders_employeesQuery = "SELECT * FROM orders_employees";

    @Query(nativeQuery = true, value = getOrders_employeesQuery)
    List<orders_employees> getOrders_employees();

    //buscar
    String getOrder_employeesQuery = "SELECT * FROM orders_employees WHERE orders_id = :orders_id";
    String getOrders_employeeQuery = "SELECT * FROM orders_employees WHERE employee_id = :employee_id";

    @Query(nativeQuery = true, value = getOrder_employeesQuery)
    List<orders_employees> getOrder_employees(Set<Integer> orders_id);

    @Query(nativeQuery = true, value = getOrders_employeeQuery)
    List<orders_employees> getOrders_employee(Set<Integer> employee_id);

    //crear
    String crearOrder_employees = "INSERT INTO order_details (employee_id,orders_id) VALUES (:employee_id,:orders_id)";

    @Modifying
    @Query(nativeQuery = true, value = crearOrder_employees)
    void crearOrder_employees(int employee_id,int orders_id);

    //modificar

     //borrar
     String borrarOrder_employeesQuery= "DELETE FROM orders_employees WHERE orders_id = :orders_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarOrder_employeesQuery)
     void borrarOrder_employeesPorId(Integer orders_id);
 }