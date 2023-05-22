package com.example.demo.Service;

import com.example.demo.Entity.shops;
import com.example.demo.Repository.ShopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ShopsService {

    @Autowired
    private ShopsRepository shopsRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<shops> ConsultarShops() {
        List<shops> listaShops = shopsRepo.getShops();
        return listaShops;
    }

    public List<shops> BuscarShops(Set<Integer> shops_id) {
        List<shops> listaShops = shopsRepo.getShopsPorId(shops_id);
        return listaShops;
    }

    public void CrearShops(String shop_name, String location, String address, String phone, String email) {
        shopsRepo.crearShops(shop_name, location, address, phone, email);
    }

    public void modificarShopsShop_name(Integer shops_id, String shop_name) {
        shopsRepo.modificarShopsShop_namePorId(shops_id, shop_name);
    }

    public void modificarShopsLocation(Integer shops_id, String location){
        shopsRepo.modificarShopsLocationPorId(shops_id, location);
    }

    public void modificarShopsAddress(Integer shops_id, String address){
        shopsRepo.modificarShopsAddressPorId(shops_id, address);
    }

    public void modificarShopsPhone(Integer shops_id, String phone){
        shopsRepo.modificarShopsPhonePorId(shops_id, phone);
    }

    public void modificarShopsEmail(Integer shops_id, String email){
        shopsRepo.modificarShopsEmailPorId(shops_id, email);
    }


    public void eliminarShops(Integer shops_id) {
        shopsRepo.eliminarShopsPorId(shops_id);
    }
}
