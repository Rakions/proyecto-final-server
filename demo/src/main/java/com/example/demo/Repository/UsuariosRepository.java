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
    String getcafe_usersQuery = "SELECT * FROM cafe_users";

    @Query(nativeQuery = true, value = getcafe_usersQuery)
    List<cafe_users> getCafe_users();

    //buscar
    String getUsuarioQuery = "SELECT * FROM cafe_users WHERE user_id = :user_id";
    String getUsuarioPorEmailQuery = "SELECT * FROM cafe_users WHERE email = :email";

    @Query(nativeQuery = true, value = getUsuarioQuery)
    List<cafe_users> getUsuarioPorId(Set<Integer> user_id);

    @Query(nativeQuery = true, value = getUsuarioPorEmailQuery)
    List<cafe_users> getUsuarioPorEmail(String email);

    //crear
    String crearUsuarioQuery = "INSERT INTO cafe_users (user_name,user_surname,email,password,username,phone,last_connection) VALUES (:user_name,:user_surname,:email,:password,:username,:phone,:last_connection)";

    @Modifying
    @Query(nativeQuery = true, value = crearUsuarioQuery)
    void crearUsuario(String user_name, String user_surname, String email, String password, String username, int phone, Date last_connection);

    //modificar
    String modificarUsuarioNombreQuery = "UPDATE cafe_users SET user_name = :user_name WHERE cafe_users.user_id = :user_id";
    String modificarUsuarioApellidoQuery = "UPDATE cafe_users SET user_surname = :user_surname WHERE cafe_users.user_id = :user_id";
    String modificarNombreDeUsuarioQuery = "update cafe_users set username = :username where cafe_users.user_id = :user_id";
    String modificarUsuarioCorreoQuery = "UPDATE cafe_users SET email = :email WHERE cafe_users.user_id = :user_id";
    String modificarUsuarioContraQuery = "UPDATE cafe_users SET password = :password WHERE cafe_users.user_id = :user_id";
    String modificarUsuarioFechaQuery = "UPDATE cafe_users SET last_connection = :last_connection WHERE cafe_users.user_id = :user_id";
    String modificarUsuarioTelefonoQuery = "UPDATE cafe_users SET phone = :phone WHERE cafe_users.user_id = :user_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioNombreQuery)
    void modificarUsuarioNombrePorId(Integer user_id, String user_name);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioApellidoQuery)
    void modificarUsuarioApellidoPorId(Integer user_id, String user_surname);

    @Modifying
    @Query(nativeQuery = true,value = modificarNombreDeUsuarioQuery)
    void modificarNombreDeUsuarioPorId(Integer user_id,String username);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioCorreoQuery)
    void modificarUsuarioCorreoPorId(Integer user_id, String email);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioContraQuery)
    void modificarUsuarioContraPorId(Integer user_id, String password);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioFechaQuery)
    void modificarUsuarioFechaPorId(Integer user_id, Date last_connection);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioTelefonoQuery)
    void modificarUsuarioTelefonoPorId(Integer user_id, int phone);

    //borrar
    String borrarUsuarioQuery = "DELETE FROM cafe_users WHERE user_id = :user_id";

    @Modifying
    @Query(nativeQuery = true, value = borrarUsuarioQuery)
    void eliminarUsuarioPorId(Integer user_id);
}
