package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.Shop_productsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import  java.sql.Date;

@RestController
@RequestMapping("API")
public class Shop_productsController {

    @Autowired
    private Shop_productsService shop_productsServ;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/shop_products/consultar")
    public List<shop_products> consultarShop_productsQuery(){
        return shop_productsServ.ConsultarShop_products();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/shop_productsShop/buscar")
    public List<shop_products> buscarShop_productsShopQuery( @RequestParam(value = "id") Set<Integer> shop_productsShop_id){
        return shop_productsServ.BuscarShop_productsShop(shop_productsShop_id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/shop_productsProduct/buscar")
    public List<shop_products> buscarShop_productsProductQuery( @RequestParam(value = "id") Set<Integer> shop_productsProduct_id){
        return shop_productsServ.BuscarShop_productsProduct(shop_productsProduct_id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/shop_products/crear")
    public void crearShop_productsQuery(@RequestBody shop_products shop_product){
        shop_productsServ.CrearShop_products(shop_product.getShop_id(), shop_product.getProduct_id());
    }


    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/shop_products/eliminar")
    public void eliminarShop_productsQuery( @RequestBody shop_products shop_product){
        shop_productsServ.eliminarShop_products(shop_product.getShop_id(), shop_product.getProduct_id());
    }
}