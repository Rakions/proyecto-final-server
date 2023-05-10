package com.example.demo.Service;

import com.example.demo.Entity.cafe_users;
import com.example.demo.Entity.products;
import com.example.demo.Repository.UsuariosRepository;
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
    public List<products> ConsultarUsuarios() {
        List<products> listaProducts =productsRepo.getProducts();
        return listaProducts;
    }

    public List<products> BuscarUsuario(Set<Integer> id) {
        List<products> listaUsuario = productsRepo.getProductPorId(id);
        return listaUsuario;
    }

    public void CrearUsuario(int user_id, String name, String surname,String email,String password,String username,int phone,Date last_connection) {
        usuariosRepo.crearUsuario(user_id,name, surname, email, password, username, phone, last_connection);
    }

    public void ModificarUsuarioNombre(Integer user_id, String name) {
        usuariosRepo.modificarUsuarioNombrePorId(user_id, name);
    }

    public void ModificarUsuarioApellido(Integer user_id, String surname){
        usuariosRepo.modificarUsuarioApellidoPorId(user_id, surname);
    }

    public void ModificarUsuarioCorreo(Integer id, String email){
        usuariosRepo.modificarUsuarioCorreoPorId(id, email);
    }

    public void ModificarUsuarioContra(Integer id, String password){
        usuariosRepo.modificarUsuarioContraPorId(id, password);
    }

    public void ModificarUltimaConexion(Integer id, Date last_connection){
        usuariosRepo.modificarUsuarioFechaPorId(id, last_connection);
    }

    public void ModificarUsuarioTelefono(Integer id, int phone){
        usuariosRepo.modificarUsuarioTelefonoPorId(id, phone);
    }

    public void EliminarUsuario(Integer user_id) {
        usuariosRepo.eliminarUsuarioPorId(user_id);
    }
}