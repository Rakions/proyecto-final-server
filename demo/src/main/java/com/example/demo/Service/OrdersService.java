// package com.example.demo.Service;

import com.example.demo.Entity.orders;
import com.example.demo.Repository.OrdersRepository;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<orders> ConsultarOrders() {
        List<orders> listaOrders = ordersRepo.getOrders();
        return listaOrders;
    }

    public List<orders> BuscarOrders(Set<Integer> orders_id) {
        List<orders> listaOrders = ordersRepo.getOrdersPorId(orders_id);
        return listaOrders;
    }

    public void CrearOrders(int user_id, int shop_id, Date order_date, String address, int total_price) {
        ordersRepo.crearOrders(user_id, shop_id, order_date, address, total_price);
    }

    public void modificarOrdersUser_id(Integer orders_id, int user_id) {
        ordersRepo.modificarOrdersUser_idPorId(orders_id, user_id);
    }

    public void modificarOrdersShop_id(Integer orders_id, int shop_id){
        ordersRepo.modificarOrdersShop_idPorId(orders_id, shop_id);
    }

    public void modificarOrdersOrder_date(Integer orders_id, Date order_date){
        ordersRepo.modificarOrdersOrder_datePorId(orders_id, order_date);
    }

    public void modificarOrdersAddress(Integer orders_id, String address){
        ordersRepo.modificarOrdersAddressPorId(orders_id, address);
    }

    public void modificarOrdersTotal_price(Integer orders_id, int total_price){
        ordersRepo.modificarOrdersTotal_pricePorId(orders_id, total_price);
    }


    public void eliminarOrders(Integer orders_id) {
        ordersRepo.eliminarOrdersPorId(orders_id);
    }
}
