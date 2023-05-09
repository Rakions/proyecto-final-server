// package com.example.demo.Controller;

// import com.example.demo.Entity.*;
// import com.example.demo.Service.EmpleadosService;
// import com.example.demo.Service.UsuariosService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.Set;
// import java.sql.Date;

// @RestController
// @RequestMapping("API")
// public class EmployeesController {

//     @Autowired
//     private EmpleadosService impl;

//     //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
//     @CrossOrigin(origins = "http://localhost:5173")
//     @GetMapping("/empleados/consultar")
//     public List<employees> consultarEmpleadosQuery(){
//         return impl.ConsultarEmpleados();
//     }

//     @CrossOrigin(origins = "http://localhost:5173")
//     @GetMapping("/empleados/buscar")
//     public List<employees> buscarEmpleadoQuery( @RequestParam(value = "id") Set<Integer> id){
//         return impl.BuscarEmpleado(id);
//     }

//     @CrossOrigin(origins = "http://localhost:5173")
//     @PostMapping("/empleados/crear")
//     public void crearEmpleadoQuery(@RequestBody employees empleado){
//         impl.CrearEmpleado(empleado.getEmployee_id(),empleado.getSalary(),empleado.getHire_date(),empleado.getPosition(),empleado.getUser_id());
//     }

//     @CrossOrigin(origins = "http://localhost:5173")
//     @PutMapping("/empleados/modificar/nombre")
//     public void modificarEmpleadoContraQuery(@RequestBody employees empleado){
//         impl.ModificarEmpleadoFechaContratacion(empleado.getEmployee_id(), empleado.getHire_date());
//     }

//     @CrossOrigin(origins = "http://localhost:5173")
//     @PutMapping("/usuarios/modificar/apellido")
//     public void modificarEmpleadoPosicionQuery(@RequestBody employees empleado){
//         impl.ModificarEmpleadoPosicion(empleado.getEmployee_id(), empleado.getPosition());
//     }
// }