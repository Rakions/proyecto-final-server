package com.example.demo.Service;

import com.example.demo.Entity.usuarios;
import com.example.demo.Repository.UsuariosRepository;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class EmpleadosService {

  @Autowired
  private EmpleadosRepository empleadosRepo;

  // -----------------------------------------Categoria-----------------------------------------\\
  public List<usuarios> ConsultarUsuarios() {
    List<usuarios> listaUsuarios = empleadosRepo.getUsuarios();
    return listaUsuarios;
  }

  public List<usuarios> BuscarUsuario(Set<Integer> id) {
    List<usuarios> listaUsuario = empleadosRepo.getUsuarioPorId(id);
    return listaUsuario;
  }

  public void CrearEmpleado(int employee_id, int salary, Date hire_date, String position, int user_id) {
    empleadosRepo.CrearEmpleado(employee_id, salary, hire_date, position, user_id);
  }

  public void ModificarEmpleadoSalario(Integer user_id, int salary) {
    empleadosRepo.modificarUsuarioNombrePorId(user_id, salary);
  }

  public void ModificarEmpleadoFechaContratacion(Integer user_id, Date hire_date) {
    empleadosRepo.modificarUsuarioNombrePorId(user_id, hire_date);
  }

  public void ModificarEmpleadoPosicion(Integer user_id, String position) {
    empleadosRepo.modificarUsuarioNombrePorId(user_id, position);
  }

  public void EliminarEmpleado(Integer user_id) {
    empleadosRepo.eliminarUsuarioPorId(user_id);
  }
}