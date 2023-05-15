package com.example.demo.Service;

import com.example.demo.Entity.products;
import com.example.demo.Repository.ProductsRepository;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<products> consultarProducts() {
        List<products> listaProducts =productsRepo.getProducts();
        return listaProducts;
    }

    public List<products> BuscarProduct(Set<Integer> id) {
        List<products> listaProduct = productsRepo.getProductPorId(id);
        return listaProduct;
    }

    public void CrearProduct(String product_name, String product_description, int stock, int reviews, int category_id, int price, String image_url) {
        productsRepo.crearProduct(product_name, product_description, stock, reviews, category_id, price,image_url);
    }

    public void ModificarProductsProduct_name(Integer products_id, String products_name) {
        productsRepo.modificarProductsProduct_namePorId(products_id, products_name);
    }

    public void ModificarProductsProduct_description(Integer products_id, String product_description){
        productsRepo.modificarProductsProduct_descriptionPorId(products_id, product_description);
    }

    public void ModificarProductsStock(Integer id, int stock){
        productsRepo.modificarProductsStockPorId(id, stock);
    }

    public void ModificarProductsReviews(Integer id, int reviews){
        productsRepo.modificarProductsReviewsPorId(id, reviews);
    }

    public void ModificarProductsCategory_id(Integer id, int category_id){
        productsRepo.modificarProductsCategory_idPorId(id, category_id);
    }

    public void ModificarProductsPrice(Integer id, int price){
        productsRepo.modificarProductsPricePorId(id, price);
    }

    public void ModificarProductsImage(Integer id,String image_url){
        productsRepo.modificarProductsImagePorId(id, image_url);
    }

    public void EliminarProduct(Integer products_id) {
        productsRepo.eliminarProductsPorId(products_id);
    }
}