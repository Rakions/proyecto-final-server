package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class Carts_detailsController {

  @Autowired
  private Carts_detailsService ordDetailsServ;

  // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts_details/consultar")
  public List<cart_details> consultarCarts_detailsemployeesQuery() {
    return ordDetailsServ.ConsultarCart_details();
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts_details/buscar")
  public List<cart_details> consultarCart_detailsQuery(@RequestParam(value = "id") Set<Integer> carts_id) {
    return ordDetailsServ.BuscarCart_detail(carts_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts_details/buscarProduct")
  public List<cart_details> consultarCart_detailsProductQuery(@RequestParam(value = "id") Set<Integer> product_id) {
    return ordDetailsServ.BuscarCart_detailProduct(product_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts_details/buscarCartProduct")
  public List<cart_details> consultarCart_detailsCartProductQuery(@RequestParam(value = "carts_id") Set<Integer> carts_id, @RequestParam(value = "product_id") Set<Integer> product_id) {
    return ordDetailsServ.BuscarCart_detailCartProduct(carts_id, product_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PostMapping("/carts_details/crear")
  public void crearCarts_employeesQuery(@RequestBody cart_details cart_details) {
    ordDetailsServ.CrearCart_details(cart_details.getCarts_id(),cart_details.getProduct_id(),cart_details.getQuantity());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/carts_details/modificar/quantity")
  public void modificarCarts_detailsQuantityQuery( @RequestBody cart_details cart_details){
    ordDetailsServ.modificarCarts_detailsQuantity(cart_details.getCarts_id(), cart_details.getProduct_id(), cart_details.getQuantity());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @DeleteMapping("/carts_details/eliminar")
  public void eliminarCarts_employees(@RequestBody cart_details cart_details) {
    ordDetailsServ.EliminarCart_details(cart_details.getCarts_id(), cart_details.getProduct_id());
  }
}