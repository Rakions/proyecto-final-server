// package com.example.demo.Repository;

// import com.example.demo.Entity.orders;

// import java.sql.Date;
// import java.util.List;
// import java.util.Set;

// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.transaction.annotation.Transactional;

// @Transactional
// public interface OrdersRepository extends CrudRepository<orders, Integer> {
//     //consultar
//     String getOrdersQuery = "SELECT * FROM orders";

//     @Query(nativeQuery = true, value = getOrdersQuery)
//     List<orders> getOrders();

//     //buscar
//     String getOrderQuery = "SELECT * FROM orders WHERE user_id = :id";

//     @Query(nativeQuery = true, value = getOrderQuery)
//     List<orders> getOrdersPorId(Set<Integer> id);

//     //crear
//     String crearOrdersQuery = "INSERT INTO cafe_users (user_name,surname,email,password,username,phone,last_connection) VALUES (:name,:surname,:email,:password,:username,:phone,:last_connection)";

//     @Modifying
//     @Query(nativeQuery = true, value = crearOrdersQuery)
//     void crearOrders(int user_id, String name, String surname, String email, String password, String username, int phone, Date last_connection);

//     //modificar
//     String modificarOrdersNombreQuery = "UPDATE Orders SET user_name = :nombre WHERE cafe_users.user_id = :id";
//     String modificarOrdersApellidoQuery = "UPDATE Orders SET apellido_Orders = :apellido WHERE Orders.id_Orders = :id";
//     String modificarOrdersCorreoQuery = "UPDATE Orders SET correo_Orders = :correo WHERE Orders.id_Orders = :id";
//     String modificarOrdersContraQuery = "UPDATE Orders SET contra_Orders = :contra WHERE Orders.id_Orders = :id";
//     String modificarOrdersFechaQuery = "UPDATE Orders SET last_connection = :fecha WHERE Orders.id_Orders = :id";
//     String modificarOrdersTelefonoQuery = "UPDATE Orders SET telefono_Orders = :telefono WHERE Orders.id_Orders = :id";

//     @Modifying
//     @Query(nativeQuery = true, value = modificarOrdersNombreQuery)
//     void modificarOrdersNombrePorId(Integer id, String nombre);

//     @Modifying
//     @Query(nativeQuery = true, value = modificarOrdersApellidoQuery)
//     void modificarOrdersApellidoPorId(Integer id, String apellido);

//     @Modifying
//     @Query(nativeQuery = true, value = modificarOrdersCorreoQuery)
//     void modificarOrdersCorreoPorId(Integer id, String correo);

//     @Modifying
//     @Query(nativeQuery = true, value = modificarOrdersContraQuery)
//     void modificarOrdersContraPorId(Integer id, String contra);


//     @Modifying
//     @Query(nativeQuery = true, value = modificarOrdersFechaQuery)
//     void modificarOrdersFechaPorId(Integer id, Date fecha);



//     @Modifying
//     @Query(nativeQuery = true, value = modificarOrdersTelefonoQuery)
//     void modificarOrdersTelefonoPorId(Integer id, int telefono);

//     //borrar
//     String borrarOrdersQuery = "DELETE FROM Orders WHERE id_Orders = :id";

//     @Modifying
//     @Query(nativeQuery = true, value = borrarOrdersQuery)
//     void eliminarOrdersPorId(Integer id);
// }