package com.example.demo.Service;

import com.example.demo.Entity.order_details;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class Orders_detailsService {

  @Autowired
  private orders_detailsRepository orders_detailsRepo;

  // -----------------------------------------Categoria-----------------------------------------\\
  public List<order_details> ConsultarOrder_details() {
    List<order_details> listaOrders_details = orders_detailsRepo.getOrder_details();
    return listaOrders_details;
  }

  public List<order_details> BuscarOrder_detail(Set<Integer> orders_id) {
    List<order_details> listaOrders_details = orders_detailsRepo.getOrder_detail(orders_id);
    return listaOrders_details;
  }

  public List<order_details> BuscarOrder_detailProduct(Set<Integer> product_id) {
    List<order_details> listaOrders_detailsProduct = orders_detailsRepo.getOrder_detailProduct(product_id);
    return listaOrders_detailsProduct;
  }

  public List<order_details> BuscarOrder_detailOrderProduct(Set<Integer> orders_id, Set<Integer> product_id) {
    List<order_details> listaOrders_detailsOrderProduct = orders_detailsRepo.getOrder_detailOrderProduct(orders_id, product_id);
    return listaOrders_detailsOrderProduct;
  }

  public void CrearOrder_details(int orders_id,int product_id,int quantity) {
    orders_detailsRepo.crearOrder_details(orders_id,product_id,quantity);
  }

  public void EliminarOrder_details(Integer orders_id){
    orders_detailsRepo.borrarOrder_deailsPorId(orders_id);
  }

}