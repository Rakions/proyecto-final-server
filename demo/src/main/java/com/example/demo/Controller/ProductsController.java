package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import  java.sql.Date;

@RestController
@RequestMapping("API")
public class ProductsController {

    @Autowired
    private ProductsService productsServ;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/products/consultar")
    public List<products> consultarProductsQuery(){
        return productsServ.consultarProducts();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/products/buscar")
    public List<products> buscarProductsQuery( @RequestParam(value = "id") Set<Integer> products_id){
        return productsServ.BuscarProduct(products_id);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/products/crear")
    public void crearProductsQuery(@RequestBody products products){
        productsServ.CrearProduct(products.getProduct_name(), products.getProduct_description(), products.getStock(), products.getReviews(),products.getCategory_id(),products.getPrice());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/products/modificar/product_name")
    public void modificarProductsProduct_nameQuery( @RequestBody products products){
        productsServ.ModificarProductsProduct_name(products.getProducts_id(), products.getProduct_name());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/products/modificar/product_description")
    public void modificarProductsProduct_descriptionQuery( @RequestBody products products){
        productsServ.ModificarProductsProduct_description(products.getProducts_id(), products.getProduct_description());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/products/modificar/stock")
    public void modificarProductsStockQuery(@RequestBody products products){
        productsServ.ModificarProductsStock(products.getProducts_id(), products.getStock());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/products/modificar/reviews")
    public void modificarProductsReviewsQuery(@RequestBody products products){
        productsServ.ModificarProductsReviews(products.getProducts_id(), products.getReviews());
    }


    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/products/modificar/category_id")
    public void modificarProductsCategory_idQuery(@RequestBody products products){
        productsServ.ModificarProductsCategory_id(products.getProducts_id(), products.getCategory_id());
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/products/modificar/price")
    public void modificarProductsPriceQuery(@RequestBody products products){
        productsServ.ModificarProductsPrice(products.getProducts_id(), products.getPrice());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/products/eliminar")
    public void eliminarProductsQuery( @RequestBody products products){
        productsServ.EliminarProduct(products.getProducts_id());
    }
}