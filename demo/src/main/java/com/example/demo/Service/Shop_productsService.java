package com.example.demo.Service;

import com.example.demo.Entity.shop_products;
import com.example.demo.Repository.Shop_productsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class Shop_productsService {

    @Autowired
    private Shop_productsRepository shop_productsRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<shop_products> ConsultarShop_products() {
        List<shop_products> listaShop_products = shop_productsRepo.getShop_products();
        return listaShop_products;
    }

    public List<shop_products> BuscarShop_productsShop(Set<Integer> shop_productsShop_id) {
        List<shop_products> shop_productShop_id = shop_productsRepo.getShop_productsShopPorId(shop_productsShop_id);
        return shop_productShop_id;
    }
    public List<shop_products> BuscarShop_productsProduct(Set<Integer> shop_productsProduct_id) {
        List<shop_products> shop_productProduct_id = shop_productsRepo.getShop_productsProductPorId(shop_productsProduct_id);
        return shop_productProduct_id;
    }

    public void CrearShop_products(int shop_id, int product_id) {
        shop_productsRepo.crearShop_products(shop_id, product_id);
    }


    public void eliminarShop_products(Integer shop_id, Integer product_id) {
        shop_productsRepo.eliminarShop_productsPorId(shop_id, product_id);
    }
}
