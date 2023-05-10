package com.example.demo.Service;

import com.example.demo.Entity.cafe_users;
import com.example.demo.Entity.employees;
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
  public List<employees> ConsultarEmpleados() {
    List<employees> listaEmpleados = empleadosRepo.getEmpleados();
    return listaEmpleados;
  }

  public List<employees> BuscarEmpleado(Set<Integer> employee_id) {
    List<employees> listaEmpleado = empleadosRepo.getEmpleadoPorId(employee_id);
    return listaEmpleado;
  }

  public void CrearEmpleado(int employee_id, int salary, Date hire_date, String position, int user_id) {
    empleadosRepo.crearEmpleado(employee_id, salary, hire_date, position, user_id);
  }

  public void ModificarEmpleadoSalario(Integer user_id, int salary) {
    empleadosRepo.modificarEmpleadoSalarioPorId(user_id, salary);
  }

  public void ModificarEmpleadoFechaContratacion(Integer user_id, Date hire_date) {
    empleadosRepo.modificarEmpleadoFechaPorId(user_id, hire_date);
  }

  public void ModificarEmpleadoPosicion(Integer user_id, String position) {
    empleadosRepo.modificarEmpleadosPosicionPorId(user_id, position);
  }

  public void BorrarEmpleado(Integer user_id) {
    empleadosRepo.borrarEmpleadoPorId(user_id);
  }
}
