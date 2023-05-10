package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.UsuariosService;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import  java.sql.Date;

@RestController
@RequestMapping("API")
public class UserController {

    @Autowired
    private UsuariosService userServ;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/cafeusuarios/consultar")
    public List<cafe_users> consultarUsuariosQuery(){
        return userServ.ConsultarUsuarios();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/usuarios/buscar")
    public List<cafe_users> buscarUsuarioQuery( @RequestParam(value = "user_id") Set<Integer> user_id){
        return userServ.BuscarUsuario(user_id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/usuarios/crear")
    public void crearUsuarioQuery(@RequestBody cafe_users usuario){
        userServ.CrearUsuario(usuario.getUser_name(),usuario.getSurname(),usuario.getEmail(),usuario.getPassword(),usuario.getUsername(),usuario.getPhone(),usuario.getLast_connection());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/nombre")
    public void modificarUsuarioNombreQuery( @RequestBody cafe_users usuario){
        userServ.ModificarUsuarioNombre(usuario.getUser_id(), usuario.getUser_name());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/apellido")
    public void modificarUsuarioApellidoQuery( @RequestBody cafe_users usuario){
        userServ.ModificarUsuarioApellido(usuario.getUser_id(), usuario.getSurname());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/username")
    public void modificarNombreDeUsuarioQuery( @RequestBody cafe_users usuario){
        userServ.ModificarNombreDeUsuario(usuario.getUser_id(), usuario.getUsername());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/correo")
    public void modificarUsuarioCorreoQuery(@RequestBody cafe_users usuario){
        userServ.ModificarUsuarioCorreo(usuario.getUser_id(), usuario.getEmail());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/contra")
    public void modificarUsuarioContraQuery(@RequestBody cafe_users usuario){
        userServ.ModificarUsuarioContra(usuario.getUser_id(), usuario.getPassword());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/telefono")
    public void modificarUsuarioTelefonoQuery(@RequestBody cafe_users usuario){
        userServ.ModificarUsuarioTelefono(usuario.getUser_id(), usuario.getPhone());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/conexion")
    public void modificarLastConnectionQuery(@RequestBody cafe_users usuario){
        userServ.ModificarUltimaConexion(usuario.getUser_id(), usuario.getLast_connection());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/usuarios/eliminar")
    public void eliminarUsuarioQuery( @RequestBody cafe_users usuario){
        userServ.EliminarUsuario(usuario.getUser_id());
    }
}
