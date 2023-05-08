package com.example.demo.Repository;

import com.example.demo.Entity.empleados;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EmpleadosRepository extends CrudRepository<empleados, Integer> {
    //consultar
    String getEmpleadosQuery = "SELECT * FROM cafe_users";

    @Query(nativeQuery = true, value = getEmpleadosQuery)
    List<empleados> getUsuarios();

    //buscar
    String getEmpleadoQuery = "SELECT * FROM usuarios WHERE user_id = :id";

    @Query(nativeQuery = true, value = getEmpleadoQuery)
    List<empleados> getUsuarioPorId(Set<Integer> id);

    //crear
    String crearEmpleadoQuery = "INSERT INTO cafe_users (user_name,surname,email,password,username,phone,last_connection) VALUES (:name,:surname,:email,:password,:username,:phone,:last_connection)";

    @Modifying
    @Query(nativeQuery = true, value = crearEmpleadoQuery)
    void crearEmpleado(int employee_id,int salary,Date hire_date,String position,int user_id);

    //modificar
    String modificarEmpleadoSalarioQuery = "UPDATE employees SET salary = :salary WHERE employees.employee_id = :employee_id";
    String modificarEmpleadoFechaQuery = "UPDATE employees SET apellido_usuario = :apellido WHERE usuarios.id_usuario = :id";
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