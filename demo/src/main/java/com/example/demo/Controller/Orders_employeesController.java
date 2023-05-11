package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.CategoriasService;
import com.example.demo.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.sql.Date;

@RestController
@RequestMapping("API")
public class Orders_employeesController {

  @Autowired
  private Orders_employeesService impl;

  // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/orders_employees/consultar")
  public List<orders_employees> consultarOrders_employeesQuery() {
    return impl.ConsultarOrders_employees();
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/orders_employees/buscar/pedidos")
  public List<orders_employees> consultarOrder_employeesQuery(@RequestParam(value = "id") Set<Integer> orders_id) {
    return impl.BuscarOrder_employees(orders_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/orders_employees/buscar/empleado")
  public List<orders_employees> consultarOrders_employeeQuery(@RequestParam(value = "id") Set<Integer> employee_id) {
    return impl.BuscarOrder_employees(employee_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PostMapping("/orders_employees/crear")
  public void crearOrders_employeesQuery(@RequestBody orders_employees orders_employees) {
    impl.CrearOrders_employees(orders_employees.getEmployee_id(),orders_employees.getOrders_id());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @DeleteMapping("/orders_employees/eliminar")
  public void eliminarOrders_employees(@RequestBody orders_employees orders_employees) {
    impl.EliminarOrder_employees(orders_employees.getOrders_id());
  }
}