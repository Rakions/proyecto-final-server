package com.example.demo.Repository;

import com.example.demo.Entity.employees;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface EmpleadosRepository extends CrudRepository<employees, Integer> {
    //consultar
    String getEmpleadosQuery = "SELECT * FROM employees";

    @Query(nativeQuery = true, value = getEmpleadosQuery)
    List<employees> getEmpleados();

    //buscar
    String getEmpleadoQuery = "SELECT * FROM employees WHERE employee_id = :employee_id";

    @Query(nativeQuery = true, value = getEmpleadoQuery)
    List<employees> getEmpleadoPorId(Set<Integer> employee_id);

    //crear
    String crearEmpleadoQuery = "INSERT INTO employees (employee_name,employee_surname,email,password,phone,salary,position,hire_date) VALUES (:employee_name,:employee_surname,:email,:password,:phone,:salary,:position,:hire_date)";

    @Modifying
    @Query(nativeQuery = true, value = crearEmpleadoQuery)
    void crearEmpleados(String employee_name,String employee_surname,String email,String password,String phone,int salary,String position,Date hire_date);

    //modificar
    String modificarEmpleadoNombreQuery = "update employees set employee_name = :employee_name where employees.employee_id = :employee_id";
    String modificarEmpleadoApellidoQuery = "update employees set employee_surname = :employee_surname where employees.employee_id = :employee_id";
    String modificarEmpleadoEmailQuery = "update employees set email = :email where employees.employee_id = :employee_id";
    String modificarEmpleadoContraQuery = "update employees set password = :password where employees.employee_id = :employee_id";
    String modificarEmpleadoTelefonoQuery = "update employees set phone = :phone where employees.employee_id = :employee_id";
    String modificarEmpleadoSalarioQuery = "update employees set salary = :salary where employees.employee_id = :employee_id";
    String modificarEmpleadoPosicionQuery = "update employees set position = :position where employees.employee_id = :employee_id";
    String modificarEmpleadoFechaQuery = "update employees set hire_date = :hire_date where employees.employee_id = :employee_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoNombreQuery)
    void modificarEmpleadoNombrePorId(Integer employee_id, String employee_name);

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoApellidoQuery)
    void modificarEmpleadoApellidoPorId(Integer employee_id, String employee_surname);
    
    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoEmailQuery)
    void modificarEmpleadoEmailPorId(Integer employee_id, String email);

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoContraQuery)
    void modificarEmpleadoContraPorId(Integer employee_id, String password);

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoTelefonoQuery)
    void modificarEmpleadoTelefonoPorId(Integer employee_id, String phone);

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoSalarioQuery)
    void modificarEmpleadoSalarioPorId(Integer employee_id, Integer salary);

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoFechaQuery)
    void modificarEmpleadoFechaPorId(Integer employee_id, Date hire_date);

     @Modifying
     @Query(nativeQuery = true, value = modificarEmpleadoPosicionQuery)
     void modificarEmpleadoPosicionPorId(Integer employee_id, String position);

     //borrar
     String borrarEmpleadoQuery = "DELETE FROM employees WHERE employee_id = :employee_id";

     @Modifying
     @Query(nativeQuery = true, value = borrarEmpleadoQuery)
     void borrarEmpleadoPorId(Integer employee_id);
 }
