package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.UsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class EmployeesController {

    @Autowired
    private UsuariosService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/empleados/consultar")
    public List<usuarios> consultarEmpleadosQuery(){
        return impl.ConsultarEmpleados();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/usuarios/buscar")
    public List<usuarios> buscarEmpleadoQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarUsuario(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/usuarios/crear")
    public void crearEmpleadoQuery(@RequestBody usuarios usuario){
        impl.CrearUsuario(usuario.getUser_id(), usuario.getUser_name(), usuario.getSurname(), usuario.getEmail(),usuario.getPassword(),usuario.getUsername(),usuario.getPhone(),usuario.getLast_connection());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/nombre")
    public void modificarEmpleadoNombreQuery(@RequestBody usuarios usuario){
        impl.ModificarUsuarioNombre(usuario.getUser_id(), usuario.getUser_name());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/apellido")
    public void modificarEmpleadoApellidoQuery(@RequestBody usuarios usuario){
        impl.ModificarUsuarioApellido(usuario.getUser_id(), usuario.getSurname());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/correo")
    public void modificarEmpleadoCorreoQuery(@RequestBody usuarios usuario){
        impl.ModificarUsuarioCorreo(usuario.getUser_id(), usuario.getEmail());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/contra")
    public void modificarEmpleadoContraQuery(@RequestBody usuarios usuario){
        impl.ModificarUsuarioContra(usuario.getUser_id(), usuario.getPassword());
    }


    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/telefono")
    public void modificarEmpleadoTelefonoQuery(@RequestBody usuarios usuario){
        impl.ModificarUsuarioTelefono(usuario.getUser_id(), usuario.getPhone());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/usuarios/eliminar")
    public void eliminarEmpleadoQuery( @RequestBody usuarios usuario){
        impl.EliminarUsuario(usuario.getUser_id());
    }
}