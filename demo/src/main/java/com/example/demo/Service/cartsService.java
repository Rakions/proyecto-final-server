package com.example.demo.Service;

import com.example.demo.Entity.carts;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class cartsService {

  @Autowired
  private cartsRepository cartsRepo;

  // -----------------------------------------Categoria-----------------------------------------\\
  public List<carts> ConsultarCarts() {
    List<carts> listaCarts = cartsRepo.getCarts();
    return listaCarts;
  }

  public List<carts> BuscarCart(Set<Integer> cart_id) {
    List<carts> listaCart = cartsRepo.getCart(cart_id);
    return listaCart;
  }

  public List<carts> BuscarCartUser(Set<Integer> user_id) {
    List<carts> listaCartUser = cartsRepo.getCartUser(user_id);
    return listaCartUser;
  }

  
  public void modificarCartsTotal_price(Integer carts_id, float total_price){
    cartsRepo.modificarCartsTotal_pricePorId(carts_id, total_price);
}

  
  public void CrearCart(int user_id, float total_price) {
    cartsRepo.crearCart(user_id, total_price);
  }


  public void EliminarCart(int cart_id){
    cartsRepo.borrarCartPorId(cart_id);
  }

}