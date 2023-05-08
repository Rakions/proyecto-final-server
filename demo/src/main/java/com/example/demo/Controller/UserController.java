package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.UsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import  java.sql.Date;

@RestController
@RequestMapping("API")
public class UserController {

    @Autowired
    private UsuariosService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/usuarios/consultar")
    public List<cafe_users> consultarUsuariosQuery(){
        return impl.ConsultarUsuarios();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/usuarios/buscar")
    public List<cafe_users> buscarUsuarioQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarUsuario(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/usuarios/crear")
    public void crearUsuarioQuery(@RequestBody cafe_users usuario){
        impl.CrearUsuario(usuario.getUser_id(), usuario.getUser_name(), usuario.getSurname(), usuario.getEmail(),usuario.getPassword(),usuario.getUsername(),usuario.getPhone(),usuario.getLast_connection());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/nombre")
    public void modificarUsuarioNombreQuery( @RequestBody cafe_users usuario){
        impl.ModificarUsuarioNombre(usuario.getUser_id(), usuario.getUser_name());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/apellido")
    public void modificarUsuarioApellidoQuery( @RequestBody cafe_users usuario){
        impl.ModificarUsuarioApellido(usuario.getUser_id(), usuario.getSurname());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/correo")
    public void modificarUsuarioCorreoQuery(@RequestBody cafe_users usuario){
        impl.ModificarUsuarioCorreo(usuario.getUser_id(), usuario.getEmail());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/contra")
    public void modificarUsuarioContraQuery(@RequestBody cafe_users usuario){
        impl.ModificarUsuarioContra(usuario.getUser_id(), usuario.getPassword());
    }


    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/telefono")
    public void modificarUsuarioTelefonoQuery(@RequestBody cafe_users usuario){
        impl.ModificarUsuarioTelefono(usuario.getUser_id(), usuario.getPhone());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/usuarios/eliminar")
    public void eliminarUsuarioQuery( @RequestBody cafe_users usuario){
        impl.EliminarUsuario(usuario.getUser_id());
    }
}