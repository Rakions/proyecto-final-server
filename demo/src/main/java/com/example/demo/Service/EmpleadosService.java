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

  public void CrearEmpleados(String employee_name, String employee_surname, String email, String password, String phone,
      int salary, String position, Date hire_date) {
    empleadosRepo.crearEmpleados(employee_name, employee_surname, email, password, phone, salary, position, hire_date);
  }

  public void ModificarEmpleadoNombre(Integer employee_id, String employee_name) {
    empleadosRepo.modificarEmpleadoNombrePorId(employee_id, employee_name);
  }

  public void ModificarEmpleadoApellido(Integer employee_id, String employee_surname) {
    empleadosRepo.modificarEmpleadoApellidoPorId(employee_id, employee_surname);
  }

  public void ModificarEmpleadoEmail(Integer employee_id, String email) {
    empleadosRepo.modificarEmpleadoEmailPorId(employee_id, email);
  }

  public void ModificarEmpleadoContra(Integer employee_id, String password) {
    empleadosRepo.modificarEmpleadoContraPorId(employee_id, password);
  }

  public void ModificarEmpleadoTelefono(Integer employee_id, String phone) {
    empleadosRepo.modificarEmpleadoTelefonoPorId(employee_id, phone);
  }

  public void ModificarEmpleadoSalario(Integer employee_id, int salary) {
    empleadosRepo.modificarEmpleadoSalarioPorId(employee_id, salary);
  }

  public void ModificarEmpleadoPuesto(Integer employee_id, String position) {
    empleadosRepo.modificarEmpleadoPosicionPorId(employee_id, position);
  }

  public void ModificarEmpleadoFechaContratacion(Integer employee_id, Date hire_date) {
    empleadosRepo.modificarEmpleadoFechaPorId(employee_id, hire_date);
  }

  public void EliminarEmpleado(Integer employee_id){
    empleadosRepo.borrarEmpleadoPorId(employee_id);
  }

}
