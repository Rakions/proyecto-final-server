package com.example.demo.Service;

import com.example.demo.Entity.sessions;
import com.example.demo.Repository.SessionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SessionsService {

    @Autowired
    private SessionsRepository sessionsRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<sessions> consultarSessions() {
        List<sessions> listaSessions = sessionsRepo.getSessions();
        return listaSessions;
    }

    public List<sessions> BuscarSession(Set<Integer> user_id) {
        List<sessions> listaSessions = sessionsRepo.getSessionsPorId(user_id);
        return listaSessions;
    }

    public List<sessions> BuscarSessionToken(String token) {
        List<sessions> listaSessions = sessionsRepo.getSessionsPorToken(token);
        return listaSessions;
    }

    public void crearSessions(int user_id, String token) {
        sessionsRepo.crearSessions(user_id, token);
    }

    public void modificarSessionsUser_id(String token, int user_id) {
        sessionsRepo.modificarSessionsUser_idPorToken(token, user_id);
    }

    public void modificarSessionsToken(int user_id, String token) {
        sessionsRepo.modificarSessionsTokenPorUser_id(user_id, token);
    }


    public void eliminarSessions(int user_id) {
        sessionsRepo.eliminarSessionsPorUser_id(user_id);
    }

    public void eliminarSessionsToken(String token) {
        sessionsRepo.eliminarSessionsPorToken(token);
    }
}
