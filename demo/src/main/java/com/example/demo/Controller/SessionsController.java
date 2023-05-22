package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.SessionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class SessionsController {

    @Autowired
    private SessionsService sessionsServ;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/sessions/consultar")
    public List<sessions> consultarSessionsQuery(){
        return sessionsServ.consultarSessions();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/sessions/buscar")
    public List<sessions> buscarSessionQuery( @RequestParam(value = "user_id") Set<Integer> user_id){
        return sessionsServ.BuscarSession(user_id);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/sessionsToken/buscar")
    public List<sessions> buscarSessionTokenQuery( @RequestParam(value = "token") String token){
        return sessionsServ.BuscarSessionToken(token);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/sessions/crear")
    public void crearSessionsQuery(@RequestBody sessions session){
        sessionsServ.crearSessions(session.getUser_id(), session.getToken());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/sessions/modificar/user_id")
    public void modificarSessionsUser_idQuery( @RequestBody sessions session){
        sessionsServ.modificarSessionsUser_id(session.getToken(), session.getUser_id());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/sessions/modificar/token")
    public void modificarSessionsTokenQuery( @RequestBody sessions session){
        sessionsServ.modificarSessionsToken(session.getUser_id(), session.getToken());
    }


    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/sessions/eliminar")
    public void eliminarSessionsQuery( @RequestBody sessions session){
        sessionsServ.eliminarSessions(session.getUser_id());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/sessions/eliminar")
    public void eliminarSessionsTokenQuery( @RequestBody sessions session){
        sessionsServ.eliminarSessionsToken(session.getToken());
    }
}