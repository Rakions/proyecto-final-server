// package com.example.demo.Repository;

import com.example.demo.Entity.employees;

// import java.sql.Date;
// import java.util.List;
// import java.util.Set;

// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface EmpleadosRepository extends CrudRepository<employees, Integer> {
    //consultar
    String getEmpleadosQuery = "SELECT * FROM cafe_users";

    @Query(nativeQuery = true, value = getEmpleadosQuery)
    List<employees> getEmpleados();

    //buscar
    String getEmpleadoQuery = "SELECT * FROM employees WHERE employee_id = :employee_id";

    @Query(nativeQuery = true, value = getEmpleadoQuery)
    List<employees> getEmpleadoPorId(Set<Integer> employee_id);

    //crear
    String crearEmpleadoQuery = "INSERT INTO employees (user_name,surname,email,password,username,phone,last_connection) VALUES (:name,:surname,:email,:password,:username,:phone,:last_connection)";

     @Modifying
     @Query(nativeQuery = true, value = crearEmpleadoQuery)
     void crearEmpleado(int employee_id,int salary,Date hire_date,String position,int user_id);
  
    //modificar
    String modificarEmpleadoSalarioQuery = "UPDATE employees SET salary = :salary WHERE employees.employee_id = :employee_id";
    String modificarEmpleadoFechaQuery = "UPDATE employees SET hire_date = :hire_date WHERE employees.employee_id = :employee_id";
    String modificarEmpleadosPosicionQuery = "UPDATE employees SET position = :position WHERE employees.employee_id = :employee_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoSalarioQuery)
    void modificarEmpleadoSalarioPorId(Integer employee_id, Integer salary);

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadoFechaQuery)
    void modificarEmpleadoFechaPorId(Integer employee_id, Date hire_date);

    @Modifying
    @Query(nativeQuery = true, value = modificarEmpleadosPosicionQuery)
    void modificarEmpleadosPosicionPorId(Integer employee_id, String position);

    //borrar
    String borrarEmpleadoQuery = "DELETE FROM employees WHERE employee_id = :employee_id";

    @Modifying
    @Query(nativeQuery = true, value = borrarEmpleadoQuery)
    void borrarEmpleadoPorId(Integer employee_id);
}
