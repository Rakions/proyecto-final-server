package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.OrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import  java.sql.Date;

@RestController
@RequestMapping("API")
public class OrdersController {

    @Autowired
    private OrdersService ordersServ;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/orders/consultar")
    public List<orders> consultarOrdersQuery(){
        return ordersServ.ConsultarOrders();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/orders/buscar")
    public List<orders> buscarOrdersQuery( @RequestParam(value = "id") Set<Integer> orders_id){
        return ordersServ.BuscarOrders(orders_id);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/orders/crear")
    public void crearOrdersQuery(@RequestBody orders order){
        ordersServ.CrearOrders(order.getUser_id(), order.getShop_id(), order.getOrder_date(), order.getAddress(), order.getTotal_price());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/orders/modificar/user_id")
    public void modificarOrdersUser_idQuery( @RequestBody orders order){
        ordersServ.modificarOrdersUser_id(order.getOrders_id(), order.getUser_id());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/orders/modificar/shop_id")
    public void modificarOrdersShop_idQuery( @RequestBody orders order){
        ordersServ.modificarOrdersShop_id(order.getOrders_id(), order.getShop_id());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/orders/modificar/order_date")
    public void modificarOrdersOrder_dateQuery(@RequestBody orders order){
        ordersServ.modificarOrdersOrder_date(order.getOrders_id(), order.getOrder_date());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/orders/modificar/address")
    public void modificarOrdersAddressQuery(@RequestBody orders order){
        ordersServ.modificarOrdersAddress(order.getOrders_id(), order.getAddress());
    }


    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/orders/modificar/total_price")
    public void modificarOrdersTotal_priceQuery(@RequestBody orders order){
        ordersServ.modificarOrdersTotal_price(order.getOrders_id(), order.getTotal_price());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/orders/eliminar")
    public void eliminarOrdersQuery( @RequestBody orders order){
        ordersServ.eliminarOrders(order.getOrders_id());
    }
}