package com.example.demo.Repository;

import com.example.demo.Entity.cafe_users;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UsuariosRepository extends CrudRepository<cafe_users, Integer> {
    //consultar
    String getUsuariosQuery = "SELECT * FROM cafe_users";

    @Query(nativeQuery = true, value = getUsuariosQuery)
    List<cafe_users> getUsuarios();

    //buscar
    String getProductQuery = "SELECT * FROM usuarios WHERE user_id = :id";

    @Query(nativeQuery = true, value = getUsuarioQuery)
    List<cafe_users> getUsuarioPorId(Set<Integer> id);

    //crear
    String crearUsuarioQuery = "INSERT INTO cafe_users (user_name,surname,email,password,username,phone,last_connection) VALUES (:name,:surname,:email,:password,:username,:phone,:last_connection)";

    @Modifying
    @Query(nativeQuery = true, value = crearUsuarioQuery)
    void crearUsuario(int user_id, String name, String surname, String email, String password, String username, int phone, Date last_connection);

    //modificar
    String modificarUsuarioNombreQuery = "UPDATE usuarios SET user_name = :nombre WHERE cafe_users.user_id = :id";
    String modificarUsuarioApellidoQuery = "UPDATE usuarios SET apellido_usuario = :apellido WHERE usuarios.id_usuario = :id";
    String modificarUsuarioCorreoQuery = "UPDATE usuarios SET correo_usuario = :correo WHERE usuarios.id_usuario = :id";
    String modificarUsuarioContraQuery = "UPDATE usuarios SET contra_usuario = :contra WHERE usuarios.id_usuario = :id";
    String modificarUsuarioFechaQuery = "UPDATE usuarios SET last_connection = :fecha WHERE usuarios.id_usuario = :id";
    String modificarUsuarioTelefonoQuery = "UPDATE usuarios SET telefono_usuario = :telefono WHERE usuarios.id_usuario = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioNombreQuery)
    void modificarUsuarioNombrePorId(Integer id, String nombre);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioApellidoQuery)
    void modificarUsuarioApellidoPorId(Integer id, String apellido);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioCorreoQuery)
    void modificarUsuarioCorreoPorId(Integer id, String correo);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioContraQuery)
    void modificarUsuarioContraPorId(Integer id, String contra);


    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioFechaQuery)
    void modificarUsuarioFechaPorId(Integer id, Date fecha);



    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioTelefonoQuery)
    void modificarUsuarioTelefonoPorId(Integer id, int telefono);

    //borrar
    String borrarUsuarioQuery = "DELETE FROM usuarios WHERE id_usuario = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarUsuarioQuery)
    void eliminarUsuarioPorId(Integer id);
}