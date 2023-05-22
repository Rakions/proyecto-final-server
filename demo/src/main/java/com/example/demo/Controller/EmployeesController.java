package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.EmpleadosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class EmployeesController {

  @Autowired
  private EmpleadosService impl;

  // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/empleados/consultar")
  public List<employees> consultarEmpleadosQuery() {
    return impl.ConsultarEmpleados();
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/empleados/buscar")
  public List<employees> buscarEmpleadoQuery(@RequestParam(value = "id") Set<Integer> id) {
    return impl.BuscarEmpleado(id);
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PostMapping("/empleados/crear")
  public void crearEmpleadoQuery(@RequestBody employees empleado) {
    impl.CrearEmpleados(empleado.getEmployee_name(), empleado.getEmployee_surname(), empleado.getEmail(),
        empleado.getPassword(), empleado.getPhone(), empleado.getSalary(), empleado.getPosition(),
        empleado.getHire_date());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/empleados/modificar/nombre")
  public void modificarEmpleadoNombreQuery(@RequestBody employees empleado) {
    impl.ModificarEmpleadoNombre(empleado.getEmployee_id(), empleado.getEmployee_name());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/empleados/modificar/apellido")
  public void modificarEmpleadoApellidoQuery(@RequestBody employees empleado) {
    impl.ModificarEmpleadoApellido(empleado.getEmployee_id(), empleado.getEmployee_surname());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/empleados/modificar/email")
  public void modificarEmpleadoEmailQuery(@RequestBody employees empleado) {
    impl.ModificarEmpleadoEmail(empleado.getEmployee_id(), empleado.getEmail());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/empleados/modificar/contra")
  public void modificarEmpleadoPasswordQuery(@RequestBody employees empleado) {
    impl.ModificarEmpleadoContra(empleado.getEmployee_id(), empleado.getPassword());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/empleados/modificar/telefono")
  public void modificarEmpleadoTelefonoQuery(@RequestBody employees empleado) {
    impl.ModificarEmpleadoTelefono(empleado.getEmployee_id(), empleado.getPhone());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/empleados/modificar/salario")
  public void modificarEmpleadoSalarioQuery(@RequestBody employees empleado) {
    impl.ModificarEmpleadoSalario(empleado.getEmployee_id(), empleado.getSalary());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/empleados/modificar/fecha")
  public void modificarEmpleadoContraQuery(@RequestBody employees empleado) {
    impl.ModificarEmpleadoFechaContratacion(empleado.getEmployee_id(), empleado.getHire_date());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PutMapping("/empleados/modificar/puesto")
  public void modificarEmpleadoPosicionQuery(@RequestBody employees empleado) {
    impl.ModificarEmpleadoPuesto(empleado.getEmployee_id(), empleado.getPosition());
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @DeleteMapping("/empleados/eliminar")
  public void eliminarEmpleado(@RequestBody employees empleado) {
    impl.EliminarEmpleado(empleado.getEmployee_id());
  }
}
