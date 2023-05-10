package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.ShopsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import  java.sql.Date;

@RestController
@RequestMapping("API")
public class ShopsController {

    @Autowired
    private ShopsService shopsServ;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/shops/consultar")
    public List<shops> consultarShopsQuery(){
        return shopsServ.ConsultarShops();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/shops/buscar")
    public List<shops> buscarShopsQuery( @RequestParam(value = "id") Set<Integer> shops_id){
        return shopsServ.BuscarShops(shops_id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/shops/crear")
    public void crearShopsQuery(@RequestBody shops shop){
        shopsServ.CrearShops(shop.getShop_name(), shop.getLocation(), shop.getAddress(), shop.getPhone(), shop.getEmail());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/shops/modificar/shop_name")
    public void modificarShopsShop_nameQuery( @RequestBody shops shop){
        shopsServ.modificarShopsShop_name(shop.getShop_id(), shop.getShop_name());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/shops/modificar/shop_id")
    public void modificarShopsLocationQuery( @RequestBody shops shop){
        shopsServ.modificarShopsLocation(shop.getShop_id(), shop.getLocation());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/shops/modificar/shop_date")
    public void modificarShopsAddressQuery(@RequestBody shops shop){
        shopsServ.modificarShopsAddress(shop.getShop_id(), shop.getAddress());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/shops/modificar/address")
    public void modificarShopsPhoneQuery(@RequestBody shops shop){
        shopsServ.modificarShopsPhone(shop.getShop_id(), shop.getPhone());
    }


    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/shops/modificar/total_price")
    public void modificarShopsEmailQuery(@RequestBody shops shop){
        shopsServ.modificarShopsEmail(shop.getShop_id(), shop.getEmail());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/shops/eliminar")
    public void eliminarShopsQuery( @RequestBody shops shop){
        shopsServ.eliminarShops(shop.getShop_id());
    }
}