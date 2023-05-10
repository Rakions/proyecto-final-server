package com.example.demo.Service;

import com.example.demo.Entity.orders_employees;
import com.example.demo.Repository.orders_employeesRepository;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class Orders_employeesService {

  @Autowired
  private orders_employeesRepository orders_employeesRepo;

  // -----------------------------------------Categoria-----------------------------------------\\
  public List<orders_employees> ConsultarOrders_employees() {
    List<orders_employees> listaOrders_employees = orders_employeesRepo.getOrders_employees();
    return listaOrders_employees;
  }

  public List<orders_employees> ConsultarOrders_employee(Set<Integer> employee_id) {
    List<orders_employees> listaOrders_employees = orders_employeesRepo.getOrders_employee(employee_id);
    return listaOrders_employees;
  }

  public List<orders_employees> BuscarOrder_employees(Set<Integer> orders_id) {
    List<orders_employees> listaOrders_employees = orders_employeesRepo.getOrder_employees(orders_id);
    return listaOrders_employees;
  }

  public void CrearOrders_employees(int employee_id,int orders_id) {
    orders_employeesRepo.crearOrder_employees(employee_id,orders_id);
  }

  public void EliminarOrder_employees(Integer orders_id){
    orders_employeesRepo.borrarOrder_employeesPorId(orders_id);
  }

}