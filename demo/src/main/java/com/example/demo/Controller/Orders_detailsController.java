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
public class Orders_detailsController {

  @Autowired
  private Orders_detailsService impl;

  // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
  @CrossOrigin(origins = "http://localhost:5173")
  @GetMapping("/orders_details/consultar")
  public List<order_details> consultarOrders_detailsemployeesQuery() {
    return impl.ConsultarOrder_details();
  }

  @CrossOrigin(origins = "http://localhost:5173")
  @GetMapping("/orders_details/buscar")
  public List<order_details> consultarOrder_detailsQuery(@RequestParam(value = "id") Set<Integer> orders_id) {
    return impl.BuscarOrder_detail(orders_id);
  }

  @CrossOrigin(origins = "http://localhost:5173")
  @PostMapping("/orders_details/crear")
  public void crearOrders_employeesQuery(@RequestBody order_details order_details) {
    impl.CrearOrder_details(order_details.getOrders_id(),order_details.getProduct_id(),order_details.getQuantity());
  }

  @CrossOrigin(origins = "http://localhost:5173")
  @DeleteMapping("/orders_details/eliminar")
  public void eliminarOrders_employees(@RequestBody order_details order_details) {
    impl.EliminarOrder_details(order_details.getOrders_id());
  }
}