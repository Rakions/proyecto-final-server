package com.example.demo.Service;

import com.example.demo.Entity.cart_details;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class Carts_detailsService {

  @Autowired
  private carts_detailsRepository carts_detailsRepo;

  // -----------------------------------------Categoria-----------------------------------------\\
  public List<cart_details> ConsultarCart_details() {
    List<cart_details> listaCarts_details = carts_detailsRepo.getCart_details();
    return listaCarts_details;
  }

  public List<cart_details> BuscarCart_detail(Set<Integer> carts_id) {
    List<cart_details> listaCarts_details = carts_detailsRepo.getCart_detail(carts_id);
    return listaCarts_details;
  }

  public List<cart_details> BuscarCart_detailProduct(Set<Integer> product_id) {
    List<cart_details> listaCarts_detailsProduct = carts_detailsRepo.getCart_detailProduct(product_id);
    return listaCarts_detailsProduct;
  }

  public List<cart_details> BuscarCart_detailCartProduct(Set<Integer> carts_id, Set<Integer> product_id) {
    List<cart_details> listaCarts_detailsCartProduct = carts_detailsRepo.getCart_detailCartProduct(carts_id, product_id);
    return listaCarts_detailsCartProduct;
  }
  
  public void CrearCart_details(int carts_id,int product_id,int quantity) {
    carts_detailsRepo.crearCart_details(carts_id,product_id,quantity);
  }

  public void modificarCarts_detailsQuantity(int carts_id, int product_id, int quantity){
    carts_detailsRepo.modificarCarts_detailsQuantityPorId(carts_id, product_id, quantity);
}

  public void EliminarCart_details(int carts_id, int product_id){
    carts_detailsRepo.borrarCart_deailsPorId(carts_id, product_id);
  }

}