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
  private Carts_detailsService cartDetailsServ;

  // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts_details/consultar")
  public List<carts_details> consultarCarts_detailsQuery() {
    return cartDetailsServ.ConsultarCart_details();
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts_details/buscar")
  public List<carts_details> buscarCart_detailsQuery(@RequestParam(value = "id") Set<Integer> carts_id) {
    return cartDetailsServ.BuscarCart_detail(carts_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts_details/buscarProduct")
  public List<carts_details> buscarCart_detailsProductQuery(@RequestParam(value = "id") Set<Integer> products_id) {
    return cartDetailsServ.BuscarCart_detailProduct(products_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts_details/buscarCartProduct")
  public List<carts_details> buscarCart_detailsCartProductQuery(@RequestParam(value = "cart_id") Set<Integer> carts_id, @RequestParam(value = "products_id") Set<Integer> products_id) {
    return cartDetailsServ.BuscarCart_detailCartProduct(carts_id, products_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PostMapping("/carts_details/crear")
  public void crearCarts_employeesQuery(@RequestBody carts_details cart_details) {
    cartDetailsServ.CrearCart_details(cart_details.getCart_id(),cart_details.getProducts_id(),cart_details.getQuantity());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/carts_details/modificar/quantity")
  public void modificarCarts_detailsQuantityQuery( @RequestBody carts_details cart_details){
    cartDetailsServ.modificarCarts_detailsQuantity(cart_details.getCart_id(), cart_details.getProducts_id(), cart_details.getQuantity());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @DeleteMapping("/carts_details/eliminar")
  public void EliminarCart_details(@RequestBody carts_details cart_details) {
    cartDetailsServ.EliminarCart_details(cart_details.getCart_id(), cart_details.getProducts_id());
  }
}