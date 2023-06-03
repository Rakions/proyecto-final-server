package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class cartsController {

  @Autowired
  private cartsService cartsServ;

  // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts/consultar")
  public List<carts> consultarCartsQuery() {
    return cartsServ.ConsultarCarts();
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts/buscar")
  public List<carts> consultarCartQuery(@RequestParam(value = "id") Set<Integer> cart_id) {
    return cartsServ.BuscarCart(cart_id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/carts/buscarUser")
  public List<carts> consultarCartuserQuery(@RequestParam(value = "user_id") Set<Integer> user_id) {
    return cartsServ.BuscarCartUser(user_id);
  }

  
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/carts/modificar/total_price")
  public void modificarCartsTotal_priceQuery(@RequestBody carts carts){
      cartsServ.modificarCartsTotal_price(carts.getCart_id(), carts.getTotal_price());
  }


  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PostMapping("/carts/crear")
  public void crearCartsQuery(@RequestBody carts carts) {
    cartsServ.CrearCart(carts.getUser_id(), carts.getTotal_price());
  }


  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @DeleteMapping("/carts/eliminar")
  public void eliminarCarts(@RequestBody carts carts) {
    cartsServ.EliminarCart(carts.getCart_id());
  }
}