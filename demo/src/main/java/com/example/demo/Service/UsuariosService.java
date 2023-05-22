package com.example.demo.Service;

import com.example.demo.Entity.cafe_users;
import com.example.demo.Repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<cafe_users> ConsultarUsuarios() {
        List<cafe_users> listaUsuarios = usuariosRepo.getCafe_users();
        return listaUsuarios;
    }

    public List<cafe_users> BuscarUsuario(Set<Integer> user_id) {
        List<cafe_users> listaUsuario = usuariosRepo.getUsuarioPorId(user_id);
        return listaUsuario;
    }
    public List<cafe_users> BuscarUsuarioPorEmail(String email) {
        List<cafe_users> listaUsuario = usuariosRepo.getUsuarioPorEmail(email);
        return listaUsuario;
    }

    public void CrearUsuario(String user_name, String user_surname,String email,String password,String username,String phone,Date last_connection) {
        usuariosRepo.crearUsuario(user_name, user_surname, email, password, username, phone, last_connection);
    }

    public void ModificarUsuarioTodo(Integer user_id,String user_name,String user_surname,String email,String password,String username,String phone){
        usuariosRepo.modficarUsuarioTodoPorId(user_id, user_name, user_surname, email, password, username, phone);
    }

    public void ModificarUsuarioNombre(Integer user_id, String user_name) {
        usuariosRepo.modificarUsuarioNombrePorId(user_id, user_name);
    }

    public void ModificarUsuarioApellido(Integer user_id, String user_surname){
        usuariosRepo.modificarUsuarioApellidoPorId(user_id, user_surname);
    }

    public void ModificarNombreDeUsuario(Integer user_id,String username){
        usuariosRepo.modificarNombreDeUsuarioPorId(user_id, username);
    }

    public void ModificarUsuarioCorreo(Integer user_id, String email){
        usuariosRepo.modificarUsuarioCorreoPorId(user_id, email);
    }

    public void ModificarUsuarioContra(Integer user_id, String password){
        usuariosRepo.modificarUsuarioContraPorId(user_id, password);
    }

    public void ModificarUltimaConexion(Integer user_id, Date last_connection){
        usuariosRepo.modificarUsuarioFechaPorId(user_id, last_connection);
    }

    public void ModificarUsuarioTelefono(Integer user_id, String phone){
        usuariosRepo.modificarUsuarioTelefonoPorId(user_id, phone);
    }

    public void EliminarUsuario(Integer user_id) {
        usuariosRepo.eliminarUsuarioPorId(user_id);
    }
}