package com.example.demo.Repository;

import com.example.demo.Entity.sessions;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SessionsRepository extends CrudRepository<sessions, Integer> {
    //consultar
    String getSessionsQuery = "SELECT * FROM sessions";

    @Query(nativeQuery = true, value = getSessionsQuery)
    List<sessions> getSessions();

    //buscar
    String getSessionQuery = "SELECT * FROM sessions WHERE user_id = :id";

    @Query(nativeQuery = true, value = getSessionQuery)
    List<sessions> getSessionsPorId(Set<Integer> id);

    String getSessionTokenQuery = "SELECT * FROM sessions WHERE token = :token";

    @Query(nativeQuery = true, value = getSessionTokenQuery)
    List<sessions> getSessionsPorToken(String token);

    //crear
    String crearSessionsQuery = "INSERT INTO Sessions (user_id, token) VALUES (:user_id,:token)";

    @Modifying
    @Query(nativeQuery = true, value = crearSessionsQuery)
    void crearSessions(int user_id, String token);

    //modificar
    String modificarSessionsUser_idQuery = "UPDATE Sessions SET user_id = :user_id WHERE sessions.token = :token";
    String modificarSessionsTokenQuery = "UPDATE Sessions SET token = :token WHERE sessions.user_id = :user_id";

    @Modifying
    @Query(nativeQuery = true, value = modificarSessionsUser_idQuery)
    void modificarSessionsUser_idPorToken(String token, int user_id);

    @Modifying
    @Query(nativeQuery = true, value = modificarSessionsTokenQuery)
    void modificarSessionsTokenPorUser_id(int user_id, String token);


    //borrar
    String borrarSessionsQuery = "DELETE FROM Sessions WHERE user_id = :user_id";

    @Modifying
    @Query(nativeQuery = true, value = borrarSessionsQuery)
    void eliminarSessionsPorUser_id(int user_id);

    String borrarSessionTokenQuery = "DELETE FROM Sessions WHERE token = :token";

    @Modifying
    @Query(nativeQuery = true, value = borrarSessionTokenQuery)
    void eliminarSessionsPorToken(String token);
}