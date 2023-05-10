package com.example.demo.Repository;

import com.example.demo.Entity.shops;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ShopsRepository extends CrudRepository<shops, Integer> {
    //consultar
    String getShopsQuery = "SELECT * FROM shops";

    @Query(nativeQuery = true, value = getShopsQuery)
    List<shops> getShops();

    //buscar
    String getShopQuery = "SELECT * FROM shops WHERE shop_id = :id";

    @Query(nativeQuery = true, value = getShopQuery)
    List<shops> getShopsPorId(Set<Integer> id);

    //crear
    String crearShopsQuery = "INSERT INTO shops (shop_name,location,address,phone,email) VALUES (:shop_name,:location,:address,:phone,:email)";

    @Modifying
    @Query(nativeQuery = true, value = crearShopsQuery)
    void crearShops(String shop_name, String location, String address, String phone, String email);

    //modificar
    String modificarShopsShop_nameQuery = "UPDATE Shops SET shop_name = :shop_name WHERE shops.shop_id = :id";
    String modificarShopsLocationQuery = "UPDATE Shops SET location = :location WHERE shops.shop_id = :id";
    String modificarShopsAddressQuery = "UPDATE Shops SET address = :address WHERE shops.shop_id = :id";
    String modificarShopsPhoneQuery = "UPDATE Shops SET phone = :phone WHERE shops.shop_id = :id";
    String modificarShopsEmailQuery = "UPDATE Shops SET email = :email WHERE shops.shop_id = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarShopsShop_nameQuery)
    void modificarShopsShop_namePorId(Integer id, String shop_name);

    @Modifying
    @Query(nativeQuery = true, value = modificarShopsLocationQuery)
    void modificarShopsLocationPorId(Integer id, String location);

    @Modifying
    @Query(nativeQuery = true, value = modificarShopsAddressQuery)
    void modificarShopsAddressPorId(Integer id, String address);

    @Modifying
    @Query(nativeQuery = true, value = modificarShopsPhoneQuery)
    void modificarShopsPhonePorId(Integer id, String phone);


    @Modifying
    @Query(nativeQuery = true, value = modificarShopsEmailQuery)
    void modificarShopsEmailPorId(Integer id, String email);



    //borrar
    String borrarShopsQuery = "DELETE FROM Shops WHERE id_Shops = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarShopsQuery)
    void eliminarShopsPorId(Integer id);
}