package com.example.demo.Service;

import com.example.demo.Entity.carts_details;
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
  public List<carts_details> ConsultarCart_details() {
    List<carts_details> listaCarts_details = carts_detailsRepo.getCart_details();
    return listaCarts_details;
  }

  public List<carts_details> BuscarCart_detail(Set<Integer> carts_id) {
    List<carts_details> listaCarts_details = carts_detailsRepo.getCart_detail(carts_id);
    return listaCarts_details;
  }

  public List<carts_details> BuscarCart_detailProduct(Set<Integer> products_id) {
    List<carts_details> listaCarts_detailsProduct = carts_detailsRepo.getCart_detailProduct(products_id);
    return listaCarts_detailsProduct;
  }

  public List<carts_details> BuscarCart_detailCartProduct(Set<Integer> carts_id, Set<Integer> products_id) {
    List<carts_details> listaCarts_detailsCartProduct = carts_detailsRepo.getCart_detailCartProduct(carts_id, products_id);
    return listaCarts_detailsCartProduct;
  }
  
  public void CrearCart_details(int carts_id,int products_id,int quantity) {
    carts_detailsRepo.crearCart_details(carts_id,products_id,quantity);
  }

  public void modificarCarts_detailsQuantity(int carts_id, int products_id, int quantity){
    carts_detailsRepo.modificarCarts_detailsQuantityPorId(carts_id, products_id, quantity);
}

  public void EliminarCart_details(int carts_id, int products_id){
    carts_detailsRepo.borrarCart_deailsPorId(carts_id, products_id);
  }

}